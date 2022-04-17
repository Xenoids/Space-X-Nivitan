import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ufo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ufo extends Actor
{
    /**
     * Act - do whatever the ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delay=40;
    private int jeda=0;
    
    public void move()
    {
        setLocation(getX(),getY()+1);
        if(getY()>500)
        {
            setLocation(Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(50));
        }
    }
    
    public void act()
    {
        // Add your action code here.
        move();
        if(delay==0)
        {
            delay=40;
        }
        if(jeda>0)
        {
            jeda--;
        }
        if(jeda==1)
        {
            getWorld().addObject(new laser(),getX(),getY()+50);
        }
        if(jeda==0)
        {
            jeda=150;
        }
    }
}
