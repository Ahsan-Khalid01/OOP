/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movierentalassociation;
import java.util.Scanner;
/**
 *
 * @author dcui
 */
public class Action extends Movie {
    private int fee;
    private final int latefeePerday=3;
    public Action(int id,String t,int fe)
    {
        super(id,t);
        this.fee=fe;
    }
    @Override
    public void CalculateLateFee()
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter Total Late Days : ");
       int day=input.nextInt();
       System.out.printf("======: Action Movie :======\nTitle :   %s\nMOvie Fee:    $%d\nLate Fee Per Day:    $%d\nTotal Late Days:    %d \nTotal Fee To Be Paid:    $%d\n\n",this.GetTitle(),this.fee,this.latefeePerday,day,this.fee+(this.latefeePerday*day));
        
    }
    
}
