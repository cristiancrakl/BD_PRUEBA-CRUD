package paquete;

import java.sql.*;
import javax.swing.JOptionPane;

public class Consultar extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstancia();

    public Consultar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta a BD");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Consultar = new javax.swing.JButton();
        btn_VerificarCientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Informacion = new javax.swing.JTextArea();
        btn_Refrescar = new javax.swing.JButton();
        btn_PaginaAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Consultar.setText("Consultar clientes");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btn_VerificarCientes.setText("Verificar si hay clientes en la BD");
        btn_VerificarCientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerificarCientesActionPerformed(evt);
            }
        });

        txt_Informacion.setColumns(20);
        txt_Informacion.setRows(5);
        jScrollPane1.setViewportView(txt_Informacion);

        btn_Refrescar.setText("Refrescar");
        btn_Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefrescarActionPerformed(evt);
            }
        });

        btn_PaginaAnterior.setText("Pagina Anterior");
        btn_PaginaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PaginaAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Refrescar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(btn_VerificarCientes, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_PaginaAnterior)))
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_Refrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VerificarCientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_PaginaAnterior)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefrescarActionPerformed
        txt_Informacion.setText(" ");
    }//GEN-LAST:event_btn_RefrescarActionPerformed

    private void btn_PaginaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PaginaAnteriorActionPerformed
        this.dispose(); // Cierra la ventana actual (Consultar)

        // Crear una nueva instancia de Registro y hacerla visible
        Registro registro = new Registro();
        registro.setVisible(true);
    }//GEN-LAST:event_btn_PaginaAnteriorActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_ConsultarActionPerformed

        try {
            Connection conexion = conectar.conectar();
            PreparedStatement seleccionar = conexion.prepareStatement("SELECT * FROM registrohumanos");

            ResultSet consulta = seleccionar.executeQuery();

            while (consulta.next()) {
                txt_Informacion.append(consulta.getString(1));
                txt_Informacion.append("     ");
                txt_Informacion.append(consulta.getString(2));
                txt_Informacion.append("     ");
                txt_Informacion.append(consulta.getString(3));
                txt_Informacion.append("     ");
                txt_Informacion.append(consulta.getString(4));
                txt_Informacion.append("     ");
                txt_Informacion.append(consulta.getString(5));
                txt_Informacion.append("\n");

            }

            conectar.cerrarConexion();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }

    }// GEN-LAST:event_btn_ConsultarActionPerformed

    private void txt_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_ConsultaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_ConsultaActionPerformed

    private void btn_VerificarCientesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_VerificarCientesActionPerformed
        try {

            Connection conexion = conectar.conectar();
            PreparedStatement seleccionar = conexion.prepareStatement("SELECT * FROM registrohumanos");

            ResultSet consulta = seleccionar.executeQuery();

            if (consulta.next()) {

                JOptionPane.showMessageDialog(null, "la base de datos tiene clientes .");

            } else {
                JOptionPane.showMessageDialog(null, "la base de datos no tiene clientes .");
            }

            conectar.cerrarConexion();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }
    }// GEN-LAST:event_btn_VerificarCientesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_PaginaAnterior;
    private javax.swing.JButton btn_Refrescar;
    private javax.swing.JButton btn_VerificarCientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_Informacion;
    // End of variables declaration//GEN-END:variables
}
