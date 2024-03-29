package moduledefault.classify.knn.view.jpanel;

import moduledefault.classify.knn.FacadeKnnClassifierModule;
import moduledefault.classify.knn.Knn;


public class JPanelKnn extends javax.swing.JPanel {


    public JPanelKnn() {
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelK = new javax.swing.JLabel();
        jTextFieldK = new javax.swing.JTextField();
        jLabelDistanceFunction = new javax.swing.JLabel();
        jComboBoxDistanceFunction = new javax.swing.JComboBox();
        jLabelInferenceRule = new javax.swing.JLabel();
        jComboBoxInferenceRule = new javax.swing.JComboBox();
        jButtonCommit = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabelK.setText("K");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        add(jLabelK, gridBagConstraints);

        jTextFieldK.setText(Integer.toString(FacadeKnnClassifierModule.getK()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 3, 6);
        add(jTextFieldK, gridBagConstraints);

        jLabelDistanceFunction.setText("Função Distância");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        add(jLabelDistanceFunction, gridBagConstraints);

        jComboBoxDistanceFunction.setModel(new javax.swing.DefaultComboBoxModel(Knn.DISTANCE_FUNCTION));
        jComboBoxDistanceFunction.setSelectedItem(FacadeKnnClassifierModule.getDistanceFunction());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 3, 6);
        add(jComboBoxDistanceFunction, gridBagConstraints);

        jLabelInferenceRule.setText("Regra de Inferência");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        add(jLabelInferenceRule, gridBagConstraints);

        jComboBoxInferenceRule.setModel(new javax.swing.DefaultComboBoxModel(Knn.INFERENCE_RULE));
        jComboBoxInferenceRule.setSelectedItem(FacadeKnnClassifierModule.getInferenceRule());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        add(jComboBoxInferenceRule, gridBagConstraints);

        jButtonCommit.setText("Concluir");
        jButtonCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCommitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 6);
        add(jButtonCommit, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitActionPerformed
        commit();
    }//GEN-LAST:event_jButtonCommitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCommit;
    private javax.swing.JComboBox jComboBoxDistanceFunction;
    private javax.swing.JComboBox jComboBoxInferenceRule;
    private javax.swing.JLabel jLabelDistanceFunction;
    private javax.swing.JLabel jLabelInferenceRule;
    private javax.swing.JLabel jLabelK;
    private javax.swing.JTextField jTextFieldK;
    // End of variables declaration//GEN-END:variables

    private void commit() {
        FacadeKnnClassifierModule.setK(Integer.parseInt(jTextFieldK.getText()));
        FacadeKnnClassifierModule.setDistanceFunction((String)jComboBoxDistanceFunction.getSelectedItem());
        FacadeKnnClassifierModule.setInferenceRule((String)jComboBoxInferenceRule.getSelectedItem());
        FacadeKnnClassifierModule.getJDialogConfig().dispose();
    }

}
