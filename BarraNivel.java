import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarraNivel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarraNivel extends Armamento
{
     private boolean isJumping = false;
    sold1 cikar = new sold1();
    
    public BarraNivel(){
       this(120, 80);
    }
    public BarraNivel(int width, int height){
      GreenfootImage image = new GreenfootImage("BarraRadioactina1.png");
      image.scale(width, height);
      setImage(image);
 
    }
    public void act() 
    {   
        cikar.runTimer();
        //checkRadioactinaUp();
    }
    
    public void checkRadioactinaUp(){
      cikar.jump();
      System.out.println(cikar.timer);
      if(cikar.timer == 10){
       setImage("beep.png");
      }
    }
}
