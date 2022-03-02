//Slip 13 A) Write a java program to accept ‘n’ integers from the user & store them in an ArrayList collection. Display the elements of ArrayList collection in reverse order.

import java.io.*;

class Slip13A{

    public static void main(String args[]){

        String temp=null;

        int i,j,n;

        DataInputStream dr = new DataInputStream(System.in);

        try{

            System.out.print("Enter How May Element You Want = ");

            n = Integer.parseInt(dr.readLine());

            String name[]= new String[n];

            for(i=0; i<n; i++){

                System.out.print("Enter " + (i+1) + " String = ");

                name[i] = dr.readLine();

            }

            System.out.print("After Sorting = ");

            for(i=n-1; i>=0; i--){

                System.out.print(name[i] + " ");

            }

        }catch(Exception e){}

    }

}




//Slip 13 B) Write a java program that asks the user name, and then greets the user by name. Before outputting the user's name, convert it to upper case letters. For example, if the user's name is Raj, then the program should respond "Hello, RAJ, nice to meet you!".


import java.io.DataInputStream;

class Slip13B {

    public static void main(String args[]){

        String str;

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter Username : ");

            str = dr.readLine();

            System.out.print("\"Hello, " + str.toUpperCase() + ", nice to meet you!\"");

        } catch (Exception e) {}

    }

}

