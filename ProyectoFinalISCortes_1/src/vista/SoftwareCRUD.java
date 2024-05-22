package vista;
//librerias

import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class SoftwareCRUD extends javax.swing.JFrame {//inicia clase
    //variables de conexion

    public Connection cn;//conexion a BD
    public Statement stmt;//Instrucciones SQL querys de BD
    public ResultSet rs;//Resultado final de datos

    public SoftwareCRUD() {//metodo especia llamado clase constructor
        initComponents();
    }//termina constructor

    //metodo para conectar a bd
    public void conectarBase() {//inicia metodo conectar
        try {//inicia try
            //puente de conexion
            Class.forName("com.mysql.jdbc.Driver");//puente de conexion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdfiscortes", "root", "");
            stmt = cn.createStatement();//genera sentencias sql
            JOptionPane.showMessageDialog(null, "CONEXION BD ESTABLECIDA \nRVC");
        } catch (SQLException ex) {//inicia exeption
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception e) {//inica exception errores generales
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panAlta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtDescripciónProducto = new javax.swing.JTextField();
        txtUbicacionProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        panBaja = new javax.swing.JPanel();
        lblIdProductoBaja = new javax.swing.JLabel();
        txtIDProductoBaja = new javax.swing.JTextField();
        btnBajaProducto = new javax.swing.JButton();
        panBusquedaEditar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUbicacionProductoMod = new javax.swing.JTextField();
        txtDescripcionProductoMod = new javax.swing.JTextField();
        txtNombreProductoMod = new javax.swing.JTextField();
        txtIdProductoMod = new javax.swing.JTextField();
        btnEditarProducto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultaProductos = new javax.swing.JTable();
        btnActualizarProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Prueba de conexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panAlta.setBackground(new java.awt.Color(204, 204, 255));
        panAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Alta producto")));
        panAlta.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Id Producto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Ubicacion");

        txtDescripciónProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripciónProductoActionPerformed(evt);
            }
        });

        btnAlta.setText("Alta de Producto");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaLayout = new javax.swing.GroupLayout(panAlta);
        panAlta.setLayout(panAltaLayout);
        panAltaLayout.setHorizontalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUbicacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripciónProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panAltaLayout.setVerticalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripciónProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panBaja.setBackground(new java.awt.Color(204, 204, 255));
        panBaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Baja Producto"));

        lblIdProductoBaja.setText("Captura Id Producto a Eliminar");

        btnBajaProducto.setText("Borrar Producto");
        btnBajaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBajaLayout = new javax.swing.GroupLayout(panBaja);
        panBaja.setLayout(panBajaLayout);
        panBajaLayout.setHorizontalGroup(
            panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdProductoBaja)
                    .addComponent(txtIDProductoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBajaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBajaProducto)
                .addGap(76, 76, 76))
        );
        panBajaLayout.setVerticalGroup(
            panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblIdProductoBaja)
                .addGap(33, 33, 33)
                .addComponent(txtIDProductoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnBajaProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBusquedaEditar.setBackground(new java.awt.Color(204, 204, 255));
        panBusquedaEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda - Editar Producto"));

        jLabel9.setText("Id Producto");

        jLabel10.setText("Nombre");

        jLabel11.setText("Descripcion");

        txtDescripcionProductoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionProductoModActionPerformed(evt);
            }
        });

        btnEditarProducto.setText("Editar Producto");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        jLabel12.setText("Ubicacion");

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBusquedaEditarLayout = new javax.swing.GroupLayout(panBusquedaEditar);
        panBusquedaEditar.setLayout(panBusquedaEditarLayout);
        panBusquedaEditarLayout.setHorizontalGroup(
            panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBusquedaEditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10))
                    .addGap(33, 33, 33)
                    .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUbicacionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescripcionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        panBusquedaEditarLayout.setVerticalGroup(
            panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBusquedaEditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(59, 59, 59)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtIdProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtNombreProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescripcionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(txtUbicacionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );

        jtConsultaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_producto", "Nombre", "Descripción", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jtConsultaProductos);

        btnActualizarProductos.setText("Actualizar lista de productos");
        btnActualizarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(panBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(panBusquedaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(btnActualizarProductos)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panBusquedaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarProductos)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      conectarBase();//llamada a la conexion de bd
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        conectarBase();//llamada a metodo conectar
        //declaracion de variables de entrada
        int idProducto=Integer.parseInt(txtIdProducto.getText());
        String nombre=txtNombreProducto.getText();
        String decripcion=txtDescripciónProducto.getText();
        String ubicacion=txtUbicacionProducto.getText();
       
        //proceso guardar en la base de datos
  String altaProducto="INSERT INTO PRODUCTOS VALUES ('"+idProducto+"','"+nombre+"','"+decripcion+"','"+ubicacion+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego producto de forma correcta\n"+nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD :\n"+ e);
        }//termina catch
    }//GEN-LAST:event_btnAltaActionPerformed

    private void txtDescripciónProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripciónProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripciónProductoActionPerformed

    private void txtDescripcionProductoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionProductoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionProductoModActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
String editarSQL="";
             
        try {
            conectarBase();
            int idProductoMod=Integer.parseInt(this.txtIdProductoMod.getText());
            String nombre = this.txtNombreProductoMod.getText();
            String descripcion = this.txtDescripcionProductoMod.getText();
            String ubicacion = this.txtUbicacionProductoMod.getText();
           
editarSQL="UPDATE productos SET nombre = '"+nombre+"',descripcion = '"+descripcion+"', ubicacion='"+ubicacion+"' where id_producto = '"+idProductoMod+"'";
                 stmt.executeUpdate(editarSQL);
           
                 JOptionPane.showMessageDialog(null, "Producto actualizado\nVerifica tu consulta");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de BD al actualizar producto"+ e);
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnBajaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaProductoActionPerformed
int confirmaBaja;
        try {
            conectarBase();
            int productoBaja=Integer.parseInt(txtIDProductoBaja.getText());
           
            confirmaBaja=stmt.executeUpdate("DELETE FROM productos WHERE ID_PRODUCTO = '"+productoBaja+"'");
           
            if (confirmaBaja==1) {//si elimino
                JOptionPane.showMessageDialog(null,"Se dio de baja el Id de Producto : \n"+productoBaja);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese ID de producto  : \nVerifica  codigo");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de BD\n"+ e);
        }
    }//GEN-LAST:event_btnBajaProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        try {
            conectarBase();
            int idProductoMod=Integer.parseInt(this.txtIdProductoMod.getText());
            //instruccion para buscar usuario
            rs=stmt.executeQuery("SELECT * FROM productos where id_producto='"+idProductoMod+"'");
            JOptionPane.showMessageDialog(null, "Buscando Producto...");
            if (rs.next()==true) {
                this.txtNombreProductoMod.setText(rs.getString("nombre"));
                this.txtDescripcionProductoMod.setText(rs.getString("descripcion"));
                this.txtUbicacionProductoMod.setText(rs.getString("ubicacion"));
            } else {
                 JOptionPane.showMessageDialog(null, "Error no existe ese ID de Producto\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD"+ e);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnActualizarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductosActionPerformed
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsultaProductos.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from productos");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("id_producto ");
                 modeloDatos.addColumn("nombre");
                 modeloDatos.addColumn("descripcion");
                 modeloDatos.addColumn("ubicacion");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD en consulta, verifica\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_btnActualizarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(SoftwareCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoftwareCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoftwareCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoftwareCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoftwareCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProductos;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBajaProducto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsultaProductos;
    private javax.swing.JLabel lblIdProductoBaja;
    private javax.swing.JPanel panAlta;
    private javax.swing.JPanel panBaja;
    private javax.swing.JPanel panBusquedaEditar;
    private javax.swing.JTextField txtDescripcionProductoMod;
    private javax.swing.JTextField txtDescripciónProducto;
    private javax.swing.JTextField txtIDProductoBaja;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdProductoMod;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProductoMod;
    private javax.swing.JTextField txtUbicacionProducto;
    private javax.swing.JTextField txtUbicacionProductoMod;
    // End of variables declaration//GEN-END:variables
}
