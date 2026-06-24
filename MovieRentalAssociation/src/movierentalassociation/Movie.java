/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movierentalassociation;

/**
 *
 * @author dcui
 */
public class Movie {
    private int idno;
    private String title;
    public Movie()
    {
    }
    public Movie(int id,String title)
    {
        this.idno=id;
        this.title=title;
    }
    public void setIDno(int id)
    {
        this.idno=id;
    }
    public void setTitle(String t)
    {
        this.title=t;
    }
    public int GetID()
    {
        return this.idno;
    }
    public String GetTitle()
    {
        return this.title;
    }
    public void CalculateLateFee()
    {
    }
            
    
}
