package com.admint.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.admint")
//@Import({ DataSourceConfig.class, TransactionManagerConfig.class })
public class RootConfig {

//    @Bean
//    public DataSource dataSource() {
//        // Create and configure the DataSource bean
//        return new DataSource();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        // Create and configure the TransactionManager bean
//        return new TransactionManager();
//    }
}
