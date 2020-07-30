/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;


import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmad Ryan
 */
public class InsertPelanggan {

    KoneksiPelanggan konek = new KoneksiPelanggan();

    public void insert(int noid,int nohp, String nama, String alamat, int norek ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql = "insert into tabelpelanggan values('" + noid + "','" + nohp + "','" + nama + "','" + alamat + "','" + norek + "');";

            statement.executeUpdate(sql);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}


