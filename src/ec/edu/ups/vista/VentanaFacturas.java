/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMER PC
 */
public class VentanaFacturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaFacturas
     */
    
    private String mensaje;
    private String mensajeError;
    private List<Producto> productos;
    private Cliente cliente;
    private ControladorFactura controladorFactura;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private VentanaGestionFacturas ventanaGestionFacturas;
    private VentanaSeleccionCliente ventanaSeleccionCliente;
    private VentanaSeleccionProducto ventanaSeleccionProducto;
    private VentanaPrincipal ventanaPrincipal;
    
    public VentanaFacturas(ControladorFactura controladorFactura, ControladorCliente controladorCliente, ControladorProducto controladorProducto, VentanaPrincipal ventanaPrincipal) {
        initComponents();
	productos = new ArrayList<Producto>();
	this.controladorFactura = controladorFactura;
	this.controladorCliente = controladorCliente;
	this.controladorProducto = controladorProducto;
	this.ventanaPrincipal = ventanaPrincipal;
    }

    public VentanaSeleccionCliente getVentanaSeleccionCliente() {
	return ventanaSeleccionCliente;
    }

    public void setVentanaSeleccionCliente(VentanaSeleccionCliente ventanaSeleccionCliente) {
	this.ventanaSeleccionCliente = ventanaSeleccionCliente;
    }

    public VentanaSeleccionProducto getVentanaSeleccionProducto() {
	return ventanaSeleccionProducto;
    }

    public void setVentanaSeleccionProducto(VentanaSeleccionProducto ventanaSeleccionProducto) {
	this.ventanaSeleccionProducto = ventanaSeleccionProducto;
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

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JCheckBox getChbxEstado() {
        return chbxEstado;
    }

    public void setChbxEstado(JCheckBox chbxEstado) {
        this.chbxEstado = chbxEstado;
    }

    public JLabel getLbCliente() {
        return lbCliente;
    }

    public void setLbCliente(JLabel lbCliente) {
        this.lbCliente = lbCliente;
    }

    public JLabel getLbDatos() {
        return lbDatos;
    }

    public void setLbDatos(JLabel lbDatos) {
        this.lbDatos = lbDatos;
    }

    public JLabel getLbEstado() {
        return lbEstado;
    }

    public void setLbEstado(JLabel lbEstado) {
        this.lbEstado = lbEstado;
    }

    public JLabel getLbFecha() {
        return lbFecha;
    }

    public void setLbFecha(JLabel lbFecha) {
        this.lbFecha = lbFecha;
    }

    public JLabel getLbID() {
        return lbID;
    }

    public void setLbID(JLabel lbID) {
        this.lbID = lbID;
    }

    public JLabel getLbIVA() {
        return lbIVA;
    }

    public void setLbIVA(JLabel lbIVA) {
        this.lbIVA = lbIVA;
    }

    public JLabel getLbSubtotal() {
        return lbSubtotal;
    }

    public void setLbSubtotal(JLabel lbSubtotal) {
        this.lbSubtotal = lbSubtotal;
    }

    public JLabel getLbTitulo() {
        return lbTitulo;
    }

    public void setLbTitulo(JLabel lbTitulo) {
        this.lbTitulo = lbTitulo;
    }

    public JLabel getLbTotal() {
        return lbTotal;
    }

    public void setLbTotal(JLabel lbTotal) {
        this.lbTotal = lbTotal;
    }

    public JTable getTblDatos() {
        return tblDatos;
    }

    public void setTblDatos(JTable tblDatos) {
        this.tblDatos = tblDatos;
    }

    public JTextField getTxtCliente() {
        return txtCliente;
    }

    public void setTxtCliente(JTextField txtCliente) {
        this.txtCliente = txtCliente;
    }

    public JTextField getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JTextField txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtIVA() {
        return txtIVA;
    }

    public void setTxtIVA(JTextField txtIVA) {
        this.txtIVA = txtIVA;
    }

    public JTextField getTxtSubtotal() {
        return txtSubtotal;
    }

    public void setTxtSubtotal(JTextField txtSubtotal) {
        this.txtSubtotal = txtSubtotal;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public void setTxtTotal(JTextField txtTotal) {
        this.txtTotal = txtTotal;
    }

    public VentanaGestionFacturas getVentanaGestionFacturas() {
	return ventanaGestionFacturas;
    }

    public void setVentanaGestionFacturas(VentanaGestionFacturas ventanaGestionFacturas) {
	this.ventanaGestionFacturas = ventanaGestionFacturas;
    }

    public void setProducto(int codigo, int stock) {
	Producto producto = controladorProducto.buscar(codigo);
	producto.setStock(stock);
	productos.add(producto);
	controladorFactura.agregarProducto(producto);
	controladorFactura.calcularSubtotal();
	controladorFactura.calcularIVA();
	controladorFactura.calcularTotal();
	txtSubtotal.setText(controladorFactura.getFactura().getSubtotal()+"");
	txtTotal.setText(controladorFactura.getFactura().getTotal()+"");
	actualizar();
    }

    public Cliente getCliente() {
	return cliente;
    }

    public void setCliente(String cedula) {
	cliente = controladorCliente.buscarCliente(cedula);
	txtCliente.setText(cliente.getRuc().trim());
	txtNombre.setText(cliente.getNombre().trim());
	txtTelefono.setText(cliente.getTelefono().trim());
	txtDireccion.setText(cliente.getDireccion().trim());
	txtCedula.setText(cliente.getPropietario().getCedula().trim());
	txtNombreP.setText(cliente.getPropietario().getNombre().trim());
	txtApellido.setText(cliente.getPropietario().getApellido().trim());
	txtTelefonoP.setText(cliente.getPropietario().getTelefono().trim());
	controladorFactura.getFactura().setCliente(cliente);
	btnSelCliente.setEnabled(false);
    }
    
    public void actualizar(){
	controladorFactura.calcularSubtotal();
	controladorFactura.calcularTotal();
	txtSubtotal.setText(controladorFactura.getFactura().getSubtotal()+"");
	txtTotal.setText(controladorFactura.getFactura().getTotal()+"");
	DefaultTableModel tabla = (DefaultTableModel) tblDatos.getModel();
	List<Producto> productos = controladorFactura.getFactura().getProductos();
        tabla.setRowCount(0);
	for(int i = 0; i < productos.size(); i++){
	    tabla.addRow(new Object[]{
		productos.get(i).getId(),
		productos.get(i).getNombre().trim(),
		productos.get(i).getStock(),
		productos.get(i).getPrecio()
	    });
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

        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        lbIVA = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        lbCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        chbxEstado = new javax.swing.JCheckBox();
        lbDatos = new javax.swing.JLabel();
        btnSelCliente = new javax.swing.JButton();
        lbCliente1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbCliente2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbCliente3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lbCliente4 = new javax.swing.JLabel();
        lbCliente5 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lbCliente6 = new javax.swing.JLabel();
        txtTelefonoP = new javax.swing.JTextField();
        lbCliente7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jPanel2.setBackground(new java.awt.Color(30, 160, 250));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Facturas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(251, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbID.setText("ID:");

        lbFecha.setText("Fecha:");

        lbSubtotal.setText("Subtotal:");

        lbIVA.setText("IVA:");

        lbTotal.setText("Total:");

        lbCliente.setText("RUC");

        txtCliente.setEditable(false);

        lbEstado.setText("Estado:");

        chbxEstado.setText("Activo");

        lbDatos.setForeground(new java.awt.Color(51, 51, 255));
        lbDatos.setText("Datos de la factura");

        btnSelCliente.setText("Seleccionar Cliente");
        btnSelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelClienteActionPerformed(evt);
            }
        });

        lbCliente1.setText("Nombre");

        txtNombre.setEditable(false);

        lbCliente2.setText("Telefono");

        txtTelefono.setEditable(false);

        lbCliente3.setText("Direccion");

        txtDireccion.setEditable(false);

        txtCedula.setEditable(false);

        lbCliente4.setText("Cédula:");

        lbCliente5.setText("Nombre:");

        txtNombreP.setEditable(false);

        txtApellido.setEditable(false);

        lbCliente6.setText("Apellido:");

        txtTelefonoP.setEditable(false);

        lbCliente7.setText("Teléfono:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbID)
                            .addComponent(lbFecha)
                            .addComponent(lbSubtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtSubtotal)
                            .addComponent(txtID))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbCliente1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbCliente3)
                                        .addComponent(lbCliente2))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTotal)
                                    .addComponent(lbIVA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIVA)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEstado)
                                .addGap(18, 18, 18)
                                .addComponent(chbxEstado)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbCliente4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbCliente5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCliente7)
                                    .addComponent(lbCliente6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelCliente)
                        .addGap(130, 130, 130))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDatos)
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDatos)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente4)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbID)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCliente)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente5)
                        .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFecha)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCliente1)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente6)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSubtotal)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCliente2)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIVA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente7)
                        .addComponent(txtTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCliente3)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(chbxEstado)
                    .addComponent(btnSelCliente))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar Producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(70, 70, 70))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(txtCliente.getText().isEmpty() || txtFecha.getText().isEmpty() || txtID.getText().isEmpty() || txtIVA.getText().isEmpty() || txtSubtotal.getText().isEmpty() || txtTotal.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this, mensajeError);
        } else {
	    controladorFactura.getFactura().setCliente(cliente);
	    for(Producto p : productos)
		controladorFactura.agregarProducto(p);
	    controladorFactura.calcularSubtotal();
	    controladorFactura.calcularIVA();
	    controladorFactura.calcularTotal();
	    controladorFactura.guardarFactura();
	    this.dispose();
//            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
	if(ventanaSeleccionProducto.isVisible() == false){
            ventanaPrincipal.getDesktopPane().add(ventanaSeleccionProducto);
            ventanaSeleccionProducto.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelClienteActionPerformed
	if(ventanaSeleccionCliente.isVisible() == false){
            ventanaPrincipal.getDesktopPane().add(ventanaSeleccionCliente);
            ventanaSeleccionCliente.setVisible(true);
        }
    }//GEN-LAST:event_btnSelClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblDatos.getSelectedRow();
	int codigo = (int) tblDatos.getValueAt(fila, 0);
	Producto producto = controladorProducto.buscar(codigo);
	controladorFactura.quitarProducto(producto);
	actualizar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
	controladorFactura.crearFactura(controladorFactura.codigoFactura()+1, null, LocalDateTime.now(), 0, 0.12, 0, true);
	txtID.setText((controladorFactura.codigoFactura()+1)+"");
	txtFecha.setText(controladorFactura.getFactura().getFecha().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	txtSubtotal.setText("0.00");
	txtIVA.setText(controladorFactura.getFactura().getIVA()+"");
	txtTotal.setText("0.00");
	chbxEstado.setSelected(true);
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        ventanaGestionFacturas.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limpiar(){
	txtCliente.setText("");
	txtNombre.setText("");
	txtTelefono.setText("");
	txtDireccion.setText("");
	txtCedula.setText("");
	txtNombreP.setText("");
	txtApellido.setText("");
	txtTelefonoP.setText("");
	txtID.setText((controladorFactura.codigoFactura()+1)+"");
	txtFecha.setText("");
	txtSubtotal.setText("0.00");
	txtIVA.setText("");
	txtTotal.setText("0.00");
	DefaultTableModel tabla = (DefaultTableModel) tblDatos.getModel();
	tabla.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSelCliente;
    private javax.swing.JCheckBox chbxEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCliente1;
    private javax.swing.JLabel lbCliente2;
    private javax.swing.JLabel lbCliente3;
    private javax.swing.JLabel lbCliente4;
    private javax.swing.JLabel lbCliente5;
    private javax.swing.JLabel lbCliente6;
    private javax.swing.JLabel lbCliente7;
    private javax.swing.JLabel lbDatos;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIVA;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoP;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
