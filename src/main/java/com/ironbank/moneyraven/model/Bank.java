package com.ironbank.moneyraven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bank {
    @Id
    private long id;
    private long totalAmount;

    public void credit(long amount){
        totalAmount -= amount;
    }

}
