package digittal.signature.rsa;
public class Show extends javax.swing.JFrame {

    /**
     * Creates new form Show
     */
    public Show() {
        this.setLocation(200, 30);
        this.setResizable(false);
    
        initComponents();
        
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digittal/signature/rsa/How-does-a-digital-signature-work.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
}
