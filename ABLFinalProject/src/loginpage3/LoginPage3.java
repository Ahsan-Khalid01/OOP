 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginpage3;

import javax.swing.ImageIcon;

/**
 *
 * @author Ahsan Khalid
 */
public class LoginPage3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // first page 
        DesignClass f1=new DesignClass();
        f1.setTitle("Allied Bank Limited");
        f1.setSize(400,500);
        f1.setIconImage(new ImageIcon(LoginPage3.class.getResource("/pic/logo ablll.png")).getImage());
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.addcomponents();
        f1.setDefaultCloseOperation(3);
        f1.setVisible(true);
   
   }
    
}
