package com.ipin.book_network.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Book extends BaseEntity {

    String title;
    String authorName;
    String isbn;
    String synopsis;
    String bookCover;
    boolean archived;
    boolean shareable;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    User owner;

    @OneToMany(mappedBy = "book")
    List<Feedback> feedbacks;

    @OneToMany(mappedBy = "book")
    List<BookTransactionHistory> histories;
}
