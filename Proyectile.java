import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Proyectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Proyectile extends Proyectiles
{
 private int speed = -10;
    private boolean RigthLeft =true;
    private int deletePro;
    private int timeDeletePro;
    boolean touchingAct = false;
    
    public Proyectile(boolean AstSeeing){
        getImage().scale(20,20);
        RigthLeft = AstSeeing;
        deletePro = 30;
    }
    
    public void act() 
    {
        timeDeletePro++;
        moveProyectile(RigthLeft);
        checkForCollisions();
        removePro();
    }
    
    public void moveProyectile(boolean isSeeing){
        //shot.play();
        if(isSeeing) setLocation(getX() + speed, getY());
        if(!isSeeing) setLocation(getX() - speed, getY());
    }
    
    private void removePro()
    {
        if (timeDeletePro >= deletePro)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void checkForCollisions() {
       Actor s1 = getOneIntersectingObject(sold1.class);
       Actor s2 = getOneIntersectingObject(sold1.class);
       if( s1 != null || s2 != null ) {
           if(getWorld() instanceof World1){
              World1 mundo = (World1)getWorld();
              VidaS Health = mundo.getHealthBar();
              if(touchingAct==false){
                  Health.loseHealth();
                  touchingAct = true;
               /*if(Health.health<=0){
                   //GameOver
                }*/
               }
               getWorld().removeObject(this);
           }
           if(getWorld() instanceof mapa2){
              mapa2 mundo = (mapa2)getWorld();
              VidaS Health = mundo.getHealthBar();
              if(touchingAct==false){
                  Health.loseHealth();
                  touchingAct = true;
               /*if(Health.health<=0){
                   //GameOver
                }*/
               }
               getWorld().removeObject(this);
           }
           if(getWorld() instanceof World3){
              World3 mundo = (World3)getWorld();
              VidaS Health = mundo.getHealthBar();
              if(touchingAct==false){
                  Health.loseHealth();
                  touchingAct = true;
               /*if(Health.health<=0){
                   //GameOver
                //}*/
               }
               getWorld().removeObject(this);
           }
           //mundo.vidas.decrementar(); 
       }else{
           touchingAct = false;
       }
       //getWorld().addObject(new BarraAvance(),50,300);
       
       
       }  
}
