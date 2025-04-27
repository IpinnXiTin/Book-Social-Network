package com.ipin.book_network.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account");

    String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
