/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rat.screens;
import javax.swing.table.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.awt.Toolkit;
import java.awt.*;
import rat.resources.*;
import rat.models.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


//import javax.swing.DefaultListModel;
///import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JList;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;

/**
 *
 * @author RUP <your.name at your.org>
 */
public class App_Screen extends javax.swing.JFrame 
{
    private DefaultTableModel tableModel1,tableModel2;
    private DefaultListModel listModel1,listModel2;
    private MenuDbHandler menuDb;
    private OrderDbHandler orderDb;
    private ArrayList<MenuItems> currentOrderItems;
    private ArrayList<Order> orders;

    /**
     * Creates new form App_Screen
     */
    public App_Screen() 
    {
        initComponents();
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("RMS APP");
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        
        
        currentOrderItems= new ArrayList();
        menuDb= new MenuDbHandler();
        orderDb=new OrderDbHandler();
        
        tableModel1=new  DefaultTableModel();
        listModel1=new  DefaultListModel();
        orderItemsList.setModel(listModel1);
        
        tableModel1.addColumn("NAME");
        tableModel1.addColumn("PRICE");
        menuTable.setModel(tableModel1);
        
        ArrayList<MenuItems> items=menuDb.getMenu();
        
        for(MenuItems item:items)
        {
            tableModel1.addRow(new String[]{item.getName(),String.valueOf(item.getPrice())});
        }
        initOrderListModel1();
        initDetailsTableModel();
    }
    private void initOrderListModel1()
    {
        listModel2=new DefaultListModel();
        
        orders=Utils.arrangeOrders(orderDb.getOrders());
        
        for(Order order :orders)
        {
            listModel2.addElement("Order "+ order.getId());    
        }
        ordersList.setModel(listModel2);
    }
    private void initDetailsTableModel()
    {
        tableModel2=new DefaultTableModel();
        DetailsTable.setModel(tableModel2);
        tableModel2.addColumn("NAME");
        tableModel2.addColumn("PRICE");
        tableModel2.addColumn("QTY");   
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemsList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        qtyField = new javax.swing.JTextField();
        addMenuItemBtn = new javax.swing.JButton();
        removeMenuItemsBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();
        showDetailsBtn = new javax.swing.JButton();
        removeOrderBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RATE-A-TOUILLE");

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");

        jScrollPane1.setViewportView(menuTable);

        jScrollPane2.setViewportView(orderItemsList);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Qty:");

        addMenuItemBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMenuItemBtn.setText("Add");
        addMenuItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemBtnActionPerformed(evt);
            }
        });

        removeMenuItemsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeMenuItemsBtn.setText("Remove");
        removeMenuItemsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuItemsBtnActionPerformed(evt);
            }
        });

        placeOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        placeOrderBtn.setText("Place Order");
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Orders");

        jScrollPane3.setViewportView(ordersList);

        jScrollPane4.setViewportView(DetailsTable);

        showDetailsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showDetailsBtn.setText("Show Details");
        showDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsBtnActionPerformed(evt);
            }
        });

        removeOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeOrderBtn.setText("Remove");
        removeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOrderBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalLabel.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(addMenuItemBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeMenuItemsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderBtn)
                .addGap(18, 18, 18)
                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(showDetailsBtn)
                .addGap(18, 18, 18)
                .addComponent(removeOrderBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(refreshBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addMenuItemBtn)
                        .addComponent(removeMenuItemsBtn)
                        .addComponent(placeOrderBtn)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(showDetailsBtn)
                        .addComponent(removeOrderBtn)
                        .addComponent(refreshBtn)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMenuItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemBtnActionPerformed
        // TODO add your handling code here:
        if(menuTable.getSelectedRow()!=-1 && qtyField.getText().length()!=0){
            String name=(String)menuTable.getValueAt(menuTable.getSelectedRow(), 0);
            currentOrderItems.add(menuDb.QueryByName(name,Integer.parseInt(qtyField.getText())));
            listModel1.addElement(name);
            //&& !listModel1.contains((String)menuTable.getValueAt(menuTable.getSelectedRow(),0)) 
        }
    }//GEN-LAST:event_addMenuItemBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        initOrderListModel1();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void showDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsBtnActionPerformed
        // TODO add your handling code here:
        if (ordersList.getSelectedIndex() != -1) 
        {
            initDetailsTableModel();
            //tablemodel2.clear();
            int order = orders.get(ordersList.getSelectedIndex()).getId();

            //System.out.println(order);
            for(Order o:orders){
                if(o.getId()==order){
                    for (MenuItems item : (ArrayList<MenuItems>) o.getItems()) 
                    {
                        String row[] = {item.getName(), String.valueOf(item.getPrice()), String.valueOf(item.getQty())};
                        System.out.println(row);
                        tableModel2.addRow(row);
                    }
                    totalLabel.setText("Rs." + String.format("%5.2f", o.getTotal()));
                    break;
                }
            }
        }
    }//GEN-LAST:event_showDetailsBtnActionPerformed

    private void removeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOrderBtnActionPerformed
        // TODO add your handling code here:
        if(ordersList.getSelectedIndex()!=-1)
        {
            orderDb.removeOrder(orders.get(ordersList.getSelectedIndex()).getId());
            orders.remove(ordersList.getSelectedIndex());
            listModel2.remove(ordersList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeOrderBtnActionPerformed

    private void removeMenuItemsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuItemsBtnActionPerformed
        // TODO add your handling code here:
        if(ordersList.getSelectedIndex() !=-1)
        {
            currentOrderItems.remove(ordersList.getSelectedIndex());
            listModel1.remove(ordersList.getSelectedIndex());
        }
    }//GEN-LAST:event_removeMenuItemsBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String date = df.format(new Date());
        orderDb.addOrder(date,currentOrderItems);
        
        listModel1.clear();
        qtyField.setText("");
                   
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    /**
     * @param args the command line arguments
     *///format("%5.2f",order.getTotal())
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
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DetailsTable;
    private javax.swing.JButton addMenuItemBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable menuTable;
    private javax.swing.JList<String> orderItemsList;
    private javax.swing.JList<String> ordersList;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JTextField qtyField;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeMenuItemsBtn;
    private javax.swing.JButton removeOrderBtn;
    private javax.swing.JButton showDetailsBtn;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
