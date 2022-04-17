import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
{
    //public Back()
    //{
        //GreenfootImage myImage = getImage();
        //myImage.scale(150,100);
        //setImage(myImage);
    //}
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
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
        }
        if(Button.changes=true)
        {
            if(Greenfoot.mouseClicked(this)) 
            {   
                Space.bgm.stop();
                mainmenu.lagu.playLoop();
                mainmenu.lagu.setVolume(30);
            }
            Button.changes=false;
        }
    }
}
