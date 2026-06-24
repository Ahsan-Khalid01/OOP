/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstguiapp;
import javax.swing.JFrame;

/**
 *
 * @author dcui
 */
public class MyfirstGuiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainFrame mf=new MainFrame();
        mf.setSize(400, 600);
        mf.setTitle("My First GUI App");
        mf.setDefaultCloseOperation(3);
        mf.setLayout(null);
        mf.addComps();
        mf.setVisible(true);
        // TODO code application logic here
    }
    
}
