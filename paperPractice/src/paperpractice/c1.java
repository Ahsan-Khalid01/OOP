/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paperpractice;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 * 
 *
 * @author dcui
 */
public class c1 extends JFrame {
    private int id;
    private String Name;
    private String Course;
    JLabel lb;
    JButton btn;
    JTextField fld;
    public void SetName(String n)
    {
        this.Name=n;
    }
    public void SetID(int id)
    {
        this.id=id;
        
    }
    public void setCourse(String c)
    {
        this.Course=c;
    }
    
    public void addcomp()
    {
        lb=new JLabel();
        lb.setText("Name");
        lb.setBounds(10, 10, 100, 30);
        lb.setOpaque(true);
        this.add(lb);
        
        lb=new JLabel();
        lb.setText("Course");
        lb.setBounds(10, 60, 100, 30);
        lb.setOpaque(true);
        this.add(lb);
        
        lb=new JLabel();
        lb.setText("ID");
        lb.setBounds(10, 110, 100, 30);
        lb.setOpaque(true);
        this.add(lb);
        
        fld=new JTextField();
        fld.setBounds(130, 60,200, 30);
        fld.setOpaque(true);
        this.add(fld);
        
        
        fld=new JTextField();
        fld.setBounds(130, 10,200, 30);
        fld.setOpaque(true);
        this.add(fld);
        
        
        fld=new JTextField();
        fld.setBounds(130, 110,200, 30);
        fld.setOpaque(true);
        this.add(fld);
        
        btn=new JButton();
        btn.setText("Add");
        btn.setBounds(20, 150, 100, 30);
        btn.setVisible(true);
        this.add(btn);
        
        btn=new JButton();
        btn.setText("Delete");
        btn.setBounds(130, 150, 100, 30);
        btn.setVisible(true);
         this.add(btn);
        
        btn=new JButton();
        btn.setText("Update");
        btn.setBounds(240, 150, 100, 30);
        btn.setVisible(true);
         this.add(btn);
         
                 
        btn=new JButton();
        btn.setText("View");
        btn.setBounds(155, 200, 100, 30);
        btn.setVisible(true);
         this.add(btn);
    }
    
    
}
