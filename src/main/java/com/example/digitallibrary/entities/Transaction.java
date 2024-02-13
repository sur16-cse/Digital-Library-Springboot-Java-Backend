package com.example.digitallibrary.entities;

import com.example.digitallibrary.enumeration.TransactionStatus;
import com.example.digitallibrary.enumeration.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Book book;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    private Double fine;

    @Enumerated(value = EnumType.ORDINAL)
    private TransactionStatus transactionStatus;

    @Enumerated(value = EnumType.ORDINAL)
    private TransactionType transactionType;
}
