/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

/**
 *
 * @author Deny SQP
 */
public class KondisiKebersihan extends javax.swing.JFrame {

    /**
     * Creates new form KondisiLingkungan
     */
     RuangKelas kls = new RuangKelas();
    int s = 0, ts = 0, kondisi;
    public KondisiKebersihan() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LB = new javax.swing.JCheckBox();
        LBR = new javax.swing.JCheckBox();
        DB = new javax.swing.JCheckBox();
        DBR = new javax.swing.JCheckBox();
        AB = new javax.swing.JCheckBox();
        ABR = new javax.swing.JCheckBox();
        JB = new javax.swing.JCheckBox();
        JBR = new javax.swing.JCheckBox();
        Selanjutnya = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        PB = new javax.swing.JCheckBox();
        ABR1 = new javax.swing.JCheckBox();

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Persentase Kebisingan Kelas                : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Presentase Bau di Kelas                       : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Persentase Keausan Permukaan Kelas  :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("KEBERSIHAN RUANG KELAS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kondisi Lantai      :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Kondisi Dinding   :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Kondisi Atap       :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Kondisi Pintu      :");

        LB.setText("Bersih");
        LB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBActionPerformed(evt);
            }
        });

        LBR.setText("Kotor");
        LBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBRActionPerformed(evt);
            }
        });

        DB.setText("Bersih");
        DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBActionPerformed(evt);
            }
        });

        DBR.setText("Kotor");
        DBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBRActionPerformed(evt);
            }
        });

        AB.setText("Bersih");
        AB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABActionPerformed(evt);
            }
        });

        ABR.setText("Kotor");
        ABR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABRActionPerformed(evt);
            }
        });

        JB.setText("Bersih");
        JB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActionPerformed(evt);
            }
        });

        JBR.setText("Kotor");
        JBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRActionPerformed(evt);
            }
        });

        Selanjutnya.setText("Selanjutnya");
        Selanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelanjutnyaActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus");

        jButton1.setText("Baik Semua");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Kondisi Jendela   :");

        PB.setText("Bersih");
        PB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBActionPerformed(evt);
            }
        });

        ABR1.setText("Kotor");
        ABR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LB)
                                        .addComponent(DB)
                                        .addComponent(AB))
                                    .addComponent(PB))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LBR)
                                    .addComponent(DBR)
                                    .addComponent(ABR)
                                    .addComponent(ABR1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Selanjutnya)
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(68, 68, 68)
                                        .addComponent(JB)
                                        .addGap(14, 14, 14)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(JBR))))
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB)
                    .addComponent(LBR)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DB)
                    .addComponent(DBR)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AB)
                    .addComponent(ABR)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(PB)
                    .addComponent(ABR1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(JB)
                    .addComponent(JBR))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selanjutnya)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBActionPerformed
        LBR.setSelected(false);
    }//GEN-LAST:event_LBActionPerformed

    private void LBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBRActionPerformed
        LB.setSelected(false);
    }//GEN-LAST:event_LBRActionPerformed

    private void DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBActionPerformed
        DBR.setSelected(false);
    }//GEN-LAST:event_DBActionPerformed

    private void DBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBRActionPerformed
        DB.setSelected(false);
    }//GEN-LAST:event_DBRActionPerformed

    private void ABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABActionPerformed
        ABR.setSelected(false);
    }//GEN-LAST:event_ABActionPerformed

    private void ABRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABRActionPerformed
        AB.setSelected(false);
    }//GEN-LAST:event_ABRActionPerformed

    private void JBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActionPerformed
        JBR.setSelected(false);
    }//GEN-LAST:event_JBActionPerformed

    private void JBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRActionPerformed
        JB.setSelected(false);
    }//GEN-LAST:event_JBRActionPerformed

    private void SelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelanjutnyaActionPerformed
        IO x = new IO(LB,LBR,DB,DBR,AB,ABR,PB,ABR1,JB,JBR);
        kls = x.getRuangKelas();
        Sistem n = new Sistem();
        int kon;
        x.output(kls.getKondisiLantai(), kls.getKondisiDinding(), kls.getKondisiAtap(), kls.getKondisiPintu(), kls.getKondisiJendela());
        System.out.println("==============Analisis=================="); 
        if (kls.getKondisiLantai().equalsIgnoreCase("Lantai Bersih")) {
            System.out.println("Kondisi Lantai : Sesuai");
            s++;
        } else {
            System.out.println("Kondisi Lantai : Tidak Sesuai");
            ts++;
        }
        if (kls.getKondisiDinding().equalsIgnoreCase("Dinding Bersih/Baik")){
            System.out.println("Kondisi Dinding : Sesuai");
            s++;
        }else {
            ts++;
            System.out.println("Kondisi Dinding : Tidak Sesuai");
        }
        if (kls.getKondisiAtap().equalsIgnoreCase("Atap Bersih")){
            System.out.println("Kondisi Atap : Sesuai");
            s++;
        }else{
            System.out.println("Kondisi Atap : Tidak Sesuai");
            ts++;
        }
        if (kls.getKondisiPintu().equalsIgnoreCase("Pintu Bersih/Baik")){
            System.out.println("Kondisi Pintu : Sesuai");
            s++;
        }else {
            System.out.println("Kondisi Pintu : Tidak Sesuai");
            ts++;
        }
        if (kls.getKondisiJendela().equalsIgnoreCase("Jendela Bersih/Baik")){
            System.out.println("Kondisi Jendela : Sesuai");
            s++;
        } else {
            System.out.println("Kondisi Jendela : Tidak Sesuai");
            ts++;
        }
        n.persentaseKondisiLingkungan(s);
        dispose();
        x.inputKondisiKenyamanan();
    }//GEN-LAST:event_SelanjutnyaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JB.setSelected(true);
        LB.setSelected(true);
        DB.setSelected(true);
        AB.setSelected(true);
        PB.setSelected(true);
        JBR.setSelected(false);
        LBR.setSelected(false);
        DBR.setSelected(false);
        ABR.setSelected(false);
        ABR1.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBActionPerformed
       ABR1.setSelected(false);
    }//GEN-LAST:event_PBActionPerformed

    private void ABR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABR1ActionPerformed
        PB.setSelected(false);
    }//GEN-LAST:event_ABR1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new KondisiLingkungan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AB;
    private javax.swing.JCheckBox ABR;
    private javax.swing.JCheckBox ABR1;
    private javax.swing.JCheckBox DB;
    private javax.swing.JCheckBox DBR;
    private javax.swing.JCheckBox JB;
    private javax.swing.JCheckBox JBR;
    private javax.swing.JCheckBox LB;
    private javax.swing.JCheckBox LBR;
    private javax.swing.JCheckBox PB;
    private javax.swing.JButton Selanjutnya;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
