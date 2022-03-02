//Slip 7 A) Write a java program to display Label with text “Dr. D Y Patil College”, background color Red and font size 20 on the frame.

//Answer :

import java.awt.*;

import java.awt.event.*;

 

public class Slip7A extends Frame{

    public void paint(Graphics g){

        Font f = new Font("Georgia",Font.PLAIN,20);

        g.setFont(f);

        g.drawString("Dr D Y Patil College", 50, 70);

        setBackground(Color.RED);

    }

    public static void main(String args[]){

        Slip7A sl = new Slip7A();

        sl.setVisible(true);

        sl.setSize(200,300);

    }


}

 


//Slip 7 B) Write a java program to accept details of ‘n’ cricket player (pid, pname, totalRuns, InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the details of player having maximum average. (Use Array of Object)


import java.io.*;

class Cricket{

    String Name;

    int Total_runs;

    int Notout;

    int Inning;

    float avg;

 

    void accept(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{

            System.out.print("Enter Name of Player : ");

            Name = br.readLine();

            System.out.print("Enter Total Runs of Player : ");

            Total_runs = Integer.parseInt(br.readLine());

            System.out.print("Enter Name of Tixes Not out : ");

            Notout = Integer.parseInt(br.readLine());

            System.out.print("Enter Innings played by players : ");

            Inning = Integer.parseInt(br.readLine());

        }catch (Exception e) {}

    }

    void average(){

        avg = Total_runs/Inning;

        System.out.println("Name : "+Name+"\nTotal runs : "+Total_runs+"\nAvergae : "+avg+"\nInning : "+ Inning);

    }

}

public class Slip7B {

    public static void main(String args[]){

        float max =0;

        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("How many Players : ");

            n = Integer.parseInt(br.readLine());

            Cricket ob1[]= new Cricket[n];

            for(int i=0; i<n; i++){

                ob1[i] = new Cricket();

                ob1[i].accept();

            }

            for(int i=0; i<n; i++){

                ob1[i].average();

            }

            for(int i=0; i<n; i++){

                if(max<ob1[i].avg){

                    max = ob1[i].avg;

                }

            }

            System.out.println("-----------------------------\nMax avg : "+max);

        } catch (Exception e) {

            System.out.println("Error........."+e);

        }

    }

}