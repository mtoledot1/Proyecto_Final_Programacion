/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Persona;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMER PC
 */
public class VentanaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaClientes
     */
    
    private String mensaje;
    private String mensajeError;
    private ControladorCliente controladorCliente;
    private ControladorPersona controladorPersona;
    
    public VentanaCliente(ControladorCliente controladorCliente, ControladorPersona controladorPersona) {
        initComponents();
	this.controladorCliente = controladorCliente;
	this.controladorPersona = controladorPersona;
    }

    public JLabel getLbCedula() {
        return lbCedula;
    }

    public void setLbCedula(JLabel lbCedula) {
        this.lbCedula = lbCedula;
    }

    public JLabel getLbDireccion() {
        return lbDireccion;
    }

    public void setLbDireccion(JLabel lbDireccion) {
        this.lbDireccion = lbDireccion;
    }

    public JLabel getLbNombre() {
        return lbNombreC;
    }

    public void setLbNombre(JLabel lbNombre) {
        this.lbNombreC = lbNombre;
    }

    public JLabel getLbRuc() {
        return lbRuc;
    }

    public void setLbRuc(JLabel lbRuc) {
        this.lbRuc = lbRuc;
    }

    public JLabel getLbTelefono() {
        return lbTelefonoC;
    }

    public void setLbTelefono(JLabel lbTelefono) {
        this.lbTelefonoC = lbTelefono;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombre() {
        return txtNombreC;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombreC = txtNombre;
    }

    public JTextField getTxtRuc() {
        return txtRuc;
    }

    public void setTxtRuc(JTextField txtRuc) {
        this.txtRuc = txtRuc;
    }

    public JTextField getTxtTelefono() {
        return txtTelefonoC;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefonoC = txtTelefono;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
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
        lbRuc = new javax.swing.JLabel();
        lbNombreC = new javax.swing.JLabel();
        lbTelefonoC = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbCedula = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtTelefonoC = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbRuc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRuc.setText("Ruc:");

        lbNombreC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNombreC.setText("Nombre Cliente:");

        lbTelefonoC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTelefonoC.setText("Telefono Cliente:");

        lbDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbDireccion.setText("Direccion:");

        lbCedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCedula.setText("Cedula:");

        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "RUC", "Nombre", "Teléfono", "Dirección"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblApellido.setText("Apellido:");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTelefono.setText("Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCedula)
                            .addComponent(lbRuc)
                            .addComponent(lbNombreC)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido)
                            .addComponent(lblTelefono)
                            .addComponent(lbDireccion)
                            .addComponent(lbTelefonoC))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addComponent(txtRuc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreC)
                            .addComponent(txtCedula)
                            .addComponent(txtTelefonoC)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtTelefono))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefonoC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        if(txtCedula.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtNombreC.getText().isEmpty() || txtRuc.getText().isEmpty() || txtTelefonoC.getText().isEmpty()){
            //JOptionPane.showMessageDialog(this, mensajeError);
        } else {
	    String cedula = txtCedula.getText();
	    String nombre = txtNombre.getText();
	    String apellido = txtApellido.getText();
	    String telefono = lblTelefono.getText();
	    String ruc = txtRuc.getText();
	    String nombreC = txtNombreC.getText();
	    String direccion = txtDireccion.getText();
	    String telefonoC = txtTelefonoC.getText();
	    controladorPersona.crear(cedula, nombre, apellido, telefono);
	    controladorCliente.registar(cedula, ruc, nombreC, telefonoC, direccion);
//            JOptionPane.showMessageDialog(this, mensaje);
        }
	controladorCliente.verCliente((DefaultTableModel) jTable1.getModel());
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String ruc = txtRuc.getText();
	List<Cliente> clientes = controladorCliente.listar();
	for(Cliente c : clientes){
	    if(c.getRuc().equalsIgnoreCase(ruc)){
		txtCedula.setText(c.getPropietario().getCedula());
		txtNombre.setText(c.getPropietario().getNombre());
		txtApellido.setText(c.getPropietario().getApellido());
		lblTelefono.setText(c.getPropietario().getTelefono());
		txtNombreC.setText(c.getNombre());
		txtDireccion.setText(c.getDireccion());
		txtTelefonoC.setText(c.getTelefono());
		int i = clientes.indexOf(c);
		jTable1.setRowSelectionInterval(i, i);
	    }
	}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String cedula = txtCedula.getText();
	String nombre = txtNombre.getText();
	String apellido = txtApellido.getText();
	String telefono = lblTelefono.getText();
	String ruc = txtRuc.getText();
	String nombreC = txtNombreC.getText();
	String direccion = txtDireccion.getText();
	String telefonoC = txtTelefonoC.getText();
	controladorPersona.actualizar(cedula, nombre, apellido, telefono);
	controladorCliente.actualizar(cedula, ruc, nombreC, apellido, telefonoC, direccion);
	controladorCliente.verCliente((DefaultTableModel) jTable1.getModel());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String ruc = txtRuc.getText();
	controladorPersona.eliminar(controladorCliente.buscarCliente(ruc).getPropietario().getCedula());
	controladorCliente.eliminar(ruc);
	controladorCliente.verCliente((DefaultTableModel) jTable1.getModel());
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        controladorCliente.verCliente((DefaultTableModel) jTable1.getModel());
    }//GEN-LAST:event_formInternalFrameActivated

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
	txtCedula.setText(jTable1.getValueAt(fila, 0)+"");
	txtRuc.setText(jTable1.getValueAt(fila, 1)+"");
	txtNombreC.setText(jTable1.getValueAt(fila, 2)+"");
	txtTelefonoC.setText(jTable1.getValueAt(fila, 3)+"");
	txtDireccion.setText(jTable1.getValueAt(fila, 4)+"");
	Persona persona = controladorPersona.buscarCliente(txtCedula.getText());
	txtNombre.setText(persona.getNombre());
	txtApellido.setText(persona.getApellido());
	txtTelefono.setText(persona.getTelefono());
    }//GEN-LAST:event_jTable1MouseClicked

    public void limpiar(){
	txtCedula.setText("");
	txtRuc.setText("");
	txtNombreC.setText("");
	txtTelefonoC.setText("");
	txtDireccion.setText("");
	txtNombre.setText("");
	txtApellido.setText("");
	txtTelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbNombreC;
    private javax.swing.JLabel lbRuc;
    private javax.swing.JLabel lbTelefonoC;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables
}
