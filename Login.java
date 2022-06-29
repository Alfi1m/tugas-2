
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author hp
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Daftarmenu = new javax.swing.JLabel();
        grafikjumlahmahasiswa = new javax.swing.JButton();
        grafikjumlahdosen = new javax.swing.JButton();
        grafikkelulusan = new javax.swing.JButton();
        rataipk = new javax.swing.JButton();
        ratakelulusan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(108, 92, 231));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Daftarmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Daftarmenu.setForeground(new java.awt.Color(245, 246, 250));
        Daftarmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Daftarmenu.setText("Daftar Menu");

        grafikjumlahmahasiswa.setText("Garfik jumlah mahasiswa");
        grafikjumlahmahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafikjumlahmahasiswaActionPerformed(evt);
            }
        });

        grafikjumlahdosen.setText("Grafik jumlah dosen");
        grafikjumlahdosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafikjumlahdosenActionPerformed(evt);
            }
        });

        grafikkelulusan.setText("Grafik kelulusan");
        grafikkelulusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafikkelulusanActionPerformed(evt);
            }
        });

        rataipk.setText("Rata-rata IPK");
        rataipk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rataipkActionPerformed(evt);
            }
        });

        ratakelulusan.setText("Rata-rata kelulusan");
        ratakelulusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratakelulusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 446, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ratakelulusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grafikjumlahmahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grafikkelulusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grafikjumlahdosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rataipk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Daftarmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Daftarmenu)
                .addGap(18, 18, 18)
                .addComponent(grafikjumlahmahasiswa)
                .addGap(18, 18, 18)
                .addComponent(grafikjumlahdosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grafikkelulusan)
                .addGap(18, 18, 18)
                .addComponent(ratakelulusan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rataipk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grafikjumlahmahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafikjumlahmahasiswaActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset piedata=new DefaultCategoryDataset();
        piedata.setValue(500, "AKTIF", "AKTIF" );
        piedata.setValue(20, "NON-AKTIF", "NON-AKTIF");
        piedata.setValue(5, "CUTI", "CUTI");

        JFreeChart chart= ChartFactory.createBarChart("Chart Jumlah Mahasiswa FTI", "xxx", "yyy", piedata, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        ChartFrame frame =new ChartFrame ("Chart Jumlah Mahasiswa FTI",chart);
        frame.setVisible(true);
        frame.setBounds(500, 200, 500, 500);
    }//GEN-LAST:event_grafikjumlahmahasiswaActionPerformed

    private void grafikjumlahdosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafikjumlahdosenActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset piedata=new DefaultCategoryDataset();
        piedata.setValue(40, "INFORMATIKA", "INFORMATIKA" );
        piedata.setValue(30, "INDUSTRI", "INDUSTRI");
        piedata.setValue(30, "ELEKTO", "ELEKTRO");

        
        JFreeChart chart= ChartFactory.createBarChart("Cart Jumlah Dosen","xxx", "yyy", piedata, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        ChartFrame frame =new ChartFrame ("Chart Jumlah Dosen",chart);
        frame.setVisible(true);
        frame.setBounds(500, 200, 500, 500);
    }//GEN-LAST:event_grafikjumlahdosenActionPerformed

    private void grafikkelulusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafikkelulusanActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset piedata=new DefaultCategoryDataset();
        piedata.setValue(30, "FTI", "2016");
        piedata.setValue(20, "FTI", "2017");
        piedata.setValue(60, "FTI", "2018");
        piedata.setValue(30, "FTI", "2019");
        piedata.setValue(20, "FTI", "2020");
        piedata.setValue(60, "FTI", "2021");
        piedata.setValue(20, "ELEKTO", "2016");
        piedata.setValue(40, "ELEKTO", "2017");
        piedata.setValue(20, "ELEKTO", "2018");
        piedata.setValue(20, "ELEKTO", "2019");
        piedata.setValue(40, "ELEKTO", "2020");
        piedata.setValue(20, "ELEKTO", "2021");
        piedata.setValue(30, "INDUSTRI", "2016");
        piedata.setValue(30, "INDUSTRI", "2016");
        piedata.setValue(35, "INDUSTRI", "2016");
        piedata.setValue(49, "INDUSTRI", "2016");
        piedata.setValue(50, "INDUSTRI", "2016");
        piedata.setValue(38, "INDUSTRI", "2016");
        piedata.setValue(33, "INDUSTRI", "2016");
        
        
        JFreeChart chart = ChartFactory.createLineChart("Grafik kelulusan Mahasiswa FTI", "xxx", "yyy", piedata, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        ChartFrame frame =new ChartFrame ("Grafik kelulusan Mahasiswa FTI",chart);
        frame.setVisible(true);
        frame.setBounds(500, 200, 500, 500);
    }//GEN-LAST:event_grafikkelulusanActionPerformed

    private void rataipkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rataipkActionPerformed
        // TODO add your handling code here:
                DefaultCategoryDataset piedata=new DefaultCategoryDataset();
        piedata.setValue(3.0, "FTI", "2016");
        piedata.setValue(3.0, "FTI", "2017");
        piedata.setValue(3.3, "FTI", "2018");
        piedata.setValue(3.2, "FTI", "2019");
        piedata.setValue(3.5, "FTI", "2020");
        piedata.setValue(3.4, "FTI", "2021");
        piedata.setValue(2.6, "ELEKTO", "2016");
        piedata.setValue(3.7, "ELEKTO", "2017");
        piedata.setValue(2.8, "ELEKTO", "2018");
        piedata.setValue(2.9, "ELEKTO", "2019");
        piedata.setValue(3.2, "ELEKTO", "2020");
        piedata.setValue(3.1, "ELEKTO", "2021");
        piedata.setValue(3.0, "INDUSTRI", "2016");
        piedata.setValue(3.0, "INDUSTRI", "2016");
        piedata.setValue(3.5, "INDUSTRI", "2016");
        piedata.setValue(2.9, "INDUSTRI", "2016");
        piedata.setValue(3.4, "INDUSTRI", "2016");
        piedata.setValue(3.8, "INDUSTRI", "2016");
        piedata.setValue(3.3, "INDUSTRI", "2016");
        
        
        JFreeChart chart= ChartFactory.createLineChart("Grafik rata-rata IPK", "xxx", "yyy", piedata, PlotOrientation.VERTICAL, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        ChartFrame frame =new ChartFrame ("Grafik rata-rata IPK",chart);
        frame.setVisible(true);
        frame.setBounds(500, 200, 500, 500);
    }//GEN-LAST:event_rataipkActionPerformed

    private void ratakelulusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratakelulusanActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ratakelulusanActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Daftarmenu;
    private javax.swing.JButton grafikjumlahdosen;
    private javax.swing.JButton grafikjumlahmahasiswa;
    private javax.swing.JButton grafikkelulusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rataipk;
    private javax.swing.JButton ratakelulusan;
    // End of variables declaration//GEN-END:variables
}
