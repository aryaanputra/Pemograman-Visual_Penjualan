package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private Connection koneksi;

    public Connection connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/penjualan?serverTimezone=Asia/Jakarta";

            koneksi = DriverManager.getConnection(url, "root", "");

            System.out.println("Berhasil terhubung database");

        } catch (ClassNotFoundException | SQLException ex) {

            System.out.println("Gagal terhubung database: " + ex);

        }

        return koneksi;
    }
}