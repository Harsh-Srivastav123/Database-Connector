package com.database.connector.entity.postgres;

import jakarta.persistence.*;

@Entity
@Table(name = "demo_table")
public class PostgresDemoTable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String databaseName;
    private String driverName;
    private String creator;
    private String admin;
    private String migrationTool;
}
