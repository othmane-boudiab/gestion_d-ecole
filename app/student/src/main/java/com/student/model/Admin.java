package com.student.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
//@EqualsAndHashCode
@ToString
@PrimaryKeyJoinColumn(name = "admin_id")
@Entity
@Table(name = "admin")
public class Admin extends User {

    @Column
    private String password;
}
