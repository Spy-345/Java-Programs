
// Project ->  Make It Like mac Calculator and add Good colors and ui.Add Hexadecimal and Octal functions.

import javax.swing.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener                    
{
    public JFrame mainframe;  //JFrame Class(from package) reference to create frame 
    public JButton bAdd,bSub,bMult,bDiv; // Button class References to create buttons
    public JTextField TextF1,TextF2;  //TextField class References to create Text Fields
    public JLabel Label1;
    Integer Num1, Num2;

    public Calculator(int Height, int Width, String Title)
    {
        mainframe = new JFrame(Title);
        mainframe.setSize(Width, Height);

        mainframe.addWindowListener(this);

        bbAdd = new JButton("Add");
        bSub = new JButton("Sub");
        bMult = new JButton("Mult");
        bDiv = new JButton("Div");

        bAdd.setBounds(25,280,80,40); //x-cord,y-cord,Width,Height
        bSub.setBounds(115,280,80,40);
        bMult.setBounds(205,280,80,40); 
        bDiv.setBounds(295,280,80,40);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMult.addActionListener(this);
        bDiv.addActionListener(this);


        TextF1 = new JTextField();
        TextF2 = new JTextField();

        TextF1.setBounds(70,100,100,40);
        TextF2.setBounds(210,100,100,40);

        mainframe.add(bAdd);
        mainframe.add(bSub);
        mainframe.add(bMult);
        mainframe.add(bDiv);

        mainframe.add(TextF1);
        mainframe.add(TextF2);

        Label1 = new JLabel();
        Label1.setBounds(150,30,150,40);


        mainframe.add(Label1);

        mainframe.setLayout(null);
        mainframe.setVisible(true);

    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {

        try
        {
            Num1 = Integer.parseInt(TextF1.getText());
            Num1 = Integer.parseInt(TextF2.getText());

            if(obj.getSource() == bAdd)
            {
                Label1.setText("Addition is : " + (Num1 + Num1));
            }
            else if(obj.getSource() == bSub)
            {
                Label1.setText("Substraction is : " + (Num1 - Num1));
            }
            else if (obj.getSource() == bMult)
            {
                Label1.setText("Multiplication is : " + (Num1 * Num1));
            }
            else if (obj.getSource() == bDiv)
            {
                Label1.setText("Division is : " + (Num1 / Num1));
            }
           

        }
        catch(Exception eobj)
        {

        }
    }

}



class MarvellousCalculator
{
    public static void main(String arg[])
    {
        Calculator cobj = new Calculator(500, 400, "Marvellous Calculator");
    }
}