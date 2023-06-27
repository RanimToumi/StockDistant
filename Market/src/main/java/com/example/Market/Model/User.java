package com.example.Market.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column( name = "firstname")
    private  String firstname;
    @Column(name = "lastname")
    private  String  lastname ;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email ;
    @Column(name = "password")
    private String password ;
    @Column(name = "phoneNum")
    private int phoneNum ;


    @OneToMany(mappedBy = "user")
    private List<Commande> commandes;
}
