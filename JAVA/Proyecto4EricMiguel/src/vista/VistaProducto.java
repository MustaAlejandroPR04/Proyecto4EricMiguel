/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controller.Controller;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Conexion;
import modelo.Producte;
import modelo.Stock;

/**
 *
 * @author 9199.joan23
 */
public class VistaProducto extends javax.swing.JInternalFrame {

    Controller producto = new Controller();

    /**
     * Creates new form VistaProducto
     */
    public VistaProducto() {

        initComponents();
        
        this.jTablaProducto.setModel(producto.mostrarProducto());
        producto.Caja(jcCategoriaCaja);
        
        // Cuando inicie  el programa los botones: eliminar, guardar estaran desactivadas
        this.jbEliminar.setEnabled(false);
        this.jbGuardar.setEnabled(false);
        this.jtCategoriaId.setText("");
        this.jtCategoria.setVisible(false);
        

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
        jLabel4 = new javax.swing.JLabel();
        jtIdPro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtStockActual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtNombrePro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrecioPro = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbAñadir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtStockMax = new javax.swing.JTextField();
        jtStockMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcCategoriaCaja = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtCategoriaId = new javax.swing.JTextField();
        jtStockIdPro = new javax.swing.JTextField();
        StokId = new javax.swing.JLabel();
        jtStockId = new javax.swing.JTextField();
        jtCategoria = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaProducto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setBackground(new java.awt.Color(0, 51, 153));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Producto");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("ID");

        jtIdPro.setEditable(false);
        jtIdPro.setBackground(new java.awt.Color(255, 204, 0));
        jtIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdProActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Stock");

        jtStockActual.setBackground(new java.awt.Color(255, 204, 0));
        jtStockActual.setForeground(new java.awt.Color(0, 51, 153));
        jtStockActual.setText(" ");

        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Nombre:");

        jtNombrePro.setBackground(new java.awt.Color(255, 204, 0));
        jtNombrePro.setForeground(new java.awt.Color(0, 51, 153));
        jtNombrePro.setText(" ");
        jtNombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreProActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Precio");

        jtPrecioPro.setBackground(new java.awt.Color(255, 204, 0));
        jtPrecioPro.setForeground(new java.awt.Color(0, 51, 153));
        jtPrecioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioProActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(255, 204, 0));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 204, 0));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbAñadir.setBackground(new java.awt.Color(255, 204, 0));
        jbAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multimedia.png"))); // NOI18N
        jbAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Stock Max");

        jtStockMax.setBackground(new java.awt.Color(255, 204, 0));
        jtStockMax.setForeground(new java.awt.Color(0, 51, 153));

        jtStockMin.setBackground(new java.awt.Color(255, 204, 0));
        jtStockMin.setForeground(new java.awt.Color(0, 51, 153));
        jtStockMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtStockMinActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Stocck Min");

        jcCategoriaCaja.setBackground(new java.awt.Color(255, 204, 0));
        jcCategoriaCaja.setForeground(new java.awt.Color(0, 51, 153));
        jcCategoriaCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcCategoriaCaja.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcCategoriaCajaItemStateChanged(evt);
            }
        });
        jcCategoriaCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaCajaActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Categoria");

        jtCategoriaId.setBackground(new java.awt.Color(255, 204, 0));
        jtCategoriaId.setForeground(new java.awt.Color(0, 51, 153));
        jtCategoriaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCategoriaIdActionPerformed(evt);
            }
        });

        jtStockIdPro.setEditable(false);
        jtStockIdPro.setBackground(new java.awt.Color(255, 204, 0));
        jtStockIdPro.setForeground(new java.awt.Color(0, 51, 153));

        StokId.setForeground(new java.awt.Color(255, 204, 0));
        StokId.setText("Stocck Id");

        jtStockId.setEditable(false);
        jtStockId.setBackground(new java.awt.Color(255, 204, 0));
        jtStockId.setForeground(new java.awt.Color(0, 51, 153));
        jtStockId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtStockIdActionPerformed(evt);
            }
        });

        jtCategoria.setBackground(new java.awt.Color(255, 204, 0));
        jtCategoria.setForeground(new java.awt.Color(0, 51, 153));
        jtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StokId)
                        .addGap(18, 18, 18)
                        .addComponent(jtStockId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addComponent(jcCategoriaCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAñadir)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtCategoriaId, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtStockActual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtStockIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtStockMax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtStockActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtStockIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtStockMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtStockId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StokId)
                            .addComponent(jLabel7)
                            .addComponent(jcCategoriaCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCategoriaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbAñadir)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbEliminar)
                                .addComponent(jbGuardar)))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado Producto"));

        jTablaProducto.setBackground(new java.awt.Color(255, 204, 0));
        jTablaProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 2, true));
        jTablaProducto.setForeground(new java.awt.Color(0, 51, 153));
        jTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaProducto);

        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Buscar");

        jTextField3.setBackground(new java.awt.Color(255, 204, 0));
        jTextField3.setForeground(new java.awt.Color(0, 51, 153));

        jbBuscar.setBackground(new java.awt.Color(255, 204, 0));
        jbBuscar.setForeground(new java.awt.Color(0, 51, 153));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/interfaz.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 592, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdProActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:

        //primero ver de que accion viene si de guardar o demodificar 
        //validar
        if (this.jtNombrePro.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre para el producto");
            jtNombrePro.requestFocus();
            return;
        }
        if (this.jtStockActual.getText().length() == 0) {

            JOptionPane.showConfirmDialog(rootPane, "Campo obligatorio  para el producto");

            // boolean num=ControllerFactura.isNumeric(this.jtStock.getText());
            jtStockActual.requestFocus();
            return;
        }
        //  ControllerFactura.isNumeric(this.jtStock.getText())
        if (!Controller.isNumeric(this.jtStockActual.getText())) {

            JOptionPane.showConfirmDialog(rootPane, "Debe ser un numero ");

            boolean num=Controller.isNumeric(this.jtStockActual.getText());
            jtStockActual.requestFocus();
            return;
        }

        //
       

       //producte.addProducteStock(p, s);
       
        // Activamos el boton añadir, eliminar
        this.jbAñadir.setEnabled(true);
        this.jbEliminar.setEnabled(false);
        
        if (this.jbGuardar.getText()=="Guardar"){
        String nombre = this.jtNombrePro.getText();
        double precio = Double.parseDouble(this.jtPrecioPro.getText());
        int stock = Integer.parseInt(this.jtStockActual.getText());
        int stockM = Integer.parseInt(this.jtStockMax.getText());
        int stockm = Integer.parseInt(this.jtStockMin.getText());
        int idcategoria = Integer.parseInt(this.jtCategoriaId.getText());

        Stock s = new Stock(stock, stockM, stockm);

        Producte p = new Producte(nombre, precio, idcategoria);
        producto.añadirProductoEstoc(p, s);
        }
        if (this.jbGuardar.getText()=="Modificar"){
            
        String prod_nom = this.jtNombrePro.getText();
        double prod_precio = Double.parseDouble(this.jtPrecioPro.getText());
        
        int categoria_id = Integer.parseInt(this.jtCategoriaId.getText());

            
        int pro_id = Integer.parseInt(this.jtIdPro.getText());
        
      
        
        Producte p = new Producte(prod_precio,categoria_id , pro_id,prod_nom);
        
        int stock = Integer.parseInt(this.jtStockActual.getText());
        int stockM = Integer.parseInt(this.jtStockMax.getText());
        int stockm = Integer.parseInt(this.jtStockMin.getText());
        
        Stock s = new Stock(stock, stockM, stockm);

       
        producto.modifcarProductoEstoc(p, s);
        }
       
        this.jbAñadir.setEnabled(true);
        this.jbEliminar.setEnabled(true);
        this.jbGuardar.setEnabled(false);
        
         this.jTablaProducto.setModel(producto.mostrarProducto());
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreProActionPerformed

    private void jbAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirActionPerformed
        // TODO add your handling code here:

        //poner todo en blanco
        this.jtNombrePro.setText("");
        this.jtStockActual.setText("");
        this.jtIdPro.setText("");
        this.jtStockIdPro.setText("");
        this.jtPrecioPro.setText("");
        this.jtCategoriaId.setText("");
        this.jtStockMax.setText("");
        this.jtStockMin.setText("");
        this.jtCategoria.setText("");
        this.jtStockId.setText("");
       

        
        // indicamos si el boton guardar se llama modificar lo cambiamos a guardar
        
         //Modificamos el boton modificar  para que pase a guardar
         if(jbGuardar.getText()=="Modificar"){
        this.jbGuardar.setText("Guardar");
         }
         
      
         // Desactivamos los botones añadir y eliminar
         this.jbAñadir.setEnabled(false);
         this.jbEliminar.setEnabled(false);
         //Activamos los botones guardar 
         this.jbGuardar.setEnabled(true);
         
        //inciamos la accion guardar que viene del controller
        
         this.jTablaProducto.setModel(producto.mostrarProducto());
    }//GEN-LAST:event_jbAñadirActionPerformed

    private void jTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaProductoMouseClicked
        // TODO add your handling code here:

        //System.out.println("Hola");
        //Modificamos el boton guardar para que pase a modificar
        this.jbGuardar.setText("Modificar");
        //Marcar la fila selecionado al presionar click
        int fila = jTablaProducto.rowAtPoint(evt.getPoint());
        //Pasa el parametro
        jtIdPro.setText(String.valueOf(jTablaProducto.getValueAt(fila, 0)));
        jtStockIdPro.setText(String.valueOf(jTablaProducto.getValueAt(fila, 0)));
        jtNombrePro.setText(String.valueOf(jTablaProducto.getValueAt(fila, 1)));
        jtPrecioPro.setText(String.valueOf(jTablaProducto.getValueAt(fila, 2)));
        jtCategoriaId.setText(String.valueOf(jTablaProducto.getValueAt(fila, 4)));
        jtStockMax.setText(String.valueOf(jTablaProducto.getValueAt(fila, 5)));
        jtStockMin.setText(String.valueOf(jTablaProducto.getValueAt(fila, 6)));
        jtStockActual.setText(String.valueOf(jTablaProducto.getValueAt(fila, 7)));
        jtCategoria.setText(String.valueOf(jTablaProducto.getValueAt(fila, 8)));
        jtStockId.setText(String.valueOf(jTablaProducto.getValueAt(fila, 9)));
        

        //Desahibilitar los botones de añadir y eliminar
        
         this.jbAñadir.setEnabled(true);
         this.jbEliminar.setEnabled(true);
         this.jbGuardar.setEnabled(true);
         
    }//GEN-LAST:event_jTablaProductoMouseClicked

    private void jcCategoriaCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCategoriaCajaActionPerformed

    private void jtCategoriaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCategoriaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCategoriaIdActionPerformed

    private void jcCategoriaCajaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcCategoriaCajaItemStateChanged
        Categoria ca = (Categoria) this.jcCategoriaCaja.getSelectedItem();
        this.jtCategoriaId.setText(String.valueOf(ca.getCategoria_id()));
    }//GEN-LAST:event_jcCategoriaCajaItemStateChanged

    private void jtStockMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtStockMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtStockMinActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
      
    
        int pro_id  = Integer.parseInt(this.jtIdPro.getText());
        int id_stock = Integer.parseInt(this.jtStockId.getText());


        Stock s = new Stock(id_stock);

        Producte p = new Producte(pro_id);

        
        producto.eliminarProductoEstoc(p,s);
         this.jbEliminar.setEnabled(false);
         
          this.jTablaProducto.setModel(producto.mostrarProducto());
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtStockIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtStockIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtStockIdActionPerformed

    private void jtPrecioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioProActionPerformed

    private void jtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StokId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaProducto;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbAñadir;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcCategoriaCaja;
    private javax.swing.JTextField jtCategoria;
    private javax.swing.JTextField jtCategoriaId;
    private javax.swing.JTextField jtIdPro;
    private javax.swing.JTextField jtNombrePro;
    private javax.swing.JTextField jtPrecioPro;
    private javax.swing.JTextField jtStockActual;
    private javax.swing.JTextField jtStockId;
    private javax.swing.JTextField jtStockIdPro;
    private javax.swing.JTextField jtStockMax;
    private javax.swing.JTextField jtStockMin;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
