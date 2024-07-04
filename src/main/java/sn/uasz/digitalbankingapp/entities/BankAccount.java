package sn.uasz.digitalbankingapp.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import sn.uasz.digitalbankingapp.enums.AccountStatus;

import java.util.Date;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class BankAccount {
    @Id @UuidGenerator
    private String id;
    private double balance;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private AccountStatus status = AccountStatus.CREATED;
    private Date createdAt;
    private String currency;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
    @OneToMany(mappedBy = "account",targetEntity = Operation.class)
    private Set<Operation> operations;


}
