import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class introMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class introMenu extends World
{
    public int mx;
    public int my;
    public int act=0;
    public boolean flag=false;
    public introMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    public void act(){
        checkMouseMove();
    }

    public void checkMouseMove(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
            mx = mouse.getX();
            my = mouse.getY();
            setBackground("MainMenu.jpg");
            if(mx>250 && my > 150 && mx<350 && my < 250){
                setBackground("MainMenuPlayGrande.jpg");
                if(Greenfoot.mouseClicked(this)){
                    World1 world = new World1(act);
                    Greenfoot.setWorld(world); 
                }
            }else if(mx>75 && my > 175 && mx<180 && my < 285){
                setBackground("MainMenuCreditosGrande.jpg");
                if(Greenfoot.mouseClicked(this)){
                    MenuCreditos mc = new MenuCreditos();
                    Greenfoot.setWorld(mc); 
                }
            }else if(mx>400 && my > 180 && mx<505 && my < 290){
                setBackground("MainMenuAyudaGrande.jpg");

                if(Greenfoot.mouseClicked(this)){
                    MenuAyuda ma = new MenuAyuda();
                    Greenfoot.setWorld(ma); 
                }
            }
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
