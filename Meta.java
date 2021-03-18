import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meta extends struct
{
  GreenfootSound coin = new GreenfootSound("Diamante.mp3");
    public GreenfootSound music = new GreenfootSound("World.mp3");
    public int hola=1;
    public int flag1;
    
    public Meta(int flag,int width, int height) 
    {  
        GreenfootImage image = new GreenfootImage("goal.png");
      image.scale(width, height);
      setImage(image);
        flag1=flag;
    } 
    
    public void act() 
    {
        checkForCollisions();
    } 
    
    public void checkForCollisions() {       
       Actor s1 = getOneIntersectingObject(sold1.class);
       Actor s2 = getOneIntersectingObject(sold1.class);
       if( s1 != null || s2 != null) {
           World1 world1 = new World1(flag1);
           world1.music.stop();
           if(getWorld() instanceof World1){
              world1.music.stop(); 
              mapa2 world2 = new mapa2(flag1);
              world2.music.stop();
              Greenfoot.setWorld(world2);
              world2.music.play();
           }
           if(getWorld() instanceof mapa2){
              World3 world3 = new World3(flag1);
              world3.music.stop();
              Greenfoot.setWorld(world3);
              world3.music.play();
           }
           if(getWorld() instanceof World3){
              GameOver GO = new GameOver();
              GO.act();
            }
           //music.stop();
       }
    }
}
