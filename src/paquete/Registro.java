package paquete;

import java.sql.*;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    Conexion conectar = Conexion.getInstancia();

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registros a BD");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Correo = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Contraseña = new javax.swing.JTextField();
        combo_Rol = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_Refrescar = new javax.swing.JButton();
        btn_Registrar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_Consultas = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        txt_idBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite su nombre:");

        jLabel2.setText("Digite su correo:");

        jLabel3.setText("Digite su contraseña:");

        txt_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CorreoActionPerformed(evt);
            }
        });

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraseñaActionPerformed(evt);
            }
        });

        combo_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "cliente", " " }));
        combo_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_RolActionPerformed(evt);
            }
        });

        jLabel4.setText("Selecione su rol:");

        btn_Refrescar.setText("Refrescar");
        btn_Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefrescarActionPerformed(evt);
            }
        });

        btn_Registrar1.setText("Registrar Datos");
        btn_Registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Registrar1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Maximo 20 caracteres");

        btn_Consultas.setText("Next page");
        btn_Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultasActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        jLabel6.setText("Digite el id a modificar o eliminar:");

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        txt_idBuscar.setText("Digite el id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Consultas)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_Refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Correo)
                            .addComponent(txt_Nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_idBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Buscar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(txt_idBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_Consultas)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement modificar = conexion.prepareStatement(" UPDATE registrohumanos SET Nombre = ?, Correo = ?, Contraseña = ?, Rol = ? WHERE id = ?");

            modificar.setString(1, txt_Nombre.getText());
            modificar.setString(2, txt_Correo.getText());
            modificar.setString(3, txt_Contraseña.getText());
            modificar.setString(4, combo_Rol.getSelectedItem().toString());
            modificar.setInt(5, Integer.parseInt(txt_idBuscar.getText()));

            modificar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dato Modificado");

            conectar.cerrarConexion();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "" + e);

        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        Connection conexion = conectar.conectar();
        try {
            PreparedStatement buscar = conexion.prepareStatement("SELECT * FROM registrohumanos WHERE id = ?");
            buscar.setInt(1, Integer.parseInt(txt_idBuscar.getText()));
            ResultSet resultado = buscar.executeQuery();
            
            if (resultado.next()) {
                txt_Nombre.setText(resultado.getString("Nombre"));
                txt_Correo.setText(resultado.getString("Correo"));
                txt_Contraseña.setText(resultado.getString("Contraseña"));
                combo_Rol.setSelectedItem(resultado.getString("Rol"));
                } else
                JOptionPane.showMessageDialog(null, "No se encontraron resultados");
                conectar.cerrarConexion();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "" + e);
                    }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void txt_CorreoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_CorreoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_CorreoActionPerformed

    private void txt_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_ContraseñaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_ContraseñaActionPerformed

    private void combo_RolActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_combo_RolActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_combo_RolActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txt_NombreActionPerformed

    private void btn_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_RefrescarActionPerformed
        txt_Nombre.setText("");
        txt_Correo.setText("");
        txt_Contraseña.setText("");
    }// GEN-LAST:event_btn_RefrescarActionPerformed

    private void btn_ConsultasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_ConsultasActionPerformed
        // Cerrar la ventana actual
        this.dispose(); // Cierra la ventana actual (Consultar)

        // Crear una nueva instancia de Registro y hacerla visible
        Consultar consultar = new Consultar();
        consultar.setVisible(true);
    }// GEN-LAST:event_btn_ConsultasActionPerformed

    private void btn_Registrar1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_Registrar1ActionPerformed

        try {

            Connection conexion = conectar.conectar();
            PreparedStatement insertar = conexion.prepareStatement("insert into registrohumanos values(?,?,?,?,?)");

            insertar.setString(1, "0");
            insertar.setString(2, txt_Nombre.getText().trim());
            insertar.setString(3, txt_Correo.getText().trim());
            insertar.setString(4, txt_Contraseña.getText().trim());
            insertar.setString(5, combo_Rol.getSelectedItem().toString());
            insertar.executeUpdate();

            JOptionPane.showMessageDialog(null, "datos registrados");

            conectar.cerrarConexion();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error);
        }

    }// GEN-LAST:event_btn_Registrar1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Consultas;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Refrescar;
    private javax.swing.JButton btn_Registrar1;
    private javax.swing.JComboBox<String> combo_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_Contraseña;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_idBuscar;
    // End of variables declaration//GEN-END:variables
}
