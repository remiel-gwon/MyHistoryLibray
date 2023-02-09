package com.example.myhistorylibray.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Table(name="accountbook")
@Entity
@Data
public class accountBook {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    int account_no;
    LocalDate usedate;
    String used;
    String content;
    int amount;
    String pay;
    String payment;
}
