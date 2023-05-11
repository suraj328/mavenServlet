package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import model.StoreData;

// import java.sql.*;
public class CreateData {
    public StoreData getStoreData(int id) {
        StoreData store = new StoreData();
        // store.setId(100);
        store.setName("Suraj Sah");
        // store.setTech("java programming");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uthinkcrazy", "root",
                    "uthinkcrazy");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM courses where courseId=" + id);
            while (rs.next()) {
                store.setId(rs.getInt("courseId"));
                store.setName("Suraj Sah");
                store.setTech(rs.getString("courseName"));
            }
        } catch (Exception e) {
           System.out.println(e);
        }

        return store;
    }
}
