package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args)throws Exception {
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password = System.getenv("DB_PASSWORD");
        Connection conn= DriverManager.getConnection(url,username,password);

        System.out.println("Maven项目数据库连接成功");

        System.out.println("merged version");


        System.out.println("feature branch code");
        conn.close();

        }
    }
