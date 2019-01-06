
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    //Model model;
    String search;
    String total;
    DefaultTableModel table;
    String movieId;
    LocalDate checkOut;
    LocalDate dueDate;
    
    public Controller(){
        view = new View();
        //model = new Model();
        initMenu();
        initTopButtons();
        view.setTitle("BluckBoster");
        view.setVisible(true);
    }
    public void initMenu(){
        view.addExitMenuListener((ActionEvent evt) -> {
            System.exit(0);
        });
        view.addAddMenuListener((ActionEvent evt) -> {
           //add();
        });
        view.addRemoveMenuListener((ActionEvent evt) -> {
           //remove();
        });
        view.addActionMenuListener((ActionEvent evt) -> {
            table = (DefaultTableModel)view.getSearchTable().getModel();
           //model.search(genre, action, table);
        });
        view.addHorrorMenuListener((ActionEvent evt) -> {
           table = (DefaultTableModel)view.getSearchTable().getModel();
            //model.search(genre, horror, table);
        });
        view.addAnimatedMenuListener((ActionEvent evt) -> {
           table = (DefaultTableModel)view.getSearchTable().getModel();
            //model.search(genre, animated, table);
        });
        view.addCartMenuListener((ActionEvent evt) -> {
           if(!view.getSearchFrame().isVisible()){
               view.getDesktopPane().add(view.getSearchFrame());
               view.getSearchFrame().setVisible(true);
           }
        });
        view.addInvenMenuListener((ActionEvent evt) -> {
            if(!view.getListFrame().isVisible()){
               view.getDesktopPane().add(view.getListFrame());
               view.getListFrame().setVisible(true);
           }
        });
    }
    public void initTopButtons(){
        view.addAddBtnListener((ActionEvent evt) -> {
            //add();
        });
        view.addRemoveBtnListener((ActionEvent evt) -> {
            //remove();
        });
        view.addSearchBtnListener((ActionEvent evt) -> {
            search = view.getSearch();
            table = (DefaultTableModel)view.getSearchTable().getModel();
            if(view.getTitleSearch()){
                //model.search("title", search, table);
            }
            else if(view.getDirSearch()){
                //model.search("director", search, table);
            }
            else{
                //model.search("genre", search, table);
            }
        });
        view.addCheckoutBtnListener((ActionEvent evt) -> {
            total = view.getTotal();
            checkOut = LocalDate.now();
            dueDate = LocalDate.now().plusMonths(1);
            //model.checkout(total, checkOut, dueDate);
            view.setTotalField(total);
        });
    }
    public void add() throws SQLException{
        movieId = view.getMovie();
        table = (DefaultTableModel)view.getListTable().getModel();
        //model.addMovie(movieId);
        //model.updateTable(table);
    }
    public void remove() throws SQLException{
        movieId = view.getMovie();
        table = (DefaultTableModel)view.getListTable().getModel();
        //model.deleteMovie(movieId);   
        //model.updateTable(table);
    }
}
