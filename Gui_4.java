import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);

        fobj.setSize(500, 500);
        fobj.setVisible(true);

        fobj.addWindowListener(new MarvellousListener()); 

    }
}

class MarvellousListener extends WindowAdapter //Window Adapter is class which implements the WindowListener class and Provide Definations to them.
{
    public void windowClosing(WindowEvent obj)  //To close the Created Frame
    {
        System.exit(0); // System class Method to close the frame
    }
    
}

class Gui_4
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");
    }
}