package com.ipin.book_network.exception;

import com.ipin.book_network.enums.ErrorCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookException extends RuntimeException {

    ErrorCode errorCode;

}
