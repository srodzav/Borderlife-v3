import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuAyuda extends World
{

    private int mx;
    private int my;
    public MenuAyuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }
    public void act(){
     MouseInfo mouse = Greenfoot.getMouseInfo();
     if(mouse!=null){
       mx = mouse.getX();
       my = mouse.getY();
       setBackground("Ayuda.jpg");
       if(mx>10 && my > 10 && mx<60 && my < 60){
             setBackground("AyudaAtras.jpg");
             if(Greenfoot.mouseClicked(this)){
               introMenu ip = new introMenu();
               Greenfoot.setWorld(ip); 
             }
       }
     }   
    }
}
