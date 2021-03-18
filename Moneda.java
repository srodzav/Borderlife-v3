import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moneda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moneda extends Articulos
{
 public boolean Up = false;
    private int desplaza=1;
    public int ref=5;
    GreenfootSound coin = new GreenfootSound("Diamante.mp3");

    public Moneda(){
        this(35,55);
    }

    public Moneda(int width, int height){
        //GreenfootImage image = getImage();
        GreenfootImage image = new GreenfootImage("moneda.png");
        image.scale(width, height);
        setImage(image);

    }

    public void act() 
    {
        checkForCollisions();
    }

    public void checkForCollisions() {       
        Actor sold1 = getOneIntersectingObject(sold1.class);
        Actor sold2 = getOneIntersectingObject(sold1.class);
        if( sold1 != null || sold2 != null) {
            if(getWorld() instanceof World1){
                 World1 mundo = (World1)getWorld();
                 //VidaS Health = mundo.getHealthBar();
                //Health.recoveryHealth();
            }
            coin.play();
            getWorld().removeObject(this);
        }
    }
}
