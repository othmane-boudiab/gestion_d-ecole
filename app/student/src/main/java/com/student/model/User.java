package com.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column
    private String email;
    @Column
    private String phone;
//    @Column(name = "date_of_birth")
//    private LocalDate dateOfBirth;

}
