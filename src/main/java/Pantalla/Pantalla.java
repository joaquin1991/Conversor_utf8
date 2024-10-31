/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantalla;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Pantalla extends javax.swing.JFrame {
    public static transformarTodos transformador;
  
    public static String direccion;

    
    //public static Object[][] tablita;
    
    public Pantalla() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        textito = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quiereCambiar = new java.awt.Checkbox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        salir = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        segundos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor UFT8");

        jLabel1.setText("Bienvenido al editor de Subtítulos");

        textito.setText("C:\\carpeta\\ejemplo.srt");
        textito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textitoActionPerformed(evt);
            }
        });

        confirmar.setText("OK");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel2.setText("Escriba la ruta con el archivo que desesa convertir");

        jLabel3.setText("¿Desea reemplazar los caracteres?");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reemplazar", "Por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cargarTabla();
        tabla.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaComponentAdded(evt);
            }
        });
        tabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaFocusGained(evt);
            }
        });
        tabla.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        nuevo.setText("NUEVO");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        guardar.setText("GUARDAR CAMBIOS");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        segundos.setText("0");
        segundos.setName("segundos"); // NOI18N
        segundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundosActionPerformed(evt);
            }
        });

        jLabel4.setText("Elija segundos a adelantar el subtítulo con relación al video");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quiereCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textito, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(confirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addComponent(salir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quiereCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmar)
                            .addComponent(salir))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(guardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
         
         Pantalla.direccion = textito.getText();

         int segundosObtenidos = 0;
         String textoSegundos = this.segundos.getText();
         try {segundosObtenidos = Integer.parseInt(textoSegundos);
         
            try {
           Boolean enviar = Conversor_uft8.ejecutar(direccion, Pantalla.transformador, this.quiereCambiar.getState(), segundosObtenidos);

           
            if(enviar){
                Reemplazar reemplazar = new Reemplazar();
                reemplazar.setVisible(true);
                reemplazar.establecerDireccion(direccion);
               
                   } else
                       {
                           Mensaje mensaje = new Mensaje();
                           mensaje.nombrar("Archivo no encontrado");
                           mensaje.setVisible(true);
                           //mensaje.ejecutar("Archivo no encontrado");
                       }
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         }catch(NumberFormatException e) {
         Mensaje mensaje = new Mensaje();
         mensaje.nombrar("El campo de segundos adelantar debe ser un entero");
         mensaje.setVisible(true);
         
         }
     
    }//GEN-LAST:event_confirmarActionPerformed

    private void textitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textitoActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Object[] fila = new Object[2];
        modelo.addRow(fila);
        tabla.setModel(modelo);
    }//GEN-LAST:event_nuevoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    
      int seleccion = tabla.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
      modelo.removeRow(seleccion);
      tabla.setModel(modelo);
     
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        List<Par_De_Letras> nuevo_Par = new ArrayList<Par_De_Letras>();
     DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
     transformador.guardarCambios(modelo);
     
    }//GEN-LAST:event_guardarActionPerformed

    private void tablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaFocusGained

    private void tablaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablaPropertyChange

              
    }//GEN-LAST:event_tablaPropertyChange

    private void tablaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaComponentAdded
    ///aca        // TODO add your handling code here:
    }//GEN-LAST:event_tablaComponentAdded

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void segundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundosActionPerformed

    public void cargarTabla(){
         DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Pantalla.transformador.pares.forEach(par->modelo.addRow(cargarFila(par)));
        tabla.setModel(modelo);
    }
    
    public Object[] cargarFila(Par_De_Letras par){
        Object [] fila = new Object[2];
        fila[0] = par.reemplazable;
        fila[1] = par.reemplazada;
        return fila;
    }
   
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         Pantalla.transformador = new transformarTodos();
      

       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo;
    private java.awt.Checkbox quiereCambiar;
    private javax.swing.JButton salir;
    private javax.swing.JTextField segundos;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textito;
    // End of variables declaration//GEN-END:variables


    
  
}
