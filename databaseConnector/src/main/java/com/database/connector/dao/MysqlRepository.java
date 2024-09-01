package com.database.connector.dao;

import com.database.connector.entity.mysql.MysqlDemoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlRepository extends JpaRepository<MysqlDemoTable,String> {
}
