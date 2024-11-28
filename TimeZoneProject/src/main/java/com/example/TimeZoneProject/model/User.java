package com.example.TimeZoneProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.*;
import java.util.Calendar;

@Entity(name = "person")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private ZonedDateTime createdAt;


}
