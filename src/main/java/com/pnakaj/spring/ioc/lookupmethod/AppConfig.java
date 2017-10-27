package com.pnakaj.spring.ioc.lookupmethod;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@ComponentScan("com.pnakaj.spring.ioc.lookupmethod")
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DefaultUserReprocess defaultUserReprocessPrototypeBean() {
        return new DefaultUserReprocess();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CustomerReprocess customerReprocessPrototypeBean() {
        return new CustomerReprocess();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DealerReprocess dealerReprocessPrototypeBean() {
        return new DealerReprocess();
    }


}
