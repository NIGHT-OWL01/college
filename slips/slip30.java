//Slip 30 A) Write a java program to accept a number from a user, if it is zero then throw user defined Exception “Number is Zero”. If it is non-numeric then generate an error “Number is Invalid” otherwise check whether it is palindrome or not.

//Answer :

import java.io.*;

class Numberiszero extends Exception{}

class Slip30A{

    public static void main( String args[]){

        int r,sum=0,temp; 

        int n;

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter Number : ");

            n = Integer.parseInt(dr.readLine());

            if(n==0){

                throw new Numberiszero();

            }else{

                temp=n; 

                while(n>0){ 

                    r=n%10;

                    sum=(sum*10)+r; 

                    n=n/10; 

                } 

                if(temp==sum){

                    System.out.println("Palindrome Number "); 

                }else{

                    System.out.println("Not Palindrome");

                }

            }

        } catch (Numberiszero nz) {

            System.out.println("Number is Zero");

        }

        catch (NumberFormatException e){

            System.out.println("Number is Invalid");

        }

        catch (Exception e){}

    }

}


//Slip 30 B) Write a java program to design a following GUI (Use Swing).

//Answer :

import javax.swing.*;

import java.awt.*;



class Slip30B extends JFrame{



    JLabel l1,l2,l3,l4,l5,l6;

    JTextField t1,t2,t3,t4;

    JButton b1,b2;

    JRadioButton rb1, rb2;

    JCheckBox ch1,ch2,ch3;

    Panel p1,p2,p3,p4,p5,p6;

    GridLayout g1,g2,g3,g4,g5,g6,g7;

    JFrame jf;



    public Slip30B(){

        jf = new JFrame();



        l1 = new JLabel("",JLabel.CENTER);

        l1.setText("<HTML><U>Personal Information</U></HTML>");

        p1 = new Panel();

        g1 = new GridLayout(1,1);

        p1.setLayout(g1);

        p1.add(l1);

        l1.setFont( new Font("Times New Roman",Font.BOLD,20));



        l2 = new JLabel(" First Name : ");

        t1 = new JTextField(30);

        l3 = new JLabel(" Last Name : ");

        t2 = new JTextField(30);

        p2 = new Panel();

        g2 = new GridLayout(2,1);

        p2.setLayout(g2);

        p2.add(l2);

        p2.add(t1);

        p2.add(l3);

        p2.add(t2);



        l4 = new JLabel(" Address : ");

        t3 = new JTextField(30);

        l5 = new JLabel(" Mobile Number : ");

        t4 = new JTextField(30);

        p3 = new Panel();

        g3 = new GridLayout(2,1);

        p3.setLayout(g3);

        p3.add(l4);

        p3.add(t3);

        p3.add(l5);

        p3.add(t4);



        l5 = new JLabel(" Gender ");

        rb1 = new JRadioButton("Male");

        rb2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();

        bg.add(rb1);

        bg.add(rb2);

        p4 = new Panel();

        g4 = new GridLayout(1,2);

        p4.setLayout(g4);

        p4.add(l5);

        p4.add(rb1);

        p4.add(rb2);



        l6 = new JLabel(" Your Interests");

        ch1 =  new JCheckBox("Comuter");

        ch2 =  new JCheckBox("Sport");

        ch3 =  new JCheckBox("Music");



        p5 = new Panel();

        g5 = new GridLayout(1,2);

        p5.setLayout(g5);

        p5.add(l6);

        p5.add(ch1);

        p5.add(ch2);

        p5.add(ch3);



       

        b1 = new JButton("Submit");

        b2 = new JButton("Reset");



        p6 = new Panel();

        g6 = new GridLayout(1,1,400,10);

        p6.add(b1);

        p6.add(b2);



        this.setSize(500,250);

        this.setVisible(true);



        g7 = new GridLayout(6,1);

        this.setLayout(g7);

        this.add(p1);

        this.add(p2);

        this.add(p3);

        this.add(p4);

        this.add(p5);

        this.add(p6);

    }

    public static void main(String args[]){

        new Slip30B();

    }


}