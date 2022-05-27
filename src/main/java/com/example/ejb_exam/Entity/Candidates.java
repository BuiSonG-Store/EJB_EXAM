package com.example.ejb_exam.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(nullable = false)
    public String name;
    @Column(nullable = false)
    public String address;
    @Column(nullable = false)
    public LocalDateTime dateOfBirth;
    @Column(nullable = false)
    public String jobHistory;
    @Column(nullable = false)
    public String skill;
}
