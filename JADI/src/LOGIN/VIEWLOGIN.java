/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIN;

/**
 *
 * @author Erzi Hutama
 */
public class VIEWLOGIN extends javax.swing.JFrame {

    /**
     * Creates new form VIEWLOGIN
     */
    public VIEWLOGIN() {
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

        MENU = new javax.swing.JPanel();
        BGMENU = new javax.swing.JPanel();
        BGCONTROL = new javax.swing.JPanel();
        PROFIL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ABOUT = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();
        CERITA = new javax.swing.JLabel();
        IMAJINASI = new javax.swing.JLabel();
        PANELLOGOUT = new javax.swing.JPanel();
        LOGOUT = new javax.swing.JLabel();
        MAINPANEL1 = new javax.swing.JPanel();
        PANELHOME = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PANELCERITA = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PANELIMAJINASI = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        PANELABOUT = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LOGIN = new javax.swing.JPanel();
        SIGNUP = new javax.swing.JPanel();
        btn2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SIGNIN = new javax.swing.JPanel();
        btn1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LOG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JLabel();
        TXTSIGNIN = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jCheckBox3 = new javax.swing.JCheckBox();
        txtPassLog = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        txtUsname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TXTSIGNUP = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNamad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtNamab = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 23, 25));

        MENU.setPreferredSize(new java.awt.Dimension(840, 556));

        BGMENU.setBackground(new java.awt.Color(22, 23, 25));
        BGMENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGCONTROL.setBackground(new java.awt.Color(41, 42, 44));
        BGCONTROL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PROFIL.setBackground(new java.awt.Color(102, 102, 102));
        PROFIL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN/c.png"))); // NOI18N
        PROFIL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ERZI HUTAMA DWIRAMA PUTRA");
        PROFIL.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        BGCONTROL.add(PROFIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 180));

        ABOUT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ABOUT.setForeground(new java.awt.Color(255, 255, 255));
        ABOUT.setText("A B O U T");
        ABOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ABOUTMouseClicked(evt);
            }
        });
        BGCONTROL.add(ABOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        HOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setText("H O M E");
        HOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOMEMouseClicked(evt);
            }
        });
        BGCONTROL.add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        CERITA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CERITA.setForeground(new java.awt.Color(255, 255, 255));
        CERITA.setText("C E R I T A");
        CERITA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CERITAMouseClicked(evt);
            }
        });
        BGCONTROL.add(CERITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        IMAJINASI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IMAJINASI.setForeground(new java.awt.Color(255, 255, 255));
        IMAJINASI.setText("I M A J I N A S I");
        IMAJINASI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMAJINASIMouseClicked(evt);
            }
        });
        BGCONTROL.add(IMAJINASI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        PANELLOGOUT.setBackground(new java.awt.Color(102, 102, 102));
        PANELLOGOUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGOUT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT.setText("L O G  O U T");
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });
        PANELLOGOUT.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        BGCONTROL.add(PANELLOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 210, 40));

        BGMENU.add(BGCONTROL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        MAINPANEL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANELHOME.setBackground(new java.awt.Color(22, 23, 25));
        PANELHOME.setPreferredSize(new java.awt.Dimension(640, 560));
        PANELHOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APLIKASI INI DI BUAT UNTUK DI MANFAATKAN DALAM BENTUK APA PUN ");
        PANELHOME.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INI AKAN MENJADI MODAL UNTUK BELAJAR MEMBUAT APLIKASI SELANJUTNYA");
        PANELHOME.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JADI SAKSIKANLAH");
        PANELHOME.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        MAINPANEL1.add(PANELHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 620, 560));

        PANELCERITA.setBackground(new java.awt.Color(22, 23, 25));
        PANELCERITA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("APLIKASI INI DI BUAT DENGAN TUJUAN SEBAGAI TUGAS DAN PEMBELAJARAN DALAM MENGGUNAKAN NETBEANS ");
        PANELCERITA.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 108, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SEHINGGA SANGAT MUDAH UNTUK MEMBANTU TEMAN KITA YANG SEDANG KE SUSAHAN ");
        PANELCERITA.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN/icon.png"))); // NOI18N
        PANELCERITA.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        MAINPANEL1.add(PANELCERITA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 640, 560));

        PANELIMAJINASI.setBackground(new java.awt.Color(22, 23, 25));
        PANELIMAJINASI.setPreferredSize(new java.awt.Dimension(640, 560));
        PANELIMAJINASI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("DALAM SEBUAH IMAJINASI SEMUA BERHARAP MENDAPATKAN NILAI SEMPURNA");
        PANELIMAJINASI.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        MAINPANEL1.add(PANELIMAJINASI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 640, -1));

        PANELABOUT.setBackground(new java.awt.Color(204, 204, 204));
        PANELABOUT.setPreferredSize(new java.awt.Dimension(640, 560));
        PANELABOUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("ERZI HUTAMA DWIRAMAA PUTRA");
        PANELABOUT.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel23.setText("PBO11");
        PANELABOUT.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel25.setText("APP VERSI 0.1");
        PANELABOUT.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel27.setText("UNIVERSITAS KOMPUTER INDONESIA");
        PANELABOUT.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN/POTO.png"))); // NOI18N
        PANELABOUT.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 550));

        MAINPANEL1.add(PANELABOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 640, 560));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MAINPANEL1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout MENULayout = new javax.swing.GroupLayout(MENU);
        MENU.setLayout(MENULayout);
        MENULayout.setHorizontalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGMENU, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MENULayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MAINPANEL1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MENULayout.setVerticalGroup(
            MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGMENU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MENULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MENULayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MAINPANEL1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        LOGIN.setBackground(new java.awt.Color(22, 23, 25));
        LOGIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SIGNUP.setBackground(new java.awt.Color(102, 102, 102));
        SIGNUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNUPMouseClicked(evt);
            }
        });
        SIGNUP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN/B.png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        SIGNUP.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 109));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("S I G N  U P");
        SIGNUP.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 194, -1, -1));

        LOGIN.add(SIGNUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 280));

        SIGNIN.setBackground(new java.awt.Color(0, 0, 0));
        SIGNIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIGNINMouseClicked(evt);
            }
        });
        SIGNIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGIN/A.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        SIGNIN.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 109));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("S I G N   I N");
        SIGNIN.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 194, -1, -1));

        LOGIN.add(SIGNIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 280));

        LOG.setBackground(new java.awt.Color(41, 42, 44));
        LOG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" L E T  M E  I N");
        LOG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnlogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnlogin.setText(">");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(btnlogin)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnlogin)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LOG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 100, 90));

        LOGIN.add(LOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 840, 90));

        TXTSIGNIN.setBackground(new java.awt.Color(22, 23, 25));
        TXTSIGNIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TXTSIGNIN.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 370, 10));
        TXTSIGNIN.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 360, 10));

        jCheckBox3.setBackground(new java.awt.Color(41, 42, 44));
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("R E M E M B E R   M E");
        jCheckBox3.setBorder(null);
        TXTSIGNIN.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 190, -1));

        txtPassLog.setBackground(new java.awt.Color(22, 23, 25));
        txtPassLog.setBorder(null);
        TXTSIGNIN.add(txtPassLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 370, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("P A S S W O R D ");
        TXTSIGNIN.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        txtUsname.setBackground(new java.awt.Color(22, 23, 25));
        txtUsname.setBorder(null);
        TXTSIGNIN.add(txtUsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 360, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("U S E R  N A M E");
        TXTSIGNIN.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        LOGIN.add(TXTSIGNIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        TXTSIGNUP.setBackground(new java.awt.Color(22, 23, 25));
        TXTSIGNUP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PASSWORD");
        TXTSIGNUP.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NAMA DEPAN");
        TXTSIGNUP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NAMA BELAKANG");
        TXTSIGNUP.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("EMAIL");
        TXTSIGNUP.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        txtNamad.setBackground(new java.awt.Color(22, 23, 25));
        txtNamad.setForeground(new java.awt.Color(255, 255, 255));
        txtNamad.setBorder(null);
        txtNamad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamadActionPerformed(evt);
            }
        });
        TXTSIGNUP.add(txtNamad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 290, 30));
        TXTSIGNUP.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 290, -1));
        TXTSIGNUP.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 290, -1));

        txtNamab.setBackground(new java.awt.Color(22, 23, 25));
        txtNamab.setForeground(new java.awt.Color(255, 255, 255));
        txtNamab.setBorder(null);
        txtNamab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamabActionPerformed(evt);
            }
        });
        TXTSIGNUP.add(txtNamab, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 290, 30));
        TXTSIGNUP.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 290, -1));

        txtEmail.setBackground(new java.awt.Color(22, 23, 25));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        TXTSIGNUP.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 290, 30));
        TXTSIGNUP.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 290, -1));

        jPasswordField2.setBackground(new java.awt.Color(22, 23, 25));
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(null);
        TXTSIGNUP.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 290, 30));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("USERNAME");
        TXTSIGNUP.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));
        TXTSIGNUP.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 290, -1));

        txtUsername.setBackground(new java.awt.Color(22, 23, 25));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        TXTSIGNUP.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 290, 30));

        jCheckBox2.setBackground(new java.awt.Color(22, 23, 25));
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("i aggre terms and conditions");
        TXTSIGNUP.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        LOGIN.add(TXTSIGNUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 630, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        TXTSIGNIN.setVisible(true);
    }//GEN-LAST:event_btn1MouseClicked

    private void SIGNINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNINMouseClicked
      
    }//GEN-LAST:event_SIGNINMouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        TXTSIGNIN.setVisible(false);
    }//GEN-LAST:event_btn2MouseClicked

    private void SIGNUPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIGNUPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SIGNUPMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNamabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamabActionPerformed

    private void txtNamadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamadActionPerformed

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
       MENU.setVisible(true);
       LOGIN.setVisible(false);
    }//GEN-LAST:event_btnloginMouseClicked

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void IMAJINASIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMAJINASIMouseClicked
        MAINPANEL1.removeAll();
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();

        MAINPANEL1.add(PANELIMAJINASI);
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();
    }//GEN-LAST:event_IMAJINASIMouseClicked

    private void CERITAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERITAMouseClicked
           MAINPANEL1.removeAll();
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();

        MAINPANEL1.add(PANELCERITA);
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();
    }//GEN-LAST:event_CERITAMouseClicked

    private void HOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseClicked
        MAINPANEL1.removeAll();
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();

        MAINPANEL1.add(PANELHOME);
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();
    }//GEN-LAST:event_HOMEMouseClicked

    private void ABOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABOUTMouseClicked
           MAINPANEL1.removeAll();
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();

        MAINPANEL1.add(PANELABOUT);
        MAINPANEL1.repaint();
        MAINPANEL1.revalidate();
    }//GEN-LAST:event_ABOUTMouseClicked

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
            java.util.logging.Logger.getLogger(VIEWLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEWLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEWLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEWLOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIEWLOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABOUT;
    private javax.swing.JPanel BGCONTROL;
    private javax.swing.JPanel BGMENU;
    private javax.swing.JLabel CERITA;
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel IMAJINASI;
    private javax.swing.JPanel LOG;
    private javax.swing.JPanel LOGIN;
    private javax.swing.JLabel LOGOUT;
    private javax.swing.JPanel MAINPANEL1;
    private javax.swing.JPanel MENU;
    private javax.swing.JPanel PANELABOUT;
    private javax.swing.JPanel PANELCERITA;
    private javax.swing.JPanel PANELHOME;
    private javax.swing.JPanel PANELIMAJINASI;
    private javax.swing.JPanel PANELLOGOUT;
    private javax.swing.JPanel PROFIL;
    private javax.swing.JPanel SIGNIN;
    private javax.swing.JPanel SIGNUP;
    private javax.swing.JPanel TXTSIGNIN;
    private javax.swing.JPanel TXTSIGNUP;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNamab;
    private javax.swing.JTextField txtNamad;
    private javax.swing.JPasswordField txtPassLog;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsname;
    // End of variables declaration//GEN-END:variables
}
