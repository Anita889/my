package com.example.projectwork.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Long pincode;
    private Long account;
    @CreationTimestamp
    private Timestamp start;
    @UpdateTimestamp
    private Timestamp finish;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_Id",nullable = false)
    private Users user;
}
