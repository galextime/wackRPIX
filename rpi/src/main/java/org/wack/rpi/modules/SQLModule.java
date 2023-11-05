package org.wack.rpi.modules;

import java.sql.Connection;

public class SQLModule {
    private static Connection connection;

    public SQLModule(String database_url, String username, String password) {

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