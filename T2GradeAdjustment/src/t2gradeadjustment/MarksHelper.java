/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t2gradeadjustment;

/**
 *
 * @author Ahsan Khalid
 */
public class MarksHelper
{
      public int[] increaseMarks(int[] marks) {
        int[] newMarks = new int[marks.length];
          System.out.println("   --:  Orignal Marks :--\n");
          for(int k=0;k<marks.length;k++)
          {
              System.out.printf("%d  ",marks[k]);
          }
          System.out.println("");
        for (int i = 0; i < marks.length; i++) {
            newMarks[i] = marks[i] + 5;

            if (newMarks[i] > 100) {
                newMarks[i] = 100;
            }
        }

        return newMarks;
    }

}
