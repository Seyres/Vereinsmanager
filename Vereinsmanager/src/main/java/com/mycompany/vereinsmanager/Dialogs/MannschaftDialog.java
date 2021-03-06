package com.mycompany.vereinsmanager.Dialogs;

import com.mycompany.vereinsmanager.Enums.EObjektStatus;
import com.mycompany.vereinsmanager.Enums.ESaveObject;
import com.mycompany.vereinsmanager.Enums.ESaveStatus;
import com.mycompany.vereinsmanager.Entities.Mannschaft;
import com.mycompany.vereinsmanager.Entities.Spiel;
import com.mycompany.vereinsmanager.main.StartupWindow;
import com.mycompany.vereinsmanager.Entities.Trainer;
import com.mycompany.vereinsmanager.Entities.Trainingszeit;
import com.mycompany.vereinsmanager.main.XMLLoader;
import com.mycompany.vereinsmanager.main.XMLSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Frame mit Eingabemaske zum Bearbeiten von Mannschaften
 * @author Timo
 */
public final class MannschaftDialog extends javax.swing.JDialog {
    /**
    * true beim Erzeugen einer neuen Mannschaft, sonst false
    */
    private boolean isNew;
    /**
    * Trainingszeitendialog
    */
    public SelectTrainingszeitenDialog EditTrainingszeitenDialog;
    /**
    * Trainingszeiten der Mannschaft
    */
    private ArrayList<Trainingszeit> trainingszeiten;
    /**
    * parent
    */
    private StartupWindow parent;
    
    /**
     *  Erstellt neuen Mannschaftsdialog
     * @throws IOException 
     */
    public MannschaftDialog() throws IOException {
        setCboTrainerItems();
    }
    /**
     * Erstellt neuen Mannschaftsdialog
     * @param isNew boolean ob es sich um eine neue Mannschaft handelt oder um eine bestehende
     * @param parent parent Frame
     * @throws IOException 
     */
    public MannschaftDialog(boolean isNew, StartupWindow parent) throws IOException {
        initComponents();
        this.parent = parent;
        setIsNew(isNew);
        SetWindowTitle();
        setCboTrainerItems();
    }
    /**
     *
     * @return ArrayList&lt;Trainingszeit&gt; Trainingszeiten der Mannschaft
     */
    public ArrayList<Trainingszeit> getTrainingszeiten() {
        return trainingszeiten;
    }
    
    /**
     * setzt die Trainingszeiten für den aktuellen Mannschaftsdialog
     * @param trainingszeiten
     */
    public void setTrainingszeiten(ArrayList<Trainingszeit> trainingszeiten) {
        this.trainingszeiten = trainingszeiten;
    }

    /**
     * gibt zurück ob der Mannschaftsdialog für eine neue Mannschaft ist oder nicht
     * @return boolean isNew
     */
    public boolean isIsNew() {
        return isNew;
    }

    /**
     * Setzt isNew neu und aktiviert/deaktiviert das Eingabefeld für Bezeichnung
     * @param IsNew boolean neuer Wert für isNew
     */
    public void setIsNew(boolean IsNew) {
        this.isNew = IsNew;
        SetWindowTitle();
        this.tfBezeichnung.setEnabled(IsNew);
        this.tfBezeichnung.setEditable(IsNew);
        this.btnLoeschen.setEnabled(!IsNew);
    }

    /**
     * Lädt die angegebene Spielerliste in lbSpieler Liste
     * @param Spieler ArrayList&lt;Spieler&gt;
     */
    public void setLbSpieler(ArrayList<String> Spieler) {
        DefaultListModel model = new DefaultListModel();
        model.addAll(Spieler);
        this.lbSpieler.setModel(model);
    }

    /**
     * Setzt bezeichnung in das Bezeichnungseingabefeld
     * @param bezeichnung
     */
    public void setTfBezeichnung(String bezeichnung) {
        this.tfBezeichnung.setText(bezeichnung);
    }

    /**
     * Setzt ergebnis in das Ergebnisfeld
     * @param ergebnis
     */
    public void setTfErgebnis(String ergebnis) {
        this.tfErgebnis.setText(ergebnis);
    }

    /**
     * Gibt den aktuellen Trainernamen zurück
     * @return String toString() des ausgewählten Trainers in der Combobox
     */
    public String getcboTrainer() {
        return cboTrainer.getModel().getSelectedItem() != null ? cboTrainer.getModel().getSelectedItem().toString() : "";
    }
    /**
     * Setzt trainer als ausgewählten Trainer in der Trainercombobox
     * @param trainer
     * @throws IOException 
     */
    public void setcboTrainer(String trainer) throws IOException {
        setCboTrainerItems();
        cboTrainer.getModel().setSelectedItem(trainer);
    }

    /**
     * Macht das Bezeichnungseingabefeld editierbar oder uneditierbar
     * @param CanEdit boolean
     */
    public void ChangetfBezeichnungCanEdit(Boolean CanEdit) {
        tfBezeichnung.setEditable(CanEdit);
        tfBezeichnung.setEnabled(CanEdit);
    }

    /**
     * Stellt passenden Text für Label- und Buttonbeschriftung ein
     */
    private void SetWindowTitle() {
        String Caption = isNew ? EObjektStatus.erstellen.toString() : EObjektStatus.bearbeiten.toString();
        String ButtonCaption = isNew ? ESaveStatus.erstellen.toString() : ESaveStatus.aktualisieren.toString();
        lblÜberschrift.setText("Mannschaft " + Caption);
        btnSpeichern.setText(ButtonCaption);
    }
    /**
     * Lädt die Liste der Trainer aus dem XMLFile und lädt diese in die Trainercombobox cboTrainer
     * @throws IOException 
     */
    private void setCboTrainerItems() throws IOException {
        ArrayList<Trainer> trainer = XMLLoader.loadTrainer();
        ArrayList<String> trainerNamen = new ArrayList<>();
        for (Trainer cTrainer : trainer) {
            trainerNamen.add(cTrainer.getVorname() + " " + cTrainer.getNachname());
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addAll(trainerNamen);
        cboTrainer.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblÜberschrift = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfBezeichnung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfErgebnis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbSpieler = new javax.swing.JList<>();
        btnVerwerfen = new javax.swing.JButton();
        btnSpeichern = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        cboTrainer = new javax.swing.JComboBox<>();
        btnLoeschen = new javax.swing.JButton();
        btnSpielOeffnen = new javax.swing.JButton();

        lblÜberschrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblÜberschrift.setText("Mannschaft");

        jLabel2.setText("Bezeichnung");

        jLabel3.setText("Trainingszeiten");

        jLabel4.setText("Trainer");

        jLabel5.setText("Spieler");

        jLabel6.setText("Letztes Ergebnis");

        jLabel7.setText("Nächstes Spiel");

        lbSpieler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lbSpieler);

        btnVerwerfen.setText("Verwerfen");
        btnVerwerfen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerwerfenActionPerformed(evt);
            }
        });

        btnSpeichern.setText("Speichern");
        btnSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeichernActionPerformed(evt);
            }
        });

        jButton1.setText("Trainingszeiten bearbeiten");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cboTrainer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnLoeschen.setText("Löschen");
        btnLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoeschenActionPerformed(evt);
            }
        });

        btnSpielOeffnen.setText("Nächstes Spiel öffnen");
        btnSpielOeffnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpielOeffnenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoeschen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerwerfen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSpeichern))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblÜberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfBezeichnung)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboTrainer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(tfErgebnis, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(btnSpielOeffnen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(212, 212, 212)
                                            .addComponent(lblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblÜberschrift, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(tfErgebnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnSpielOeffnen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfBezeichnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboTrainer, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpeichern)
                    .addComponent(btnVerwerfen)
                    .addComponent(btnLoeschen))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeichernActionPerformed
        try {
            ArrayList<Object> ObjekteZumSpeichern = new ArrayList<Object>();
            ArrayList<Mannschaft> OldMannschaften = XMLLoader.loadMannschaft();
            Boolean existiertBereits = false;
            for (Mannschaft cMannschaft : OldMannschaften) {
                if (tfBezeichnung.getText().equalsIgnoreCase(cMannschaft.getBezeichnung())) {
                    if (!isNew) {
                        OldMannschaften.remove(cMannschaft);
                    } else {
                        lblWarning.setText("<html><b>" + tfBezeichnung.getText() + " existiert bereits</b></html>");
                        existiertBereits = true;
                    }
                    break;
                }
            }
            if (existiertBereits) {
                return;
            }
            Mannschaft Mannschaft = new Mannschaft();
            Mannschaft.setBezeichnung(tfBezeichnung.getText());
            Mannschaft.setLetztesErgebnis(new Spiel("", "", new Date(), null)); //Spiel erzeugen oder auswählen
            if (trainingszeiten != null) {
                Mannschaft.setTrainingszeiten(trainingszeiten.toArray(new Trainingszeit[trainingszeiten.size()]));
            }
            ArrayList<Spiel> alleSpiele = XMLLoader.loadSpiel();

            Mannschaft.setTrainer(getcboTrainer());
            ObjekteZumSpeichern.addAll(OldMannschaften);
            ObjekteZumSpeichern.add(Mannschaft);
            XMLSerializer.serializeToXML(ObjekteZumSpeichern, ESaveObject.mannschaft);
            parent.allesAktualisieren();
            parent.mannschaftDialog.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MannschaftDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSpeichernActionPerformed

    private void btnVerwerfenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerwerfenActionPerformed
        parent.mannschaftDialog.dispose();
    }//GEN-LAST:event_btnVerwerfenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String bezeichnung = tfBezeichnung.getText();
        if (bezeichnung.isBlank() || bezeichnung.isEmpty()) {
            lblWarning.setText("<html><b>Bezeichnung darf zum anlegen von Trainingszeiten nicht leer sein!</b></html>");
            return;
        } else {
            lblWarning.setText(null);
        }
        ChangetfBezeichnungCanEdit(false);
        EditTrainingszeitenDialog = new SelectTrainingszeitenDialog(this, bezeichnung);
        EditTrainingszeitenDialog.fillFields();
        EditTrainingszeitenDialog.setResizable(false);
        EditTrainingszeitenDialog.setDefaultCloseOperation(SelectTrainingszeitenDialog.HIDE_ON_CLOSE);
        EditTrainingszeitenDialog.setModal(true);
        EditTrainingszeitenDialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLoeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoeschenActionPerformed
        try {
            int result = JOptionPane.showConfirmDialog(null, "Möchten Sie das aktuelle Element wirklich löschen?", "Löschen?", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.NO_OPTION) {
                return;
            }
            ArrayList<Mannschaft> OldMannschaften = XMLLoader.loadMannschaft();
            ArrayList<Object> neueMannschaften = new ArrayList();
            for (Mannschaft cMannschaft : OldMannschaften) {
                if (tfBezeichnung.getText().equalsIgnoreCase(cMannschaft.getBezeichnung())) {
                    OldMannschaften.remove(cMannschaft);
                    break;
                }
            }
            neueMannschaften.addAll(OldMannschaften);
            XMLSerializer.serializeToXML(neueMannschaften, ESaveObject.mannschaft);
            parent.allesAktualisieren();
            parent.mannschaftDialog.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MannschaftDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoeschenActionPerformed

    private void btnSpielOeffnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpielOeffnenActionPerformed
        try {
            Mannschaft tmpMannschaft = new Mannschaft();
            tmpMannschaft.setBezeichnung(this.tfBezeichnung.getText());
            Spiel naechstesSpiel = parent.ermittelNaechstesSpiel(tmpMannschaft);

            if (naechstesSpiel.toString().equalsIgnoreCase("null gegen null")) {
                int result = JOptionPane.showConfirmDialog(null, "Kein nächstes Spiel vorhanden, neues anlegen?", "Kein Spiel gefunden", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            parent.spielDialogErzeugen(true, naechstesSpiel);
        } catch (IOException ex) {
            Logger.getLogger(MannschaftDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSpielOeffnenActionPerformed

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
            java.util.logging.Logger.getLogger(MannschaftDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MannschaftDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MannschaftDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MannschaftDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MannschaftDialog().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MannschaftDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoeschen;
    private javax.swing.JButton btnSpeichern;
    private javax.swing.JButton btnSpielOeffnen;
    private javax.swing.JButton btnVerwerfen;
    private javax.swing.JComboBox<String> cboTrainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lbSpieler;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JLabel lblÜberschrift;
    private javax.swing.JTextField tfBezeichnung;
    private javax.swing.JTextField tfErgebnis;
    // End of variables declaration//GEN-END:variables
}
