//Slip 15 A) Write a java program to search given name into the array, if it is found then display its index otherwise display appropriate message.

import java.io.DataInputStream;

class Slip15A{

    public static void main(String args[]){

        String arr[] = {"saurabh", "Sapkal", "Mahesh","priya"};

        int i,n=0;

        boolean a=false;

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter String : ");

            String s= dr.readLine();

            for(i = 0; i < arr.length; i++)

            {

                if(arr[i].equals(s))

                {

                    n = i;

                    a = true;

                    break;

                }

            }

            if(a){

                System.out.println("arr" + "["+ i + "]");

            }else{

                System.out.println("not Found");

            }

        } catch (Exception e) {}

    }

}


//Slip 15 B) Write an applet application to display smiley face.

import java.applet.Applet;

import java.awt.Graphics;

public class Slip15B extends Applet{

 

public void paint(Graphics g){

    g.drawOval(80, 70, 150, 150);

    g.fillOval(120, 120, 15, 15);

    g.fillOval(170, 120, 15, 15);

    g.drawArc(130, 180, 50, 20, 180, 180);

}

 

}

/*

<applet code="Slip15B.class" width="300" height="300">

</applet>

*/