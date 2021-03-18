import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo1 extends Enemigo
{
 private int speed ;
    private int time;
    private int timer;
    public boolean isSeeing = true;
    public int timerAnm;
    private int scrolled;
    //GreenfootSound shot = new GreenfootSound("pistol.wav");
    
    public enemigo1(){
        timer = timer = timerAnm = 0;
        speed = -1;
    }
    public void act() 
    {
        time++;
        moveAround();
        fireProyectile();
        runTimer();
        animate();
    }
    
    public void moveAround(){
        if(time<120){
            setLocation(getX() + speed, getY());
        }
        else{
            isSeeing = !isSeeing;
            speed = -speed;
            time = 0;
        }
    }
    
    public void fireProyectile(){
        timer++;
        scrolled = ((Scrolling)getWorld()).getUnivX(getX());
        if(timer>110){
            ((Scrolling)getWorld()).addObject(new Proyectile(isSeeing), scrolled, getY(), true);
            //getWorld().addObject(new Proyectile(isSeeing), getX()+6,getY());
            timer = 0;
            //shot.play();
        }
    }

    public void runTimer()
    {
        timerAnm++;
        if(timerAnm == 30)
            timerAnm = 0;
    }
    
    private void animate()
    {
        if(true)
        {
            
            if(timerAnm == 0){               
                if(isSeeing)
                    setImage("soldierGunWalk1.png");
                else
                    setImage("soldierGunWalk1D.png");
            }
            else if(timerAnm == 5){
                if(isSeeing)
                    setImage("soldierGunWalk2.png");
                else
                    setImage("soldierGunWalk2D.png");
            }
            else if(timerAnm == 10){
                if(isSeeing)
                    setImage("soldierGunWalk3.png");
                else
                    setImage("soldierGunWalk3D.png");
            }
            else if(timerAnm == 15){
                if(isSeeing)
                    setImage("soldierGunWalk4.png");
                else
                    setImage("soldierGunWalk4D.png");
            }
            else if(timerAnm == 20){
                if(isSeeing)
                    setImage("soldierGunWalk5.png");
                else
                    setImage("soldierGunWalk5D.png");
            }

        }
    } 
}
