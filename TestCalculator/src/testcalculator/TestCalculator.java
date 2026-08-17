/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcalculator;
import java.awt.Color;
/**
 *
 * @author Ahsan Khalid
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        mainFrame frm=new mainFrame();
        frm.setSize(400,600);
        frm.setTitle("Calculator");
        frm.getContentPane().setBackground(Color.CYAN);
        frm.setDefaultCloseOperation(3);
        frm.setLocationRelativeTo(null);
        frm.setLayout(null);
        frm.addComps();
        frm.setVisible(true);
        // TODO code application logic here
    }
    
}
