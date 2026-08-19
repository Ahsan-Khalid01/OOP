/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage3;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
/**
 *
 * @author Abdur Rahim
 */
public class LoanFrame extends JFrame implements ActionListener {
    
   JTextField amountField, nameField, fatherField;
   JButton applyBtn;

    LoanFrame()
    {
        setTitle("Allied Bank Limited");
        setSize(420, 320);
        setLocationRelativeTo(null);
        setLayout(null);
      

        JLabel heading = new JLabel(" Loan Application ");
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        heading.setBounds(130, 20, 200, 30);
       this.add(heading);

        JLabel amtLabel = new JLabel("Loan Amount:");
        amtLabel.setBounds(40, 80, 120, 25);
        this.add(amtLabel);

        amountField = new JTextField();
        amountField.setBounds(170, 80, 180, 25);
        add(amountField);

        JLabel nameLabel = new JLabel("Your Name:");
        nameLabel.setBounds(40, 120, 120, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(170, 120, 180, 25);
        add(nameField);

        JLabel fatherLabel = new JLabel("Father Name:");
        fatherLabel.setBounds(40, 160, 120, 25);
        add(fatherLabel);

        fatherField = new JTextField();
        fatherField.setBounds(170, 160, 180, 25);
        add(fatherField);

        applyBtn = new JButton("Apply Loan");
        applyBtn.setBounds(130, 215, 150, 30);
        applyBtn.addActionListener(this);
        add(applyBtn);

        setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        /*String amtStr = amountField;
        String name = nameField;*/
        String amtStr = amountField.getText();
        String name  =  nameField.getText();
        String fatherN=  fatherField.getText();

        if(amtStr.equals("")||name.equals("")||fatherN.equals("") )
        {
            JOptionPane.showMessageDialog(this, " All fields are required!  ");
            
        }
        double amount = Double.parseDouble(amtStr);
       //if(amount <= 0 && amount >1000000)
        if(amount <= 0 ||amount > 1000000)
        {
            JOptionPane.showMessageDialog(this, " Loan must be less than or equal to 10 Lac ");
        }
    else
        {
      JOptionPane.showMessageDialog(this,"Loan Applied Successfully!  \n\nName: " + name +"\n Father Name: " + fatherN +" \n Amount: Rs " + amount );
       dispose();
    }
    
    
    
 }  
}
