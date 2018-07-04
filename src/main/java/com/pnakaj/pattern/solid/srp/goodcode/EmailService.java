package com.pnakaj.pattern.solid.srp.goodcode;

import static org.hibernate.util.StringHelper.isNotEmpty;

/**
 * Created by pankaj on 3/30/2018.
 */
public class EmailService {
    public void sendEmail(String email) {
        new EmailSender().send(email, "anyContent", "user service", "any content");
    }

    public boolean validateEmail(String email) {
        if (isNotEmpty(email) && correctEmail(email)) {
            throw new EmailValidException("Email Should Not be Empty");
        }
        return true;
    }

    private boolean correctEmail(String email) {
        return email.contains("@");
    }
};
