import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no extends Button
{
    /**
     * Act - do whatever the no wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        checkhover();
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("ClickSFX.wav");
            Greenfoot.setWorld(new mainmenu());
            Space.bgm.stop();
            mainmenu.lagu.setVolume(30);
            mainmenu.lagu.playLoop();
        }
    }
}
