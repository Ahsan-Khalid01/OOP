/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalpaperpractice;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
/**
 *
 * @author dcui
 */
public class class2 extends JFrame implements ActionListener
{
  JLabel uname,name,fname,pass;
  JButton btnok,btnclr;
  JTextField uf,nf,fnf;
  JPasswordField pf;
  public void addcomp2()
  {
      
      name=new JLabel();
      name.setText("Name");
      name.setBounds(5, 10, 100, 30);
      this.add(name);
      
      fname=new JLabel();
      fname.setText("Father Name");
      fname.setBounds(5, 60, 150, 30);
      this.add(fname);
      
      uname=new JLabel();
      uname.setText("User Name");
      uname.setBounds(5, 110, 150, 30);
      this.add(uname);
      
      pass=new JLabel();
      pass.setText("Password");
      pass.setBounds(5, 160, 150, 30);
      this.add(pass);
      
      
      btnok=new JButton();
      btnok.setText("Ok");
      btnok.setBounds(10,250,100,40);
      this.add(btnok);
      btnok.addActionListener(this);
      
      btnclr=new JButton();
      btnclr.setText("Clear");
      btnclr.setBounds(140, 250, 100, 40);
      this.add(btnclr);
      
      nf=new JTextField();
      nf.setBounds(175, 10, 200, 30);
      this.add(nf);
      
      fnf=new JTextField();
      fnf.setBounds(175, 60, 200, 30);
      this.add(fnf);
      
      uf=new JTextField();
      uf.setBounds(175, 110, 200, 30);
      this.add(uf);
       
      pf=new JPasswordField();
      pf.setBounds(175, 160, 200, 30);
      this.add(pf);
      
      
      
      
  }
  
  
    @Override
    public void actionPerformed(ActionEvent e) {
    String input=e.getActionCommand();
  
    if(input.equals("Ok"))
    {
      try {
        Connection conn;
        String dbstr="jdbc:ucanaccess://C:/Users/dcui/Documents/NetBeansProjects/FinalpaperPractice/finalpaperpractice.accdb";
       conn=DriverManager.getConnection(dbstr);
       String query="insert into userinfo(Name,FatherName,UserName,Password)values(?,?,?,?)";
       PreparedStatement stat=conn.prepareStatement(query);
       stat.setString(1,this.nf.getText());
       stat.setString(2,this.fnf.getText());
       stat.setString(3,this.uf.getText());
       char [] pass=this.pf.getPassword();
       String pas=new String(pass);
       
       stat.setString(4, pas);
       stat.executeUpdate();
       JOptionPane.showMessageDialog(null, "Sign up Successfull");
       stat.close();
       conn.close();
    }
    
        catch(Exception ex){
           System.out.print(ex.getMessage());
            
        }
    }
       
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
