package com.example.digitallibrary.entities;

import com.example.digitallibrary.enumeration.CardStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import java.sql.Date;

@Entity
public class Card {

    @Id
    @UuidGenerator
    private String id;

    @Enumerated(EnumType.STRING)
    private CardStatus status;

    private Date validUpto;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date updatedOn;

    @Min(0)
    @Max(3)
    private int totalIssuedBook;

//    @OneToMany(mappedBy = "card")
//    @JsonIgnore
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private Set<Transaction> transactions;

    @PostPersist
    void setStatus() {
        status = CardStatus.ACTIVE;
    }

}
