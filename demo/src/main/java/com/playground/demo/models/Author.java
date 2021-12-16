package com.playground.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId ;

    @Column(name = "first_name")
    private String authorFirstName ;

    @Column(name = "last_name")
    private String authorLastName ;

}
