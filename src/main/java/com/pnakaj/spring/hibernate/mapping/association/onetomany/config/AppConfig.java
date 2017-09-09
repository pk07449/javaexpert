package com.pnakaj.spring.hibernate.mapping.association.onetomany.config;


import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@ComponentScan("com.pnakaj.spring.hibernate.mapping.association.onetomany")
@EnableTransactionManagement
public class AppConfig {

    @Bean(destroyMethod = "close", name = "dataSource")
    public BasicDataSource getBasicDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:system");
        basicDataSource.setUsername("system");
        basicDataSource.setPassword("password");
        basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        return basicDataSource;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory){
        return  new HibernateTransactionManager(sessionFactory);
    }

    @Bean
    @DependsOn("dataSource")
    public LocalSessionFactoryBean getLocalSessionFactory() {
        AnnotationSessionFactoryBean localSessionFactoryBean = new AnnotationSessionFactoryBean();
        localSessionFactoryBean.setDataSource(getBasicDataSource());
        localSessionFactoryBean.setPackagesToScan("com.pnakaj.spring.hibernate.mapping.association.onetomany.domain");
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
        hibernateProperties.put("hibernate.current_session_context_class", "thread");
        hibernateProperties.put("hibernate.show_sql", "true");
        hibernateProperties.put("hibernate.hbm2ddl.auto", "create");

        localSessionFactoryBean.setHibernateProperties(hibernateProperties);
        return localSessionFactoryBean;
    }
}
//