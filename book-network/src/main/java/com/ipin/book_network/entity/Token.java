package com.ipin.book_network.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Token {

    @Id
    @GeneratedValue
    Integer id;
    String token;
    LocalDateTime createdAt;
    LocalDateTime expiresAt;
    LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    User user;
}
