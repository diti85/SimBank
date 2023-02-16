package com.albank.albank.Customers;

// import java.time.LocalDate;
// import java.time.Month;
// import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {


    @Bean
    CommandLineRunner commandLineRunner(CustomerRepo repo){
        return args -> {
            // Customer diti = new Customer("Endrit","Basha",LocalDate.of(2000,Month.JULY,14),200);
            // Customer oki = new Customer("Oketa","Basha",LocalDate.of(2000,Month.JULY,14),200);
            // repo.saveAll(List.of(diti,oki));
        };
    }
    
}
