/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.categoria;

import com.my.companyferramentas.DadosTemporarios;
import com.my.companymodelo.ModCategoria;
import com.mycompanydao.DaoCategoria;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rosa.3950
 */
public class ListCategoria extends javax.swing.JFrame {

    /**
     * Creates new form ListCategoria1
     */
    public ListCategoria() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listarTodos();
        
    }    
    public void listarTodos(){
        try{
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableCategoria.getModel();
            tableCategoria.setModel(defaultTableModel);
            DaoCategoria daoCategoria = new DaoCategoria();
            
            ResultSet resultSet = daoCategoria.listarTodos();
            defaultTableModel.setRowCount(0);
        while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                defaultTableModel.addRow(new Object[]{id, nome, descricao});
            }
        }catch (Exception e ){
                 System.out.println(e.getMessage());
    }
    }
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = new DefaultTableModel();

            defaultTableModel.addColumn("ID");
            defaultTableModel.addColumn("NOME");
            defaultTableModel.addColumn("DESCRIÇÃO");
            
            tableCategoria.setModel(defaultTableModel);

            DaoCategoria daoCategoria = new DaoCategoria();

          
            ResultSet resultSet = daoCategoria.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
        while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
             defaultTableModel.addRow(new Object[]{id, nome, descricao});
    }
        }catch(Exception e){
            System.out.println(e.getMessage());
    }
    }
         public void listarPorNome(String pNome){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = new DefaultTableModel();

            defaultTableModel.addColumn("ID");
            defaultTableModel.addColumn("NOME");
            defaultTableModel.addColumn("DESCRIÇÃO");
            
            tableCategoria.setModel(defaultTableModel);

            DaoCategoria daoCategoria = new DaoCategoria();

            ResultSet resultSet = daoCategoria.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                
                defaultTableModel.addRow(new Object[]{id, nome, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
          
    public void listarPorDescricao(String pDescricao){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = new DefaultTableModel();

            defaultTableModel.addColumn("ID");
            defaultTableModel.addColumn("NOME");
            defaultTableModel.addColumn("DESCRIÇÃO");
            
            tableCategoria.setModel(defaultTableModel);

            DaoCategoria daoCategoria = new DaoCategoria();

            
            ResultSet resultSet = daoCategoria.listarPorDescricao(pDescricao);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String descricao = resultSet.getString(3);
                
                defaultTableModel.addRow(new Object[]{id, nome, descricao});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }      
     
         

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        asdfg = new javax.swing.JScrollPane();
        tableCategoria = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        tfFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Id", "Nome", "Descrição" }));
        jcbTipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoFiltroActionPerformed(evt);
            }
        });

        asdfg.setBackground(new java.awt.Color(0, 0, 153));
        asdfg.setAutoscrolls(true);
        asdfg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asdfgMouseClicked(evt);
            }
        });

        tableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                " ID", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoriaMouseClicked(evt);
            }
        });
        asdfg.setViewportView(tableCategoria);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(asdfg, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(asdfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnBuscar)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoFiltroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId(Integer.parseInt(tfFiltro.getText()));
                break;
            case 2:
                listarPorNome(tfFiltro.getText());
                break;
            case 3:
                listarPorDescricao(tfFiltro.getText());
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void asdfgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asdfgMouseClicked
        
    }//GEN-LAST:event_asdfgMouseClicked

    private void tableCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoriaMouseClicked
        if (evt.getClickCount() == 2){
            ModCategoria modCategoria = new ModCategoria();

            modCategoria.setId(Integer.parseInt(String.valueOf(tableCategoria.getValueAt(tableCategoria.getSelectedRow(), 0))));
            modCategoria.setNome(String.valueOf(tableCategoria.getValueAt(tableCategoria.getSelectedRow(), 1)));
            modCategoria.setDescricao(String.valueOf(tableCategoria.getValueAt(tableCategoria.getSelectedRow(), 2)));

            DadosTemporarios.tempObject = (ModCategoria) modCategoria;

            CadCategoria cadCategoria = new CadCategoria();
            cadCategoria.setVisible(true);
        }
    }//GEN-LAST:event_tableCategoriaMouseClicked

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
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane asdfg;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableCategoria;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
