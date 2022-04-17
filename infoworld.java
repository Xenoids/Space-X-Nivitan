import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class infoworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infoworld extends World
{

    /**
     * Constructor for objects of class infoworld.
     * 
     */
    public infoworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    
    public void prepare()
    {
        Back b = new Back();
        addObject(b,50,50);
    }
    
    public void started()
    {
        mainmenu.lagu.setVolume(50);
        mainmenu.lagu.playLoop();
    }
    
    public void stopped()
    {
        mainmenu.lagu.stop();
        Space.bgm.stop();
    }
}
