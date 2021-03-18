import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuCreditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuCreditos extends World
{
  private int mx;
    private int my;
    public MenuCreditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }
    public void act(){
     MouseInfo mouse = Greenfoot.getMouseInfo();
     if(mouse!=null){
       mx = mouse.getX();
       my = mouse.getY();
       setBackground("Creditos.jpg");
       if(mx>10 && my > 10 && mx<60 && my < 60){
             setBackground("CreditosAtras.jpg");
             if(Greenfoot.mouseClicked(this)){
               introMenu ip = new introMenu();
               Greenfoot.setWorld(ip); 
             }
       }
     }   
    }
    
}
