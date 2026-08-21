/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculator;

import java.awt.Color;

/**
 *
 * @author Ahsan Khalid
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cal f=new cal();
        f.setTitle("Calculator");
        f.setSize(400, 600);
        f.getContentPane().setBackground(Color.BLUE);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.cal();
        f.setVisible(true);
        // TODO code application logic here
    }

}
