/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vereinsmanager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Timo
 */
public class StartupWindow extends javax.swing.JFrame {

    /**
     * Creates new form StartupWindow
     */
    public StartupWindow() {
        initComponents();
    }
    public MannschaftDialog MannschaftDialog;
    public SpielDialog SpielDialog;
    public SpielerDialog SpielerDialog;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jContentWindow = new javax.swing.JTabbedPane();
        jMannschaftTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbMannschaft = new javax.swing.JList<>();
        btnAddMannschaft = new javax.swing.JButton();
        btnShowMannschaften = new javax.swing.JButton();
        jMitgliedTab = new javax.swing.JPanel();
        btnAddMitglied = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbMitglieder = new javax.swing.JList<>();
        btnBeitraegeAnzeigen = new javax.swing.JButton();
        btnShowMitglieder = new javax.swing.JButton();
        jSpielerTab = new javax.swing.JPanel();
        btnAddSpieler = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbSpieler = new javax.swing.JList<>();
        btnShowSpieler = new javax.swing.JButton();
        jSpielTab = new javax.swing.JPanel();
        btnAddSpiel = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbSpiele = new javax.swing.JList<>();
        btnShowSpiele = new javax.swing.JButton();
        lblTitel = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMannschaftTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jMannschaftTabComponentShown(evt);
            }
		});
        lbMannschaft.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mannschaft 1", "Mannschaft 2", "Mannschaft 3", "Mannschaft 4", "Mannschaft 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jScrollPane1.setViewportView(lbMannschaft);

        btnAddMannschaft.setText("Mannschaft erstellen");
        btnAddMannschaft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMannschaftActionPerformed(evt);
            }
        });

        btnShowMannschaften.setText("Mannschaften anzeigen");
        btnShowMannschaften.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMannschaftenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMannschaftTabLayout = new javax.swing.GroupLayout(jMannschaftTab);
        jMannschaftTab.setLayout(jMannschaftTabLayout);
        jMannschaftTabLayout.setHorizontalGroup(
            jMannschaftTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMannschaftTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMannschaftTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jMannschaftTabLayout.createSequentialGroup()
                        .addComponent(btnAddMannschaft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowMannschaften)
                        .addGap(0, 329, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jMannschaftTabLayout.setVerticalGroup(
            jMannschaftTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMannschaftTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMannschaftTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMannschaft)
                    .addComponent(btnShowMannschaften))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jContentWindow.addTab("Mannschaften", jMannschaftTab);

        jMitgliedTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jMitgliedTabComponentShown(evt);
            }
        });

        btnAddMitglied.setText("Mitglied erstellen");
        btnAddMitglied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMitgliedActionPerformed(evt);
            }
        });

        lbMitglieder.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lbMitglieder);

        btnBeitraegeAnzeigen.setText("Ausstehende Beträge anzeigen");

        btnShowMitglieder.setText("Mitglieder anzeigen");
        btnShowMitglieder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMitgliederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMitgliedTabLayout = new javax.swing.GroupLayout(jMitgliedTab);
        jMitgliedTab.setLayout(jMitgliedTabLayout);
        jMitgliedTabLayout.setHorizontalGroup(
            jMitgliedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMitgliedTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMitgliedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jMitgliedTabLayout.createSequentialGroup()
                        .addComponent(btnAddMitglied)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBeitraegeAnzeigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowMitglieder)
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jMitgliedTabLayout.setVerticalGroup(
            jMitgliedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMitgliedTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMitgliedTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMitglied)
                    .addComponent(btnBeitraegeAnzeigen)
                    .addComponent(btnShowMitglieder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jContentWindow.addTab("Mitglieder", jMitgliedTab);

        jSpielerTab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jSpielerTabComponentShown(evt);
            }
        });

        btnAddSpieler.setText("Spieler erstellen");
        btnAddSpieler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSpielerActionPerformed(evt);
            }
        });

        lbSpieler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lbSpieler);

        btnShowSpieler.setText("Spieler anzeigen");
        btnShowSpieler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSpielerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSpielerTabLayout = new javax.swing.GroupLayout(jSpielerTab);
        jSpielerTab.setLayout(jSpielerTabLayout);
        jSpielerTabLayout.setHorizontalGroup(
            jSpielerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSpielerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSpielerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jSpielerTabLayout.createSequentialGroup()
                        .addComponent(btnAddSpieler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowSpieler)
                        .addGap(0, 389, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jSpielerTabLayout.setVerticalGroup(
            jSpielerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSpielerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSpielerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSpieler)
                    .addComponent(btnShowSpieler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jContentWindow.addTab("Spieler", jSpielerTab);

        btnAddSpiel.setText("Spiel erstellen");
        btnAddSpiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSpielActionPerformed(evt);
            }
        });

        lbSpiele.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lbSpiele);

        btnShowSpiele.setText("Spiele anzeigen");
        btnShowSpiele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSpieleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSpielTabLayout = new javax.swing.GroupLayout(jSpielTab);
        jSpielTab.setLayout(jSpielTabLayout);
        jSpielTabLayout.setHorizontalGroup(
            jSpielTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSpielTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSpielTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jSpielTabLayout.createSequentialGroup()
                        .addComponent(btnAddSpiel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowSpiele)
                        .addGap(0, 403, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jSpielTabLayout.setVerticalGroup(
            jSpielTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSpielTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSpielTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSpiel)
                    .addComponent(btnShowSpiele))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jContentWindow.addTab("Spiele", jSpielTab);

        lblTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitel.setText("Handballverein ITFM4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jContentWindow)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jContentWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMitgliedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMitgliedActionPerformed
        try {
            SpielerDialog = new SpielerDialog(EZugehörigkeit.Mitglieder, true); //Hier Entity �bergeben und in Konstruktor die Werte setzen(wenn nicht neu)
            SpielerDialog.setDefaultCloseOperation(SpielerDialog.DISPOSE_ON_CLOSE);
            SpielerDialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(StartupWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMitgliedActionPerformed

    private void btnAddMannschaftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMannschaftActionPerformed
        MannschaftDialog = new MannschaftDialog(true); //Hier Entity �bergeben und in Konstruktor die Werte setzen(wenn nicht neu)
        MannschaftDialog.setDefaultCloseOperation(MannschaftDialog.DISPOSE_ON_CLOSE);
        MannschaftDialog.setVisible(true);
    }//GEN-LAST:event_btnAddMannschaftActionPerformed

    private void btnAddSpielerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSpielerActionPerformed
        try {
            SpielerDialog = new SpielerDialog(EZugehörigkeit.Spieler, true); //Hier Entity �bergeben und in Konstruktor die Werte setzen(wenn nicht neu)
            SpielerDialog.setDefaultCloseOperation(SpielerDialog.DISPOSE_ON_CLOSE);
            SpielerDialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(StartupWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddSpielerActionPerformed

    private void btnAddSpielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSpielActionPerformed
        SpielDialog = new SpielDialog(true); //Hier Entity �bergeben und in Konstruktor die Werte setzen(wenn nicht neu)
        SpielDialog.setDefaultCloseOperation(SpielDialog.DISPOSE_ON_CLOSE);
        SpielDialog.setVisible(true);
    }//GEN-LAST:event_btnAddSpielActionPerformed

    private void btnShowMitgliederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMitgliederActionPerformed
        try {

            DefaultListModel model = new DefaultListModel();
            model.addAll(XMLLoader.loadMitglieder());
            lbMitglieder.setModel(model);

        } catch (IOException ex) {
            Logger.getLogger(StartupWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowMitgliederActionPerformed

    private void btnShowMannschaftenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMannschaftenActionPerformed
        try {

            DefaultListModel model = new DefaultListModel();
            ArrayList<Mannschaft> mannschaften = XMLLoader.loadMannschaft();
            ArrayList<String> mannschaftsnamen = new ArrayList<String>();
            for (Mannschaft cMannschaft : mannschaften) {
                mannschaftsnamen.add(cMannschaft.getBezeichnung());
            }

            model.addAll(mannschaftsnamen);
            lbMannschaft.setModel(model);

        } catch (IOException ex) {
            Logger.getLogger(StartupWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowMannschaftenActionPerformed

    private void btnShowSpielerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSpielerActionPerformed
        try {

            DefaultListModel model = new DefaultListModel();
            model.addAll(XMLLoader.loadProfiSpieler());
            lbSpieler.setModel(model);

        } catch (IOException ex) {
            Logger.getLogger(StartupWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowSpielerActionPerformed

    private void btnShowSpieleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSpieleActionPerformed
        try {

            DefaultListModel model = new DefaultListModel();
            model.addAll(XMLLoader.loadSpiel());
            lbSpiele.setModel(model);

        } catch (IOException ex) {
            Logger.getLogger(StartupWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowSpieleActionPerformed

    private void jMannschaftTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMannschaftTabComponentShown
        btnShowMannschaftenActionPerformed(null);
    }//GEN-LAST:event_jMannschaftTabComponentShown

    private void jMitgliedTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jMitgliedTabComponentShown
        btnShowMitgliederActionPerformed(null);
    }//GEN-LAST:event_jMitgliedTabComponentShown

    private void jSpielerTabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jSpielerTabComponentShown
        btnShowSpielerActionPerformed(null);
    }//GEN-LAST:event_jSpielerTabComponentShown



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
            java.util.logging.Logger.getLogger(StartupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartupWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMannschaft;
    private javax.swing.JButton btnAddMitglied;
    private javax.swing.JButton btnAddSpiel;
    private javax.swing.JButton btnAddSpieler;
    private javax.swing.JButton btnBeitraegeAnzeigen;
    private javax.swing.JButton btnShowMannschaften;
    private javax.swing.JButton btnShowMitglieder;
    private javax.swing.JButton btnShowSpiele;
    private javax.swing.JButton btnShowSpieler;
    private javax.swing.JTabbedPane jContentWindow;
    private javax.swing.JPanel jMannschaftTab;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jMitgliedTab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jSpielTab;
    private javax.swing.JPanel jSpielerTab;
    private javax.swing.JList<String> lbMannschaft;
    private javax.swing.JList<String> lbMitglieder;
    private javax.swing.JList<String> lbSpiele;
    private javax.swing.JList<String> lbSpieler;
    private javax.swing.JLabel lblTitel;
    // End of variables declaration//GEN-END:variables
}
