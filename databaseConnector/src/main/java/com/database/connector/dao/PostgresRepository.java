package com.database.connector.dao;

import com.database.connector.entity.postgres.PostgresDemoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostgresRepository extends JpaRepository<PostgresDemoTable,String> {
}
