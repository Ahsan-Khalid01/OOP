/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author Ahsan Khalid
 */
public class mainFrame  extends JFrame implements ActionListener 
{
    
 
    JButton [] btns;
    JTextField txtmain;
    double num1;
    int opertion;
    Font f=new Font("Times New Roman",Font.PLAIN,20);
    public void addComps()
    {
        txtmain=new JTextField();
        txtmain.setText("0");
        txtmain.setBackground(Color.BLACK);
        txtmain.setForeground(Color.WHITE);
        txtmain.setFont(f);
        txtmain.setHorizontalAlignment(SwingConstants.RIGHT);
        txtmain.setEnabled(false);
        txtmain.setBounds(10,10,360,50);
        this.add(txtmain);
        
        
        String [] str={"0","1","2","3","4","5","6","7","8","9",".","+","-","*","/","C","B","="};
        btns=new JButton[str.length];
        int x=20,y=80;
        for(int i=0; i<str.length; i++)
        {
            btns[i]=new JButton();
            btns[i].setText(str[i]);
            btns[i].setBounds(x,y,55,55);
            btns[i].setFont(f);
            btns[i].addActionListener(this);
            this.add(btns[i]);
            x=x+75;
            if((i+1)%5==0)
            {
                x=20;
                y=y+75;
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String op=e.getActionCommand();
        String txt=txtmain.getText();
        if(txt.compareTo("0")==0)
        {
            txtmain.setText(op);
        }
        else
        if(op.compareTo(".")==0)
        {
            if(txt.contains("."))
            {
                
            }
            else
            {
                txtmain.setText(txtmain.getText()+op);
            }
        }
        else
        if(op.compareTo("B")==0)
        {
            String var=txt.substring(0, txt.length()-1);
            if(var.length()==0)
            {
                txtmain.setText("0");
            }
            else
            {
            txtmain.setText(var);
            }
        }
        else
        if(op.compareTo("+")==0)
        {
            this.num1=Double.parseDouble(txtmain.getText());
            this.opertion=1;
            txtmain.setText("0");
            
        }
        else
        if(op.compareTo("-")==0)
        {
            this.num1=Double.parseDouble(txtmain.getText());
            this.opertion=2;
            txtmain.setText("0");
        }
         else
        if(op.compareTo("*")==0)
        {
            this.num1=Double.parseDouble(txtmain.getText());
            this.opertion=3;
            txtmain.setText("0");
        }
         else
        if(op.compareTo("/")==0)
        {
            this.num1=Double.parseDouble(txtmain.getText());
            this.opertion=4;
            txtmain.setText("0");
        }
        else
        if(op.compareTo("=")==0)
        {
            double num2=Double.parseDouble(txtmain.getText());
            double res=0.0;
            if(this.opertion==1)
            {
                res=this.num1+num2;
            }
            else
            if(this.opertion==2)
            {
                res=this.num1-num2;
            }
             else
            if(this.opertion==3)
            {
                res=this.num1*num2;
            }
              else
            if(this.opertion==4)
            {
                res=this.num1/num2;
            }
            txtmain.setText(Double.toString(res));
            
            
        }
        else
        if(op.compareTo("C")==0)
        {
            txtmain.setText("0");
        }
        else
        {
        String r=txtmain.getText()+op;
        txtmain.setText(r);
        }
        
    }
    
}
    

