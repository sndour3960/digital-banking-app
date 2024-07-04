package sn.uasz.digitalbankingapp.entities;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("CA")
public class CurrentAccount {
    private double overDraft;
}
