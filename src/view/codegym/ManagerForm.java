package view.codegym;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.codegym.Customer;
import service.codegym.CustomerService;

public class ManagerForm extends javax.swing.JFrame {

    CustomerService customerService;
    DefaultTableModel defaultTableModel;

    public ManagerForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        showTime();

        customerService = new CustomerService();
        defaultTableModel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        customerTable.setModel(defaultTableModel);

        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("FullName");
        defaultTableModel.addColumn("Age");
        defaultTableModel.addColumn("UserName");
        defaultTableModel.addColumn("Password");
        defaultTableModel.addColumn("Retype Pass");
        defaultTableModel.addColumn("PhoneNumber");
        defaultTableModel.addColumn("Gender");
        defaultTableModel.addColumn("Address");
        defaultTableModel.addColumn("Role");

        setTableData(customerService.getAllCustomers());

        customerTable.setComponentPopupMenu(jPopupMenu);

    }

    public void showTime() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentTimeDate = new Date();
                txtTime.setText(currentTimeDate.toString());
            }
        });
        timer.start();
    }

    private void setTableData(List<Customer> customers) {
        for (Customer customer : customers) {
            defaultTableModel.addRow(new Object[]{customer.getId(), customer.getFullname(), customer.getAge(), customer.getUsername(), customer.getPassword(), customer.getRetypepass(), customer.getPhone(), customer.getGender(), customer.getAddress(), customer.getRole()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuEdit = new javax.swing.JMenuItem();
        jMenuDelete = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextSearch = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtFile = new javax.swing.JMenu();
        txtCreateAccount = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();
        txtMenuForm = new javax.swing.JMenuItem();
        txtMenufood = new javax.swing.JMenuItem();
        txtExit = new javax.swing.JMenuItem();
        txtFind = new javax.swing.JMenu();
        txtFindId = new javax.swing.JMenuItem();
        txtFindFullname = new javax.swing.JMenuItem();
        txtTime = new javax.swing.JMenu();

        jPopupMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jMenuEdit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jMenuEdit.setText("Edit");
        jMenuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuEdit);

        jMenuDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jMenuDelete.setText("Delete");
        jMenuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(164, 176, 190));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Management System Customers", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        customerTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        customerTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FullName", "Age", "UserName", "Password", "Retype Pass", "PhoneNumber", "Gender", "Address", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customerTable.setColumnSelectionAllowed(true);
        customerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(customerTable);
        customerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSearch)
                .addGap(29, 29, 29)
                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtFile.setText("File");
        txtFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtCreateAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCreateAccount.setText("Create Account");
        txtCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateAccountActionPerformed(evt);
            }
        });
        txtFile.add(txtCreateAccount);

        Refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        txtFile.add(Refresh);

        txtMenuForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMenuForm.setText("Menuform");
        txtMenuForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuFormActionPerformed(evt);
            }
        });
        txtFile.add(txtMenuForm);

        txtMenufood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMenufood.setText("Menufood");
        txtMenufood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenufoodActionPerformed(evt);
            }
        });
        txtFile.add(txtMenufood);

        txtExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtExit.setText("Exit");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });
        txtFile.add(txtExit);

        jMenuBar1.add(txtFile);

        txtFind.setText("Find");
        txtFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtFindId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFindId.setText("By ID");
        txtFind.add(txtFindId);

        txtFindFullname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFindFullname.setText("By Fullname");
        txtFind.add(txtFindFullname);

        jMenuBar1.add(txtFind);

        txtTime.setForeground(new java.awt.Color(255, 0, 0));
        txtTime.setText("TimeICT");
        txtTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(txtTime);

        setJMenuBar(jMenuBar1);

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

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed

        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtExitActionPerformed

    private void txtMenufoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenufoodActionPerformed

        new FoodForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtMenufoodActionPerformed

    private void txtCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateAccountActionPerformed

        new RegisteredForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtCreateAccountActionPerformed

    private void txtMenuFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuFormActionPerformed

        new MenuForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtMenuFormActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed

        defaultTableModel.setRowCount(0);
        setTableData(customerService.getAllCustomers());
    }//GEN-LAST:event_RefreshActionPerformed

    private void jMenuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditActionPerformed
        int row = customerTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManagerForm.this, "Please Select User Before Edit!", "An Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            int customerId = Integer.valueOf(String.valueOf(customerTable.getValueAt(row, 0)));

            new EditForm(customerId).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuEditActionPerformed

    private void jMenuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteActionPerformed
        int row = customerTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManagerForm.this, "Please Select User Before Deleting!", "An Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(ManagerForm.this, "Do you want to delete this User?");

            if (confirm == JOptionPane.YES_OPTION) {
                int customerId = Integer.valueOf(String.valueOf(customerTable.getValueAt(row, 0)));

                customerService.deleteCustomer(customerId);

                defaultTableModel.setRowCount(0);
                setTableData(customerService.getAllCustomers());
            }
        }
    }//GEN-LAST:event_jMenuDeleteActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String inutSearch = jTextSearch.getText();
        if (inutSearch.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No empty");
            return;
        }
        List<Customer> customersList = customerService.searchCustomers(inutSearch);
        if (customersList == null) {
            JOptionPane.showMessageDialog(rootPane, "Not found");
            return;
        }
        defaultTableModel.setRowCount(0);
        setTableData(customerService.searchCustomers(inutSearch));
    }//GEN-LAST:event_jButtonSearchActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDelete;
    private javax.swing.JMenuItem jMenuEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JMenuItem txtCreateAccount;
    private javax.swing.JMenuItem txtExit;
    private javax.swing.JMenu txtFile;
    private javax.swing.JMenu txtFind;
    private javax.swing.JMenuItem txtFindFullname;
    private javax.swing.JMenuItem txtFindId;
    private javax.swing.JMenuItem txtMenuForm;
    private javax.swing.JMenuItem txtMenufood;
    private javax.swing.JMenu txtTime;
    // End of variables declaration//GEN-END:variables
}
