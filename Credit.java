import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends World
{

    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        show();
    }
    
    public void show()
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
