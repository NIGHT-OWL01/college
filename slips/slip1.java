//Slip 1 A) Write a ‘java’ program to display characters from ‘A’ to ‘Z’.

//Answer :

class slip1A{

    public static void main(String args[]){

      for(int i=65; i<=90; i++){

        System.out.print( " " + Character. toString((char) i));

      }

    }

}

//Slip 1 B) Write a ‘java’ program to copy only non-numeric data from one file to another file.

//Answer :

import java.io.*;

class Slip1B{

    public static void main(String args[]) throws IOException{

        char ch;

        FileReader fr = new FileReader("a.txt");

        FileWriter fw = new FileWriter("b.txt");

        int c;

        while ((c=fr.read())!=-1){

            ch=(char)c;

          if(Character.isDigit(ch)==false){

              fw.write(c);

          }

        }

        fr.close();

        fw.close();

    }

}

