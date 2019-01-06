
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarina
 */
public class Controller {
    
    View view;
    Model model;
    private ActionListener actionListener1;
    private ActionListener actionListener2;
    private ActionListener actionListener3;
    private ActionListener actionListener4;
    private ActionListener actionListener5;
    private ActionListener actionListener6;
    private ActionListener actionListener7;
    private ActionListener actionListener8;
    private ActionListener actionListener9;
    private ActionListener actionListener0;
    private ActionListener actionListenerDiv;
    private ActionListener actionListenerMul;
    private ActionListener actionListenerSub;
    private ActionListener actionListenerAdd;
    private ActionListener actionListenerEquals;
    private ActionListener actionListenerClear;
    private ActionListener actionListenerExit;
    public double mem, mem2;
    public int op;
    
    public Controller(){
        init();
    }
    public void init(){
         view = new View();
         model = new Model();
         setActions();
         view.setVisible(true);
    }
    public void setActions(){        
        actionListener1=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "1");           
            }
        };
        view.btn1Listener(actionListener1); 
        
        actionListener2=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "2");           
            }
        };
        view.btn2Listener(actionListener2); 
        
        actionListener3=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "3");           
            }
        };
        view.btn3Listener(actionListener3); 
        
        actionListener4=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "4");           
            }
        };
        view.btn4Listener(actionListener4); 
        
        actionListener5=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "5");           
            }
        };
        view.btn5Listener(actionListener5); 
        
        actionListener6=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "6");           
            }
        };
        view.btn6Listener(actionListener6); 
        
        actionListener7=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "7");           
            }
        };
        view.btn7Listener(actionListener7);    
        
        actionListener8=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "8");           
            }
        };
        view.btn8Listener(actionListener8);
        
        actionListener9=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "9");           
            }
        };
        view.btn9Listener(actionListener9);  
        
        actionListener0=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText(view.screen.getText() + "0");           
            }
        };
        view.btn0Listener(actionListener0);
        
        actionListenerDiv=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               mem = Double.parseDouble(view.screen.getText());
               view.screen.setText("");
               op = 1;           
            }
        };
        view.btnDivListener(actionListenerDiv);  
        
        actionListenerMul=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               mem = Double.parseDouble(view.screen.getText());
               view.screen.setText("");
               op = 2;           
            }
        };
        view.btnMulListener(actionListenerMul); 
        
        actionListenerSub=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               mem = Double.parseDouble(view.screen.getText());
               view.screen.setText("");
               op = 3;           
            }
        };
        view.btnSubListener(actionListenerSub); 
        
        actionListenerAdd=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               mem = Double.parseDouble(view.screen.getText());
               view.screen.setText("");
               op = 4;           
            }
        };
        view.btnAddListener(actionListenerAdd); 
        
        actionListenerEquals=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               mem2 = Double.parseDouble(view.screen.getText());
               if(op == 1)
                   view.screen.setText("" + model.div(mem, mem2));
               else if(op == 2)
                   view.screen.setText("" + model.mul(mem, mem2));
               else if(op == 3)
                   view.screen.setText("" + model.sub(mem, mem2));
               else if(op == 4)
                   view.screen.setText("" + model.add(mem, mem2));
            }
        };
        view.btnEqualsListener(actionListenerEquals);  
        
        actionListenerClear=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               view.screen.setText("");         
            }
        };
        view.clearListener(actionListenerClear);  
        
        actionListenerExit=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               System.exit(0);         
            }
        };
        view.exitListener(actionListenerExit);  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller app = new Controller();
        // TODO code application logic here
    }
    
}
