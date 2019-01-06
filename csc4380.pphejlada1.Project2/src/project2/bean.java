package project2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarina
 */
public class bean {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public bean(){
           // connect to databese and set up Statement
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/windowingsystemsproject2", "root", "");
            st = conn.createStatement();
        }catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        
    }
    
    public int insert(String input, String input2, String input3, String input4, String input5) throws SQLException{
        String query="INSERT INTO books (title, authorID, genre, pubID, quantity) VALUES ('" + input + "', '" + input2
                + "', '" + input3 + "', '" + input4 + "', '" + input5 + "');";
        st.executeUpdate(query);       
        return 0;
    }
    
    public int insertAuthor(String input) throws SQLException{
        String query="INSERT INTO author (name) VALUES ('" + input + "');";
        st.executeUpdate(query);
        return 0;
    }
    
    public int insertPub(String input) throws SQLException{
        String query="INSERT INTO publisher (company) VALUES ('" + input + "');";
        st.executeUpdate(query);
        return 0;
    }
    
    public ResultSet listAll() throws SQLException{
        String query = "SELECT books.bookID, books.title, author.name, books.genre, books.quantity, publisher.company "
                + "FROM ((books INNER JOIN author ON books.authorID = author.authorID) "
                + "INNER JOIN publisher ON books.pubID = publisher.pubID);";  
        rs = st.executeQuery(query);
        return rs;
    }
    
    public ResultSet readTitle(String value) throws SQLException{
        String query="SELECT books.bookID, books.title, author.name, books.genre, books.quantity, publisher.company "
                + "FROM ((books INNER JOIN author ON books.authorID = author.authorID) "
                + "INNER JOIN publisher ON books.pubID = publisher.pubID) WHERE title = '" + value + "';";  
        rs = st.executeQuery(query);        
        return rs;
    }
    
    public ResultSet readAuthor(String value) throws SQLException{
        String query="SELECT books.bookID, books.title, author.name, books.genre, books.quantity, publisher.company "
                + "FROM ((books INNER JOIN author ON books.authorID = author.authorID) "
                + "INNER JOIN publisher ON books.pubID = publisher.pubID) WHERE books.authorID = '" + value + "';";
        rs = st.executeQuery(query);
        return rs;
    }
    
    public String selectAuthor(String input) throws SQLException{
        String query="SELECT authorID FROM author WHERE name = '" + input + "';";
        rs = st.executeQuery(query);
        String out = "";
        while(rs.next())
            out = rs.getString("authorID");
        return out;
    }
    
    public String selectPublisher(String input) throws SQLException{
        String query="SELECT pubID FROM publisher WHERE company = '" + input + "';";
        rs = st.executeQuery(query);
        String out="";
        while(rs.next())
            out = rs.getString("pubID");
        return out;
    }
    
    public int update(String col, String value, String rowID, String valueID) throws SQLException{
        String query="UPDATE books SET "+col+" = '"+value+"' WHERE "+rowID+" = "+valueID+";";
        st.executeUpdate(query);
        return 0;
    }
    
    public int delete(String value) throws SQLException{
        String query="DELETE FROM books WHERE bookID = '" + value + "';";     
        st.executeUpdate(query);
        return 0;
    }
}
