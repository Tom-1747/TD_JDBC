package com.example;

import java.sql.*;

public class UserDAO {
    private Database database;

    public UserDAO(Database database ) {
        this.Database = database
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                     "id SERIAL PRIMARY KEY, " +
                     "name VARCHAR(100)" +
                     ")";
    }

    try (Connection conn = database.getConnection();
        Statement stmt = conn.createStatement()) {


            stmt.execute(sql);
            System.out.println("Table 'user' cree ou deja cree")
    
    } catch (SQLEXception e) {
        e.printStackTrace();
    }

    public void insertUser(String name) {
        String sql = "INSERT INTO users(name) VALUES(?)"

        try (Connection conn = database.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, name);
        pstmt.executeUpdate();
        System.out.println("Utilisateur ajoute : " + name)
    
        } catch (SQLEXception e) {
            e.printStackTrace();
        }

    public void listUser() {
        String sql = "SELECT id, name FROM users";

        try(Connection conn = database.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("List des utilisateurs :")
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
        } catch (SQLEXception e) {
            e.printStackTrace();
        }
    }
}
