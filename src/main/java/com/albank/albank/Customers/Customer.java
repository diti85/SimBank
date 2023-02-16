package com.albank.albank.Customers;



import java.time.LocalDate;

import com.albank.albank.User.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Customer{
    @Id
    @GeneratedValue
    private Integer cust_id;
    private String first_name;
    private String last_name;
    private LocalDate dob;
    private Integer age;
    private int balance;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
    private User user;





    public Customer(String first_name, String last_name, LocalDate dob,int balance) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.balance = balance;
    }


    //toString Override
    @Override
    public String toString() {
        return "Customer [first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob
                + "," + "age=" + age + "]";
    }
}
