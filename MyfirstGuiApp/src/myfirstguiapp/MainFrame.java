/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstguiapp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author dcui
 */
public class MainFrame extends JFrame implements ActionListener
{
 JLabel lbMain,lbuname,lbpword;
 JButton btnsigin,btnclear,btncolor;
 JTextField txtname;
 JPasswordField txtpasword;
 Font fn;
 Font lfn;
 public void addComps()
 {
     lbMain=new JLabel();
     lbMain.setText("       Login");
     lbMain.setBounds(160, 85, 77, 30);
     lbMain.setOpaque(true);
     lbMain.setBackground(Color.LIGHT_GRAY);
     this.add(lbMain);
     lbuname=new JLabel();
     lbuname.setText("User Name");
     lbuname.setBounds(35, 133, 140, 60);
     lbuname.setBackground(Color.red);
     //lbuname.setOpaque(true);
     this.add(lbuname);
     txtname=new JTextField();
     txtname.setBounds(117, 150, 190, 30);
     txtname.setOpaque(true);
     this.add(txtname);
     lbpword=new JLabel();
     lbpword.setText("Password");
     lbpword.setBounds(35, 188, 100, 30);
     //lbpword.setBackground(Color.red);
     this.add(lbpword);
     txtpasword =new JPasswordField();
     txtpasword.setBounds(117, 190, 190, 30);
     txtpasword.setOpaque(true);
     this.add(txtpasword);
     //JFrame obj=new JFrame();
     
     btnsigin=new JButton();
     btnsigin.setText("Sign up");
     btnsigin.setBounds(122, 240, 77, 25);
     //btnsigin.addActionListener(this);
     this.add(btnsigin);
     btnsigin.addActionListener(this);
     
     btnclear=new JButton();
     btnclear.setText("Clear");
     btnclear.setBounds(220, 240, 77, 25);
     this.add(btnclear);
     btnclear.addActionListener(this); 
     
     btncolor=new JButton();
     btncolor.setText("Change Color");
     btncolor.setBounds(122, 275, 174, 25);
     this.add(btncolor);
     btncolor.addActionListener(this);
     
    // btnclear.addActionListener();  
 }
  @Override
     public void actionPerformed(ActionEvent e)
    {
        Random rn=new Random();
        String act=e.getActionCommand();
        if(act.compareTo("Sign up")==0)
        {
            MainFrame f2=new MainFrame();
            f2.setSize(500, 800);
            f2.setVisible(true);
           // f2.add(lbMain);
            lbMain=new JLabel();
            lbMain.setText("First Name");
            lbMain.setBounds(20, 40, 300, 50);
            lbMain.setVisible(true);
            this.add(lbMain);
            lbMain.setOpaque(true);
              f2.add(lbMain);
            
            //JOptionPane.showMessageDialog(null, "Signup Button Clicked");
          
        }
        if(act.compareTo("Clear")==0)
        {
            JOptionPane.showMessageDialog(null,"Clear Button Clicked");
        }
        if(act.compareTo("Change Color")==0)
        {
            int r=rn.nextInt(255);
            int b=rn.nextInt(255);
            int g=rn.nextInt(255);
            //int f=rn.nextInt(255);
            Color c=new Color(r,b,g);
            this.getContentPane().setBackground(c);
        }
        
        
    }
     

}
