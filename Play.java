import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    public void act()
    {
        // Add your action code here.
        checkhover();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("ClickSFX.wav");
            Greenfoot.setWorld(new Space());
            mainmenu.lagu.stop();
            Space.bgm.setVolume(30);
            Space.bgm.playLoop();
        }
    }

}
