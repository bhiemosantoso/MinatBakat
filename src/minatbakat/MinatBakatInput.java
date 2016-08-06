/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minatbakat;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class MinatBakatInput extends javax.swing.JFrame {

    /**
     * Creates new form MinatBakatInput
     */
    public MinatBakatInput() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"OUT", null, null, null, null, null, null, null, null, null, null, null, null},
                {"ME", null, null, null, null, null, null, null, null, null, null, null, null},
                {"COMP", null, null, null, null, null, null, null, null, null, null, null, null},
                {"SCI", null, null, null, null, null, null, null, null, null, null, null, null},
                {"PERS", null, null, null, null, null, null, null, null, null, null, null, null},
                {"AESTH", null, null, null, null, null, null, null, null, null, null, null, null},
                {"LITH", null, null, null, null, null, null, null, null, null, null, null, null},
                {"MUS", null, null, null, null, null, null, null, null, null, null, null, null},
                {"S.S", null, null, null, null, null, null, null, null, null, null, null, null},
                {"CLER", null, null, null, null, null, null, null, null, null, null, null, null},
                {"PRAC", null, null, null, null, null, null, null, null, null, null, null, null},
                {"MED", null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kategori", "A", "B", "C", "D", "E", "F", "G", "H", "I", "∑", "RANG", "%"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int out = 0, comp = 0, me = 0, sci = 0, pers = 0, aesth = 0, lit = 0, mus = 0, ss = 0, cler = 0, prac = 0, med = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if (jTable1.getValueAt(i, j) == null) {
                    jTable1.setValueAt(0, i, j);
                }

            }

        }

        for (int i = 1; i <= 9; i++) {
            out = out + (int) jTable1.getValueAt(0, i);
            comp = comp + (int) jTable1.getValueAt(1, i);
            me = me + (int) jTable1.getValueAt(2, i);
            sci = sci + (int) jTable1.getValueAt(3, i);
            pers = pers + (int) jTable1.getValueAt(4, i);
            aesth = aesth + (int) jTable1.getValueAt(5, i);
            lit = lit + (int) jTable1.getValueAt(6, i);
            mus = mus + (int) jTable1.getValueAt(7, i);
            ss = ss + (int) jTable1.getValueAt(8, i);
            cler = cler + (int) jTable1.getValueAt(9, i);
            prac = prac + (int) jTable1.getValueAt(10, i);
            med = med + (int) jTable1.getValueAt(11, i);

        }

        int[] rang = new int[12];
        jTable1.setValueAt(out, 0, 10);
        jTable1.setValueAt(comp, 1, 10);
        jTable1.setValueAt(me, 2, 10);
        jTable1.setValueAt(sci, 3, 10);
        jTable1.setValueAt(pers, 4, 10);
        jTable1.setValueAt(aesth, 5, 10);
        jTable1.setValueAt(lit, 6, 10);
        jTable1.setValueAt(mus, 7, 10);
        jTable1.setValueAt(ss, 8, 10);
        jTable1.setValueAt(cler, 9, 10);
        jTable1.setValueAt(prac, 10, 10);
        jTable1.setValueAt(med, 11, 10);
        for (int i = 0; i < 12; i++) {
            rang[i] = (int) jTable1.getValueAt(i, 10);
        }
//        System.out.println(rang[11]);
        Arrays.sort(rang);
        for (int i = 0; i < rang.length; i++) {
            for (int j = 0; j < rang.length; j++) {
 
                if ((int) jTable1.getValueAt(i, 10) == rang[j]) {
                    jTable1.setValueAt(j+1, i, 11);
                }
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MinatBakatInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinatBakatInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinatBakatInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinatBakatInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinatBakatInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
