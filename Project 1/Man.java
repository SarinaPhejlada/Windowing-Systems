/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.pphejlada1.project1;

import java.awt.Graphics;

/**
 *
 * @author Sarina & Nikhita
 */
public class Man extends javax.swing.JPanel {

    /**
     * Creates new form Man
     */
    public Man() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void draw(Graphics g){
        if(Hangman.wrong>=0){
        g.drawLine(400,250,470,250);//bottom line of hang
        g.drawLine(435,85,435,250);//long line of hang
        g.drawLine(435,85,515,85);//top line of hang
        g.drawLine(515,85,515,105);//short line of hang
        }
        if(Hangman.wrong>=1)
            g.drawOval(493,105,45,45);//head
        if(Hangman.wrong>=2)
            g.drawLine(515,200,515,150);//body
        if(Hangman.wrong>=3)
            g.drawLine(485,170,515,150);//left arm
        if(Hangman.wrong>=4)
            g.drawLine(545,170,515,150);//right arm
        if(Hangman.wrong>=5)
            g.drawLine(545,230,515,200);//right leg
        if(Hangman.wrong>=6){
            g.drawLine(485,230,515,200);//left leg
        }
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics g2 = (Graphics)g;
        super.paintComponent(g2);
        draw(g2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
