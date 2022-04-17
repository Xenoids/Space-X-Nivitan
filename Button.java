import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean mousehover;
    private int MAX = 255;
    static boolean changes=false;
    int count=0;
    
    // untuk semua button hover
    public void checkhover()
    {
        if(Greenfoot.mouseMoved(null))
        {
            //mousehover = Greenfoot.mouseMoved(this);
            if(mousehover!=Greenfoot.mouseMoved(this))
            {
                mousehover=!mousehover;
                if(mousehover)
                {
                    Greenfoot.playSound("HoverSFX.wav");
                }
            }
        }
    
        if(mousehover)
        {
            adjustTrans(MAX/2);
        }
        else
        {
            adjustTrans(MAX);
        }
    }
    
    public void adjustTrans(int trans)
    {
        GreenfootImage tempimg = getImage();
        tempimg.setTransparency(trans);
        setImage(tempimg);
    }
}
