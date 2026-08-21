/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculator;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.util.Scanner;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

/**
 *
 * @author Ahsan Khalid
 */
public class cal extends JFrame implements ActionListener
{
    JButton [] btn;
    int a=10,b=110;
  //  int y = 40,z=40;  
    Font font=new Font("Times nee Roman",Font.BOLD,24);
    public void cal()
    {
        
        
        JLabel lb=new JLabel();
        Font font1 =new Font("",Font.BOLD,38);
        lb.setText("0");
        lb.setBounds(3, 10,380, 60);
       lb.setBackground(Color.red);
       lb.setFont(font1);
       lb.setHorizontalAlignment(SwingConstants.RIGHT);
       lb.setOpaque(true);
       this.add(lb);
        
        
       String str[]={"0","1","2","3","4","5","6","7","8","9","+","-","/","*","=","C","D" };
       btn=new JButton[str.length];

       for(int i=0;i<str.length;i++)
       {
           btn[i]=new JButton();
           btn[i].setText(str[i]);
           btn[i].setBounds(a, b, 60,60);
           btn[i].setFont(font);
           this.add(btn[i]);
           a=a+75;
           if((i+1)%5==0)
            {
                a=10;
                b=b+75;
            }
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    }
    


