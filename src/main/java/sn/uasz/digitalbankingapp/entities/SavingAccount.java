package sn.uasz.digitalbankingapp.entities;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount {
    private double interestRate;
}
