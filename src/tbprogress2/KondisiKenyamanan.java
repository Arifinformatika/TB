/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Deny SQP
 */
public class KondisiKenyamanan extends javax.swing.JFrame {

    /**
     * Creates new form KondisiKenyamanan
     */
    RuangKelas kls = new RuangKelas();
    int s = 0, ts = 0, kondisi;
    public KondisiKenyamanan() {
        initComponents();
        setResizable(false);
        PAus.setEditable(false);
        PBau.setEditable(false);
        PBising.setEditable(false);
        nyeret1();
        nyeret2();
        nyeret3();
    }
    public void nyeret1(){
                PersenBising.setEditable(false);	
	        PersenBising.setText(String.valueOf(Sbising.getValue()));	
	        Sbising.setMinorTickSpacing(5);	
	        Sbising.setMajorTickSpacing(20);	
	        Sbising.setPaintTicks(true);	
	        Sbising.setLabelTable(Sbising.getLabelTable());	
	        Sbising.setPaintLabels(true);
                Sbising.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    PersenBising.setText ( String.valueOf(Sbising.getValue()) );
                            int PBs = Integer.parseInt(PersenBising.getText());
                            if(PBs>=80){
                                PBising.setText("Sangat Bising");
                            }
                            else if(PBs<80&&PBs>=60){
                                PBising.setText("Bising");
                            }
                            else if(PBs<60&&PBs>=30){
                                PBising.setText("Sedikit Bising");
                            }
                            else if(PBs<30&&PBs>=10){
                                PBising.setText("Tidak Bising");
                            }
                            else if(PBs<10){
                                PBising.setText("Sepi/Tenang");
                            }
                        }	
	            }
	        );
    }
     public void nyeret2(){
                PersenBau.setEditable(false);	
	        PersenBau.setText(String.valueOf(Sbau.getValue()));	
	        Sbau.setMinorTickSpacing(5);	
	        Sbau.setMajorTickSpacing(20);	
	        Sbau.setPaintTicks(true);	
	        Sbau.setLabelTable(Sbau.getLabelTable());	
	        Sbau.setPaintLabels(true);
	        Sbau.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    PersenBau.setText ( String.valueOf(Sbau.getValue()) );	
                            int PBa = Integer.parseInt(PersenBau.getText());
                            if(PBa>=80){
                                PBau.setText("Sangat Bau");
                            }
                            else if(PBa<80&&PBa>=60){
                                PBau.setText("Bau");
                            }
                            else if(PBa<60&&PBa>=30){
                                PBau.setText("Sedikit Bau");
                            }
                            else if(PBa<30&&PBa>=10){
                                PBau.setText("Tidak Bau");
                            }
                            else if(PBa<10){
                                PBau.setText("Wangi");
                            }
                        }	
	            }
	        );
     }
     public void nyeret3(){
         PersenAus.setEditable(false);	
	        PersenAus.setText(String.valueOf(Saus.getValue()));	
	        Saus.setMinorTickSpacing(5);	
	        Saus.setMajorTickSpacing(20);	
	        Saus.setPaintTicks(true);	
	        Saus.setLabelTable(Saus.getLabelTable());	
	        Saus.setPaintLabels(true);
	        Saus.addChangeListener (	
	            new ChangeListener() {	 
	                public void stateChanged (ChangeEvent e) {	
	                    PersenAus.setText ( String.valueOf(Saus.getValue()) );	
                            int PA = Integer.parseInt(PersenAus.getText());
                            if(PA>=80){
                                PAus.setText("Sangat Aus");
                            }
                            else if(PA<80&&PA>=60){
                                PAus.setText("Aus");
                            }
                            else if(PA<60&&PA>=30){
                                PAus.setText("Sedikit Aus");
                            }
                            else if(PA<30){
                                PAus.setText("Tidak Aus");
                            }
                        }	
	            }
	        );
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Sbau = new javax.swing.JSlider();
        Sbising = new javax.swing.JSlider();
        BBanyak = new javax.swing.JCheckBox();
        BSedang = new javax.swing.JCheckBox();
        BSedikit = new javax.swing.JCheckBox();
        BNon = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        RBanyak = new javax.swing.JCheckBox();
        RSedang = new javax.swing.JCheckBox();
        RSedikit = new javax.swing.JCheckBox();
        RNon = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        Saus = new javax.swing.JSlider();
        PersenBising = new javax.swing.JTextField();
        PersenBau = new javax.swing.JTextField();
        PersenAus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ln = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        PBising = new javax.swing.JTextField();
        PBau = new javax.swing.JTextField();
        PAus = new javax.swing.JTextField();

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Apakah Bangunan Masih Kokoh ? ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Apakah Ada Kunci Pintu dan Jendela ?");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Apakah Ruangan Tidak Berbahaya ? ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("KENYAMANAN RUANG KELAS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Persentase Kebisingan Kelas                : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Presentase Bau di Kelas                       : ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kebocoran dalam Kelas                        :");

        BBanyak.setText("Banyak");
        BBanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBanyakActionPerformed(evt);
            }
        });

        BSedang.setText("Sedang");
        BSedang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSedangActionPerformed(evt);
            }
        });

        BSedikit.setText("Sedikit");
        BSedikit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSedikitActionPerformed(evt);
            }
        });

        BNon.setText("Tidak Ada");
        BNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Kerusakan  dalam Kelas                        :");

        RBanyak.setText("Banyak");
        RBanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBanyakActionPerformed(evt);
            }
        });

        RSedang.setText("Sedang");
        RSedang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSedangActionPerformed(evt);
            }
        });

        RSedikit.setText("Sedikit");
        RSedikit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSedikitActionPerformed(evt);
            }
        });

        RNon.setText("Tidak Ada");
        RNon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Persentase Keausan Permukaan Kelas  :");

        PersenBising.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        PersenBau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PersenBau.setText(" ");
        PersenBau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersenBauActionPerformed(evt);
            }
        });

        PersenAus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("%");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("%");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("%");

        Ln.setText("Selanjutnya");
        Ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnActionPerformed(evt);
            }
        });

        Del.setText("Hapus");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        PBising.setText("Parameter");

        PBau.setText("Parameter");

        PAus.setText("Parameter");
        PAus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BBanyak)
                        .addGap(18, 18, 18)
                        .addComponent(BSedang)
                        .addGap(18, 18, 18)
                        .addComponent(BSedikit)
                        .addGap(18, 18, 18)
                        .addComponent(BNon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sbau, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sbising, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PersenBising)
                                    .addComponent(PersenBau, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Saus, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(PersenAus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(PBau, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PBising, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RBanyak)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RSedang)
                                        .addGap(18, 18, 18)
                                        .addComponent(RSedikit))
                                    .addComponent(Ln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RNon)
                                    .addComponent(Del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(381, 381, 381)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(Sbising, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PersenBising, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PBising, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sbau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PersenBau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PBau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(PersenAus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Saus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PAus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(BBanyak)
                    .addComponent(BSedang)
                    .addComponent(BSedikit)
                    .addComponent(BNon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(RBanyak)
                    .addComponent(RSedang)
                    .addComponent(RSedikit)
                    .addComponent(RNon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ln)
                    .addComponent(Del))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PersenBauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersenBauActionPerformed
       
    }//GEN-LAST:event_PersenBauActionPerformed

    private void PAusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAusActionPerformed

    private void BBanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBanyakActionPerformed
        BSedang.setSelected(false);
        BSedikit.setSelected(false);
        BNon.setSelected(false);
    }//GEN-LAST:event_BBanyakActionPerformed

    private void BSedangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSedangActionPerformed
        BBanyak.setSelected(false);
        BSedikit.setSelected(false);
        BNon.setSelected(false);
    }//GEN-LAST:event_BSedangActionPerformed

    private void BSedikitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSedikitActionPerformed
        BBanyak.setSelected(false);
        BSedang.setSelected(false);
        BNon.setSelected(false);
    }//GEN-LAST:event_BSedikitActionPerformed

    private void BNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNonActionPerformed
        BBanyak.setSelected(false);
        BSedang.setSelected(false);
        BSedikit.setSelected(false);
    }//GEN-LAST:event_BNonActionPerformed

    private void RBanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBanyakActionPerformed
       RSedang.setSelected(false);
       RSedikit.setSelected(false);
       RNon.setSelected(false);               
    }//GEN-LAST:event_RBanyakActionPerformed

    private void RSedangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSedangActionPerformed
       RBanyak.setSelected(false);
       RSedikit.setSelected(false);
       RNon.setSelected(false); 
    }//GEN-LAST:event_RSedangActionPerformed

    private void RSedikitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSedikitActionPerformed
       RBanyak.setSelected(false);
       RSedang.setSelected(false);
       RNon.setSelected(false); 
    }//GEN-LAST:event_RSedikitActionPerformed

    private void RNonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNonActionPerformed
       RBanyak.setSelected(false);
       RSedang.setSelected(false);
       RSedikit.setSelected(false);
    }//GEN-LAST:event_RNonActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
       PersenAus.setText(null);
       PersenBau.setText(null);
       PersenBising.setText(null);
       PAus.setText(null);
       PBising.setText(null);
       PBau.setText(null);
       BBanyak.setSelected(false);
       BSedang.setSelected(false);
       BSedikit.setSelected(false);
       BNon.setSelected(false);
       RBanyak.setSelected(false);
       RSedang.setSelected(false);
       RSedikit.setSelected(false);
       RNon.setSelected(false); 
    }//GEN-LAST:event_DelActionPerformed
    //JTextField Bising,JTextField PersenBising,JTextField Bau,JTextField PersenBau,JTextField Aus,JTextField PersenAus
    private void LnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnActionPerformed
        IO x = new IO(PBising,PersenBising,PBau,PersenBau,PAus,PersenAus,BBanyak, BSedang, BSedikit, BNon, RBanyak, RSedang, RSedikit, RNon);
        Sistem n = new Sistem();
        kls = x.getRuangKelas();
        //String Kebisingan, String Bau, String Kebocoran, String Kerusakan, String Keausan, String x
       x.output(kls.getKebisingan(),kls.getBau(),kls.getKebocoran(),kls.getKerusakan(),kls.getKerusakan(),null);
       System.out.println("==============Analisis==================");
       if ("Tidak Bising".equalsIgnoreCase(kls.getKebisingan())||"Sepi/Tenang".equalsIgnoreCase(kls.getKebisingan())) {
            System.out.println("Kebisingan : Tidak Bising");
            s++;
        } else {
            System.out.println("Kebisingan : Bising");
            ts++;
        }
        if ("Tidak Bau".equalsIgnoreCase(kls.getBau())||"Wangi".equalsIgnoreCase(kls.getBau())) {
            System.out.println("Bau : Enak");
            s++;
        } else {
            System.out.println("Bau : Tidak Sedap");
            ts++;
        }
        if ("Tidak Begitu Parah".equalsIgnoreCase(kls.getKerusakan())||"Keadaan Baik".equalsIgnoreCase(kls.getKerusakan())) {
            System.out.println("Kerusakan : Tidak Rusak");
            s++;
        } else {
            System.out.println("Kerusakan : Rusak");
            ts++;
        }
        if ("Tidak Aus".equalsIgnoreCase(kls.getKeausan())) {
            System.out.println("Keausan : Tidak Ada");
            s++;
        } else {
            System.out.println("Keausan : Ada");
            ts++;
        }
//        if (s == 1) {
//            System.out.println("s");
//            kon = 1;
//        } else {
//            System.out.println("Tidak s");
//            kon = 0;
//        }
        n.persentaseKenyamanan(s);
        dispose();
        x.inputKondisiKeamanan();
    }//GEN-LAST:event_LnActionPerformed

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
//            java.util.logging.Logger.getLogger(KondisiKenyamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(KondisiKenyamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(KondisiKenyamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(KondisiKenyamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new KondisiKenyamanan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BBanyak;
    private javax.swing.JCheckBox BNon;
    private javax.swing.JCheckBox BSedang;
    private javax.swing.JCheckBox BSedikit;
    private javax.swing.JButton Del;
    private javax.swing.JButton Ln;
    private javax.swing.JTextField PAus;
    private javax.swing.JTextField PBau;
    private javax.swing.JTextField PBising;
    private javax.swing.JTextField PersenAus;
    private javax.swing.JTextField PersenBau;
    private javax.swing.JTextField PersenBising;
    private javax.swing.JCheckBox RBanyak;
    private javax.swing.JCheckBox RNon;
    private javax.swing.JCheckBox RSedang;
    private javax.swing.JCheckBox RSedikit;
    private javax.swing.JSlider Saus;
    private javax.swing.JSlider Sbau;
    private javax.swing.JSlider Sbising;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
