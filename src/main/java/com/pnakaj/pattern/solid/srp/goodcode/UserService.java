package com.pnakaj.pattern.solid.srp.goodcode;

import org.springframework.util.StringUtils;

/**
 * Created by pankaj on 3/28/2018.
 */
public class UserService {
    private UserRepository userRepository;
    private EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void register(String name, String email) {
        emailService.validateEmail(email);
        userRepository.save(new User(name, email));
        emailService.sendEmail(email);
    }
}
