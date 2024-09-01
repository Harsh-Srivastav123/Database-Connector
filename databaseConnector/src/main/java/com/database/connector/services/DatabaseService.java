package com.database.connector.services;

import com.database.connector.dao.MysqlRepository;
import com.database.connector.dao.PostgresRepository;
import com.database.connector.entity.mysql.MysqlDemoTable;
import com.database.connector.entity.postgres.PostgresDemoTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseService {


    @Autowired
    private PostgresRepository postgresRepository;

    @Autowired
    private MysqlRepository mysqlRepository;

    @Transactional("postgresTransactionManager")
    public void saveToPostgres(PostgresDemoTable entity) {
        postgresRepository.save(entity);
    }

    @Transactional("mysqlTransactionManager")
    public void saveToMysql(MysqlDemoTable entity) {
        mysqlRepository.save(entity);
    }
}
