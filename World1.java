import greenfoot.*;
    
public class World1 extends Scrolling
{

      private BarraVida hudProteactina;
    private BarraNivel hudRadioactina;
    private VidaS ProtectinaBar;
    private RadBar RadioactinaBar;
    public GreenfootSound music; 
    public int act;
    

    public World1(int act)
    {    
        super(600, 400, 1, 4000); // Construcctor para el scroll, (largo,ancho,1,tamaño del mundo)
        GreenfootImage bg = new GreenfootImage("backgroundScroll.jpg");
        music=new GreenfootSound("World.mp3");
        music.play();
        setScrollingBackground(bg);
        buildWorld(act);
        //music.stop();
   
    }
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
        // en la siguiente declaración, el actor se coloca en el centro de la ventana
        if(act==2 || act==4){
            addMainActor(new sold1(), 250, 300, 200,400); // los parametros son para que el actor se coloque en el lugar correcto
            // y con esta linea para moverlo al lado izquierdo
            mainActor.setLocation(100, 250);
            addObject(new Meta(act,90,90), 3950, 285);
           

        }else{
            addMainActor(new sold1(), 250, 300, 200,400); // los parametros son para que el actor se coloque en el lugar correcto
            // y con esta linea para moverlo al lado izquierdo
            mainActor.setLocation(100, 290);
            addObject(new Meta(act,90,90), 3950, 285);
        }

        //aqui se agregan los objetos al mundo, (actor/objeto, x,y)
        addObject(new enemigo1(), 650, 290);
        addObject(new enemigo1(), 1250, 290);
        addObject(new enemigo1(), 1850, 290);
        addObject(new enemigo1(), 2450, 290);
        addObject(new enemigo1(), 3050, 290);
         addObject(new plataforma(), 230, 250);
        addObject(new plataforma(), 340, 130);
        addObject(new plataforma(), 450, 250);
         addObject(new Radioactina(), 340, 60);//1
        addObject(new Radioactina(), 340, 280);//2
        //addObject(new Column(), 800, 275);
        addObject(new enemigo1(), 1130, 280);
        //addObject(new Column(), 1280, 275);
        addObject(new plataforma(), 1360, 210);
        addObject(new plataforma(), 1440, 210);
        addObject(new plataforma(), 1520, 210);
         addObject(new Radioactina(), 340, 60);//1
        addObject(new enemigo1(), 1500, 155);
        addObject(new plataforma(), 1960, 260);
        addObject(new plataforma(), 2050, 260);
        addObject(new plataforma(), 2140, 260);
         addObject(new Radioactina(), 340, 60);//1
        addObject(new enemigo1(), 2100, 200);
        addObject(new plataforma(), 2280, 190);
        addObject(new plataforma(), 2420, 130);
        addObject(new plataforma(), 2740, 210);
        addObject(new plataforma(), 2830, 210);
        addObject(new plataforma(), 2920, 210);
        addObject(new enemigo1(), 2860, 150);
        addObject(new Radioactina(), 340, 60);//1
        //addObject(new Column(), 3200, 275);
        addObject(new plataforma(), 3310, 130);
        addObject(new plataforma(), 3400, 130);
        addObject(new plataforma(), 3490, 130);
        addObject(new Radioactina(), 340, 60);//1
        //addObject(new Column(), 3600, 275);
        addObject(new enemigo1(), 3450, 280);
        addHudScore(); //Agrega el hud del juego, vida y coleccionables
  
    }

   public VidaS getHealthBar(){
        return ProtectinaBar;
    }
    
    public RadBar getRadBar(){
        return RadioactinaBar;
    }
}
