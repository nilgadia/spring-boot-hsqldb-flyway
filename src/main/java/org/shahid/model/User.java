package org.shahid.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user" , schema = "demo")
@Getter
@Setter
public class User {

    // TODO Sequence
    @Id
    private Integer id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    private String email;

    private Long phoneNumber;
}
