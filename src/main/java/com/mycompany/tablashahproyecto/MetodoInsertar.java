/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablashahproyecto;

import javax.swing.DefaultListModel;

/**
 *
 * @author Eddy Argueta
 */
public class MetodoInsertar extends javax.swing.JFrame {

    //declaramos un arreglo de tipo Session Virtual Para
    //almacenar la Información de las personas
    public Sesion_Virtual[] s;

    //inicializamos TablaHah para poder usar los metodos que tenga
    TablaHah hash = new TablaHah();

    //inicializamos el DefaultListModel para usar la JList
    DefaultListModel sesion = new DefaultListModel();
    DefaultListModel search = new DefaultListModel();

    //Constructor
    public MetodoInsertar() {
        initComponents();
        sesion = new DefaultListModel();
        svList.setModel(sesion);
        search = new DefaultListModel();
        BusquedaList.setModel(search);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        btnRegistar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        svList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtActualizarNombre = new javax.swing.JTextField();
        txtActualizarFN = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        BusquedaList = new javax.swing.JList<>();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ingres el Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, -1));
        jPanel2.add(txtFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 290, -1));

        btnRegistar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistar.setText("Registrar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jScrollPane1.setViewportView(svList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 180));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Indice");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("No. Entrada");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("LISTADO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("ACTUALIZAR");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("INSERTAR");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 11, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 51, -1, -1));
        jPanel2.add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 250, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nombre");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("BUSQUEDA");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, -1, -1));
        jPanel2.add(txtActualizarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 230, -1));
        jPanel2.add(txtActualizarFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 230, -1));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("ELIMINAR");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("No. de Entrada");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));
        jPanel2.add(txtBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 260, -1));

        BusquedaList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(BusquedaList);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 280, 100));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        s = new Sesion_Virtual[120];

        //almacenamos el nombre y la fecha de nacimento en strings
        String Nombre = txtNombre.getText();
        String FN = txtFN.getText();

        //instancio una Sesion Vitual y le mandamos el nombre y la fecha
        Sesion_Virtual sv = new Sesion_Virtual(Nombre, FN);
        hash.Insertar(sv);

        //imprimimos la lista en la pantalla negra para comprobar el correcto funcionamiento
        hash.listar();

        //bloque de codigo que me permite almacenar una Sesión en esta clase
        int c = 0;
        Sesion_Virtual b = new Sesion_Virtual(sv.getEntrada(), sv.getNombre(), sv.getNacimiento());
        s[c] = b;
        c++;

        //mando la persona agregada a Jlist que tengo en la interfaz
        sesion.addElement(hash.indice(b.getEntrada()) + " ; " + b.getEntrada() + " ; " + b.getNombre() + " ; " + b.getNacimiento());


    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //obtengo el indice de la informacion que seleccione
        int entrada = Integer.parseInt(txtEliminar.getText());

        //mando el numero de entraada para eliminar a la persona
        //que tenga ese numero de entrada
        hash.Eliminar(entrada);

        //este posicionEliminar nos va servir para desaparecer del
        //Jlist el elemento que borramos del arreglo
        int posicionEliminar = entrada - 2000;

        //le mandamos la poscion en donde esta impreso el elemento
        //que eliminamos en el arreglo
        sesion.setElementAt(" ", posicionEliminar);

        //imprimimos la lista en la pantalla negra para comprobar el correcto funcionamiento
        hash.listar();


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        int Posicion = svList.getSelectedIndex();
        int Entrada = Posicion + 2000;
        String Nombre = txtActualizarNombre.getText();
        String FechaN = txtActualizarFN.getText();
        Sesion_Virtual sv = new Sesion_Virtual(Entrada, Nombre, FechaN);
        hash.actualizar(sv);
        hash.listar();
        String imprimir = hash.indice(sv.getEntrada()) + " ; " + sv.getEntrada() + " ; " + sv.getNombre() + " ; " + sv.getNacimiento();

        sesion.setElementAt(imprimir, Posicion);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        //borramos todo para mostrar la nueva busqueda 
        search.removeAllElements();
        //almacenamos el nombre en un String
        String busq = txtBuscarNombre.getText();

        //le enviamos el nombre al metodo buscar para que me retrone
        //la informacion y lo imprima en el JList
        search.addElement(hash.Buscar(busq));
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(MetodoInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoInsertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoInsertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> BusquedaList;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> svList;
    private javax.swing.JTextField txtActualizarFN;
    private javax.swing.JTextField txtActualizarNombre;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
