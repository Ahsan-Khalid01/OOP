/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package t2gradeadjustment;

/**
 *
 * @author Ahsan Khalid
 */
public class T2GradeAdjustment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int[] marks = {90, 95, 98, 70, 60};

        MarksHelper obj = new MarksHelper();
        int[] result = obj.increaseMarks(marks);
        System.out.println("\n  :-- After Exceed :--\n");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("\n");
    }

}
