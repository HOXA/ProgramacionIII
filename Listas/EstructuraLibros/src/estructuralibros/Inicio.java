package estructuralibros;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Sthefany Johana Campos Hernández
 * 0901-17-2452
 */

public class Inicio extends javax.swing.JFrame {
    
    Nodo cabeza=null; //Se Declara Una variable Nodo iniciandola en Null
    int longitud=0; //Variable Integer para la longitud del nodo
    DefaultTableModel tabla = new DefaultTableModel(); //Declarar el modelo de la Tabla
    
    public Inicio() {
        initComponents();
        Tbl_Nodo.setModel(tabla); //Se agrega el modelo a la JTable
        this.setLocationRelativeTo(null); //Posición del JFrame en el Centro de la pantalla
        tabla.addColumn("No. Nodo"); //Declaramos Las columnas de La Tabla
        tabla.addColumn("Título");
        tabla.addColumn("Autor");
        tabla.addColumn("ISBN");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Nodo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JTextField();
        TxtAutor = new javax.swing.JTextField();
        TxtISBN = new javax.swing.JTextField();
        BtnIngresoPrimero = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        BtnIngresoFinal = new javax.swing.JButton();
        BtnIngresoDespues = new javax.swing.JButton();
        BtnBorrarPrimero = new javax.swing.JButton();
        BtnBorrarUltimo = new javax.swing.JButton();
        BtnBorrarPosicion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tbl_Nodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_Nodo);

        jLabel1.setText("Título Del Libro");

        jLabel2.setText("Autor");

        jLabel3.setText("ISBN");

        BtnIngresoPrimero.setText("Ingreso Principio");
        BtnIngresoPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoPrimeroActionPerformed(evt);
            }
        });

        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnIngresoFinal.setText("Ingreso Final");
        BtnIngresoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoFinalActionPerformed(evt);
            }
        });

        BtnIngresoDespues.setText("Ingreso Despues");
        BtnIngresoDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoDespuesActionPerformed(evt);
            }
        });

        BtnBorrarPrimero.setText("Borrar Principio");
        BtnBorrarPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarPrimeroActionPerformed(evt);
            }
        });

        BtnBorrarUltimo.setText("Borrar Último");
        BtnBorrarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarUltimoActionPerformed(evt);
            }
        });

        BtnBorrarPosicion.setText("Borrar Posición");
        BtnBorrarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarPosicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTitulo)
                            .addComponent(TxtAutor)
                            .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnIngresoPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(BtnBorrarPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnIngresoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(BtnBorrarUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnBorrarPosicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnIngresoDespues, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresoPrimero)
                    .addComponent(BtnIngresoFinal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarPrimero)
                    .addComponent(BtnBorrarUltimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnIngresoDespues)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBorrarPosicion))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresoPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoPrimeroActionPerformed
        String StrTitulo, StrAutor, StrISBN; //Declaración de variables String para los campos del Libro
        StrTitulo = TxtTitulo.getText(); //Obtenemos el valor del TextField y se lo asignamos a la variable String
        StrAutor = TxtAutor.getText();
        StrISBN = TxtISBN.getText();        
        Libro Nuevo = new Libro(StrTitulo, StrAutor, StrISBN); //Agregamos los String a la Estructura Libro       
        insertarPrincipio(Nuevo); //Método InsertarPrincipio Mandamos la Variabe tipo Libro
    }//GEN-LAST:event_BtnIngresoPrimeroActionPerformed

    private void BtnIngresoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoFinalActionPerformed
        String StrTitulo, StrAutor, StrISBN; //Declaración de variables String para los campos del Libro
        StrTitulo = TxtTitulo.getText(); //Obtenemos el valor del TextField y se lo asignamos a la variable String
        StrAutor = TxtAutor.getText();
        StrISBN = TxtISBN.getText();        
        Libro Nuevo = new Libro(StrTitulo, StrAutor, StrISBN); //Agregamos los String a la Estructura Libro               
        insertarFinal(Nuevo); //Método InsertarFinal Mandamos la Variabe tipo Libro
    }//GEN-LAST:event_BtnIngresoFinalActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
            ClearTabla(); //Método ClearTabla donde se Limpia la tabla cada que se vaya a mostrar
            Listar(); //Método InsertarPrincipio Mandamos la Variabe tipo Libro
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnBorrarPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarPrimeroActionPerformed
        eliminaPrincipio(); //Método EliminarPrincipio
    }//GEN-LAST:event_BtnBorrarPrimeroActionPerformed

    private void BtnBorrarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarUltimoActionPerformed
        eliminarUltimo(); //Método EliminarUltimo
    }//GEN-LAST:event_BtnBorrarUltimoActionPerformed

    private void BtnIngresoDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoDespuesActionPerformed
        String StrTitulo, StrAutor, StrISBN, StrPosicion;//Declaración de variables String para los campos del Libro y El String Posición
        int IntPosicion; //Declaración de variables Int para la posicion
        StrTitulo = TxtTitulo.getText(); //Obtenemos el valor del TextField y se lo asignamos a la variable String
        StrAutor = TxtAutor.getText();
        StrISBN = TxtISBN.getText();
        StrPosicion = JOptionPane.showInputDialog("Ingrese la posición");
        Libro Nuevo = new Libro(StrTitulo, StrAutor, StrISBN); //Agregamos los String a la Estructura Libro 
        boolean EsNumero = EsNumero(StrPosicion); //Declaramos una variable Booleana y la igualamos al Metodo EsNumero 
        if (EsNumero==true) { //
            IntPosicion = Integer.parseInt(StrPosicion);
            insertarDespues(IntPosicion, Nuevo);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese Un Número Válido", "ERROR", HEIGHT);
        }        
    }//GEN-LAST:event_BtnIngresoDespuesActionPerformed

    private void BtnBorrarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarPosicionActionPerformed
        String StrPosicion;
        StrPosicion = JOptionPane.showInputDialog("Ingrese la posición");
        int IntPosicion;
        boolean EsNumero = EsNumero(StrPosicion);
        if (EsNumero==true) {
            IntPosicion = Integer.parseInt(StrPosicion);
            eliminarLibro(IntPosicion);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese Un Número Válido", "ERROR", HEIGHT);
        }        
    }//GEN-LAST:event_BtnBorrarPosicionActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    public void insertarPrincipio(Libro libro) {
		Nodo Nuevo =new Nodo(libro);
		Nuevo.siguiente=cabeza;
		cabeza=Nuevo;
		longitud++;	
	}
    public void insertarFinal(Libro libro) {
		Nodo nodo=new Nodo(libro);
		if (cabeza==null){
                    cabeza=nodo;
		}else{
                    Nodo puntero=cabeza;
                    while (puntero.siguiente!=null) {
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=nodo;
		}
		longitud++;
	}
    public void insertarDespues(int n, Libro libro) {
		Nodo Nuevo =new Nodo(libro);
		if (cabeza==null) {
			cabeza=Nuevo;
		} else {
			Nodo puntero=cabeza;
			int contador=0;
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			Nuevo.siguiente=puntero.siguiente;
			puntero.siguiente=Nuevo;
		}
		longitud++;
	}
    public Libro obtener(int n) {
		if (cabeza==null) {
			return null;
		} else {
			Nodo puntero=cabeza;
			int contador=0;
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			if (contador!=n) {
				return null;
			} else {
				return puntero.libro;
			}
		}
	}
    public void eliminaPrincipio() {
            cabeza=cabeza.siguiente;
        }
    public void eliminarUltimo() {
            if (cabeza!= null) {
                if (cabeza.siguiente==null) {
                    cabeza=null;  
                    longitud--;
                } else {
                    Nodo puntero=cabeza;
                    while (puntero.siguiente.siguiente!=null) {                    
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=null;
                    longitud--;
                }
            }
        }
    public void eliminarLibro(int n) {
            if (cabeza!=null){
                if (n==0){
                    Nodo primer=cabeza;
                    cabeza=cabeza.siguiente;
                    primer.siguiente=null;
                    longitud--;
                } else if (n<longitud) {
                    Nodo puntero=cabeza;
                    int contador=1;
                    while (contador<(n-1)){
                        puntero=puntero.siguiente;
                        contador++;
                    }
                    Nodo temp=puntero.siguiente;
                    puntero.siguiente=temp.siguiente;
                    temp.siguiente=null;
                    longitud--;
                }
            }
        }
    public void Listar(){
                String Data[] = new String[4];
                int Contador = 0;
		Nodo aux=cabeza;
		while (aux!=null){
                        Data[0]= String.valueOf(Contador);
                        Data[1]= String.valueOf(aux.libro.titulo);
                        Data[2]= String.valueOf(aux.libro.autor);
                        Data[3]= String.valueOf(aux.libro.isbn);
                        tabla.addRow(Data);
			aux=aux.siguiente;
                        Contador = Contador + 1;
		}
    }
    private void ClearTabla(){
        while (tabla.getRowCount() > 0) {
               tabla.removeRow(0);
        }
    }
    public static boolean EsNumero(String Posicion) {
        boolean resultado;
        try {
            Integer.parseInt(Posicion);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrarPosicion;
    private javax.swing.JButton BtnBorrarPrimero;
    private javax.swing.JButton BtnBorrarUltimo;
    private javax.swing.JButton BtnIngresoDespues;
    private javax.swing.JButton BtnIngresoFinal;
    private javax.swing.JButton BtnIngresoPrimero;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JTable Tbl_Nodo;
    private javax.swing.JTextField TxtAutor;
    private javax.swing.JTextField TxtISBN;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
