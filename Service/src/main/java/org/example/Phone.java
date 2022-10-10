package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Phone {
    @NonNull
    private final String prefix;

    @NonNull
    private final String number;

    private String bonusCode;

}
