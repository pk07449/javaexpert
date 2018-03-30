package com.pnakaj.pattern.solid.srp.goodcode;

import org.hibernate.util.StringHelper;
import org.springframework.util.StringUtils;

import static org.hibernate.util.StringHelper.isNotEmpty;
import static org.springframework.util.StringUtils.isEmpty;

/**
 * Created by pankaj on 3/30/2018.
 */
public class EmailService {
    public void sendEmail(String email) {
        new EmailSender().send(email, "anyContent", "user service", "any content");
    }

    public boolean validateEmail(String email) {
        if (isNotEmpty(email) && email.contains("@")) {
            throw new EmailValidException("Email Should Not be Empty");
        }
        return true;
    }
};
