
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roy
 */
public class Model {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    
    public Model(){
         try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/windowingsystemsproject3", "root", "");
            st = conn.createStatement();
            System.out.println("Connected");
            
        }catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            e.printStackTrace();
            System.out.println("Not Connected");
            System.exit(0);
        }   
    }
    public int insert(String input, String input2, String input3, String input4, String input5) throws SQLException{

        String query="INSERT INTO user (user_name, password, user_id) VALUES ('" + input + "', '" + input2
                + "', '" + input3 + "');";
        st.executeUpdate(query);       
        return 0;
    }

 public int insertUser(String input, String input2) throws SQLException{
        String query="INSERT INTO user (user_name, password) VALUES ('" + input + "', '" + input2 + "');";
        st.executeUpdate(query);
        return 0; 
  }
   public int insertScore(int input, int input2) throws SQLException{
        String query="INSERT INTO scores (score, user_id) VALUES ('" + input + "', '" + input2 + "');";
        st.executeUpdate(query);
        return 0;
    }
   public String readLoginUser(String value, String value2) throws SQLException{
        String query="SELECT user_id FROM user WHERE user_name = '" + value + "' AND password = '" + value2 + "';";
        rs = st.executeQuery(query); 
        String out="";
        while(rs.next())
            out = rs.getString("user_id");
        return out;
    }
    public String selectWord(int input) throws SQLException{
        String query="SELECT word FROM words WHERE word_id = '" + input + "';";
        rs = st.executeQuery(query);
        String out="";
        while(rs.next())
            out = rs.getString("word");
        return out;
        //startgame
    }
    public void listScores(DefaultTableModel table) throws SQLException{
        table.setRowCount(0);
        String query = "SELECT scores.score, user.user_name FROM (scores INNER JOIN user ON user.user_id = scores.user_id) ORDER BY score desc LIMIT 15;"; 
        rs = st.executeQuery(query);
        Object[] values = new Object[2];
        while(rs.next()){
            values = new Object[6];
            values[0] = rs.getString("user_name");
            values[1] = rs.getString("score");
            table.addRow(values);
        }
    }  
}

