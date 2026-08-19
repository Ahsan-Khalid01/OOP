/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage3;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
//import javax.swing.j


/**
 *
 * @author Ahsan Khalid
 */
public class DesignClass extends JFrame implements ActionListener
{
    JLabel lb,logo;
    JTextField unamef;
    JPasswordField upaswrdf;
    JButton btn;
    Font font;
    public void addcomponents()
    {
       this.getContentPane().setBackground(Color.WHITE);
      //this.setSize(400, 500);
       //this.setVisible(true);
       //this.add(this);
        ImageIcon icon=new ImageIcon( "C:\\Users\\dcui\\Downloads\\ABL logo.jpg");
        logo=new JLabel(icon);
        logo.setBounds(7, 15, 360, 110);
        this.add(logo);
       font=new Font("Times New Roman",Font.BOLD+Font.TRUETYPE_FONT,22);
      /* lb=new JLabel();
       lb.setText("myABL");
       lb.setBounds(162, 10, 300, 150);
       lb.setBackground(Color.red);
       lb.setFont(font);
       lb.setVisible(true);
       this.add(lb);*/
       font=new Font("Times New Roman",Font.BOLD+Font.PLAIN,16);
       lb=new JLabel();
       lb.setText("User Name");
       lb.setBounds(43, 148, 100, 20);
       lb.setFont(font);
       this.add(lb);
       unamef=new JTextField();
       unamef.setBounds(130, 148, 210, 27);
       this.add(unamef);
       font=new Font("Times New Roman",Font.BOLD+Font.PLAIN,16);
       lb=new JLabel();
       lb.setText("Password");
       lb.setBounds(44, 188, 100, 20);
       lb.setFont(font);
       this.add(lb);
       upaswrdf=new JPasswordField(); 
       upaswrdf.setBounds(130,183, 210, 27);
       this.add(upaswrdf);
       btn=new JButton();
       font=new Font("Times New Roman",Font.BOLD+Font.ITALIC,15);
       btn.setText("Login");
       btn.setBounds(140, 218, 85, 25);
       btn.setVisible(true);
       btn.setFont(font);
       btn.addActionListener(this);
       this.add(btn);
       
       btn=new JButton();
       font=new Font("Times New Roman",Font.BOLD+Font.ITALIC,15);
       btn.setText("Clear");
       btn.setBounds(245, 218, 85, 25);
       btn.setVisible(true);
       btn.setFont(font);
       btn.addActionListener(this);
       this.add(btn);
       lb=new JLabel();
       font=new Font("Times New Roman",Font.PLAIN,10);
       lb.setText("or dont have a account?");
       lb.setBounds(174,248,500,25);
       this.add(lb);
      /* JFrame f=new JFrame();
       f.getContentPane().setBackground(Color.WHITE);
       f.setSize(400, 500);
       f.setVisible(true);
       this.add(f);*/
       //Color c=new Color(Color.WHITE);
       btn=new JButton();
       //font=new Font("Times New Roman",Font.BOLD+Font.ITALIC,15);
       btn.setText("Sign up");
       btn.setBounds(190, 278,100, 25);
       //btn.setFont(font);
       btn.setVisible(true);
       this.add(btn);  
       btn.addActionListener(this);
       
        btn=new JButton();
       font=new Font("Times New Roman",Font.BOLD,20);
       btn.setText("Change Theme");
       btn.setBounds(1, 430,384, 30);
       btn.setFont(font);
       btn.setVisible(true);
       this.add(btn);  
       btn.addActionListener(this);
    }
    
    
  @Override
    public void actionPerformed(ActionEvent e)
    {
       String input=e.getActionCommand();
    if(input.compareTo("Sign up")==0)
       {
           
          Frame2 f2=new Frame2();
          f2.setTitle("Allied Bank Limited");
           f2.setSize(420, 500);
          // f2.setIconImage(new ImageIcon(LoginPage3.getResource("/pic/logo ablll.png")).getImage());
          // f2.setIconImage( ImageIcon(LoginPage3.class.getResource("/pic/logo ablll.png")).getImage());
        f2.setIconImage(new ImageIcon(LoginPage3.class.getResource("/pic/logo ablll.png")).getImage());
        f2.setLayout(null);
        f2.setLocationRelativeTo(null);
        f2.addcomp2();
        f2.setDefaultCloseOperation(3);
        f2.setVisible(true);
        //f1.addcomp2();
           
           
       }
       if(input.compareTo("Clear")==0)
        {
           this.unamef.setText("");
           this.upaswrdf.setText("");
       }
        if(input.compareTo("Change Theme")==0)
        {
           Random rd=new Random();
           int r=rd.nextInt(255);
           int a=rd.nextInt(255);
           int s=rd.nextInt(255);
           Color c=new Color(r,a,s);
           this.getContentPane().setBackground(c);
        }
      if(input.compareTo("Login") == 0)
{
    String username = unamef.getText().trim();
    String password = new String(upaswrdf.getPassword()).trim();

    if(username.isEmpty() ||password.isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Please enter both username and password  ");
     }
    else
    {
        try
        {
            String dbStr = "jdbc:ucanaccess://C:/Users/dcui/Documents/NetBeansProjects/ABLFinalProject/ABLdatabase.accdb";
            Connection conn = DriverManager.getConnection(dbStr);
            String query = "SELECT * FROM CustomerInfo WHERE UserName=? AND Pin=?";
            PreparedStatement stat = conn.prepareStatement(query);
            stat.setString(1, username);
            stat.setInt(2, Integer.parseInt(password));
            
            ResultSet rs = stat.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, " Login Successful!");
                
                UserAccountFrame userFrame = new UserAccountFrame(username);
                
               userFrame.setTitle("Allied Bank Limited ");
              userFrame.setIconImage(new ImageIcon(LoginPage3.class.getResource("/pic/logo ablll.png")).getImage());
               ImageIcon icon=new ImageIcon("C:\\Users\\dcui\\Documents\\NetBeansProjects\\ABLFinalProject\\cropTopLogo.jpg");
                userFrame.setSize(420, 700);
                //userFrame.setBackground(Color.black);
                userFrame.setLayout(null);
                userFrame.setLocationRelativeTo(null);
                userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                userFrame.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Username or Pin ");
            }
            
            rs.close();
            stat.close();
            conn.close();
        
       /* if(input.compareTo("Change Theme")==0)
        {
           Random rd=new Random();
           int r=rd.nextInt(255);
           int a=rd.nextInt(255);
           int s=rd.nextInt(255);
           Color c=new Color(r,a,s);
           this.getContentPane().setBackground(c);
        }*/
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error  " + ex.getMessage());
        }
    }
}

       
 } 
}

