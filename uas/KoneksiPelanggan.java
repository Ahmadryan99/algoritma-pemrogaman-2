/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmad Ryan
 */
public class KoneksiPelanggan {

    public static void main(String[] args) {

        KoneksiPelanggan tesKoneksi = new KoneksiPelanggan();
        tesKoneksi.koneksi();

    }

    Connection con = null;
    String statusKoneksi;

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/daftarpelanggan";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses KoneksiPelanggan");
            statusKoneksi = "Berhasil Tersambung";
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
            statusKoneksi = "Gagal Tersambung";
//System.exit(0);
        }
    }
}
