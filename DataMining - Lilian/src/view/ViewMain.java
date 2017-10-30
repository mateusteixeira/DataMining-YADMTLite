/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewMain.java
 *
 * Created on 19/08/2010, 23:23:52
 */
package view;

import controller.FacadeHost;
import interfaces.PersistenceModuleInterface;
import java.awt.Component;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.serialization.Serializer;

/**
 *
 * @author evaristowb
 */
public class ViewMain extends javax.swing.JFrame {

    /** Creates new form ViewMain */
    public ViewMain() {
        initComponents();

        FacadeHost.setViewMain(this);
                try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
          // UIManager.setLookAndFeel();
            //e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPAbas1 = new view.jpanel.JPanelTabbed();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DataMining Tool");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAbas1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAbas1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(771, 626));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.jpanel.JPanelTabbed jPAbas1;
    // End of variables declaration//GEN-END:variables

   
}
