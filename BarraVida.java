import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarraVida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarraVida extends Armamento
{
    private boolean isJumping = false;
    sold1 s1 = new sold1();
    
    public BarraVida(){
       this(120, 80);
    }
    public BarraVida(int width, int height){
      GreenfootImage image = new GreenfootImage("vida.png");
      image.scale(width, height);
      setImage(image);
 
    }
    public void act() 
    {   
        s1.runTimer();
        //checkRadioactinaUp();
    }
    
    public void checkVidaUp(){
      s1.jump();
      System.out.println(s1.timer);
      if(s1.timer == 10){
       setImage("beep.png");
      }
    }   
}
