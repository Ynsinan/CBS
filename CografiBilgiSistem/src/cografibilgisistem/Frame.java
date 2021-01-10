package cografibilgisistem;

import java.awt.BasicStroke;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.lang.reflect.Array;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicBorders;

public class Frame extends javax.swing.JFrame {
    

    Graphics2D ekle;

    public Frame() {
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nokta_x1 = new javax.swing.JTextField();
        nokta_y1 = new javax.swing.JTextField();
        nokta_kücük = new javax.swing.JCheckBox();
        nokta_orta = new javax.swing.JCheckBox();
        nokta_buyuk = new javax.swing.JCheckBox();
        noktaButton = new javax.swing.JRadioButton();
        cizgiButton = new javax.swing.JRadioButton();
        poligonButton = new javax.swing.JRadioButton();
        cizgi_kücük = new javax.swing.JCheckBox();
        cizgi_orta = new javax.swing.JCheckBox();
        cizgi_buyuk = new javax.swing.JCheckBox();
        poligon_duz = new javax.swing.JCheckBox();
        poligon_cizgili = new javax.swing.JCheckBox();
        poligon_noktali = new javax.swing.JCheckBox();
        alan_xEkseni = new javax.swing.JTextField();
        alan_yEkseni = new javax.swing.JTextField();
        cizButton = new javax.swing.JButton();
        ciz_Panel = new javax.swing.JPanel();
        ekranaGetir = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prog_cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nokta_x1.setText(" X1");
        nokta_x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokta_x1ActionPerformed(evt);
            }
        });

        nokta_y1.setText(" Y1");
        nokta_y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokta_y1ActionPerformed(evt);
            }
        });

        nokta_kücük.setText("Küçük Boy");
        nokta_kücük.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokta_kücükActionPerformed(evt);
            }
        });

        nokta_orta.setText("Orta Boy");

        nokta_buyuk.setText("Büyük Boy");

        noktaButton.setText("Nokta");

        cizgiButton.setText("Çizgi");

        poligonButton.setText("Poligon");

        cizgi_kücük.setText("Küçük Boy");

        cizgi_orta.setText("Orta Boy");

        cizgi_buyuk.setText("Büyük Boy");

        poligon_duz.setText("Düz Çizgili");

        poligon_cizgili.setText("Kesikli Çizgili");

        poligon_noktali.setText("Noktalı");

        alan_xEkseni.setText("X Ekseni");
        alan_xEkseni.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                alan_xEkseniİnputMethodTextChanged(evt);
            }
        });
        alan_xEkseni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alan_xEkseniActionPerformed(evt);
            }
        });

        alan_yEkseni.setText("Y Ekseni");
        alan_yEkseni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alan_yEkseniActionPerformed(evt);
            }
        });

        cizButton.setText("ÇİZ");
        cizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cizButtonActionPerformed(evt);
            }
        });

        ciz_Panel.setBackground(new java.awt.Color(204, 0, 51));
        ciz_Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ciz_Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ciz_PanelLayout = new javax.swing.GroupLayout(ciz_Panel);
        ciz_Panel.setLayout(ciz_PanelLayout);
        ciz_PanelLayout.setHorizontalGroup(
            ciz_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ciz_PanelLayout.setVerticalGroup(
            ciz_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        ekranaGetir.setText("Ekrana Getir");
        ekranaGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekranaGetirActionPerformed(evt);
            }
        });

        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YUNUS INAN ");

        jLabel2.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("1821012021");

        prog_cikis.setText("Cikis");
        prog_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prog_cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(poligonButton)
                            .addComponent(cizgiButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cizgi_kücük)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cizgi_orta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cizgi_buyuk))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(poligon_duz)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cizButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(temizle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prog_cikis))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(poligon_cizgili)
                                        .addGap(18, 18, 18)
                                        .addComponent(poligon_noktali)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ciz_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nokta_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nokta_y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nokta_kücük)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nokta_orta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nokta_buyuk)
                                .addGap(194, 194, 194)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noktaButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alan_xEkseni, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alan_yEkseni, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ekranaGetir)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alan_xEkseni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alan_yEkseni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ekranaGetir))
                        .addGap(9, 9, 9)
                        .addComponent(noktaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nokta_kücük)
                            .addComponent(nokta_orta)
                            .addComponent(nokta_buyuk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nokta_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nokta_y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cizgiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cizgi_kücük)
                            .addComponent(cizgi_orta)
                            .addComponent(cizgi_buyuk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(poligonButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poligon_duz)
                            .addComponent(poligon_cizgili)
                            .addComponent(poligon_noktali))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cizButton)
                            .addComponent(temizle)
                            .addComponent(prog_cikis)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(52, 52, 52)
                .addComponent(ciz_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nokta_x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokta_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nokta_x1ActionPerformed

    private void nokta_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokta_y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nokta_y1ActionPerformed

    private void cizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cizButtonActionPerformed
        ekle = (Graphics2D) ciz_Panel.getGraphics();
        Scanner scn = new Scanner(System.in);
        if (noktaButton.isSelected()) {
            if (nokta_kücük.isSelected()) {
                ekle.fillOval((Integer.parseInt(nokta_x1.getText())), (Integer.parseInt(nokta_y1.getText())), 20, 20);
            } else if (nokta_orta.isSelected()) {
                ekle.fillOval((Integer.parseInt(nokta_x1.getText())), (Integer.parseInt(nokta_y1.getText())), 30, 30);

            } else if (nokta_buyuk.isSelected()) {
                ekle.fillOval((Integer.parseInt(nokta_x1.getText())), (Integer.parseInt(nokta_y1.getText())), 40, 40);
            }
        }

        if (cizgiButton.isSelected()) {

            if (cizgi_kücük.isSelected()) {

                int x1, y1, x2, y2, xn, yn, tempx, tempy;

                String sayi = JOptionPane.showInputDialog("Kaç adet kordinat gireceksiniz :");
                int veri = Integer.parseInt(sayi);

                x1 = Integer.parseInt(JOptionPane.showInputDialog(null, "x1 koordinatını gir : "));
                y1 = Integer.parseInt(JOptionPane.showInputDialog(null, "y1 koordinatını gir : "));
                x2 = Integer.parseInt(JOptionPane.showInputDialog(null, "x2 koordinatını gir : "));
                y2 = Integer.parseInt(JOptionPane.showInputDialog(null, "y2 koordinatını gir : "));
                tempx = x2;
                tempy = y2;
                ekle.setStroke(new BasicStroke(2));
                ekle.drawLine(x1, y1, x2, y2);
                for (int i = 0; i < veri - 1; i++) {
                    xn = Integer.parseInt(JOptionPane.showInputDialog(null, "sonraki x koordinatını gir : "));
                    yn = Integer.parseInt(JOptionPane.showInputDialog(null, "sonraki y koordinatını gir : "));
                    ekle.drawLine(tempx, tempy, xn, yn);
                    tempx = xn;
                    tempy = yn;

                }

            } else if (cizgi_orta.isSelected()) {

                int x1, y1, x2, y2, xn, yn, tempx, tempy;

                String sayi = JOptionPane.showInputDialog("Kaç adet kordinat gireceksiniz :");
                int veri = Integer.parseInt(sayi);

                x1 = Integer.parseInt(JOptionPane.showInputDialog(null, "x1 koordinatını gir : "));
                y1 = Integer.parseInt(JOptionPane.showInputDialog(null, "y1 koordinatını gir : "));
                x2 = Integer.parseInt(JOptionPane.showInputDialog(null, "x2 koordinatını gir : "));
                y2 = Integer.parseInt(JOptionPane.showInputDialog(null, "y2 koordinatını gir : "));
                tempx = x2;
                tempy = y2;
                ekle.setStroke(new BasicStroke(5));
                ekle.drawLine(x1, y1, x2, y2);
                for (int i = 0; i < veri - 1; i++) {
                    xn = Integer.parseInt(JOptionPane.showInputDialog(null, "sonraki x koordinatını gir : "));
                    yn = Integer.parseInt(JOptionPane.showInputDialog(null, "sonraki y koordinatını gir : "));
                    ekle.drawLine(tempx, tempy, xn, yn);
                    tempx = xn;
                    tempy = yn;

                }

            } else if (cizgi_buyuk.isSelected()) {

                int x1, y1, x2, y2, xn, yn, tempx, tempy;

                String sayi = JOptionPane.showInputDialog("Kaç adet kordinat gireceksiniz :");
                int veri = Integer.parseInt(sayi);

                x1 = Integer.parseInt(JOptionPane.showInputDialog(null, "x1 koordinatını gir : "));
                y1 = Integer.parseInt(JOptionPane.showInputDialog(null, "y1 koordinatını gir : "));
                x2 = Integer.parseInt(JOptionPane.showInputDialog(null, "x2 koordinatını gir : "));
                y2 = Integer.parseInt(JOptionPane.showInputDialog(null, "y2 koordinatını gir : "));
                tempx = x2;
                tempy = y2;
                ekle.setStroke(new BasicStroke(8));
                ekle.drawLine(x1, y1, x2, y2);
                for (int i = 0; i < veri - 1; i++) {
                    xn = Integer.parseInt(JOptionPane.showInputDialog(null, "sonraki x koordinatını gir : "));
                    yn = Integer.parseInt(JOptionPane.showInputDialog(null, "sonraki y koordinatını gir : "));
                    ekle.drawLine(tempx, tempy, xn, yn);
                    tempx = xn;
                    tempy = yn;

                }

            }
        }
        if (poligonButton.isSelected()) {
            ekle = (Graphics2D) ciz_Panel.getGraphics();
            int cizgisayisi = Integer.parseInt(JOptionPane.showInputDialog(null, "Poligonun kaç kenarlı olacak ?"));
            int dizix[] = new int[cizgisayisi], diziy[] = new int[cizgisayisi];
            int x, y;

            if (poligon_duz.isSelected()) {
                
                for (int i = 0; i < cizgisayisi; i++) {
                        x = Integer.parseInt(JOptionPane.showInputDialog(null, "x koordinatı"));
                        y = Integer.parseInt(JOptionPane.showInputDialog(null, "y koordinatı"));
                        dizix[i] = x;
                        diziy[i] = y;
                    }
                    ekle.drawPolygon(dizix, diziy, cizgisayisi);
                

            } else if (poligon_cizgili.isSelected()) {
                
                Stroke dashed = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
                ekle.setStroke(dashed);
                for (int i = 0; i < cizgisayisi; i++) {
                        x = Integer.parseInt(JOptionPane.showInputDialog(null, "x koordinatı"));
                        y = Integer.parseInt(JOptionPane.showInputDialog(null, "y koordinatı"));
                        dizix[i] = x;
                        diziy[i] = y;
                    }
                    ekle.drawPolygon(dizix, diziy, cizgisayisi);

            } else if (poligon_noktali.isSelected()) {
                
                Stroke dotted = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{1, 2}, 0);
                ekle.setStroke(dotted);
               // ekle.setStroke(new BasicStroke(2));
                for (int i = 0; i < cizgisayisi; i++) {
                        x = Integer.parseInt(JOptionPane.showInputDialog(null, "x koordinatı"));
                        y = Integer.parseInt(JOptionPane.showInputDialog(null, "y koordinatı"));
                        dizix[i] = x;
                        diziy[i] = y;
                    }
                    ekle.drawPolygon(dizix, diziy, cizgisayisi);

            }
        }

    }//GEN-LAST:event_cizButtonActionPerformed

    private void alan_xEkseniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alan_xEkseniActionPerformed

    }//GEN-LAST:event_alan_xEkseniActionPerformed
    private void alan_yEkseniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alan_yEkseniActionPerformed

    }//GEN-LAST:event_alan_yEkseniActionPerformed

    private void alan_xEkseniİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_alan_xEkseniİnputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_alan_xEkseniİnputMethodTextChanged

    private void ekranaGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekranaGetirActionPerformed

        ciz_Panel.setSize(Integer.parseInt((alan_xEkseni.getText())), Integer.parseInt(alan_yEkseni.getText()));
        ciz_Panel.setVisible(true);
    }//GEN-LAST:event_ekranaGetirActionPerformed

    private void nokta_kücükActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokta_kücükActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nokta_kücükActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        ciz_Panel.repaint();
    }//GEN-LAST:event_temizleActionPerformed

    private void prog_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prog_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_prog_cikisActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alan_xEkseni;
    private javax.swing.JTextField alan_yEkseni;
    private javax.swing.JButton cizButton;
    private javax.swing.JPanel ciz_Panel;
    private javax.swing.JRadioButton cizgiButton;
    private javax.swing.JCheckBox cizgi_buyuk;
    private javax.swing.JCheckBox cizgi_kücük;
    private javax.swing.JCheckBox cizgi_orta;
    private javax.swing.JButton ekranaGetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton noktaButton;
    private javax.swing.JCheckBox nokta_buyuk;
    private javax.swing.JCheckBox nokta_kücük;
    private javax.swing.JCheckBox nokta_orta;
    private javax.swing.JTextField nokta_x1;
    private javax.swing.JTextField nokta_y1;
    private javax.swing.JRadioButton poligonButton;
    private javax.swing.JCheckBox poligon_cizgili;
    private javax.swing.JCheckBox poligon_duz;
    private javax.swing.JCheckBox poligon_noktali;
    private javax.swing.JButton prog_cikis;
    private javax.swing.JButton temizle;
    // End of variables declaration//GEN-END:variables
}
