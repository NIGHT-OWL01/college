//Slip 26 A) Write a java program to display ASCII values of the characters from a file.

//Answer :

import java.io.*;

class Slip26A{

    public static void main(String args[]) throws IOException{

        char ch;

        FileReader fr = new FileReader("a.txt");

        int c;

        while ((c=fr.read())!=-1){

            ch=(char)c;

            if(Character.isDigit(ch)==false && (Character.isSpaceChar(c)==false)){

                System.out.println("ASCII "+ch+" : "+ c);

            }

        }

        fr.close();

    }

}


//Slip 26 B) Write a java program using applet to draw Temple.

//Answer :

import java.applet.Applet;

import java.awt.Color;

import java.awt.Graphics;

public class Slip26B extends Applet{

 

    public void init() {

        setBackground(Color.BLACK);

    }

public void paint(Graphics g){

    g.setColor(Color.WHITE);

    g.drawRect(100, 150, 90, 120);

    g.drawRect(130, 230, 20, 40);

    g.drawLine(150, 100, 100, 150);

    g.drawLine(150, 100, 190, 150);

    g.drawLine(150, 50, 150, 100);

    g.setColor(Color.ORANGE);

    g.drawRect(150, 50, 20, 20);

}

 

}

/*

<applet code="Slip26B.class" width="300" height="300">

</applet>

*/