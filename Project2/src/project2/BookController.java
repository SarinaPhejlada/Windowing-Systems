package project2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forrestlybarger
 */
public class BookController {
    view view;
    bean model;
    ResultSet arr = null;
    
    private ActionListener listSearch, listDelete, listAddSub, listEditSub, listClose;
    
    public BookController(){
        init();
    }
    
    public void init(){
        view = new view();
        model = new bean();
        setActions();
        
        view.setVisible(true);
    }    
    
    public void fillTable(DefaultTableModel table, ResultSet rs)
    {   
        Object[] values = new Object[6];
        try {
            while(rs.next()){
                values = new Object[6];
                values[0] = rs.getString("bookID");
                values[1] = rs.getString("title");
                values[2] = rs.getString("name");
                values[3] = rs.getString("genre");
                values[4] = rs.getString("quantity");
                values[5] = rs.getString("company");
                table.addRow(values);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setActions(){
        try {
            DefaultTableModel tableMod = (DefaultTableModel) view.mainTable.getModel();
            arr = model.listAll();
            fillTable(tableMod, arr);
            listSearch = new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    tableMod.setRowCount(0);
                    if(view.radioByName.isSelected()){
                        try {
                            arr = model.readTitle(view.textSearch.getText());
                        } catch (SQLException ex) {
                            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else if(view.radioByAuthor.isSelected()){
                        try {
                            String id = String.valueOf(model.selectAuthor(view.textSearch.getText()));
                            arr = model.readAuthor(id);
                        } catch (SQLException ex) {
                            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    fillTable(tableMod, arr);
                }
            };
            view.searchButtonList(listSearch);
            
            listDelete = new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    System.out.println("delete");
                    try{
                        model.delete(view.textDelete.getText());
                        tableMod.setRowCount(0);
                        arr = model.listAll();
                        fillTable(tableMod, arr);
                        view.textDelete.setText("");
                    }catch(Exception e){
                        System.out.println("Row not Found");
                    }
                }
            };
            view.deleteButtonList(listDelete);
            
            listAddSub = new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    try {
                        try {
                            ArrayList<String> arr = new ArrayList<>();
                            arr.add(view.textTitleAdd.getText());
                            if(model.selectAuthor(view.textAuthorAdd.getText()) != "")
                                arr.add(model.selectAuthor(view.textAuthorAdd.getText()));
                            else{
                                model.insertAuthor(view.textAuthorAdd.getText());
                                arr.add(model.selectAuthor(view.textAuthorAdd.getText()));
                            }
                            arr.add(view.textGenreAdd.getText());
                            if(model.selectPublisher(view.textPublisherAdd.getText()) != "")
                                arr.add(model.selectPublisher(view.textPublisherAdd.getText()));
                            else{
                                model.insertPub(view.textPublisherAdd.getText());
                                arr.add(model.selectPublisher(view.textPublisherAdd.getText()));
                            }
                            arr.add(view.textQuantityAdd.getText());
                            
                            String title = view.textTitleAdd.getText();
                            String authorID = String.valueOf(model.selectAuthor(view.textAuthorAdd.getText()));
                            String genre = view.textGenreAdd.getText();
                            String pubID = String.valueOf(model.selectPublisher(view.textPublisherAdd.getText()));
                            String quant = view.textQuantityAdd.getText();
                            model.insert(title, authorID, genre, pubID, quant);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        tableMod.setRowCount(0);
                        arr = model.listAll();
                        fillTable(tableMod, arr);
                        view.dialogAdd.setVisible(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            view.submitDialogButton(listAddSub);
            
            listEditSub = new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    try {
                        if(!view.textTitleEdit.getText().equals("")){
                            try {
                                model.update("title", view.textTitleEdit.getText(), "bookID", view.textBookIDEdit.getText());
                            } catch (SQLException ex) {
                                Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else if(!view.textAuthorEdit.getText().equals("")){
                            try {
                                String id = model.selectAuthor(view.textAuthorEdit.getText());
                                model.update("authorID", view.textAuthorEdit.getText(), "bookID", view.textBookIDEdit.getText());
                            } catch (SQLException ex) {
                                Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else if(!view.textGenreEdit.getText().equals("")){
                            try {
                                model.update("genre", view.textGenreEdit.getText(), "bookID", view.textBookIDEdit.getText());
                            } catch (SQLException ex) {
                                Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else if(!view.textPublisherEdit.getText().equals("")){
                            try {
                                String id = model.selectPublisher(view.textPublisherEdit.getText());
                                model.update("publisherID", view.textPublisherEdit.getText(), "bookID", view.textBookIDEdit.getText());
                            } catch (SQLException ex) {
                                Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else if(!view.textQuantityEdit.getText().equals("")){
                            try {
                                model.update("quantity", view.textQuantityEdit.getText(), "bookID", view.textBookIDEdit.getText());
                            } catch (SQLException ex) {
                                Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        tableMod.setRowCount(0);
                        arr = model.listAll();
                        fillTable(tableMod, arr);
                        view.dialogEdit.setVisible(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            view.updateDialogButton(listEditSub);
        } catch (SQLException ex) {
            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listClose = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                System.exit(0);
            }
        };
        view.closeMenuButton(listClose);
    }
}
