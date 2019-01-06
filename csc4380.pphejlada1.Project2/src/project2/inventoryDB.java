package project2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarina
 */
public class inventoryDB {
    public static bean myBean;
    public static view myView;
    public static BookController myController;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myController = new BookController();
    }
    
}
