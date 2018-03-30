package com.pnakaj.pattern.solid.srp.badCode;

import org.springframework.util.StringUtils;

/**
 * Created by pankaj on 3/28/2018.
 */
public class UserService {
    private UserRepository userRepository;

    public void register(String name, String email) {

        if (StringUtils.isEmpty(email)) {

            throw new EmailValidException("Email Should Not be Empty");
        } else {
            if (email.contains("@")) {
                userRepository.save(new User(name, email));
                new EmailSender().send(email, "anyContent", "user service", "any content");
            } else {
                throw new EmailValidException("Email Should Not be Empty");
            }
        }
    }
}
