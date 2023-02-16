package com.albank.albank.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.albank.albank.Customers.Customer;
import com.albank.albank.User.Role;
import com.albank.albank.User.User;
import com.albank.albank.User.UserRepo;
import com.albank.albank.config.JwtService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService{
    private final UserRepo repo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService JwtService;
    private final AuthenticationManager authenticationManager;



    public AuthenticationResponse register(RegisterRequest request){
    var cust = Customer.builder().dob(request.getDob()).balance(request.getBalance()).first_name(request.getFirstname()).last_name(request.getLastname()).build();
    var user = User.builder()
        .customer(cust)
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .role(Role.USER)
        .build();
        repo.save(user);
        var jwtToken = JwtService.generateToken(user);
        return AuthenticationResponse.builder().token(jwtToken).build();
    }

public AuthenticationResponse authenticate(AuthenticationRequest request) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
    );
    var user = repo.findByEmail(request.getEmail()).orElseThrow(() -> new UsernameNotFoundException("This email wasnt found"+request.getEmail()));
    var jwtToken = JwtService.generateToken(user);
    return AuthenticationResponse.builder().token(jwtToken).build();
}
    
}
