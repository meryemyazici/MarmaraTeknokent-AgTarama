/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package martekstaj;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MERYEM
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        // jLabel3 uzerindeki ikonu al
        Icon i = jLabel3.getIcon();
        // goruntuyu ImageIcon olarak al
        ImageIcon icon = (ImageIcon) i;
        // ImageIcon icindeki ikonu jLabel3 boyutuna gore ayarla
        Image image = icon.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        // jLabel3 e yeni ikonu ekle
        jLabel3.setIcon(new ImageIcon(image));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxSifreyiGoster = new javax.swing.JCheckBox();
        jTextFieldKullaniciAdi = new javax.swing.JTextField();
        jButtonGiris = new javax.swing.JButton();
        jPasswordFieldSifre = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Şifre:");

        jCheckBoxSifreyiGoster.setText("Şifreyi Göster");
        jCheckBoxSifreyiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSifreyiGosterActionPerformed(evt);
            }
        });

        jTextFieldKullaniciAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKullaniciAdiActionPerformed(evt);
            }
        });

        jButtonGiris.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGiris.setText("Giriş");
        jButtonGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirisActionPerformed(evt);
            }
        });

        jPasswordFieldSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSifreActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/martekstaj/martekLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSifreyiGoster)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldSifre)
                            .addComponent(jTextFieldKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSifreyiGoster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldKullaniciAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKullaniciAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKullaniciAdiActionPerformed


    private void jButtonGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirisActionPerformed
        // metin kutularina girilen kullaniciAdini ve sifreyi alir
        String girisKullaniciAdi = jTextFieldKullaniciAdi.getText();
        String girisSifre = new String(jPasswordFieldSifre.getPassword());

        // sqlLogin den nesne olustur
        sqlLogin log = new sqlLogin(girisKullaniciAdi, girisSifre);
        boolean girisBasarili = log.LoginSQL(); //sqlLogin sinifindaki LoginSQL() metodunun sonucunu al

        if (girisBasarili) { // giris basarili ise
            JOptionPane.showMessageDialog(null, "Giriş Başarılı");
            yoneticiIslemleri digerSayfa = new yoneticiIslemleri(); //new yoneticiIslemlerinden yeni sayfa olustur
            digerSayfa.setVisible(true); // gorunur hale getir
            this.dispose(); // mevcut pencereyi kapat

        } else {// giris basarisiz ise
            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Şifre Hatalı");

        }
    }//GEN-LAST:event_jButtonGirisActionPerformed

    private void jPasswordFieldSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSifreActionPerformed


    private void jCheckBoxSifreyiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSifreyiGosterActionPerformed
        if (jCheckBoxSifreyiGoster.isSelected()) {//sifreyiGoster secili ise
            jPasswordFieldSifre.setEchoChar((char) 0); //secili oldugu an butun karakterleri ac
        } else { //eger secili degil ise
            jPasswordFieldSifre.setEchoChar('*'); //kullanici secmeyi birakinca sifreyi kapa

        }
    }//GEN-LAST:event_jCheckBoxSifreyiGosterActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGiris;
    private javax.swing.JCheckBox jCheckBoxSifreyiGoster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordFieldSifre;
    private javax.swing.JTextField jTextFieldKullaniciAdi;
    // End of variables declaration//GEN-END:variables

}
