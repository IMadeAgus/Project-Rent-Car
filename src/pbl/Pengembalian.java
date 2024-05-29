/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbl;

import java.util.Date;
import Config.Koneksi;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author wedapradnyana27
 */
public class Pengembalian extends javax.swing.JFrame {

      private Connection conn;
      private int akunpengguna;
      private String namapengguna;
      
    public Pengembalian() {
        initComponents();
         conn = Koneksi.getConnection();
    }
    public void setUser(String name){
        namapengguna= name;
    }
    
    
   public void setAkunPengguna(int akun) {
        this.akunpengguna = akun;
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Kelogin = new javax.swing.JButton();
        Kehome = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        Kereturn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nopesananmotor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        tglpengembalianmotor = new com.toedter.calendar.JDateChooser();

        jPanel3.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel9.setText("Nominal              :");

        jLabel10.setText("jLabel10");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        Kelogin.setBackground(new java.awt.Color(51, 0, 153));
        Kelogin.setForeground(new java.awt.Color(255, 255, 255));
        Kelogin.setText("Logout");
        Kelogin.setBorder(null);
        Kelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeloginActionPerformed(evt);
            }
        });

        Kehome.setBackground(new java.awt.Color(51, 0, 153));
        Kehome.setForeground(new java.awt.Color(255, 255, 255));
        Kehome.setText("Home");
        Kehome.setBorder(null);
        Kehome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KehomeActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("BravoRent Bike");

        Kereturn.setBackground(new java.awt.Color(51, 0, 153));
        Kereturn.setForeground(new java.awt.Color(255, 255, 255));
        Kereturn.setText("Pengembalian Motor");
        Kereturn.setBorder(null);
        Kereturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KereturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kehome)
                .addGap(18, 18, 18)
                .addComponent(Kereturn)
                .addGap(18, 18, 18)
                .addComponent(Kelogin)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Kehome)
                    .addComponent(Kereturn)
                    .addComponent(Kelogin))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("FORM PENGEMBALIAN");

        jLabel3.setText("No Pesanan        ");

        nopesananmotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopesananmotorActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BravoRent Bike");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel15.setText("Tgl Pengembalian");

        btnCek.setBackground(new java.awt.Color(51, 0, 153));
        btnCek.setForeground(new java.awt.Color(255, 255, 255));
        btnCek.setText("Cek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(nopesananmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglpengembalianmotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nopesananmotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(tglpengembalianmotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnCek, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//        private void getData(int akun) {    
//        try {
//         String sql = "SELECT tbpengguna.Nama" +
//                     "FROM tbpengguna " ;
//        System.out.println(sql); // Tampilkan query di konsol
//       
//
//        PreparedStatement st = conn.prepareStatement(sql);
//        st.setInt(1, akun); // Set parameter untuk AkunPengguna
//        
//        ResultSet rs = st.executeQuery();
//        
//        if (rs.next()) {
//            int id = rs.getInt("IdPesanan");
//            String namaPengguna = rs.getString("Nama");
//            namapengguna = namaPengguna;
//            akunpengguna = akun;
//        }
//    } catch (Exception e) {
//        Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, e);
//    }
//       
//    }
    private void KeloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeloginActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KeloginActionPerformed

    private void KereturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KereturnActionPerformed
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KereturnActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
   try {
    String NoPesananString = nopesananmotor.getText();
    int NoPesanan = Integer.parseInt(NoPesananString);

    // Query untuk mendapatkan informasi yang diperlukan
    String sql = "SELECT tbpengguna.AkunPengguna, tbpengguna.Nama, tbpesanan.TanggalPengembalian, tbmotor.NamaMotor, tbmotor.Harga " +
                 "FROM tbpesanan " +
                 "JOIN tbpengguna ON tbpesanan.AkunPengguna = tbpengguna.AkunPengguna " +
                 "JOIN tbmotor ON tbpesanan.IdMotor = tbmotor.IdMotor " +
                 "WHERE tbpesanan.IdPesanan = ?";
    System.out.println(sql); // Display the query in the console
    PreparedStatement st = conn.prepareStatement(sql);
    st.setInt(1, NoPesanan); // Set parameter for NoPesanan as an integer
    ResultSet rs = st.executeQuery();

    if (rs.next()) {
         java.sql.Date tanggalPengembalianSQL = rs.getDate("TanggalPengembalian");
        String nama = rs.getString("Nama");
        String namaMotor = rs.getString("NamaMotor");
        int akunPengguna = rs.getInt("AkunPengguna");
        int hargaMotor = rs.getInt("Harga");
         // Ambil nilai tanggal dari JDateChooser
        java.util.Date tglPengembalianInput = tglpengembalianmotor.getDate();
        // Konversi java.util.Date ke LocalDate
        LocalDate tglPengembalian = tanggalPengembalianSQL.toLocalDate();
        LocalDate tglPengembalianInputLocalDate = tglPengembalianInput.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         // Hitung selisih tanggal
        long selisihHari = ChronoUnit.DAYS.between(tglPengembalian, tglPengembalianInputLocalDate);
         // Hitung total harga // Jika selisih kurang dari nol, atur total harga menjadi 0
        int totalHarga = selisihHari < 0 ? 0 : (int) (selisihHari * hargaMotor);
       
        

        // Lakukan sesuatu dengan nilai selisihHari dan totalHarga, misalnya tampilkan atau gunakan dalam perhitungan lain
        System.out.println("Selisih Hari: " + selisihHari);
        System.out.println("Total Harga: " + totalHarga);
//        akunpengguna = akunPengguna;
//        namapengguna = nama;
        pindahKeHalamanBayarDenda(NoPesanan, nama, totalHarga, tglPengembalianInput,selisihHari,akunPengguna);
        
    } else {
        System.out.println("Pesanan tidak ditemukan");
    }

} catch (Exception e) {
    Logger.getLogger(Pengembalian.class.getName()).log(Level.SEVERE, null, e);}
    }//GEN-LAST:event_btnCekActionPerformed
    private void pindahKeHalamanBayarDenda(int NoPesanan, String nama, int totalHarga, Date tglPengembalianInput,long selisihHari, int akunPengguna) {
        // Buat objek halaman pesan
        Bayardenda halamanBayarDenda = new Bayardenda();
        halamanBayarDenda.setDataDenda(NoPesanan, nama, totalHarga, tglPengembalianInput,selisihHari,akunPengguna);
        // Tampilkan halaman pesan
        halamanBayarDenda.setVisible(true);
        // Tutup halaman saat ini jika diperlukan
        this.dispose();
}
    private void nopesananmotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopesananmotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nopesananmotorActionPerformed

    private void KehomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KehomeActionPerformed
         Halaman_utama home = new Halaman_utama();
        home.setVisible(true);
        home.setAkunPengguna(akunpengguna);
        home.setUser(namapengguna);
        this.dispose();
    }//GEN-LAST:event_KehomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kehome;
    private javax.swing.JButton Kelogin;
    private javax.swing.JButton Kereturn;
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nopesananmotor;
    private com.toedter.calendar.JDateChooser tglpengembalianmotor;
    // End of variables declaration//GEN-END:variables
}

