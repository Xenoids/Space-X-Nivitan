import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void move()
    {
        setLocation(getX(),getY()+5);
        if(getY()>690)
        {
            getWorld().removeObject(this);
        }
        else
        {
            checkhit();
        }
    }
    
    public void checkhit()
    {
        if(isTouching(Rocket.class))
        {
            getWorld().addObject(new explosionfx(),getX(),getY()+100);
            Space s=(Space)getWorld();
            s.updateHealth(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("ExplosionSFX.wav");
        }
    }
    
    public void act()
    {
        // Add your action code here.
        move();
    }
}
