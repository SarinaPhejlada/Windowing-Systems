
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarina
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth()) /2);
        int y = (int) ((screen.getHeight() -getHeight()) /2);
        setLocation(x, y);
        initComponents();
    }
    
    //Action Listeners for Buttons A-Z
    public void addBtnAListener(ActionListener a) {
        btnA1.addActionListener(a);
    }
    public void addBtnBListener(ActionListener a) {
        btnB1.addActionListener(a);
    }
    public void addBtnCListener(ActionListener a) {
        btnC1.addActionListener(a);
    }
    public void addBtnDListener(ActionListener a) {
        btnD1.addActionListener(a);
    }
    public void addBtnEListener(ActionListener a) {
        btnE1.addActionListener(a);
    }
    public void addBtnFListener(ActionListener a) {
        btnF1.addActionListener(a);
    }
    public void addBtnGListener(ActionListener a) {
        btnG1.addActionListener(a);
    }
    public void addBtnHListener(ActionListener a) {
        btnH1.addActionListener(a);
    }
    public void addBtnIListener(ActionListener a) {
        btnI1.addActionListener(a);
    }
    public void addBtnJListener(ActionListener a) {
        btnJ1.addActionListener(a);
    }
    public void addBtnKListener(ActionListener a) {
        btnK1.addActionListener(a);
    }
    public void addBtnLListener(ActionListener a) {
        btnL1.addActionListener(a);
    }
    public void addBtnMListener(ActionListener a) {
        btnM1.addActionListener(a);
    }
    public void addBtnNListener(ActionListener a) {
        btnN1.addActionListener(a);
    }
    public void addBtnOListener(ActionListener a) {
        btnO1.addActionListener(a);
    }
    public void addBtnPListener(ActionListener a) {
        btnP1.addActionListener(a);
    }
    public void addBtnQListener(ActionListener a) {
        btnQ1.addActionListener(a);
    }
    public void addBtnRListener(ActionListener a) {
        btnR1.addActionListener(a);
    }
    public void addBtnSListener(ActionListener a) {
        btnS1.addActionListener(a);
    }
    public void addBtnTListener(ActionListener a) {
        btnT1.addActionListener(a);
    }
    public void addBtnUListener(ActionListener a) {
        btnU1.addActionListener(a);
    }
    public void addBtnVListener(ActionListener a) {
        btnV1.addActionListener(a);
    }
    public void addBtnWListener(ActionListener a) {
        btnW1.addActionListener(a);
    }
    public void addBtnXListener(ActionListener a) {
        btnX1.addActionListener(a);
    }
    public void addBtnYListener(ActionListener a) {
        btnY1.addActionListener(a);
    }
    public void addBtnZListener(ActionListener a) {
        btnZ1.addActionListener(a);
    }
//JFrame  
    public JButton getBtnA(){
        return btnA1;
    }
    public JButton getBtnB(){
        return btnB1;
    }
    public JButton getBtnC(){
        return btnC1;
    }
    public JButton getBtnD(){
        return btnD1;
    }
    public JButton getBtnE(){
        return btnE1;
    }
    public JButton getBtnF(){
        return btnF1;
    }
    public JButton getBtnG(){
        return btnG1;
    }
    public JButton getBtnH(){
        return btnH1;
    }
    public JButton getBtnI(){
        return btnI1;
    }
    public JButton getBtnJ(){
        return btnJ1;
    }
    public JButton getBtnK(){
        return btnK1;
    }
    public JButton getBtnL(){
        return btnL1;
    }
    public JButton getBtnM(){
        return btnM1;
    }
    public JButton getBtnN(){
        return btnN1;
    }
    public JButton getBtnO(){
        return btnO1;
    }
    public JButton getBtnP(){
        return btnP1;
    }
    public JButton getBtnQ(){
        return btnQ1;
    }
    public JButton getBtnR(){
        return btnR1;
    }
    public JButton getBtnS(){
        return btnS1;
    }
    public JButton getBtnT(){
        return btnT1;
    }
    public JButton getBtnU(){
        return btnU1;
    }
    public JButton getBtnV(){
        return btnV1;
    }
    public JButton getBtnW(){
        return btnW1;
    }
    public JButton getBtnX(){
        return btnX1;
    }
    public JButton getBtnY(){
        return btnY1;
    }
    public JButton getBtnZ(){
        return btnZ1;
    }
    
    //JFrame TOP panel buttons
    public void addBtnStartListener(ActionListener a) {
        startBtn.addActionListener(a);
    }
    public void addBtnGiveUpListener(ActionListener a) {
        giveBtn.addActionListener(a);
    } 
    public void addBtnResetListener(ActionListener a) {
        resetBtn.addActionListener(a);
    } 
    public JButton getBtnStart(){
        return startBtn;
    }
    public JButton getBtnGiveUp(){
        return giveBtn;
    }
    public JButton getBtnReset(){
        return resetBtn;
    }
    public JPanel getPanelButtons(){
        return panelButtons;
    }
 
    public void setWordLabel(String text){
        wordLabel.setText(text);
    }
    public String getWordLabel(){
        return wordLabel.getText();
    }
    public JPanel getManPanel(){
        return panelMan;
    }
    public void setManPanel(JPanel panel){
        panelMan = panel;
    }
    
    public void addBtnMenuNewGameListener(ActionListener a) {
        menuNewGame.addActionListener(a);
    } 
    public void addBtnMenuResetListener(ActionListener a) {
        menuReset.addActionListener(a);
    } 
    public void addBtnMenuExitListener(ActionListener a) {
        menuExit.addActionListener(a);
    } 

//Win Dialog
    public JDialog getWinDialog(){
        return endDialog;
    }
    public JLabel getGameOverLabel(){
        return gameoverLabel;
    }
    public JTable getScoreTable(){
        return scoreTable;
    }
    public void setScoreTable(TableModel model){
        scoreTable.setModel(model);
    }

 //Select Dialog   
    public void addBtnLoginListener(ActionListener a) {
        loginBtn.addActionListener(a);
    } 
    public void addBtnCreateAccountListener(ActionListener a) {
        createBtn.addActionListener(a);
    } 
    public JDialog getSelectDialog(){
        return selectDialog;
    }
    public JButton getLoginButton(){
        return loginBtn;
    }
    public JButton getCreateButton(){
        return createBtn;
    }
 
//Login Dialog
    public void addBtnUserCredentialsListener(ActionListener a) {
        subBtn.addActionListener(a);
    } 
    public JDialog getLoginDialog(){
        return loginDialog;
    }
    public JTextField getUsername(){
        return userField;
    }
    public JPasswordField getPassword(){
        return passField;
    }
   
//Create Account Dialog
    public void addBtnUserAccountListener(ActionListener a) {
        newSubBtn.addActionListener(a);
    } 
    public JDialog getCreateAccountDialog(){
        return createDialog;
    }
    public JTextField getnewUsername(){
        return newUserField;
    }
    public JPasswordField getnewPassword(){
        return newPassField;
    }

//DesktopPane
    public JInternalFrame getInternalFrame(){
        return internalFrame;
    }
     public JDesktopPane getDesktopPane(){
        return desktopPane;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectDialog = new javax.swing.JDialog();
        hangmanLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        loginDialog = new javax.swing.JDialog();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        subBtn = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();
        createDialog = new javax.swing.JDialog();
        newUserLabel = new javax.swing.JLabel();
        newPassLabel = new javax.swing.JLabel();
        newUserField = new javax.swing.JTextField();
        newPassField = new javax.swing.JPasswordField();
        createLabel = new javax.swing.JLabel();
        newSubBtn = new javax.swing.JButton();
        endDialog = new javax.swing.JDialog();
        gameoverLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();
        desktopPane = new javax.swing.JDesktopPane();
        internalFrame = new javax.swing.JInternalFrame();
        panelLetters = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnI1 = new javax.swing.JButton();
        btnH1 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnG1 = new javax.swing.JButton();
        btnJ1 = new javax.swing.JButton();
        btnK1 = new javax.swing.JButton();
        btnL1 = new javax.swing.JButton();
        btnM1 = new javax.swing.JButton();
        btnN1 = new javax.swing.JButton();
        btnO1 = new javax.swing.JButton();
        btnP1 = new javax.swing.JButton();
        btnQ1 = new javax.swing.JButton();
        btnR1 = new javax.swing.JButton();
        btnS1 = new javax.swing.JButton();
        btnT1 = new javax.swing.JButton();
        btnU1 = new javax.swing.JButton();
        btnV1 = new javax.swing.JButton();
        btnW1 = new javax.swing.JButton();
        btnX1 = new javax.swing.JButton();
        btnY1 = new javax.swing.JButton();
        btnZ1 = new javax.swing.JButton();
        panelMan = new javax.swing.JPanel();
        panelButtons = new javax.swing.JPanel();
        startBtn = new javax.swing.JButton();
        giveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        wordLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuNewGame = new javax.swing.JMenuItem();
        menuReset = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        hangmanLabel.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        hangmanLabel.setText("Hangman");

        loginBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        loginBtn.setText("Login");

        createBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        createBtn.setText("Create an Account");

        javax.swing.GroupLayout selectDialogLayout = new javax.swing.GroupLayout(selectDialog.getContentPane());
        selectDialog.getContentPane().setLayout(selectDialogLayout);
        selectDialogLayout.setHorizontalGroup(
            selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectDialogLayout.createSequentialGroup()
                .addGroup(selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectDialogLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(hangmanLabel))
                    .addGroup(selectDialogLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        selectDialogLayout.setVerticalGroup(
            selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(hangmanLabel)
                .addGap(31, 31, 31)
                .addComponent(loginBtn)
                .addGap(26, 26, 26)
                .addComponent(createBtn)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        userLabel.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        userLabel.setText("Username");

        passLabel.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        passLabel.setText("Password");

        subBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        subBtn.setText("Login");

        loginLabel.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        loginLabel.setText("Login to Account");

        javax.swing.GroupLayout loginDialogLayout = new javax.swing.GroupLayout(loginDialog.getContentPane());
        loginDialog.getContentPane().setLayout(loginDialogLayout);
        loginDialogLayout.setHorizontalGroup(
            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginDialogLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginDialogLayout.createSequentialGroup()
                        .addComponent(passLabel)
                        .addGap(29, 29, 29)
                        .addComponent(passField))
                    .addGroup(loginDialogLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginDialogLayout.createSequentialGroup()
                        .addComponent(userLabel)
                        .addGap(29, 29, 29)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        loginDialogLayout.setVerticalGroup(
            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDialogLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(loginLabel)
                .addGap(31, 31, 31)
                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        newUserLabel.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        newUserLabel.setText("Username");

        newPassLabel.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        newPassLabel.setText("Password");

        createLabel.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        createLabel.setText("Create an Account");

        newSubBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        newSubBtn.setText("Submit");

        javax.swing.GroupLayout createDialogLayout = new javax.swing.GroupLayout(createDialog.getContentPane());
        createDialog.getContentPane().setLayout(createDialogLayout);
        createDialogLayout.setHorizontalGroup(
            createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newUserLabel)
                    .addComponent(newPassLabel))
                .addGap(36, 36, 36)
                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newUserField)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
            .addGroup(createDialogLayout.createSequentialGroup()
                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createLabel))
                    .addGroup(createDialogLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(newSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createDialogLayout.setVerticalGroup(
            createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(createLabel)
                .addGap(39, 39, 39)
                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserLabel)
                    .addComponent(newUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(createDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassLabel)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        gameoverLabel.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        gameoverLabel.setText("Winner!");

        scoreTable.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player Name", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scoreTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(scoreTable);
        if (scoreTable.getColumnModel().getColumnCount() > 0) {
            scoreTable.getColumnModel().getColumn(0).setResizable(false);
            scoreTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout endDialogLayout = new javax.swing.GroupLayout(endDialog.getContentPane());
        endDialog.getContentPane().setLayout(endDialogLayout);
        endDialogLayout.setHorizontalGroup(
            endDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameoverLabel)
                .addGap(92, 92, 92))
        );
        endDialogLayout.setVerticalGroup(
            endDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameoverLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internalFrame.setClosable(true);
        internalFrame.setIconifiable(true);
        internalFrame.setMaximizable(true);
        internalFrame.setVisible(true);

        panelLetters.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnA1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnA1.setText("A");
        btnA1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnI1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnI1.setText("I");
        btnI1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnH1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnH1.setText("H");
        btnH1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnC1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnC1.setText("C");
        btnC1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnD1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnD1.setText("D");
        btnD1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnB1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnB1.setText("B");
        btnB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnE1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnE1.setText("E");
        btnE1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnF1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnF1.setText("F");
        btnF1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnG1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnG1.setText("G");
        btnG1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnJ1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnJ1.setText("J");
        btnJ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnK1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnK1.setText("K");
        btnK1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnL1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnL1.setText("L");
        btnL1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnM1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnM1.setText("M");
        btnM1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnN1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnN1.setText("N");
        btnN1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnO1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnO1.setText("O");
        btnO1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnP1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnP1.setText("P");
        btnP1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnQ1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnQ1.setText("Q");
        btnQ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnR1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnR1.setText("R");
        btnR1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnS1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnS1.setText("S");
        btnS1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnT1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnT1.setText("T");
        btnT1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnU1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnU1.setText("U");
        btnU1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnV1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnV1.setText("V");
        btnV1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnW1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnW1.setText("W");
        btnW1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnX1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnX1.setText("X");
        btnX1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnY1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnY1.setText("Y");
        btnY1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnZ1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btnZ1.setText("Z");
        btnZ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelLettersLayout = new javax.swing.GroupLayout(panelLetters);
        panelLetters.setLayout(panelLettersLayout);
        panelLettersLayout.setHorizontalGroup(
            panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLettersLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLettersLayout.createSequentialGroup()
                        .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnF1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnG1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnH1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnI1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnK1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLettersLayout.createSequentialGroup()
                        .addComponent(btnL1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnM1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLettersLayout.createSequentialGroup()
                                .addComponent(btnO1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnP1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnR1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnS1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnT1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnU1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnV1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLettersLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnW1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnX1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnY1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLettersLayout.setVerticalGroup(
            panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLettersLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnF1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnH1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnK1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnV1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLettersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnW1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        panelMan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelManLayout = new javax.swing.GroupLayout(panelMan);
        panelMan.setLayout(panelManLayout);
        panelManLayout.setHorizontalGroup(
            panelManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );
        panelManLayout.setVerticalGroup(
            panelManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        panelButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        startBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        startBtn.setText("Start");

        giveBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        giveBtn.setText("Give Up");

        resetBtn.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        resetBtn.setText("Reset");

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(startBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(giveBtn)
                .addGap(55, 55, 55)
                .addComponent(resetBtn)
                .addGap(17, 17, 17))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn)
                    .addComponent(giveBtn)
                    .addComponent(resetBtn))
                .addContainerGap())
        );

        wordLabel.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordLabel.setText("_ o _ _ s");

        javax.swing.GroupLayout internalFrameLayout = new javax.swing.GroupLayout(internalFrame.getContentPane());
        internalFrame.getContentPane().setLayout(internalFrameLayout);
        internalFrameLayout.setHorizontalGroup(
            internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalFrameLayout.createSequentialGroup()
                        .addComponent(panelLetters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(internalFrameLayout.createSequentialGroup()
                        .addGroup(internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(internalFrameLayout.createSequentialGroup()
                                .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(internalFrameLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))
                        .addComponent(panelMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        internalFrameLayout.setVerticalGroup(
            internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(internalFrameLayout.createSequentialGroup()
                        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLetters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        desktopPane.setLayer(internalFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(internalFrame)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(internalFrame)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        menuFile.setText("File");

        menuNewGame.setText("New Game");
        menuFile.add(menuNewGame);

        menuReset.setText("Reset");
        menuFile.add(menuReset);

        menuExit.setText("Exit");
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnF1;
    private javax.swing.JButton btnG1;
    private javax.swing.JButton btnH1;
    private javax.swing.JButton btnI1;
    private javax.swing.JButton btnJ1;
    private javax.swing.JButton btnK1;
    private javax.swing.JButton btnL1;
    private javax.swing.JButton btnM1;
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnO1;
    private javax.swing.JButton btnP1;
    private javax.swing.JButton btnQ1;
    private javax.swing.JButton btnR1;
    private javax.swing.JButton btnS1;
    private javax.swing.JButton btnT1;
    private javax.swing.JButton btnU1;
    private javax.swing.JButton btnV1;
    private javax.swing.JButton btnW1;
    private javax.swing.JButton btnX1;
    private javax.swing.JButton btnY1;
    private javax.swing.JButton btnZ1;
    private javax.swing.JButton createBtn;
    private javax.swing.JDialog createDialog;
    private javax.swing.JLabel createLabel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JDialog endDialog;
    private javax.swing.JLabel gameoverLabel;
    private javax.swing.JButton giveBtn;
    private javax.swing.JLabel hangmanLabel;
    private javax.swing.JInternalFrame internalFrame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JDialog loginDialog;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuNewGame;
    private javax.swing.JMenuItem menuReset;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JButton newSubBtn;
    private javax.swing.JTextField newUserField;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelLetters;
    private javax.swing.JPanel panelMan;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton resetBtn;
    public static javax.swing.JTable scoreTable;
    private javax.swing.JDialog selectDialog;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
