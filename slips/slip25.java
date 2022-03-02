//Slip 25 A) Write a java program to check whether given string is palindrome or not.

//Answer :

import java.io.DataInputStream;

public class Slip25A {

    public static void main(String args[]){

        int i=0,h=0;

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter String : ");

            String str = dr.readLine();

            int j= str.length()-1;

            while(i<j){

                if(str.charAt(i++) != str.charAt(j--)){

                   h = h + i ;

                }

            }

           if(h>0){

               System.out.println("String is not palindrome");

           }else{

                System.out.println("String is palindrome");

           }

        } catch (Exception e) {}

    }

}

/*
Slip 25 B) Create a package named Series having three different classes to print series:

i. Fibonacci series

ii. Cube of numbers

iii. Square of numbers Write a java program to generate ‘n’ terms of the above series.

Answer :
*/
import java.io.*;

import Series.*;



class Slip25B {

    public static void main(String args[])throws Exception{

        int n1,n2,n3;

        DataInputStream dr = new DataInputStream(System.in);

        System.out.print("Enter How Many fibonnacci series you want : ");

        n1=Integer.parseInt(dr.readLine());

        System.out.print("Enter How Many cube you want  : ");

        n2=Integer.parseInt(dr.readLine());

        System.out.print("Enter How Many Squares you want : ");

        n3=Integer.parseInt(dr.readLine());

        

        System.out.println("\nFibonacci Series ....");

        Fibo f1 = new Fibo();

        f1.fiboSeries(n1);



        System.out.println("\nCube Series ....");

        Cubes c1=new Cubes();

        c1.cubeSeries(n2);



        System.out.println("\nSquare Series ....");

        Square s1=new Square();

        s1.squareSeries(n3);

    }

}



//Create folder series



//Cubes.java



package Series;



public class Cubes {

    public void cubeSeries(int n){

        for(int i=1; i<=n; i++){

            int c=(i*i*i);

            System.out.print(c + " ");

        }

    }


}



//Fibo.java



package Series;



public class Fibo {

    public int f=0, s=1, i;

    public void fiboSeries(int nl){

        for(i=1; i<=nl; i++){

            System.out.print(f + " ");

            int n=f+s;

            f=s;

            s=n;

        }

    }

}



//Square.java



package Series;



public class Square {

    public void squareSeries(int n){

        for(int i=1; i<=n; i++){

            int c=(i*i);

            System.out.print(c +" ");

        }

    }

}

