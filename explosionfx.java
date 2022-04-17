import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class explosionfx here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explosionfx extends Actor
{
    private int delay=10;
    /**
     * Act - do whatever the explosionfx wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(delay>0)
        {
            delay--;
        }
        else
        {
            getWorld().removeObject(this);
        }
    }
}
