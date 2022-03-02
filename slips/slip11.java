/*Slip 11 A) Write a menu driven java program using command line arguments for the following:

1. Addition

2. Subtraction

3. Multiplication

4. Division.

Answer :
*/
import java.io.DataInputStream;

public class Slip11A {

    public static void main(String args[]){

        int a,b,n;

System.out.println("Enter 1 : Additon" + '\n' + "Enter 2 : Substraction" + '\n' + "Enter 3 : Multiplication" + '\n' + "Enter 4 : Division");

        DataInputStream dr = new DataInputStream(System.in);

        try {

            a = Integer.parseInt(args[0]);

            b = Integer.parseInt(args[1]);

            System.out.print("Enter Number : ");

            n = Integer.parseInt(dr.readLine());

            switch(n){

                case 1:  

                System.out.println(a + " + " + b + " = " + (a+b));

                break;

                case 2:  

                System.out.println(a + " - " + b + " = " + (a-b));

                break;

                case 3:  

                System.out.println(a + " * " + b + " = " + (a*b));

                break;

                case 4:  

                System.out.println(a + " / " + b + " = " + (a/b));

                break;

            }

        } catch (Exception e) {}

    }

}


//Slip 11 B) Write an applet application to display Table lamp. The color of lamp should get change randomly.


import java.awt.*;

import java.applet.*;

 

public class Slip11B extends Applet{

    public float R,G,B;

    Graphics gl;

    public void init(){

        repaint();

    }

    public void paint(Graphics g){

        R = (float)Math.random();

        G = (float)Math.random();

        B = (float)Math.random();

        Color cl = new Color(R,G,B);

 

            g.drawRect(0,250,290,290);

            g.drawLine(125,250,125,160);

            g.drawLine(175,250,175,160);

           

            g.drawArc(85,157,130,50,-65,312);

            g.drawArc(85,87,130,50,62,58);

           

            g.drawLine(85,177,119,89);

            g.drawLine(215,177,181,89);

            g.setColor(cl);

            g.fillArc(78,120,40,40,63,-174);

            g.fillOval(120,96,40,40);

            g.fillArc(173,100,40,40,110,180);

    }

}

 

/*

<applet code="Slip11B.class" width="300" height="300">

</applet>


*/