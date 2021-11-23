package moviecritics.Utils;

import java.sql.*;
import java.util.logging.Level;

public class SQLUtil {

    private Connection conn;
    private Statement stm;

    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/onlycritics";
        String username = "root";
        String password = "root";

        try {
            conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Statement getStatement(){
        return stm;
    }

    public void closeConnection(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable{
        closeConnection();
        super.finalize();
    }

    public int executeUpdate(String cmd){
        try {
            return this.stm.executeUpdate(cmd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ResultSet executeQuery(String cmd){
        try {
            return this.stm.executeQuery(cmd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


