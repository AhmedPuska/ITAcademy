/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perzistencija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perzistencija.PerzistencijaDemo2;

/**
 *
 * @author user
 */
public class PerzistencijaDemo extends javax.swing.JFrame {

    /**
     * Creates new form perzistencija
     */
//    public PerzistencijaDemo() {
//        initComponents();
//        showZaposleni();
//    }
    
    public ArrayList<PerzistencijaDemo2> ListZaposleni(/*String prikaz*/) {
        ArrayList<PerzistencijaDemo2> zaposleniList = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/perzistencija", "root", "");
            st = conn.createStatement();
            rs = st.executeQuery("select * from zaposleni");
            
            PerzistencijaDemo2 pd2;
            
            while (rs.next()) {
                pd2 = new PerzistencijaDemo2(
                        rs.getInt("id"),
                        rs.getString("ime"),
                        rs.getInt("godine"),
                        rs.getString("adresa"),
                        rs.getInt("dohodak")
                );
                zaposleniList.add(pd2);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
        
        return zaposleniList;
    }
    
    public void showZaposleni() {
        ArrayList<PerzistencijaDemo2> list = ListZaposleni();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getIme();
            row[2] = list.get(i).getGodine();
            row[3] = list.get(i).getAdresa();
            row[4] = list.get(i).getDohodak();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ime", "Godine", "Adresa", "Dohodak"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    
//    public void findZaposleni() {
//        
//        ArrayList<PerzistencijaDemo2> zaposleniList = ListZaposleni(jTextField1.getText());
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(new Object[]{"id", "ime", "godine", "adresa", "dohodak"});
//        Object[] row = new Object[5];
//        
//        for (int i = 0; i < zaposleniList.size(); i++) {
//            row[0] = zaposleniList.get(i).getId();
//            row[1] = zaposleniList.get(i).getIme();
//            row[2] = zaposleniList.get(i).getGodine();
//            row[3] = zaposleniList.get(i).getAdresa();
//            row[4] = zaposleniList.get(i).getDohodak();
//            model.addRow(row);
//        }
//        jTable2.setModel(model);
//    }

    
    
    
//    public Connection getConnection() {
//        
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/perzistencija", "root", "");
//            System.out.println(conn);
////            Class.forName("com.mysql.jdbc.Driver");
////            Statement st = conn.createStatement();
////            st.executeQuery("SELECT * FROM zaposleni");
////            
////            ResultSet rs = st.getResultSet();
//            
//            
////            while (rs.next()) {
////                PerzistencijaDemo = new PerzistencijaDemo(rs.getInt("id"), rs.getString("ime"), rs.getInt("godine"), rs.getString("adresa"), rs.getInt("dohodak"));
////            }
//            
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        return conn;
//    }

    
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
            java.util.logging.Logger.getLogger(PerzistencijaDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerzistencijaDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerzistencijaDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerzistencijaDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerzistencijaDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
