/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import Pertemuan10.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmad Ryan
 */
public class UpdatePelanggan {

    KoneksiPelanggan konek = new KoneksiPelanggan();

    public void update(int noid, int nohp, String nama, String alamat, int norek) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql_nohp = "update tabelpelanggan set nohp ='" + nohp + "' where noid= '" + noid + "'";
            String sql_nama = "update tabelpelanggan set nama ='" + nama + "' where noid= '" + noid + "'";

            String sql_alamat = "update tabelpelanggan set alamat ='" + alamat + "' where noid= '" + noid + "'";
            String sql_norek = "update tabelpelanggan set norek ='" + norek + "' where noid= '" + noid + "'";

            statement.executeUpdate(sql_nohp);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_norek);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_noid.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
