package sn.uasz.digitalbankingapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter @Builder @ToString
public class Customer {
    @Id @UuidGenerator
    private String id;
    private  String firstName;
    private String lastName;
    private Date birthday;
    private  String location;
    private String email;
}
