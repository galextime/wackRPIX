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
            Connection userdata = DriverManager.getConnection(jdbcUrl, username, password);

            Statement result = userdata.createStatement(redata[0]);
            int Body = result.executeQuery(redata[1]);
            int Pain = result.executeQuery(redata[2]);
            int Symptoms = result.executeQuery(redata[3]);

            for(x = 0; x < 30; x++)
            {
                for(y = 0; y < dat; y++)
                {
                    word = "Word"+x+"|"+y
                    float word = result.executeQuery(redata[x+y]);
                }
            }


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