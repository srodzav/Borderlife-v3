import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private int enterDelayCount; //Ticks up to determine when the player can press enter - to keep them from accidentally flipping through two worlds
    GreenfootSound lost = new GreenfootSound("Lost.wav");
    GreenfootSound clicked = new GreenfootSound("Clicked.wav");
    Scrolling mainHp;
    GreenfootImage image;
    public int i=10;
    public GameOver()
    {    
        super(800, 450, 1);
        setBackground("GameOver.jpg");
        lost.play();
        Greenfoot.stop();
    }

    public void act()
    {
        //setBackground("Titulo.jpg");
        GameOver mc = new GameOver();
        Greenfoot.setWorld(mc); 
        /*mainHp.HP = 10;
        enterDelayCount ++;
        if(i>0){
            i--;
        }if(i==0){
            clicked.play();
            Greenfoot.setWorld(new Main_menu());
        }*/
        //setBackground("Titulo.jpg");
        //Greenfoot.stop();
        /*World world = getWorld();
        addObject(new GameOver(), world.getWidth()/2, world.getHeight()/2);
        world.removeObject(this);*/
    }
   
}
