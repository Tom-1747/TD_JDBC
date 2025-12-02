package com.example;

public class Main {
    public static void main(String[] args) {
        
        Database db = new Database(
            "jdbc:postgresql://localhost:5432/manage_user",
            "postgres",
            "postgres"
        );

        UserDAO dao = new UserDAO(db);

        dao.createTable();
        dao.insertUser("Alice");
        dao.listUser();
    }
}