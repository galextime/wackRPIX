package org.wackrpi.modules;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLModule {
    private static Connection connection;

    public SQLModule(String database_url, String username, String password) {
        try {
            Class.forName("org.postgresql.Driver");
            // database_url = "localhost:5432/your_database"
            String jdbcUrl = "jdbc:postgresql://"+database_url;
            System.out.println(database_url + "; " + username + "; " + password);
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Perform database operations here

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {return connection;}
    public boolean close() {
        try {
            connection.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
