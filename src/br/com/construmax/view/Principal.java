package br.com.construmax.view;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                FrmPrincipal principal = new FrmPrincipal();
                //  principal.pack();      

                /*Insets in = Toolkit.getDefaultToolkit().getScreenInsets(principal.getGraphicsConfiguration());

                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

                int width = d.width - (in.left + in.top);
                int height = d.height - (in.top + in.bottom);

                principal.setSize(width, height);
                principal.setLocation(in.left, in.top);*/

                principal.setVisible(true);

                // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                //double width = screenSize.getWidth();
                //double height = screenSize.getHeight();
                // principal.setSize(screenSize);
                //new JanelaPrincipal().setVisible(true);
                //principal.setExtendedState();
            }
        });

    }

}
