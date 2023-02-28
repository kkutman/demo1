package com.demo1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * name : kutman
 **/

@Entity
@Table(name = "users")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
}
