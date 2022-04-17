import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class star extends Actor
{
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        double dy=1;
        // Add your action code here.
        setLocation(getX(),(int)(getY()+dy));
        
        if(getY()<-600)
        {
            getWorld().removeObject(this);
            System.out.println("Delete Successful");
        }
    }
}
