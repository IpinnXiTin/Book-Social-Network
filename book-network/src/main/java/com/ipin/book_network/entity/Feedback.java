package com.ipin.book_network.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Feedback extends BaseEntity {

    Double note;
    String comment;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;
}
