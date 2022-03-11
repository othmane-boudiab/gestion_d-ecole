package com.student.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
@Entity
@PrimaryKeyJoinColumn(name = "teacher_id")
@Table(name = "teacher")
public class Teacher extends User {
    @Column
    private String language;


}
