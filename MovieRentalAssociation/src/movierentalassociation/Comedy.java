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
public class Comedy extends Movie{
    private int fee;
    private double latefeeperday=2.50;
    public Comedy(int id,String title,int fe)
    {
        super(id,title);
        this.fee=fe;
    }
    @Override
    public void CalculateLateFee()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Total Late Days : ");
        int day=input.nextInt();
        System.out.printf("======: Comedy Movie :======\nTitle:    %s\nMOvie Fee:    $%d\nLate Fee Per Day:     $%f\nTotal Late Days:    %d \nTotal Fee To Be Paid:    $%f\n\n",this.GetTitle(),this.fee,this.latefeeperday,day,this.fee+(this.latefeeperday*day));
    }
    
    
}
