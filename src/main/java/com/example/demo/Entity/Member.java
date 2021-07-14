package com.example.demo.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="user")
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Member {
    @Id
    private String id;

    @Column(name="pw")
    private String pw;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="email", unique = true)
    private String email;


}
