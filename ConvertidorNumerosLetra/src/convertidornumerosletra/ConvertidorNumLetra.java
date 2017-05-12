package convertidornumerosletra;

import javax.swing.JOptionPane;

public class ConvertidorNumLetra extends javax.swing.JFrame {

    public ConvertidorNumLetra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        letra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarRespuesta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        Text4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Text1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        boton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(0, 0, 51));
        boton.setText("Convertir");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setText("PAGUESE A NOMBRE DE: ");

        MostrarRespuesta.setBackground(new java.awt.Color(51, 255, 204));
        MostrarRespuesta.setColumns(20);
        MostrarRespuesta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MostrarRespuesta.setRows(5);
        jScrollPane1.setViewportView(MostrarRespuesta);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 204));
        jLabel3.setText("FECHA: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 204));
        jLabel4.setText("INGRESA VALOR A CONSIGNAR: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 204));
        jLabel5.setText("DOCUMENTO: ");

        Text2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text2ActionPerformed(evt);
            }
        });

        Text3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text3ActionPerformed(evt);
            }
        });

        Text4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("CHEQUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(boton))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letra, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(letra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed

    }//GEN-LAST:event_Text1ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        try {
            String Rpta = "", nombre = "", fecha = "", documento = "";
            this.Text1.getText();
            nombre = this.Text3.getText();
            fecha = this.Text2.getText();
            documento = this.Text4.getText();
            if (IsInteger(this.Text1.getText()) && IsInteger(this.Text4.getText())) {
                Rpta = numero.nletra(Integer.parseInt(this.Text1.getText()));

                MostrarRespuesta.setText(nombre);
                MostrarRespuesta.setText(fecha);
                MostrarRespuesta.setText(documento);
                MostrarRespuesta.setText(Rpta+" Pesos");

            } else {

                String numer[] = this.Text1.getText().split(",");
                if (numer.length == 2) {
                    String entero = (numer[0]);
                    String decimal = (numer[1]);
                    MostrarRespuesta.setText(nombre);
                    MostrarRespuesta.setText(fecha);
                    MostrarRespuesta.setText(documento);
                    this.MostrarRespuesta.setText(numero.nletra(Integer.parseInt(entero)) + (" coma " + numero.nletra(Integer.parseInt(decimal))));

                } else {

                    JOptionPane.showMessageDialog(this, "No se puede ingresar mas de una coma", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Algo no se a ingresado correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonActionPerformed

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text2ActionPerformed

    }//GEN-LAST:event_Text2ActionPerformed

    private void Text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text3ActionPerformed

    }//GEN-LAST:event_Text3ActionPerformed

    private void Text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text4ActionPerformed

    }//GEN-LAST:event_Text4ActionPerformed
    public boolean IsInteger(String Num) {
        for (int i = 0; i < Num.length(); i++) {
            if (Num.substring(i, i + 1).equals(",")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConvertidorNumLetra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvertidorNumLetra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvertidorNumLetra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvertidorNumLetra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConvertidorNumLetra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MostrarRespuesta;
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JTextField Text3;
    private javax.swing.JTextField Text4;
    private javax.swing.JButton boton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel letra;
    // End of variables declaration//GEN-END:variables
}
