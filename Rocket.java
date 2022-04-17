import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    GreenfootSound missilesfx = new GreenfootSound("MissileSFX.wav");
    int delay=30;
    private int health;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void move()
    {
        // Add your action code here.
        int dx=0;
        double sideSpeed = 5;
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()-5,getY());
            dx-=sideSpeed;
        }
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+5,getY());
            dx+=sideSpeed;
        }
        if(this.isAtEdge())
        {
            setLocation((int)(getX()-dx),getY());
        }
        if(delay==0)
        {
            if(Greenfoot.isKeyDown("W"))
            {
                getWorld().addObject(new missile(),getX(),getY());
                Greenfoot.playSound("MissileSFX.wav");
            }
            delay=30;
        }
    }
    
    public void act()
    {
        delay--;
        move();
    }
}
