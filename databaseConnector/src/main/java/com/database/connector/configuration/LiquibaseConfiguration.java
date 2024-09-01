package com.database.connector.configuration;


import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;

@Configuration
public class LiquibaseConfiguration {
//    @Primary
//    @Bean
//    public SpringLiquibase postgresLiquibase(@Qualifier(value = "postgresDataSource") DataSource dataSource) {
//        SpringLiquibase liquibase = new SpringLiquibase();
//        liquibase.setDataSource(dataSource);
//        liquibase.setChangeLog("classpath:db/changelog/db.changelog-postgres.sql");
//        return liquibase;
//    }
//
//    @Bean
//    public SpringLiquibase mysqlLiquibase(@Qualifier(value = "mysqlDataSource") DataSource dataSource) {
//        SpringLiquibase liquibase = new SpringLiquibase();
//        liquibase.setDataSource(dataSource);
//        liquibase.setChangeLog("classpath:db/changelog/db.changelog-mysql.sql");
//        return liquibase;
//    }
}
