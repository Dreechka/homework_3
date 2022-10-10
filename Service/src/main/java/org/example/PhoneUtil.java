package org.example;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PhoneUtil {

    public String getFullNumber(Phone phone) {
        return phone.getPrefix() + phone.getNumber();
    }

    public String getPhoneWithCode(Phone phone) {
        String replaceBonusCode = phone.getBonusCode() == null ? "" : "#" + phone.getBonusCode();
        return phone.getPrefix() + phone.getNumber() + replaceBonusCode;
    }

}
