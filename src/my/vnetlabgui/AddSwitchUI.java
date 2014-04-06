/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.vnetlabgui;

/**
 *
 * @author nspurgeo
 */
public class AddSwitchUI extends javax.swing.JFrame {

    /**
     * Creates new form AddSwitchUI
     */
    public AddSwitchUI() {
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

        pnlSwitch = new javax.swing.JPanel();
        btnSwitchConfirm = new javax.swing.JButton();
        btnSwitchStart = new javax.swing.JButton();
        btnSwitchShutDown = new javax.swing.JButton();
        txtSwitchHostName = new javax.swing.JTextField();
        txtSwitchMACAddress = new javax.swing.JTextField();
        lblIPAddress = new javax.swing.JLabel();
        txtSwitchIPAddress = new javax.swing.JTextField();
        lblDiskSize = new javax.swing.JLabel();
        txtSwitchDiskSize = new javax.swing.JTextField();
        lblRAM = new javax.swing.JLabel();
        lblCPU = new javax.swing.JLabel();
        lblHostName = new javax.swing.JLabel();
        txtSwitchRAM = new javax.swing.JTextField();
        txtCPU = new javax.swing.JTextField();
        lblSwitchMACAddress = new javax.swing.JLabel();
        btnSwitchCancel = new javax.swing.JButton();
        lblAddSwitch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSwitchConfirm.setText("Confirm");

        btnSwitchStart.setText("Start");

        btnSwitchShutDown.setText("Shutdown");

        txtSwitchHostName.setText("Host Name");

        txtSwitchMACAddress.setText("MAC Address");

        lblIPAddress.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblIPAddress.setText("IP Address:");

        txtSwitchIPAddress.setText("IP Address");

        lblDiskSize.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDiskSize.setText("Disk Size:");

        txtSwitchDiskSize.setText("Hard Disk Size");

        lblRAM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRAM.setText("RAM:");

        lblCPU.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCPU.setText("CPU:");

        lblHostName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHostName.setText("Host Name:");

        txtSwitchRAM.setText("RAM");

        txtCPU.setText("CPU");

        lblSwitchMACAddress.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSwitchMACAddress.setText("MAC Address:");

        btnSwitchCancel.setText("Cancel");

        javax.swing.GroupLayout pnlSwitchLayout = new javax.swing.GroupLayout(pnlSwitch);
        pnlSwitch.setLayout(pnlSwitchLayout);
        pnlSwitchLayout.setHorizontalGroup(
            pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSwitchLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSwitchLayout.createSequentialGroup()
                        .addComponent(btnSwitchCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSwitchShutDown, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSwitchLayout.createSequentialGroup()
                        .addComponent(btnSwitchConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSwitchStart, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSwitchLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCPU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRAM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDiskSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIPAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHostName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSwitchMACAddress, javax.swing.GroupLayout.Alignment.LEADING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSwitchHostName)
                        .addComponent(txtSwitchMACAddress)
                        .addComponent(txtSwitchIPAddress)
                        .addComponent(txtSwitchDiskSize)
                        .addComponent(txtSwitchRAM)
                        .addComponent(txtCPU))
                    .addGap(60, 60, 60)))
        );
        pnlSwitchLayout.setVerticalGroup(
            pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSwitchLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSwitchStart, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSwitchConfirm, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSwitchShutDown)
                    .addComponent(btnSwitchCancel))
                .addGap(16, 16, 16))
            .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlSwitchLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHostName)
                        .addComponent(txtSwitchHostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSwitchMACAddress)
                        .addComponent(txtSwitchMACAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIPAddress)
                        .addComponent(txtSwitchIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDiskSize)
                        .addComponent(txtSwitchDiskSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlSwitchLayout.createSequentialGroup()
                            .addComponent(lblRAM)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCPU))
                        .addGroup(pnlSwitchLayout.createSequentialGroup()
                            .addComponent(txtSwitchRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        lblAddSwitch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAddSwitch.setText("Add Switch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblAddSwitch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAddSwitch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AddSwitchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSwitchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSwitchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSwitchUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSwitchUI().setVisible(lblRAM            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSwitchCancel;
    private javax.swing.JButton btnSwitchConfirm;
    private javax.swing.JButton btnSwitchShutDown;
    private javax.swing.JButton btnSwitchStart;
    private javax.swing.JLabel lblAddSwitch;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblDiskSize;
    private javax.swing.JLabel lblHostName;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblRAM;
    private javax.swing.JLabel lblSwitchMACAddress;
    private javax.swing.JPanel pnlSwitch;
    private javax.swing.JTextField txtCPU;
    private javax.swing.JTextField txtSwitchDiskSize;
    private javax.swing.JTextField txtSwitchHostName;
    private javax.swing.JTextField txtSwitchIPAddress;
    private javax.swing.JTextField txtSwitchMACAddress;
    private javax.swing.JTextField txtSwitchRAM;
    // End of variables declaration//GEN-END:variables
}