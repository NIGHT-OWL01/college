//Slip 29 A) Write a java program to check whether given candidate is eligible for voting or not. Handle user defined as well as system defined Exception.

//Answer :

import java.io.*;

class NumOutRange extends Exception{}

class Slip29A{

    static int n;

    public static void main( String args[]){

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter Age : ");

            n = Integer.parseInt(dr.readLine());

            if(n<18){

                throw new NumOutRange();

            }else{

                System.out.print("You Are eligible For Voting :) ");

            }

        } catch (NumOutRange nz) {

            System.out.println("You Are Not eligible For Voting ....!");

        }

        catch (Exception e){}

    }

}


//Slip 29 B) Write a java program using Applet for bouncing ball. Ball should change its color for each bounce.

//Answer :

import java.applet.*;

import java.awt.*;



public class Slip29B extends Applet implements Runnable {

    Thread t = null;

    int x1 = 10;

    int y1 = 300;

    int flagx1, flagy1;

    int R, G, B;



    public void start() {

        t = new Thread(this);

        t.start();

    }



    public void color(){

        R = (int) (Math.random() * 256);

        G = (int) (Math.random() * 256);

        B = (int) (Math.random() * 256);

    }

    public void run() {

        for (;;) {

            try {

                repaint();

                if (y1 <= 50) {

                    flagx1 = 0;

                    color();

                } else if (y1 >= 300) {

                    flagx1 = 1;

                    color();

                }

                if (x1 <= 10) {

                    flagy1 = 0;

                    color();

                } else if (x1 >= 400) {

                    flagy1 = 1;

                    color();

                }

                Thread.sleep(10);

            } catch (InterruptedException e) {

            }

        }

    }



    public void paint(Graphics g) {

        Color color = new Color(R, G, B);

        g.setColor(color);

        g.fillOval(x1, y1, 20, 20);

        if (flagx1 == 1)

            y1 -= 2;

        else if (flagx1 == 0)

            y1 += 2;

        if (flagy1 == 0)

            x1 += 4;

        else if (flagy1 == 1)

            x1 -= 4;

    }

}



/*

 * <applet code="Slip29B.class" width="420" height="320">

 * </applet>

 */

