import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mapa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mapa2 extends Scrolling
{
    private BarraVida hudProteactina;
    private BarraNivel hudRadioactina;
    private VidaS ProtectinaBar;
    private RadBar RadioactinaBar;
    public int band;
    public GreenfootSound music = new GreenfootSound("World.mp3");
       
    public mapa2(int act)
    {    
        super(600, 400, 1, 4000); // Construcctor para el scroll, (largo,ancho,1,tamaño del mundo)
        GreenfootImage bg = new GreenfootImage("background2Scroll.jpg");
        setScrollingBackground(bg);
        buildWorld(act);
        music.play();
    }
    
        //Agrega todo lo que tiene el hub, es neesario tener esta funcion en todos los mundos
    public void addHudScore(){
        hudProteactina = new BarraVida();
        ProtectinaBar = new VidaS();
        hudRadioactina = new BarraNivel();
        RadioactinaBar = new RadBar();
        addObject(hudProteactina, 70, 40, false);
        addObject(ProtectinaBar, 86, 35, false);
        addObject(hudRadioactina, 530, 40, false);
        addObject(RadioactinaBar, 546, 35, false);
        RadioactinaBar.health = 0;
    }
        
    public void buildWorld(int act){
         if(act==2 || act==4){
          addMainActor(new sold1(), 250, 300, 200,400); // los parametros son para que el actor se coloque en el lugar correcto
          // y con esta linea para moverlo al lado izquierdo
          mainActor.setLocation(100, 250);
        }else{
          addMainActor(new sold1(), 250, 300, 200,400); // los parametros son para que el actor se coloque en el lugar correcto
          // y con esta linea para moverlo al lado izquierdo
          mainActor.setLocation(100, 290);
        }
            
        //aqui se agregan los objetos al mundo, (actor/objeto, x,y)
        addObject(new plataforma(), 250, 320);
        addObject(new plataforma(), 360, 270);
        addObject(new plataforma(), 470, 220);
        addObject(new Radioactina(), 600, 100);//1
        addObject(new Radioactina(), 650, 150);//2
        addObject(new enemigo1(), 1130, 280);
        addObject(new plataforma(), 1360, 230);
        addObject(new plataforma(), 1440, 230);
        addObject(new plataforma(), 1540, 120);
        addObject(new plataforma(), 1620, 120);
        addObject(new plataforma(), 1700, 120);
        addObject(new plataforma(), 1780, 120);
        addObject(new plataforma(), 1970, 120);
        addObject(new plataforma(), 2050, 120);
        addObject(new plataforma(), 2130, 120);
        addObject(new plataforma(), 2210, 120);
        addObject(new enemigo1(), 2050, 60);
        addObject(new Radioactina(), 1360, 280);//3
        addObject(new plataforma(), 1800, 230);
        addObject(new plataforma(), 1890, 230);
        addObject(new plataforma(), 1980, 230);
        addObject(new enemigo1(), 2020,172);
        addObject(new plataforma(), 2450, 230);
        addObject(new plataforma(), 2590, 170);
        addObject(new Radioactina(), 2560, 70);//4
        addObject(new plataforma(), 2740, 210);
        addObject(new plataforma(), 2830, 210);
        addObject(new plataforma(), 2920, 210);
        addObject(new enemigo1(), 2860, 150);
        addObject(new Radioactina(), 3260, 280);//5
        addObject(new plataforma(), 3310, 130);
        addObject(new Radioactina(), 3400, 70);//6*/
        addObject(new plataforma(), 3490, 130);
        //addObject(new Radioactina(), 3540, 280);//7
        addObject(new enemigo1(), 3700, 280);
        addObject(new Meta(act,100,100), 3950, 285);
        
        addHudScore(); //Agrega el hud del juego, vida y coleccionables
    }
    
    public VidaS getHealthBar(){
        return ProtectinaBar;
    }
    
    public RadBar getRadBar(){
        return RadioactinaBar;
    }
}