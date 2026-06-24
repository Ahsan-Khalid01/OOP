/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movierentalassociation;

/**
 *
 * @author dcui
 */
public class MovieRentalAssociation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie []m=new Movie[5];
        m[0]=new Action(010,"The Shawshank Redemption",450);
        m[1]=new Comedy(101,"The GodFather",766);
        m[2]=new Drama(212,"12 Angry Men",632);
        m[3]=new Action(331,"Schindlers's List",330);
        m[4]=new Drama(001,"The Pursuit of Happiness",740);
        for(int i=0;i<m.length;i++)
        {
            m[i].CalculateLateFee();
        }
        

    }
    
}
