import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainmenu extends World
{
    static GreenfootSound lagu = new GreenfootSound("spacemusic.wav");
    /**
     * Constructor for objects of class mainmenu.
     * 
     */
    public mainmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    
    private void prepare ()
    {
        Play p = new Play();
        Info i = new Info();
        Credits c = new Credits();
        addObject(p,getWidth()/2,300);
        addObject(i,getWidth()/2,450);
        addObject(c,getWidth()/2,600);
    }
    
    public void started()
    {
        lagu.setVolume(30);
        lagu.playLoop();
    }
    
    public void stopped()
    {
        lagu.stop();
        Space.bgm.stop();
    }
}
