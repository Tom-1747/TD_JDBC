package com.example;

import java.sql.connection;
import java.sql.DRiverManager;
import java.sql.SQLEXception;

public class Database {

    private String url;
    private String user;
    private String password;

    public Database (String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() {
        return DRiverManager.getConnection(url, user, password);
    }
}