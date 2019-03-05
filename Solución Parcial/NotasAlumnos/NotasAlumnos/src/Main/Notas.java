/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *  Raul Alexander Sandoval Estrada
 *  0901-17-17587
 *  Programación III
 * 
 *  VARIANTE "B"
 */
public class Notas extends javax.swing.JFrame {
    DecimalFormat format = new DecimalFormat("0.00");//Declaración del decimal format para mostrar promedio con dos decimales
    int notaAlumno, generarNotas, sumaNotas, contador=1; //Variables de tipo entero
    double promedioNotas;  //Variables tipo double
    String nombreAlumno, resultadoAlumno;    //Variables tipo cadena
    Random rand = new Random(); //Metodo random
    
    
    //Vector y matriz que van a administrar la tabla
    String vectorEncabezado []={"Alumno", "Nota Final", "Resultado"}, //Vector que se encarga del encabezado de la tabla
           matrizDatos [][]={};                                       //Matriz que guarda los datos de la tabla
    
    //Definicion del modelo tabla
    DefaultTableModel modeloNotas;
    
    public void notasAlumno(){
        
        generarNotas=rand.nextInt(100); //Uso de random para generar las notas de los alumnos
        notaAlumno = generarNotas;
        if(notaAlumno<60){resultadoAlumno="Reprobado";} //COndicional para saber si ganó o perdió
        else{resultadoAlumno="Aprobado";}
        
        sumaNotas += generarNotas; //Sumatoria de notas
        promedioNotas = sumaNotas/contador; //Calculo de promedio
        LBL_promedio.setText(Double.toString(promedioNotas)); //Ingreso del promedio al JLabel
        JOptionPane.showMessageDialog(null, "Nota"+generarNotas+" suma"+sumaNotas+" resultado"+resultadoAlumno);
        contador++; //Contador que llevará la cuenta de alumnos ingresador para calculo de promedio
    }
    
    public void ingresoAlumnos(){
        nombreAlumno = TXT_nombreAlumno.getText(); //INgreso del nombre
        
        String nombre, nota, resultado; //Variables locales temporales para ingreso de datos
        
        nombre = nombreAlumno;
        nota = Integer.toString(notaAlumno);
        resultado = resultadoAlumno;

        String temp [] ={nombre, nota, resultado}; //CReación de un vector temporal para ingresar los datos al modelo tabla
        
        modeloNotas.addRow(temp);
    
    }

    
    public Notas() {
        initComponents();
        modeloNotas = new DefaultTableModel(matrizDatos, vectorEncabezado); //Se define un modelo tabla con los datos de los alumnos
        TAB_notas.setModel(modeloNotas);                                    //Se le asigna el modelo a la tabla
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TXT_nombreAlumno = new javax.swing.JTextField();
        JBT_ingresarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAB_notas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        LBL_promedio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alumno:");

        JBT_ingresarAlumno.setText("Ingresar");
        JBT_ingresarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_ingresarAlumnoActionPerformed(evt);
            }
        });

        TAB_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Alumno", "Nota Final", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TAB_notas);

        jLabel2.setText("Promedio de la clase .............................................................");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBT_ingresarAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBL_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBT_ingresarAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBL_promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBT_ingresarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_ingresarAlumnoActionPerformed
        if ("".equals(TXT_nombreAlumno.getText())){JOptionPane.showMessageDialog(null, "Campo Vancio");}
        else{
        if(contador>=10){JOptionPane.showMessageDialog(null, "Ha llegado al limite de alumnos. No puede ingresar más.");}
        else{
            notasAlumno();
            ingresoAlumnos();
        }
        }
        
    }//GEN-LAST:event_JBT_ingresarAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_ingresarAlumno;
    private javax.swing.JLabel LBL_promedio;
    private javax.swing.JTable TAB_notas;
    private javax.swing.JTextField TXT_nombreAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
