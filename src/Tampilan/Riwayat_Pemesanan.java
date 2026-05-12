package Tampilan;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import Koneksi.koneksi;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * @author aaryaanputraa
 */
public class Riwayat_Pemesanan extends javax.swing.JFrame {
    
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Riwayat_Pemesanan.class.getName());
    public Riwayat_Pemesanan() {
        initComponents();
        conn = new koneksi().connect();
        datatable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbplgn = new javax.swing.JTable();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("RIWAYAT PEMESANAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtcari.addActionListener(this::txtcariActionPerformed);
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        bcari.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        bcari.setText("CARI");
        bcari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bcari.addActionListener(this::bcariActionPerformed);

        tbplgn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbplgn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbplgnMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbplgn);

        btnCetak.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnCetak.setText("CETAK");
        btnCetak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCetak.addActionListener(this::btnCetakActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected void datatable(){

        Object[] Baris = {
            "No Faktur",
            "ID Pelanggan",
            "Nama Pelanggan",
            "Tanggal",
            "Nama Barang",
            "Jumlah",
            "Harga Jual",
            "Total",
            "Bayar",
            "Kembalian"
        };

        tabmode = new DefaultTableModel(null, Baris);

        String cariitem = txtcari.getText();

        try{

            String sql = "SELECT "
                       + "pemesanan.no_faktur, "
                       + "pemesanan.id_pelanggan, "
                       + "pemesanan.nama_pelanggan, "
                       + "pemesanan.tanggal, "
                       + "detail_pemesanan.nama_barang, "
                       + "detail_pemesanan.jumlah, "
                       + "detail_pemesanan.harga_jual, "
                       + "pemesanan.total, "
                       + "pemesanan.bayar, "
                       + "pemesanan.kembalian "
                       + "FROM pemesanan "
                       + "INNER JOIN detail_pemesanan "
                       + "ON pemesanan.no_faktur = detail_pemesanan.no_faktur "
                       + "WHERE pemesanan.no_faktur LIKE '%"+cariitem+"%' "
                       + "OR pemesanan.nama_pelanggan LIKE '%"+cariitem+"%' "
                       + "ORDER BY pemesanan.no_faktur ASC";

            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            while(hasil.next()){

                tabmode.addRow(new Object[]{

                    hasil.getString("no_faktur"),
                    hasil.getString("id_pelanggan"),
                    hasil.getString("nama_pelanggan"),
                    hasil.getString("tanggal"),
                    hasil.getString("nama_barang"),
                    hasil.getString("jumlah"),
                    hasil.getString("harga_jual"),
                    hasil.getString("total"),
                    hasil.getString("bayar"),
                    hasil.getString("kembalian")

                });

            }

            tbplgn.setModel(tabmode);

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,
                "Data gagal dipanggil : "+e.getMessage());

        }
    }
    
    private void cetakTransaksi() {

    try {

        int row = tbplgn.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null,
                "Pilih data transaksi terlebih dahulu!");
            return;
        }

        // Ambil no faktur dari tabel
        String noFaktur = tbplgn.getValueAt(row, 0).toString();

        String sql =
              "SELECT "
            + "pemesanan.no_faktur, "
            + "pemesanan.nama_pelanggan, "
            + "pemesanan.tanggal, "
            + "pemesanan.total, "
            + "pemesanan.bayar, "
            + "pemesanan.kembalian, "
            + "detail_pemesanan.nama_barang, "
            + "detail_pemesanan.jumlah, "
            + "detail_pemesanan.harga_jual "
            + "FROM pemesanan "
            + "INNER JOIN detail_pemesanan "
            + "ON pemesanan.no_faktur = detail_pemesanan.no_faktur "
            + "WHERE pemesanan.no_faktur = ?";

        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, noFaktur);

        ResultSet hasil = stat.executeQuery();

        StringBuilder isi = new StringBuilder();

        isi.append("====================================================\n");
        isi.append("                 STRUK PEMESANAN\n");
        isi.append("====================================================\n");

        boolean header = false;

        while (hasil.next()) {

            // Header transaksi cukup sekali
            if (!header) {

                isi.append("No Faktur   : "
                        + hasil.getString("no_faktur") + "\n");

                isi.append("Pelanggan   : "
                        + hasil.getString("nama_pelanggan") + "\n");

                isi.append("Tanggal     : "
                        + hasil.getString("tanggal") + "\n");

                isi.append("----------------------------------------------------\n");

                isi.append(String.format(
                    "%-20s %-8s %-10s\n",
                    "Barang",
                    "Jumlah",
                    "Harga"
                ));

                isi.append("----------------------------------------------------\n");

                header = true;
            }

            isi.append(String.format(
                "%-20s %-8s %-10s\n",
                hasil.getString("nama_barang"),
                hasil.getString("jumlah"),
                hasil.getString("harga_jual")
            ));
        }

        isi.append("----------------------------------------------------\n");

        // query ulang untuk ambil total sekali saja
        PreparedStatement stat2 = conn.prepareStatement(
            "SELECT total, bayar, kembalian "
          + "FROM pemesanan WHERE no_faktur = ?"
        );

        stat2.setString(1, noFaktur);

        ResultSet rs2 = stat2.executeQuery();

        if (rs2.next()) {

            isi.append("Total       : " + rs2.getString("total") + "\n");
            isi.append("Bayar       : " + rs2.getString("bayar") + "\n");
            isi.append("Kembalian   : " + rs2.getString("kembalian") + "\n");

        }

        isi.append("====================================================\n");

        JTextArea textArea = new JTextArea(isi.toString());

        textArea.setFont(
            new java.awt.Font("Monospaced",
            java.awt.Font.PLAIN,
            12)
        );

        textArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(textArea);

        scroll.setPreferredSize(
            new java.awt.Dimension(500, 400)
        );

        int opsi = JOptionPane.showConfirmDialog(
            null,
            scroll,
            "Preview Struk",
            JOptionPane.OK_CANCEL_OPTION
        );

        if (opsi == JOptionPane.OK_OPTION) {
            textArea.print();
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null,
            "Gagal cetak : " + e.getMessage());

    }
}
    private void tbplgnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbplgnMouseClicked

    }//GEN-LAST:event_tbplgnMouseClicked

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        datatable();
    }//GEN-LAST:event_bcariActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            datatable();
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        cetakTransaksi();
    }//GEN-LAST:event_btnCetakActionPerformed
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Riwayat_Pemesanan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton btnCetak;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbplgn;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
