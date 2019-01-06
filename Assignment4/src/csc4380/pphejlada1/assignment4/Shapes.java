/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.pphejlada1.assignment4;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Sarina
 */
public class Shapes extends javax.swing.JPanel {

    /**
     * Creates new form Shapes
     */
    public Shapes() {
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
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void draw(Graphics g){
        if(LineRectangle.image == 1){
            g.drawLine(LineRectangle.lx1,LineRectangle.ly1,LineRectangle.lx2,LineRectangle.ly2);
            g.setColor(Color.CYAN);
            repaint();
        }
        else{
            g.drawRect(LineRectangle.rx1,LineRectangle.ry1,LineRectangle.rx2,LineRectangle.ry2);
            g.setColor(Color.MAGENTA);
            repaint();
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