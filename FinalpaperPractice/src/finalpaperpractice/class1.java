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
 *
 * @author dcui
 */
public  class class1 extends JFrame implements ActionListener
{
    
    JButton btnsign,btnlog;
    public void addcomp()        
    {
        btnsign=new JButton();
        btnsign.setText("Login");
        btnsign.setBounds(10, 10, 200, 40);
        this.add(btnsign);
        btnsign.addActionListener(this);
        
        btnlog=new JButton();
        btnlog.setText("Sign UP");
        btnlog.setBounds(10, 80, 200, 40);
        this.add(btnlog);
        btnlog.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String str=e.getActionCommand();
    if(str.equals("Sign UP"))
    {
        class2 f=new class2();
        f.setTitle("Signup Frame");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(3);
        f.addcomp2();
        f.setVisible(true);
        
    }
    else if(str.equals("Login"))
    {
        class3 f=new class3();
        f.setTitle("Login Frame");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.addcomp4();
        f.setVisible(true);
    }
    }
   
    
}
