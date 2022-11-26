

/**
 *
 * @author Lenovo
 */


import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form MenuJava
     */
    static String pemesan;
    public Menu(String namaPemesan) {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        pemesan = namaPemesan;
    }
    
    public Menu(){
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        LblMenu = new javax.swing.JLabel();
        LblPembayaran = new javax.swing.JLabel();
        LblMenu1 = new javax.swing.JLabel();
        LblNamaMenu1 = new javax.swing.JLabel();
        LblHarga1 = new javax.swing.JLabel();
        BtnMinusMenu1 = new javax.swing.JButton();
        BtnAddMenu1 = new javax.swing.JButton();
        JmlhMenu1 = new javax.swing.JTextField();
        BtnMinusMenu2 = new javax.swing.JButton();
        BtnAddMenu2 = new javax.swing.JButton();
        JmlhMenu2 = new javax.swing.JTextField();
        LblMenu2 = new javax.swing.JLabel();
        LblNamaMenu2 = new javax.swing.JLabel();
        LblHarga2 = new javax.swing.JLabel();
        LblMenu3 = new javax.swing.JLabel();
        LblHarga3 = new javax.swing.JLabel();
        BtnMinusMenu3 = new javax.swing.JButton();
        JmlhMenu3 = new javax.swing.JTextField();
        LblNamaMenu3 = new javax.swing.JLabel();
        BtnAddMenu3 = new javax.swing.JButton();
        LblHarga4 = new javax.swing.JLabel();
        LblNamaMenu4 = new javax.swing.JLabel();
        BtnAddMenu4 = new javax.swing.JButton();
        LblMenu4 = new javax.swing.JLabel();
        BtnMinusMenu4 = new javax.swing.JButton();
        JmlhMenu4 = new javax.swing.JTextField();
        LblPesanan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(186, 79, 84));

        LblMenu.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMenu.setText("MENU ");

        LblPembayaran.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblPembayaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPembayaran.setText("PEMBAYARAN");

        LblMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("mieGoreng.png"))); // NOI18N
        LblMenu1.setText("jLabel2");

        LblNamaMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblNamaMenu1.setText("Mie Goreng");

        LblHarga1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblHarga1.setText("Rp10.000");

        BtnMinusMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnMinusMenu1.setText("-");
        BtnMinusMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusMenu1ActionPerformed(evt);
            }
        });

        BtnAddMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnAddMenu1.setText("+");
        BtnAddMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddMenu1ActionPerformed(evt);
            }
        });

        JmlhMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JmlhMenu1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JmlhMenu1.setText("0");

        BtnMinusMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnMinusMenu2.setText("-");
        BtnMinusMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusMenu2ActionPerformed(evt);
            }
        });

        BtnAddMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnAddMenu2.setText("+");
        BtnAddMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddMenu2ActionPerformed(evt);
            }
        });

        JmlhMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JmlhMenu2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JmlhMenu2.setText("0");

        LblMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("mieKuah.png"))); // NOI18N
        LblMenu2.setText("jLabel2");

        LblNamaMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblNamaMenu2.setText("Mie Kuah");

        LblHarga2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblHarga2.setText("Rp10.000");

        LblMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("mieCabeIjo.png"))); // NOI18N
        LblMenu3.setText("jLabel2");

        LblHarga3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblHarga3.setText("Rp10.000");

        BtnMinusMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnMinusMenu3.setText("-");
        BtnMinusMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusMenu3ActionPerformed(evt);
            }
        });

        JmlhMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JmlhMenu3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JmlhMenu3.setText("0");

        LblNamaMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblNamaMenu3.setText("Mie Cabe Ijo");

        BtnAddMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnAddMenu3.setText("+");
        BtnAddMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddMenu3ActionPerformed(evt);
            }
        });

        LblHarga4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblHarga4.setText("Rp10.000");

        LblNamaMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblNamaMenu4.setText("Mie Rendang");

        BtnAddMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnAddMenu4.setText("+");
        BtnAddMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddMenu4ActionPerformed(evt);
            }
        });
        


        LblMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("mieRendang.png"))); // NOI18N
        LblMenu4.setText("jLabel2");

        BtnMinusMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnMinusMenu4.setText("-");
        BtnMinusMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusMenu4ActionPerformed(evt);
            }
        });

        JmlhMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JmlhMenu4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JmlhMenu4.setText("0");

        LblPesanan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblPesanan.setText("Pesanan");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QR");

        btnCetak.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCetak.setText("Cetak Bukti");
        btnCetak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCetakMenu4MouseClicked(evt);
            }
        });
        
        

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("qrcode.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(LblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(LblPembayaran)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNamaMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNamaMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblHarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblHarga3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNamaMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblHarga4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNamaMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMinusMenu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JmlhMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAddMenu1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMinusMenu2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JmlhMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAddMenu2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMinusMenu3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JmlhMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAddMenu3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMinusMenu4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JmlhMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAddMenu4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPembayaran))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnMinusMenu1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnAddMenu1)
                                        .addComponent(JmlhMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPesanan)
                                    .addComponent(LblMenu1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(LblNamaMenu1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblHarga1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnMinusMenu2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnAddMenu2)
                                        .addComponent(JmlhMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(LblMenu2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(LblNamaMenu2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblHarga2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnMinusMenu3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BtnAddMenu3)
                                        .addComponent(JmlhMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(LblNamaMenu3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblHarga3))
                            .addComponent(LblMenu3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMenu4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(BtnMinusMenu4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(BtnAddMenu4)
                                                    .addComponent(JmlhMenu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LblNamaMenu4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(LblHarga4)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    //4 nama menu 
        int Mie_Goreng = 0 ;
        int Mie_Kuah = 0 ;
        int Mie_Cabe_Ijo = 0 ;
        int Mie_Rendang = 0 ;
        
    //harga dari menu 
        int harga_Mie_Goreng     = 10000;
        int harga_Mie_Kuah       = 10000;
        int harga_Mie_Cabe_Ijo   = 10000;
        int harga_Mie_Rendang    = 10000;
    
    //total harga
        int totalharga = 0 ;
        
    private void cetakPesanan(){
        if(Mie_Goreng>0){
            jTextArea1.setText("Mie Goreng\t"+Integer.toString(Mie_Goreng)+"\n");
        }
        else{
            jTextArea1.setText("");
        }
        if(Mie_Kuah>0){
            jTextArea1.append("Mie Kuah\t"+Integer.toString(Mie_Kuah)+"\n");
        }
        if(Mie_Cabe_Ijo>0){
            jTextArea1.append("Mie Cabe Ijo\t"+Integer.toString(Mie_Cabe_Ijo)+"\n");
        }
        if(Mie_Rendang>0){
            jTextArea1.append("Mie Rendang\t"+Integer.toString(Mie_Rendang)+"\n");
        }
        
        jTextArea1.append("\n\n\n\t\t" + "Harga Total : " + totalharga);
    }
        
    private void BtnMinusMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(Mie_Goreng>0){
             Mie_Goreng -= 1 ;  
             //harganya
            totalharga -= harga_Mie_Goreng;
        }
        JmlhMenu1.setText(" "+Integer.toString(Mie_Goreng));
        cetakPesanan();
    }                                             

    private void BtnAddMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        Mie_Goreng += 1 ;
        //harganya
        totalharga += harga_Mie_Goreng;
        JmlhMenu1.setText(" "+Integer.toString(Mie_Goreng));
        cetakPesanan();
    }                                           

    private void BtnMinusMenu2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(Mie_Kuah>0){
             Mie_Kuah -= 1 ;  
             //harganya
            totalharga -= harga_Mie_Kuah;
        }
        
        JmlhMenu2.setText(" "+Integer.toString(Mie_Kuah));
        cetakPesanan();
    }                                             

    private void BtnAddMenu2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        Mie_Kuah += 1 ;
        //harganya
        totalharga += harga_Mie_Kuah;

        JmlhMenu2.setText(" "+Integer.toString(Mie_Kuah));
        cetakPesanan();
    }                                           

    private void BtnMinusMenu3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(Mie_Cabe_Ijo>0){
             Mie_Cabe_Ijo -= 1 ;
             //harganya
            totalharga -= harga_Mie_Cabe_Ijo;
        }
        JmlhMenu3.setText(" "+Integer.toString(Mie_Cabe_Ijo));
        cetakPesanan();
    }                                             

    private void BtnAddMenu3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        Mie_Cabe_Ijo += 1 ;
        //harganya
        totalharga += harga_Mie_Cabe_Ijo;
        JmlhMenu3.setText(" "+Integer.toString(Mie_Cabe_Ijo));
        cetakPesanan();
    }                                           

    private void BtnAddMenu4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:

        Mie_Rendang += 1 ;
        //harganya
        totalharga += harga_Mie_Rendang;
        JmlhMenu4.setText(" "+Integer.toString(Mie_Rendang));
        cetakPesanan();
    }                                           

    private void BtnMinusMenu4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if(Mie_Rendang>0){
             Mie_Rendang -= 1 ;  
             //harganya
             totalharga -= harga_Mie_Rendang;
        }
        JmlhMenu4.setText(" "+Integer.toString(Mie_Rendang));
        cetakPesanan();
    }
    
    /*Ini adalah fungsi untuk mencetak semua pesanan yg telah input
       */
    
    private void cetak(){
        JOptionPane.showMessageDialog(this,"Pesanan berhasil dilakukan");
    }
    
    /*private void BtnCetakMenuActionPerformed(java.awt.event.ActionEvent evt){
        JOptionPane.showMessageDialog(this,"Pesanan");
    }*/
    
    private void BtnCetakMenu4MouseClicked(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here:
        cetak();
        Bukti bukti1= new Bukti(pemesan,Mie_Goreng,Mie_Kuah,Mie_Cabe_Ijo,Mie_Rendang);
        bukti1.display();
        
        Riwayat riwayat = new Riwayat();
        riwayat.setVisible(true);
        riwayat.pack();
        riwayat.setLocationRelativeTo(null);
        dispose();
        String cetakPesanan;
        cetakPesanan = ("\nMie Goreng : "+Mie_Goreng+"\t\nMie Kuah : "+Mie_Kuah+"\t\nMie Ijo : "+Mie_Cabe_Ijo+"\t\nMie Rendang : "+Mie_Rendang);
        //Add to table
                Riwayat.AddRowToJTable(new Object[]{
                                                  pemesan,
                                                  cetakPesanan,
                                                  totalharga,
                                                  java.time.LocalDate.now().toString()
                                                });
    }     

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu(pemesan).setVisible(true);
       });
    }
    
    class MakeFrame{
        Menu menu = new Menu(pemesan);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BtnAddMenu1;
    private javax.swing.JButton BtnAddMenu2;
    private javax.swing.JButton BtnAddMenu3;
    private javax.swing.JButton BtnAddMenu4;
    private javax.swing.JButton BtnMinusMenu1;
    private javax.swing.JButton BtnMinusMenu2;
    private javax.swing.JButton BtnMinusMenu3;
    private javax.swing.JButton BtnMinusMenu4;
    private javax.swing.JTextField JmlhMenu1;
    private javax.swing.JTextField JmlhMenu2;
    private javax.swing.JTextField JmlhMenu3;
    private javax.swing.JTextField JmlhMenu4;
    private javax.swing.JLabel LblHarga1;
    private javax.swing.JLabel LblHarga2;
    private javax.swing.JLabel LblHarga3;
    private javax.swing.JLabel LblHarga4;
    private javax.swing.JLabel LblMenu;
    private javax.swing.JLabel LblMenu1;
    private javax.swing.JLabel LblMenu2;
    private javax.swing.JLabel LblMenu3;
    private javax.swing.JLabel LblMenu4;
    private javax.swing.JLabel LblNamaMenu1;
    private javax.swing.JLabel LblNamaMenu2;
    private javax.swing.JLabel LblNamaMenu3;
    private javax.swing.JLabel LblNamaMenu4;
    private javax.swing.JLabel LblPembayaran;
    private javax.swing.JLabel LblPesanan;
    private javax.swing.JButton btnCetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
