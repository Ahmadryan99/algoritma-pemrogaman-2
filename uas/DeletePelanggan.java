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
public class DeletePelanggan {
    KoneksiPelanggan konek = new KoneksiPelanggan();

    public void delete(int noid) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql = "delete from tabelpelanggan where noid = '" + noid + "'";

            statement.executeUpdate(sql);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
