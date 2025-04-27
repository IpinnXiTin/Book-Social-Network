package com.ipin.book_network.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {

    int code;
    String message;

}
