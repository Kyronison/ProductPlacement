package org.example.domain;

import liquibase.pro.packaged.C;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="password")
    private String password;

    @Column(name="user_location")
    private String user_location;

    @Column(name="salary")
    private int salary;

    @Column(name="user_photo_url")
    private String user_photo_url;

    @Column(name="user_status")
    private String user_status;

    @Column(name="registration_date")
    private String registration_date;

}
