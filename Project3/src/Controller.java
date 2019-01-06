
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
public class Controller {
    //Initialize Variables
    view View;
    DrawPanel dPanel;
    Model model;

//Replace with WORDS from DB 
    public int rand;
    private String word;
    private String userName, passWord, id; //Save the username and password when Logged in
    char[] guessWord; //char array to hold correct guesses
    char[] guessed; //char array of secret word
    private static int wrong; //number of wrong guesses
    private int Score, user_id; //Score for Correct guesses
    private boolean Ready = false; //Make everything unusable until User selects Start button
    private DefaultTableModel tableMod;
    
    
    //Constructor
    public Controller(){
        View = new view(); 
        model = new Model();
        initButtons(); //ActionListener Buttons A-Z
        initTopButtons(); //ActionListener for 'Top' Buttons - Start, Give Up, Reset
        View.setWordLabel("(Click Start)"); //set Label
        View.setTitle("Hangman Project 3 MVC"); //set Title
        View.setVisible(true); //set visible
        startSelectDialog(); //Login Dialogs
       
        dPanel = new DrawPanel(); //Panel for Hangman Drawings
        View.getManPanel().setSize(200, 250); //set the Hangman size
        View.getManPanel().add(dPanel); //add the Hangman Drawing to the Hangman Panel
        dPanel.setSize(400, 250); //set size of Hangman Dude
        View.getManPanel().setVisible(true); //set Hangman Panel visible
        
        initMenuBar(); //ActionListener for Menu Bar
    }
    
    //Menu Bar
    private void initMenuBar(){
        //New Game 
        View.addBtnMenuNewGameListener((ActionEvent evt) -> { 
            if(!View.getInternalFrame().isVisible()){
                View.getDesktopPane().add(View.getInternalFrame());
                View.getInternalFrame().setVisible(true);
            }else{
                try {
                    createWord();
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                createSpaces();
                updateSpaces();
                resetLetters();
                wrong = 0;
                Score = 0;
                View.repaint();
                Ready = true;
            }
        });
        
        //Reset
        View.addBtnMenuResetListener((ActionEvent evt) -> {
            if(View.getInternalFrame().isVisible()){
                try {
                    createWord();
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                createSpaces();
                updateSpaces();
                resetLetters();
                wrong = 0;
                Score = 0;
                View.repaint();
                Ready = true;
            }
        });
        
        //Exit
        View.addBtnMenuExitListener((ActionEvent evt) -> {
            System.exit(0);
        });
    }
   
    //Hangman Drawing
    class DrawPanel extends JPanel{
        private void draw(Graphics g){
            if(wrong>=0){
                System.out.println("Drawing");
               
                g.drawLine(100,200,200,200);//bottom line of hang
                g.drawLine(130,100,130,200);//long line of hang
                g.drawLine(130,100,180,100);//top line of hang
                g.drawLine(180,100,180,120);//short line of hang
            }
            if(wrong>=1)
                g.drawOval(165,115,25,25);//head
            if(wrong>=2)
                g.drawLine(180,180,180,140);//body
            if(wrong>=3)
                g.drawLine(150,160,180,150);//left arm
            if(wrong>=4)
                g.drawLine(200,160,180,150);//right arm
            if(wrong>=5)
                g.drawLine(200,200,180,180);//right leg
            if(wrong>=6){
                g.drawLine(160,200,180,180);//left leg
            }
        }


        @Override
        public void paintComponent(Graphics g){
            Graphics g2 = (Graphics)g;
            super.paintComponent(g2);
            draw(g2);
        }
        
    }
    
    //Login OR Create Account Dialog - Select Dialog
    private void startSelectDialog(){
        View.getSelectDialog().setVisible(true);
        View.getSelectDialog().setSize(400, 400);
        View.getSelectDialog().pack();
        View.getSelectDialog().setLocationRelativeTo(View); //Centers the Dialog
        View.getSelectDialog().setTitle("Login");
        View.getSelectDialog().setModal(true);
        
        //Login Dialog
        View.addBtnLoginListener((ActionEvent evt) -> {
            View.getLoginDialog().setSize(550, 400);
            View.getLoginDialog().setVisible(true);
            View.getLoginDialog().setLocationRelativeTo(View); //Centers the Dialog
            View.getSelectDialog().setVisible(false);
        });
            //Login button
        View.addBtnUserCredentialsListener((ActionEvent evt) -> {
         
            if(View.getUsername().getText().length() == 0 ||  View.getPassword().getPassword().length == 0){
                System.out.println("Try again");
            }else{
                userName = View.getUsername().getText();
                passWord = String.valueOf(View.getPassword().getPassword());
                
                try {
                    id = model.readLoginUser(userName, passWord);
                    user_id = Integer.parseInt(id);
                    //this.model.readLoginUser(userName, passWord);
                    if(!(id.equals(""))){
                        System.out.println("Logged IN!");
                        View.getLoginDialog().setVisible(false);
                    }
                    else
                        System.out.println("Incorrect Credentials");
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
  
            }
        });
        
        //Create Account Dialog
        View.addBtnCreateAccountListener((ActionEvent evt) -> {
            View.getCreateAccountDialog().setSize(550, 400);
            View.getCreateAccountDialog().setVisible(true);
            View.getCreateAccountDialog().setLocationRelativeTo(View);
            View.getSelectDialog().setVisible(false);
        });
            //Create Account button
        View.addBtnUserAccountListener((ActionEvent evt) -> {
            //USER DATABASE - INPUT INTO DB in IF STATEMENT
            if(View.getnewUsername().getText().length() == 0 ||  View.getnewPassword().getPassword().length == 0){
                System.out.println("Try Again");
                //*
            }else{
                //*
                 userName = View.getnewUsername().getText();
                 //user_id = Integer.parseInt(id);
                 passWord = String.valueOf(View.getnewPassword().getPassword());
                try {
                    model.insertUser(userName, passWord);
                      System.out.println("Created Account!");
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
                View.getCreateAccountDialog().setVisible(false);
                View.getSelectDialog().setVisible(true);
            }
        });
    }
    
    //*Select word from DB
    private String createWord() throws SQLException{ //Selects the secret word
        //*
        rand = (int)((Math.random()*10)+1);
        word = this.model.selectWord(rand);     
        //System.out.println(rand);
        //System.out.println(word); 
        guessed = word.toCharArray();
        return word;
    }
    
    private void createSpaces(){ //creates the number of lines for each char in secret word
        guessWord = new char[word.length()];
        for(int x = 0; x < word.length(); x++){
            guessWord[x] = '-';
        } 
    }
    
    private void updateSpaces(){ //prints out the secret word with guesses
        String wordGuessed = new String(guessWord);
        View.setWordLabel(wordGuessed);
    }
    
    private void checkGuess(char guess){ //checks if guess is correct
        boolean included = false;
        if(userName == null){
                //Make username to be displayed in the Score Table as Anonymous
                userName = "Anonymous";
        }
        for(int x = 0; x < guessWord.length; x++){
            if(word.charAt(x) == guess){
                guessWord[x] = guessed[x];
                Score += 100; //Each correct guess = +100 to Score
                included= true;
            }
        }
        if (!(new String(guessWord).contains("-"))){ //checks if winner
            Ready = false; //Make buttons inactive when game is done
            Score = Score - (wrong * 50);
            try {
                this.model.insertScore(Score, user_id);
                System.out.println("Score updated");
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            View.getWinDialog().setSize(450, 450);
            View.getGameOverLabel().setText("Winner!");
            View.getWinDialog().setVisible(true);
            System.out.println("Won");
            System.out.println("SCORE: " + Score + " | WRONG: " + wrong);

            tableMod = (DefaultTableModel) View.scoreTable.getModel();
            try {
                model.listScores(tableMod);
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            View.setScoreTable(tableMod);

            
        }
        if(included == false){
            wrong++;
            View.repaint();
            if(wrong==6){ //checks if game over
                Ready = false; //Make buttons inactive when game is done
                Score = Score - (wrong * 50);
                System.out.println("SCORE: " + Score + " | WRONG: " + wrong);
                
                View.getWinDialog().setSize(450, 450);
                System.out.println("Failed");
                View.getGameOverLabel().setText("Game Over");
                View.getWinDialog().setVisible(true);
                try {
                    this.model.insertScore(Score, user_id);
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                for(int x = 0; x < guessWord.length; x++){
                    guessWord[x] = guessed[x];
                }

                tableMod = (DefaultTableModel) View.scoreTable.getModel();
                try {
                    model.listScores(tableMod);
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                View.setScoreTable(tableMod);
                
            }     
        } 
    }
    
    //All letter keys are available to view again
    private void resetLetters(){
        View.getBtnA().setVisible(true);
        View.getBtnB().setVisible(true);
        View.getBtnC().setVisible(true);
        View.getBtnD().setVisible(true);
        View.getBtnE().setVisible(true);
        View.getBtnF().setVisible(true);
        View.getBtnG().setVisible(true);
        View.getBtnH().setVisible(true);
        View.getBtnI().setVisible(true);
        View.getBtnJ().setVisible(true);
        View.getBtnK().setVisible(true);
        View.getBtnL().setVisible(true);
        View.getBtnM().setVisible(true);
        View.getBtnN().setVisible(true);
        View.getBtnO().setVisible(true);
        View.getBtnP().setVisible(true);
        View.getBtnQ().setVisible(true);
        View.getBtnR().setVisible(true);
        View.getBtnS().setVisible(true);
        View.getBtnT().setVisible(true);
        View.getBtnU().setVisible(true);
        View.getBtnV().setVisible(true);
        View.getBtnW().setVisible(true);
        View.getBtnX().setVisible(true);
        View.getBtnY().setVisible(true);
        View.getBtnZ().setVisible(true);    
    }
    
    //The TOP buttons in JFrame - Start, Give Up, Reset
    private void initTopButtons(){
        View.addBtnStartListener((ActionEvent evt) -> { //Start btn
            if (Ready == false){
                try {
                    createWord();
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                createSpaces();
                updateSpaces();
                resetLetters();
                //tableMod.setRowCount(0);
                wrong = 0;
                Score = 0;
                View.repaint();
            }else{
                 View.getBtnStart().setEnabled(false);
            }
            
            Ready = true;
        });
        
        View.addBtnGiveUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //Give UP btn
                if (Ready == true) {
                    View.getWinDialog().setSize(450, 450);
                    System.out.println("Gave Up..");
                    View.getGameOverLabel().setText("Game Over");
                    View.getWinDialog().setVisible(true);
                    View.setWordLabel(word);
                    wrong = 0;
                    Score = 0;
                    View.repaint();
                    //*Need to put this in the MODEL of MVC or Save it in DB
                    tableMod = (DefaultTableModel) View.scoreTable.getModel();
                    try {
                        model.listScores(tableMod);
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    View.setScoreTable(tableMod);
                    }
            }
        });
        
        View.addBtnResetListener((ActionEvent evt) -> { //Reset btn
            if(Ready == true){
                try {
                    createWord();
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                createSpaces();
                updateSpaces();
                resetLetters();
                wrong = 0;
                Score = 0;
                View.repaint();
            }
        });
    }
    
    //Action Listeners for Buttons
    private void initButtons(){
        View.addBtnAListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('a');
                updateSpaces();
                View.getBtnA().setVisible(false);
            }
        });
        
        View.addBtnBListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('b');
                updateSpaces();
                View.getBtnB().setVisible(false);
            }
        });
        
        View.addBtnCListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('c');
                updateSpaces();
                View.getBtnC().setVisible(false);
            }
        });
        
        View.addBtnDListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('d');
                updateSpaces();
                View.getBtnD().setVisible(false);
            }
        });
        
        View.addBtnEListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('e');
                updateSpaces();
                View.getBtnE().setVisible(false);
            }
        });
        
        View.addBtnFListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('f');
                updateSpaces();
                View.getBtnF().setVisible(false);
            }
        });
        
        View.addBtnGListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('g');
                updateSpaces();
                View.getBtnG().setVisible(false);
            }
        });
        
        View.addBtnHListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('h');
                updateSpaces();
                View.getBtnH().setVisible(false);
            }
        });
        
        View.addBtnIListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('i');
                updateSpaces();
                View.getBtnI().setVisible(false);
            }
        });
        
        View.addBtnJListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('j');
                updateSpaces();
                View.getBtnJ().setVisible(false);
            }
        });
        
        View.addBtnKListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('k');
                updateSpaces();
                View.getBtnK().setVisible(false);
            }
        });
        
        View.addBtnLListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('l');
                updateSpaces();
                View.getBtnL().setVisible(false);
            }
        });
        
        View.addBtnMListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('m');
                updateSpaces();
                View.getBtnM().setVisible(false);
            }
        });
        
        View.addBtnNListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('n');
                updateSpaces();
                View.getBtnN().setVisible(false);
            }
        });
        
        View.addBtnOListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('o');
                updateSpaces();
                View.getBtnO().setVisible(false);
            }
        });
        
        View.addBtnPListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('p');
                updateSpaces();
                View.getBtnP().setVisible(false);
            }
        });
        
        View.addBtnQListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('q');
                updateSpaces();
                View.getBtnQ().setVisible(false);
            }
        });
        
        View.addBtnRListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('r');
                updateSpaces();
                View.getBtnR().setVisible(false);
            }
        });
        
        View.addBtnSListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('s');
                updateSpaces();
                View.getBtnS().setVisible(false);
            }
        });
        
        View.addBtnTListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('t');
                updateSpaces();
                View.getBtnT().setVisible(false);
            }
        });
        
        View.addBtnUListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('u');
                updateSpaces();
                View.getBtnU().setVisible(false);
            }
        });
        
        View.addBtnVListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('v');
                updateSpaces();
                View.getBtnV().setVisible(false);
            }
        });
        
        View.addBtnWListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('w');
                updateSpaces();
                View.getBtnW().setVisible(false);
            }
        });
        
        View.addBtnXListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('x');
                updateSpaces();
                View.getBtnX().setVisible(false);
            }
        });
        
        View.addBtnYListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('y');
                updateSpaces();
                View.getBtnY().setVisible(false);
            }
        });
        
        View.addBtnZListener((ActionEvent evt) -> {
            if(Ready == true){
                checkGuess('z');
                updateSpaces();
                View.getBtnZ().setVisible(false);
            }
        });
    }
}
