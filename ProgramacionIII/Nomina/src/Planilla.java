
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * 0901-17-17587
 * Raul Alexander Sandoval Estrada
 * Programación III
*/


public class Planilla extends javax.swing.JFrame {
    DecimalFormat format = new DecimalFormat("0.00");
    //Variables sin notacion
    int int_salarioBase, int_deducciones, int_percepciones,
        int_totalProy, int_totalInfor, int_totalCapDes, int_totalRecSel, int_totalNomina, srandom;
    double ISR, IGSS, double_sueldoLiquido;
    
    String str_nombre, str_departamento;
    String matrizPlanilla [][]={}, matrizTotal [][]={{}, {}};
    String vectEncabezado []={"Nombre","Departamento","Salario Base","ISR","IGSS","Deducciones","Percepciones","Sueldo Liquido"},
            vectTotalEncabezado[] = {"Proyectos", "Informatica","Capacitacion y Desarrollo","Reclutamiento y Selección","Nomina"};
    DefaultTableModel modeloTabla, modeloTotal;
    
    
    Random rand = new Random();
    
    
    public void datosEmpleado(){ //Genera los datos del empleado
       
        srandom = rand.nextInt(3000); //Genera salario segun random    
        int_salarioBase = 2742+srandom; //Salario base en Guatemala
        int_deducciones = rand.nextInt(3000); // VAlores aleatorios
        int_percepciones = rand.nextInt(3000);
        
        if(RBT_igssSi.isSelected()){//Calculo del IGSS  segun el radio buton
            
             IGSS =int_salarioBase*0.0483;
     
              
        }else if(RBT_igssNo.isSelected()){
            IGSS=0.00;
        }
        
         //Calculo del ISR segun el salario base
            
         if ((int_salarioBase > 2600)&&(int_salarioBase < 5000)){
             
             ISR = int_salarioBase*0.03;
         } else if ((int_salarioBase >= 5000) &&(int_salarioBase < 10000) ){
             
             ISR = int_salarioBase*0.05;
         }else if (int_salarioBase >= 10000){
             
             ISR = int_salarioBase*0.1; 
         }
        
        double_sueldoLiquido = int_salarioBase + int_percepciones - IGSS - ISR - int_deducciones; //Calcula el sueldo liquido
         
        //Condicionales para determinar el nombre del departamento segun el Combo Box
        
        if(combx_Departamento.getSelectedItem()=="Proyectos"){ //Departamento Proyectos
             
            str_departamento="Proyectos";
            int_totalProy += double_sueldoLiquido;
            
         }
         if(combx_Departamento.getSelectedItem()=="Informatica"){ //Departamento Informatica
             
             str_departamento="Informatica";
             int_totalInfor += double_sueldoLiquido;
             
         }
         if(combx_Departamento.getSelectedItem()=="Capacitacion y Desarrollo"){ //Departamento Capacitacion y Desarrollo
             
             str_departamento="Capacitacion y Desarrollo";
             int_totalCapDes += double_sueldoLiquido;
             
         }
         if(combx_Departamento.getSelectedItem()=="Reclutamiento y Seleccion"){ //Departamento Reclutamiento y Seleccion
             
             str_departamento="Reclutamiento y Seleccion";
             int_totalRecSel += double_sueldoLiquido;
            
         }
         if(combx_Departamento.getSelectedItem()=="Nominas"){ //Departamento Nominas
             
             str_departamento="Nominas";
             int_totalNomina += double_sueldoLiquido;
             
         }
        
           
    }
    
    public void ingresoEmpleado(){ //Ingresa al empleado a la tabla
        
        str_nombre = TXT_InsNombre.getText();
        String Nombre, Departamento, salarioBase, tabISR, tabIGSS, Deducciones, Percepciones, sueldoLiquido;
        
        Nombre = str_nombre;
        Departamento = str_departamento;
        salarioBase = Integer.toString(int_salarioBase);
        Deducciones = Integer.toString(int_deducciones);
        Percepciones = Integer.toString(int_percepciones);
        sueldoLiquido = String.valueOf(format.format(double_sueldoLiquido));
        tabISR = String.valueOf(format.format(ISR));
        tabIGSS = String.valueOf(format.format(IGSS));
        
        String temp [] ={Nombre, Departamento, salarioBase, tabISR,tabIGSS,Deducciones, Percepciones, sueldoLiquido};
        modeloTabla.addRow(temp);
        
        
        
        
    }
    
    public void sumaPlanilla(){//Ingreso de Suma del total de salarios de cada departamento
        modeloTotal.setValueAt(Integer.toString(int_totalProy), 0, 0);
        modeloTotal.setValueAt(Integer.toString(int_totalInfor), 0, 1);
        modeloTotal.setValueAt(Integer.toString(int_totalCapDes), 0, 2);
        modeloTotal.setValueAt(Integer.toString(int_totalRecSel), 0, 3);
        modeloTotal.setValueAt(Integer.toString(int_totalNomina), 0, 4);  
    }
    public Planilla() {
        initComponents();
        modeloTabla = new DefaultTableModel(matrizPlanilla, vectEncabezado);// Se dice que el objeto Model se trabajara como una matriz
        TAB_Planilla.setModel(modeloTabla);// Se ajusta el modelo de la tabla al especificado en Modelo
        modeloTotal = new DefaultTableModel(matrizTotal, vectTotalEncabezado);
        TAB_PlanillaTotal.setModel(modeloTotal);
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrp_igss = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAB_Planilla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TXT_InsNombre = new javax.swing.JTextField();
        BT_InsNombre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        combx_Departamento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        RBT_igssSi = new javax.swing.JRadioButton();
        RBT_igssNo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAB_PlanillaTotal = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TAB_Planilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Departamento", "Salario Base", "ISR", "IGSS", "Deducciones", "Percepciones", "Sueldo Liquido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TAB_Planilla);

        jLabel1.setText("Nombre:");

        TXT_InsNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_InsNombreActionPerformed(evt);
            }
        });

        BT_InsNombre.setText("Ingresar");
        BT_InsNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_InsNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Departamento: ");

        combx_Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Proyectos", "Informatica", "Capacitacion y Desarrollo", "Reclutamiento y Seleccion", "Nominas", " " }));

        jLabel3.setText("IGSS");

        btgrp_igss.add(RBT_igssSi);
        RBT_igssSi.setText("Sí");

        btgrp_igss.add(RBT_igssNo);
        RBT_igssNo.setText("No");

        TAB_PlanillaTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Proyectos", "Informatica", "Capacitacion & Desarrollo", "Reclutamiento y Selección", "Nomina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TAB_PlanillaTotal);

        jLabel4.setText("Total de Salarios Segun Departamentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(TXT_InsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_InsNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBT_igssNo)
                                    .addComponent(combx_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RBT_igssSi))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_InsNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(BT_InsNombre)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combx_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(RBT_igssSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(RBT_igssNo))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_InsNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_InsNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_InsNombreActionPerformed

    private void BT_InsNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_InsNombreActionPerformed
        //Ingreso de trabajadores a planilla
        if ("".equals(TXT_InsNombre.getText())||combx_Departamento.getSelectedItem()=="-Seleccione-"){ //Comprobar si el texto está en blanco.
           
           JOptionPane.showMessageDialog(null, "Error, verifique datos del empleado");
               
        }else{
           datosEmpleado();
           ingresoEmpleado();
           sumaPlanilla();
           
        }
        
        
        
    }//GEN-LAST:event_BT_InsNombreActionPerformed

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
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_InsNombre;
    private javax.swing.JRadioButton RBT_igssNo;
    private javax.swing.JRadioButton RBT_igssSi;
    private javax.swing.JTable TAB_Planilla;
    private javax.swing.JTable TAB_PlanillaTotal;
    private javax.swing.JTextField TXT_InsNombre;
    private javax.swing.ButtonGroup btgrp_igss;
    private javax.swing.JComboBox<String> combx_Departamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
