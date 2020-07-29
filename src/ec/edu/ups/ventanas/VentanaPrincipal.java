/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanas;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author GAMER PC
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    //Ventanas
    private VentanaRegistrarUsuario ventanaRegistrarUsuario;
    private VentanaIniciarSesion ventanaIniciarSecion;
    private VentanaBodegas ventanaBodegas;
    private VentanaRegistrarCliente ventanaRegistrarCliente;
    private VentanaFacturas ventanaFacturas;
    private VentanaProductos ventanaProductos;
    
    //Localizacion
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    public VentanaPrincipal() {
        initComponents();
        
        ventanaRegistrarUsuario = new VentanaRegistrarUsuario();
        ventanaIniciarSecion = new VentanaIniciarSesion();
        ventanaBodegas = new VentanaBodegas();
        ventanaRegistrarCliente = new VentanaRegistrarCliente();
        ventanaFacturas = new VentanaFacturas();
        ventanaProductos = new VentanaProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        inicioMenu = new javax.swing.JMenu();
        registrarMenuIterm = new javax.swing.JMenuItem();
        iniciarSesionMenuItem = new javax.swing.JMenuItem();
        clientesMenuItem = new javax.swing.JMenuItem();
        bodegasMenuItem = new javax.swing.JMenuItem();
        productosMenuItem = new javax.swing.JMenuItem();
        facturasMenuItem = new javax.swing.JMenuItem();
        salirMenuItem = new javax.swing.JMenuItem();
        idiomasMenu = new javax.swing.JMenu();
        espanolMenuItem = new javax.swing.JMenuItem();
        ingleslMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inicioMenu.setMnemonic('f');
        inicioMenu.setText("Inicio");

        registrarMenuIterm.setText("Registrar usuario");
        registrarMenuIterm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMenuItermActionPerformed(evt);
            }
        });
        inicioMenu.add(registrarMenuIterm);

        iniciarSesionMenuItem.setMnemonic('o');
        iniciarSesionMenuItem.setText("Iniciar sesión");
        iniciarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionMenuItemActionPerformed(evt);
            }
        });
        inicioMenu.add(iniciarSesionMenuItem);

        clientesMenuItem.setText("Ingresar cliente");
        clientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesMenuItemActionPerformed(evt);
            }
        });
        inicioMenu.add(clientesMenuItem);

        bodegasMenuItem.setMnemonic('s');
        bodegasMenuItem.setText("Gestionar bodegas");
        bodegasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodegasMenuItemActionPerformed(evt);
            }
        });
        inicioMenu.add(bodegasMenuItem);

        productosMenuItem.setMnemonic('a');
        productosMenuItem.setText("Gestionar productos");
        productosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosMenuItemActionPerformed(evt);
            }
        });
        inicioMenu.add(productosMenuItem);

        facturasMenuItem.setText("Gestionar facturas");
        facturasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturasMenuItemActionPerformed(evt);
            }
        });
        inicioMenu.add(facturasMenuItem);

        salirMenuItem.setMnemonic('x');
        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        inicioMenu.add(salirMenuItem);

        menuBar.add(inicioMenu);

        idiomasMenu.setMnemonic('e');
        idiomasMenu.setText("Idiomas");

        espanolMenuItem.setMnemonic('t');
        espanolMenuItem.setText("Español");
        espanolMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espanolMenuItemActionPerformed(evt);
            }
        });
        idiomasMenu.add(espanolMenuItem);

        ingleslMenuItem.setMnemonic('y');
        ingleslMenuItem.setText("Inglés");
        ingleslMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingleslMenuItemActionPerformed(evt);
            }
        });
        idiomasMenu.add(ingleslMenuItem);

        menuBar.add(idiomasMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirMenuItemActionPerformed

    private void iniciarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionMenuItemActionPerformed
        // TODO add your handling code here:
        if(ventanaIniciarSecion.isVisible() == false){
            desktopPane.add(ventanaIniciarSecion);
            ventanaIniciarSecion.setVisible(true);
        }
    }//GEN-LAST:event_iniciarSesionMenuItemActionPerformed

    private void bodegasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodegasMenuItemActionPerformed
        // TODO add your handling code here:
        if(ventanaBodegas.isVisible() == false){
            desktopPane.add(ventanaBodegas);
            ventanaBodegas.setVisible(true);
        }
    }//GEN-LAST:event_bodegasMenuItemActionPerformed

    private void productosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosMenuItemActionPerformed
        // TODO add your handling code here:
        if(ventanaProductos.isVisible() == false){
            desktopPane.add(ventanaProductos);
            ventanaProductos.setVisible(true);
        }
    }//GEN-LAST:event_productosMenuItemActionPerformed

    private void clientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesMenuItemActionPerformed
        // TODO add your handling code here:
        if(ventanaRegistrarCliente.isVisible() == false){
            desktopPane.add(ventanaRegistrarCliente);
            ventanaRegistrarCliente.setVisible(true);
        }
    }//GEN-LAST:event_clientesMenuItemActionPerformed

    private void facturasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturasMenuItemActionPerformed
        // TODO add your handling code here:
        if(ventanaFacturas.isVisible() == false){
            desktopPane.add(ventanaFacturas);
            ventanaFacturas.setVisible(true);
        }
    }//GEN-LAST:event_facturasMenuItemActionPerformed

    private void espanolMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espanolMenuItemActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es","EC"); 
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_espanolMenuItemActionPerformed

    private void ingleslMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingleslMenuItemActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en","UK"); 
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_ingleslMenuItemActionPerformed

    private void registrarMenuItermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMenuItermActionPerformed
        // TODO add your handling code here:
        if(ventanaRegistrarUsuario.isVisible() == false){
            desktopPane.add(ventanaRegistrarUsuario);
            ventanaRegistrarUsuario.setVisible(true);
        }
    }//GEN-LAST:event_registrarMenuItermActionPerformed

    public void cambiarIdioma(){
        
        //Ventana principal
        inicioMenu.setText(mensajes.getString("inicio"));
        registrarMenuIterm.setText(mensajes.getString("registrarUsuario"));
        iniciarSesionMenuItem.setText(mensajes.getString("iniciar"));
        bodegasMenuItem.setText(mensajes.getString("bodegas"));
        productosMenuItem.setText(mensajes.getString("productos"));
        clientesMenuItem.setText(mensajes.getString("cliente"));
        facturasMenuItem.setText(mensajes.getString("facturas"));
        salirMenuItem.setText(mensajes.getString("salir"));
        idiomasMenu.setText(mensajes.getString("idiomas"));
        espanolMenuItem.setText(mensajes.getString("espanol"));
        ingleslMenuItem.setText(mensajes.getString("ingles"));
        
        //VentanaRegistrarUsuario
        ventanaRegistrarUsuario.getLbCedula().setText(mensajes.getString("cedula"));
        ventanaRegistrarUsuario.getLbNombre().setText(mensajes.getString("nombre"));
        ventanaRegistrarUsuario.getLbApellido().setText(mensajes.getString("apellido"));
        ventanaRegistrarUsuario.getLbTelefono().setText(mensajes.getString("telefono"));
        ventanaRegistrarUsuario.getLbUsuario().setText(mensajes.getString("usuario"));
        ventanaRegistrarUsuario.getLbContrasena().setText(mensajes.getString("contrasena"));
        ventanaRegistrarUsuario.getBtnRegistrar().setText(mensajes.getString("registrar"));
        ventanaRegistrarUsuario.setMensajeError(mensajes.getString("error"));
        ventanaRegistrarUsuario.setMensaje(mensajes.getString("registro"));
        
        //VentanaIniciarSecion
        ventanaIniciarSecion.getLbUsuario().setText(mensajes.getString("usuario"));
        ventanaIniciarSecion.getLbContrasena().setText(mensajes.getString("contrasena"));
        ventanaIniciarSecion.getBtnRegistrar().setText(mensajes.getString("iniciar"));
        ventanaIniciarSecion.setMensaje(mensajes.getString("mensaje"));
        ventanaIniciarSecion.setMensajeError(mensajes.getString("error"));
        
        //VentanaRegistrarCliente
        ventanaRegistrarCliente.getLbCedula().setText(mensajes.getString("cedula"));
        ventanaRegistrarCliente.getLbNombre().setText(mensajes.getString("nombre"));
        ventanaRegistrarCliente.getLbApellido().setText(mensajes.getString("apellido"));
        ventanaRegistrarCliente.getLbTelefono().setText(mensajes.getString("telefono"));
        ventanaRegistrarCliente.getLbDireccion().setText(mensajes.getString("direccion"));
        ventanaRegistrarCliente.getBtnIngresar().setText(mensajes.getString("ingresar"));
        ventanaRegistrarCliente.setMensaje(mensajes.getString("registrarC"));
        ventanaRegistrarCliente.setMensajeError(mensajes.getString("error"));
    }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bodegasMenuItem;
    private javax.swing.JMenuItem clientesMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem espanolMenuItem;
    private javax.swing.JMenuItem facturasMenuItem;
    private javax.swing.JMenu idiomasMenu;
    private javax.swing.JMenuItem ingleslMenuItem;
    private javax.swing.JMenuItem iniciarSesionMenuItem;
    private javax.swing.JMenu inicioMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem productosMenuItem;
    private javax.swing.JMenuItem registrarMenuIterm;
    private javax.swing.JMenuItem salirMenuItem;
    // End of variables declaration//GEN-END:variables

}
