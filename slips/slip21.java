//Slip 21 A) Write a java program to display each word from a file in reverse order.

//Answer :

import java.io.*;

import java.util.Scanner;

class Slip21A{

    public static void main(String args[]) throws IOException{

        FileReader fr = new FileReader("a.txt");

        FileWriter fw = new FileWriter("b.txt");

        try (Scanner dr = new Scanner(fr)) {

            while(dr.hasNextLine()){

                String s=dr.nextLine();

                StringBuffer buffer = new StringBuffer(s);

                buffer=buffer.reverse();

                String ans = buffer.toString();

                fw.write(ans);

            }

        }catch(Exception e){

            System.out.print("Error...!");

        }

        fr.close();

        fw.close();

    }

}




//Slip 21 B) Create a hash table containing city name & STD code. Display the details of the hash table. Also search for a specific city and display STD code of that city.

//Answer :

import java.util.*;

import java.io.*;

 

public class Slip21B {

    public static void main(String args[]){

        Hashtable h1=new Hashtable<>();

        Enumeration en;

        int i,n,std,val,max=0;

        String nm, cname, str, s=null;

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter the Now Many Record You Want : ");

            n = Integer.parseInt(dr.readLine());

            System.out.print("Enter the City Name & STD Code : ");

            for(i=0; i<n; i++){

                cname = dr.readLine();

                std = Integer.parseInt(dr.readLine());

                h1.put(cname,std);

            }

            System.out.print("Enter city name to search : ");

            nm = dr.readLine();

            en=h1.keys();

            while(en.hasMoreElements()){

                str=(String)en.nextElement();

                val=(Integer)h1.get(str);

                if(str.equals(nm)){

                    System.out.print("STD Code : " + val);

                }

            }

        } catch (Exception e) {}

    }   

}

