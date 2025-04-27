package com.ipin.book_network.enums;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public enum ErrorCode {
    USER_NOT_FOUND(1001, "User not found", HttpStatus.NOT_FOUND),
    INVALID_TOKEN(1002, "Invalid token", HttpStatus.UNAUTHORIZED),
    EXPIRED_TOKEN_AND_GENERATED_NEW_TOKEN(1003, "Activation token has expired. A new token has been sent to the same email address", HttpStatus.UNAUTHORIZED),
    USER_ROLE_INVALID(1004, "ROLE USER was not initialized", HttpStatus.INTERNAL_SERVER_ERROR);

    int code;
    String message;
    HttpStatus httpStatus;

}
