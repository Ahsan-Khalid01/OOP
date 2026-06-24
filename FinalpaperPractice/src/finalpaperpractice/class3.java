/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpaperpractice;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dcui
 */
public class class3 extends JFrame implements ActionListener
{
   JLabel uname,pass;
   JTextField nf;
   JPasswordField pf;
   public void addcomp4()
   {
            
      uname=new JLabel();
      uname.setText("User Name");
      uname.setBounds(5, 10, 150, 30);
      this.add(uname);
      
      pass=new JLabel();
      pass.setText("Password");
      pass.setBounds(5, 70, 150, 30);
      this.add(pass);
      
        nf=new JTextField();
      nf.setBounds(175, 10, 200, 30);
      this.add(nf);
      
       
      pf=new JPasswordField();
      pf.setBounds(175, 70, 200, 30);
      this.add(pf);
      
      JButton btn=new JButton();
      btn.setText("confirm");
      btn.setBounds(20, 200, 200, 40);
      this.add(btn);
      btn.addActionListener(this);
      
      
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input=e.getActionCommand();
        if(input.equals("confirm")){
        try{
        Connection conn;
        String dbstr="jdbc:ucanaccess://C:/Users/dcui/Documents/NetBeansProjects/FinalpaperPractice/finalpaperpractice.accdb";
        conn=DriverManager.getConnection(dbstr);
        String query="SELECT * FROM userinfo WHERE UserName=? AND Password =?";
        PreparedStatement stat=conn.prepareStatement(query);
        stat.setString(1,this.nf.getText());
        char[]p=this.pf.getPassword();
        String ps=new String(p);
        stat.setString(2, ps);
        ResultSet s=stat.executeQuery();
        if(s.next())
        {
            JOptionPane.showMessageDialog(null,"LOgin SuccessFull");
            stat.close();
            conn.close();
        }else{
            JOptionPane.showMessageDialog(null,"Account NOt FOund !!!");
        }
        
        }
        
        catch(Exception ex){
            System.out.print(ex.getMessage());
        }
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
