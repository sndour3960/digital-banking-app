package sn.uasz.digitalbankingapp.entities;

import jakarta.persistence.*;
import lombok.*;
import sn.uasz.digitalbankingapp.enums.OperationType;

import java.util.UUID;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private double amount ;
    private OperationType type;
    @ManyToOne(targetEntity = BankAccount.class)
    private BankAccount account;
}
