/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymmanagement.database;

/**
 *
 * @author hp
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:derby:gym_db;create=true";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Derby Embedded Database Connected Successfully!");
            
            // استدعاء دالة إنشاء الجداول تلقائياً بعد نجاح الاتصال
            createTables(con);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        }
        return con;
    }

    // دالة ذكية لإنشاء الجداول لو مش موجودة في الداتابيز
    private static void createTables(Connection con) {
        try (Statement stmt = con.createStatement()) {
            
            // 1. جدول المستخدمين (Login) مع إضافة مستخدم مسؤول افتراضي تلقائياً
            try {
                stmt.executeUpdate("CREATE TABLE users ("
                        + "username VARCHAR(50) PRIMARY KEY, "
                        + "password VARCHAR(50) NOT NULL, "
                        + "role VARCHAR(20) NOT NULL)");
                
                // إضافة حساب أدمن افتراضي عشان تقدري تجربي بيه الـ Login طول
                stmt.executeUpdate("INSERT INTO users VALUES ('admin', 'admin123', 'Admin')");
                stmt.executeUpdate("INSERT INTO users VALUES ('user', 'user123', 'Receptionist')");
                System.out.println("Table 'users' created with default accounts!");
            } catch (SQLException e) {
                // لو الجدول موجود مسبقاً حيتجاهل الخطأ ويهرب؛ وهذا المطلوب
            }

            // 2. جدول المدربين (Coaches)
            try {
                stmt.executeUpdate("CREATE TABLE coaches ("
                        + "id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY, "
                        + "name VARCHAR(100) NOT NULL, "
                        + "phone VARCHAR(20), "
                        + "specialization VARCHAR(50), "
                        + "salary DOUBLE)");
                System.out.println("Table 'coaches' created successfully!");
            } catch (SQLException e) {}

            // 3. جدول الأعضاء (Members)
            try {
                stmt.executeUpdate("CREATE TABLE members ("
                        + "id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY, "
                        + "name VARCHAR(100) NOT NULL, "
                        + "phone VARCHAR(20), "
                        + "gender VARCHAR(10), "
                        + "join_date DATE)");
                System.out.println("Table 'members' created successfully!");
            } catch (SQLException e) {}

        } catch (SQLException e) {
            System.out.println("Error creating tables: " + e.getMessage());
        }
    }
}