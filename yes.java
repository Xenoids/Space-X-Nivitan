import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class yes extends Button
{
    /**
     * Act - do whatever the yes wants to do. This method is called whenever
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
        }
    }
}
