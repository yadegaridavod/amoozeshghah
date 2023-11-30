package com.davod.amoozeshghah.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name ="accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;
    @Column(name = "password",nullable = false)
    private String password;
}