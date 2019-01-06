
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prant_000
 */
public class View extends javax.swing.JFrame {
    //ButtonGroup btnGroup;
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth()) /2);
        int y = (int) ((screen.getHeight() -getHeight()) /2);
        setLocation(x, y);
        //btnGroup = new ButtonGroup();
        btnGroup.add(titleRad);
        btnGroup.add(dirRad);
        btnGroup.add(genreRad);
        
    }
    //Action Listeners for Buttons
    public void addSearchBtnListener(ActionListener a){
        searchBtn.addActionListener(a);
    }
    public void addAddBtnListener(ActionListener a){
        addBtn.addActionListener(a);
    }
    public void addRemoveBtnListener(ActionListener a){
        removeBtn.addActionListener(a);
    }
    public void addCheckoutBtnListener(ActionListener a){
        checkoutBtn.addActionListener(a);
    } 
    //Action Listeners for Menus
    public void addExitMenuListener(ActionListener a){
        closeMenu.addActionListener(a);
    }
    public void addAddMenuListener(ActionListener a){
        addMenu.addActionListener(a);
    }
    public void addRemoveMenuListener(ActionListener a){
        removeMenu.addActionListener(a);
    }
    public void addActionMenuListener(ActionListener a){
        actionMenu.addActionListener(a);
    }
    public void addHorrorMenuListener(ActionListener a){
        horrorMenu.addActionListener(a);
    }
    public void addAnimatedMenuListener(ActionListener a){
        animatedMenu.addActionListener(a);
    }
    public void addInvenMenuListener(ActionListener a){
        invenMenu.addActionListener(a);
    }
    public void addCartMenuListener(ActionListener a){
        cartMenu.addActionListener(a);
    }
    //getters
    public String getSearch(){
        return searchField.getText();
    }
    public String getTotal(){
        return totalField.getText();
    }
    public String getMovie(){
        return movieField.getText();
    }
    public boolean getTitleSearch(){
        return titleRad.isSelected();
    }
    public boolean getDirSearch(){
        return dirRad.isSelected();
    }
    public boolean getGenreSearch(){
        return genreRad.isSelected();
    }
    public JTable getListTable(){
        return listTable;
    }
    public JTable getSearchTable(){
        return searchTable;
    }
    public JInternalFrame getSearchFrame(){
        return searchFrame;
    }
    public JInternalFrame getListFrame(){
        return listFrame;
    }
    public JDesktopPane getDesktopPane(){
        return desktop;
    }
    //setter
    public void setTotalField(String total){
        totalField.setText(total);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnGroup = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        searchFrame = new javax.swing.JInternalFrame();
        searchBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        title1 = new javax.swing.JLabel();
        titleRad = new javax.swing.JRadioButton();
        searchField = new javax.swing.JTextField();
        genreRad = new javax.swing.JRadioButton();
        dirRad = new javax.swing.JRadioButton();
        searchMenu = new javax.swing.JMenuBar();
        genreMenu = new javax.swing.JMenu();
        actionMenu = new javax.swing.JMenuItem();
        horrorMenu = new javax.swing.JMenuItem();
        animatedMenu = new javax.swing.JMenuItem();
        listFrame = new javax.swing.JInternalFrame();
        addBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        removeBtn = new javax.swing.JButton();
        title2 = new javax.swing.JLabel();
        checkoutBtn = new javax.swing.JButton();
        totalField = new javax.swing.JTextField();
        totalText = new javax.swing.JLabel();
        movieField = new javax.swing.JTextField();
        listMenu = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        addMenu = new javax.swing.JMenuItem();
        removeMenu = new javax.swing.JMenuItem();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        invenMenu = new javax.swing.JMenuItem();
        cartMenu = new javax.swing.JMenuItem();
        closeMenu = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuItem3.setText("jMenuItem3");

        jMenu2.setText("jMenu2");

        jLabel2.setText("Username: ");

        jLabel3.setText("Password:");

        jButton2.setText("Login");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchFrame.setClosable(true);
        searchFrame.setIconifiable(true);
        searchFrame.setResizable(true);
        searchFrame.setVisible(true);

        searchBtn.setText("Search");

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title", "Price", "Genre", "Director", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setColumnSelectionAllowed(true);
        searchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(searchTable);
        searchTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        title1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("BluckBoster");

        titleRad.setText("Title");

        searchField.setText("Title, Director, Genre");

        genreRad.setText("Genre");

        dirRad.setText("Director");

        genreMenu.setText("Genres");

        actionMenu.setText("Action");
        genreMenu.add(actionMenu);

        horrorMenu.setText("Horror");
        genreMenu.add(horrorMenu);

        animatedMenu.setText("Animated");
        genreMenu.add(animatedMenu);

        searchMenu.add(genreMenu);

        searchFrame.setJMenuBar(searchMenu);

        javax.swing.GroupLayout searchFrameLayout = new javax.swing.GroupLayout(searchFrame.getContentPane());
        searchFrame.getContentPane().setLayout(searchFrameLayout);
        searchFrameLayout.setHorizontalGroup(
            searchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(searchFrameLayout.createSequentialGroup()
                        .addGroup(searchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchFrameLayout.createSequentialGroup()
                                .addComponent(titleRad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dirRad)
                                .addGap(88, 88, 88)
                                .addComponent(genreRad)
                                .addGap(12, 12, 12))
                            .addComponent(searchField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        searchFrameLayout.setVerticalGroup(
            searchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchFrameLayout.createSequentialGroup()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchFrameLayout.createSequentialGroup()
                        .addGroup(searchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleRad)
                            .addComponent(genreRad)
                            .addComponent(dirRad))
                        .addGap(12, 12, 12)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        listFrame.setClosable(true);
        listFrame.setIconifiable(true);
        listFrame.setResizable(true);
        listFrame.setVisible(true);

        addBtn.setText("Add ");

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Price", "Quantity", "Length"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listTable.setColumnSelectionAllowed(true);
        listTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(listTable);
        listTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        removeBtn.setText("Remove");

        title2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("BluckBoster");

        checkoutBtn.setText("Checkout");

        totalText.setText("Total");

        movieField.setText("Enter Movie ID");

        editMenu.setText("Edit");

        addMenu.setText("Add");
        editMenu.add(addMenu);

        removeMenu.setText("Remove");
        editMenu.add(removeMenu);

        listMenu.add(editMenu);

        listFrame.setJMenuBar(listMenu);

        javax.swing.GroupLayout listFrameLayout = new javax.swing.GroupLayout(listFrame.getContentPane());
        listFrame.getContentPane().setLayout(listFrameLayout);
        listFrameLayout.setHorizontalGroup(
            listFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(listFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkoutBtn))
                    .addGroup(listFrameLayout.createSequentialGroup()
                        .addComponent(movieField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        listFrameLayout.setVerticalGroup(
            listFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listFrameLayout.createSequentialGroup()
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(listFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(movieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalText))
                .addContainerGap())
        );

        desktop.setLayer(searchFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(listFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(searchFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listFrame)
                    .addComponent(searchFrame))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        invenMenu.setText("Inventory");
        fileMenu.add(invenMenu);

        cartMenu.setText("Cart");
        fileMenu.add(cartMenu);

        closeMenu.setText("Close");
        fileMenu.add(closeMenu);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actionMenu;
    private javax.swing.JButton addBtn;
    private javax.swing.JMenuItem addMenu;
    private javax.swing.JMenuItem animatedMenu;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JMenuItem cartMenu;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JMenuItem closeMenu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JRadioButton dirRad;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu genreMenu;
    private javax.swing.JRadioButton genreRad;
    private javax.swing.JMenuItem horrorMenu;
    private javax.swing.JMenuItem invenMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JInternalFrame listFrame;
    private javax.swing.JMenuBar listMenu;
    private javax.swing.JTable listTable;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField movieField;
    private javax.swing.JButton removeBtn;
    private javax.swing.JMenuItem removeMenu;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JInternalFrame searchFrame;
    private javax.swing.JMenuBar searchMenu;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JRadioButton titleRad;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalText;
    // End of variables declaration//GEN-END:variables
}
