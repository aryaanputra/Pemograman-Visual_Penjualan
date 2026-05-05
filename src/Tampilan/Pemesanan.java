package Tampilan;

import java.sql.Connection;
import Koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author aaryaanputraa
 */
public class Pemesanan extends javax.swing.JFrame {
    
    Pemesanan pesan;
    
    String tanggal;
    private DefaultTableModel model;
     
    private Connection conn = new koneksi().connect();
     
    public void totalbiaya(){
        int jumlahbaris = jTable1.getRowCount();
        int totalbiaya = 0;
        int jumlahbarang, hargabarang;
        for(int i = 0; i <jumlahbaris; i++){
            jumlahbarang = Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            hargabarang = Integer.parseInt(jTable1.getValueAt (i, 3).toString());
            totalbiaya = totalbiaya + (jumlahbarang * hargabarang);
        }
        txttotal.setText(String.valueOf(totalbiaya));
        txttampil.setText("Rp "+ totalbiaya +",00");         
    }
     
    public void loadData() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{
            txtidbarang.getText(),
            txtnamabarang.getText(),
            txtjumlah.getText(),
            txtharga.getText()
        });
    }
     public void kosong() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        while (model.getRowCount()>0) {
            model.removeRow(0);
        }
    }

    public void utama () {
        txtnotrans.setText("");
        txtidbarang.setText("");
        txtnamabarang.setText("");
        txtharga.setText("");
        txtjumlah.setText("");
    }
    
    public void clear() {
        txtnotrans.setText("");
        txtnamacustomer.setText("");
        txtidcustomer.setText("");
        txttotal.setText("0");
        txtbayar.setText("0");
        txtkembalian.setText("0");
        txttampil.setText("0");
    }   

    public void clear2() {
        txtidbarang.setText("");
        txtnamabarang.setText("");
        txtharga.setText("");
        txtjumlah.setText("");
    }
    
    public void tambahtransaksi() {
        int jumlah, harga, total;

        jumlah = Integer.valueOf(txtjumlah.getText());
        harga = Integer.valueOf(txtharga.getText());
        total = jumlah * harga;

        txttotal.setText(String.valueOf(total));

        loadData();
        totalbiaya();
        clear2();
        txtidbarang.requestFocus();
    }
    
    public void setIdBarang(String kd_brg){
        txtidbarang.setText(kd_brg);
    }
    
    public void setNamaBarang(String nm_brg){
        txtnamabarang.setText(nm_brg);
    }
    
    public void setHargaJual(String hargajual){
        txtharga.setText(hargajual);
    }
    
    public void setIdPelanggan(String id){
        txtidcustomer.setText(id);
    }
    
    public void setNamaPelanggan(String nmplgn){
        txtnamacustomer.setText(nmplgn);
    }
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pemesanan.class.getName());
    public Pemesanan() {
        initComponents();
        setPreferredSize(new Dimension(2000, 800));
        model = new DefaultTableModel();

        jTable1.setModel(model);

        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Harga");

        utama();
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        txttanggal.setText(s.format(date));
        txttotal.setText("0");
        txtbayar.setText("0");
        txtkembalian.setText("0");
        txtidcustomer.requestFocus();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn_dasar = new javax.swing.JPanel();
        pn_inputatas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnotrans = new javax.swing.JTextField();
        txtidcustomer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnamacustomer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttanggal = new javax.swing.JTextField();
        btndatapelanggan = new javax.swing.JButton();
        pn_inputanbawah = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtidbarang = new javax.swing.JTextField();
        txtnamabarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtjumlah = new javax.swing.JTextField();
        btndatabarang = new javax.swing.JButton();
        pn_belanja = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnsipan = new javax.swing.JButton();
        txttampil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("No Transaksi");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("ID Customer");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Nama Customer");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Tanggal");

        txttanggal.setEnabled(false);

        btndatapelanggan.setText("...");
        btndatapelanggan.addActionListener(this::btndatapelangganActionPerformed);

        javax.swing.GroupLayout pn_inputatasLayout = new javax.swing.GroupLayout(pn_inputatas);
        pn_inputatas.setLayout(pn_inputatasLayout);
        pn_inputatasLayout.setHorizontalGroup(
            pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inputatasLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_inputatasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addComponent(txtnamacustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pn_inputatasLayout.createSequentialGroup()
                        .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(73, 73, 73)
                        .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidcustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnotrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_inputatasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)
                                .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(pn_inputatasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndatapelanggan)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        pn_inputatasLayout.setVerticalGroup(
            pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inputatasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnotrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndatapelanggan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_inputatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamacustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("ID Barang");

        txtidbarang.setEnabled(false);

        txtnamabarang.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Nama Barang");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Harga");

        txtharga.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Jumlah");

        txtjumlah.addActionListener(this::txtjumlahActionPerformed);

        btndatabarang.setText("...");
        btndatabarang.addActionListener(this::btndatabarangActionPerformed);

        javax.swing.GroupLayout pn_inputanbawahLayout = new javax.swing.GroupLayout(pn_inputanbawah);
        pn_inputanbawah.setLayout(pn_inputanbawahLayout);
        pn_inputanbawahLayout.setHorizontalGroup(
            pn_inputanbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inputanbawahLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndatabarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pn_inputanbawahLayout.setVerticalGroup(
            pn_inputanbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_inputanbawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_inputanbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtidbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_inputanbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pn_inputanbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_inputanbawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btndatabarang)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btntambah.setText("+");
        btntambah.addActionListener(this::btntambahActionPerformed);

        btnhapus.setText("-");
        btnhapus.addActionListener(this::btnhapusActionPerformed);

        btnsipan.setText("Simpan");
        btnsipan.addActionListener(this::btnsipanActionPerformed);

        txttampil.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Bayar");

        txtbayar.addActionListener(this::txtbayarActionPerformed);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Kembalian");

        javax.swing.GroupLayout pn_belanjaLayout = new javax.swing.GroupLayout(pn_belanja);
        pn_belanja.setLayout(pn_belanjaLayout);
        pn_belanjaLayout.setHorizontalGroup(
            pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_belanjaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnsipan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttampil, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_belanjaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_belanjaLayout.createSequentialGroup()
                        .addGroup(pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(112, 112, 112)
                .addComponent(btntambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhapus)
                .addGap(53, 53, 53))
        );
        pn_belanjaLayout.setVerticalGroup(
            pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_belanjaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsipan)
                    .addComponent(txttampil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah)
                    .addComponent(btnhapus)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_belanjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_inputatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pn_inputanbawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_belanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addComponent(pn_inputatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_inputanbawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_belanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_dasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        tambahtransaksi();
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        tambahtransaksi();
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            model.removeRow(row);
        }
        totalbiaya();
        txtbayar.setText("0");
        txtkembalian.setText("0");
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnsipanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsipanActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        String no_faktur = txtnotrans.getText();
        String tanggal = txttanggal.getText();
        String id_customer = txtidcustomer.getText();
        String total = txttotal.getText();

        try {
            conn.setAutoCommit(false); // biar transaksi aman

            // =========================
            // 1. SIMPAN DATA HEADER
            // =========================
            String sqlHeader = "INSERT INTO pemesanan (no_faktur, tanggal, id_pelanggan, nama_pelanggan, total, bayar, kembalian) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pHeader = conn.prepareStatement(sqlHeader);

            pHeader.setString(1, txtnotrans.getText());
            pHeader.setString(2, txttanggal.getText());
            pHeader.setString(3, txtidcustomer.getText());
            pHeader.setString(4, txtnamacustomer.getText());
            pHeader.setString(5, txttotal.getText());
            pHeader.setString(6, txtbayar.getText());
            pHeader.setString(7, txtkembalian.getText());

            pHeader.executeUpdate();
            pHeader.close();


            // =========================
            // 2. SIMPAN DETAIL BARANG
            // =========================
            int baris = jTable1.getRowCount();

            String sqlDetail = "INSERT INTO detail_pemesanan (no_faktur, id_barang, nama_barang, jumlah, harga_jual) VALUES (?,?,?,?,?)";
            PreparedStatement pDetail = conn.prepareStatement(sqlDetail);
            pDetail.setString(1, txtnotrans.getText());
            
            for (int i = 0; i < baris; i++) {
                pDetail.setString(2, jTable1.getValueAt(i, 0).toString());
                pDetail.setString(3, jTable1.getValueAt(i, 1).toString());
                pDetail.setString(4, jTable1.getValueAt(i, 2).toString());
                pDetail.setString(5, jTable1.getValueAt(i, 3).toString());

                pDetail.addBatch(); // lebih cepat dari execute satu-satu
            }

            pDetail.executeBatch();
            pDetail.close();


            // =========================
            // 3. COMMIT TRANSAKSI
            // =========================
            conn.commit();
            conn.setAutoCommit(true);

            // =========================
            // 4. RESET FORM
            // =========================
            clear();
            utama();
            kosong();
            txttampil.setText("Rp.0");

            System.out.println("Data berhasil disimpan!");

        } catch (Exception e) {
            try {
                conn.rollback(); // balikin kalau gagal
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }
        clear();
        utama();
        kosong();
        txttampil.setText("Rp.0");
    }//GEN-LAST:event_btnsipanActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        int total, bayar, kembalian;

        total = Integer.valueOf(txttotal.getText());
        bayar = Integer.valueOf(txtbayar.getText());

        if (total > bayar) {
            JOptionPane.showMessageDialog(this, "Uang tidak cukup untuk melakukan pembayaran");
        } else {
            kembalian = bayar - total;
            txtkembalian.setText(String.valueOf(kembalian));
                }
    }//GEN-LAST:event_txtbayarActionPerformed

    private void btndatabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatabarangActionPerformed
       Barang_popup barang = new Barang_popup(this);
       
       
       JDialog dialog = new JDialog(pesan, "Cari Data Barang", true);
       barang.setDialog(dialog);
       dialog.setContentPane(barang);
       dialog.pack();
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_btndatabarangActionPerformed

    private void btndatapelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatapelangganActionPerformed
       Pelanggan_popup pelanggan = new Pelanggan_popup(this);
       
       
       JDialog dialog = new JDialog(pesan, "Cari Data Barang", true);
       pelanggan.setDialog(dialog);
       dialog.setContentPane(pelanggan);
       dialog.pack();
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_btndatapelangganActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Pemesanan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndatabarang;
    private javax.swing.JButton btndatapelanggan;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsipan;
    private javax.swing.JButton btntambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pn_belanja;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_inputanbawah;
    private javax.swing.JPanel pn_inputatas;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidbarang;
    private javax.swing.JTextField txtidcustomer;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtnamabarang;
    private javax.swing.JTextField txtnamacustomer;
    private javax.swing.JTextField txtnotrans;
    private javax.swing.JTextField txttampil;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
