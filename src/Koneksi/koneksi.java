package Koneksi;

import java.sql.*;

/**
 * @author aaryaanputraa
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil terhubung database");
        }catch(ClassNotFoundException ex){
        System.out.println("Gagal terhubung database: "+ex);
    }
        String url = "jdbc:mysql://localhost/penjualan";
        try{
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil terhubung database");
        }
        catch(SQLException ex){
            System.out.println("Gagal terhubung database");
        }
        return koneksi;
    }
}
