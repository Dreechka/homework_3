package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        log.info(PhoneUtil.getFullNumber(new Phone("+7", "91222331")));
    }
}
