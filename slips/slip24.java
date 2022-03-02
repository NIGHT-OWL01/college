//Slip 24 A) Write a java program to count number of digits, spaces and characters from a file.

//Answer :

import java.io.*;

class Slip24A{

    public static void main(String args[]) throws IOException{

        FileReader fr = new FileReader("a.txt");

        FileWriter fw = new FileWriter("b.txt");

        int c;

        int letter=0;

        int space=0;

        int num=0;

        int other=0;

 

        while ((c=fr.read())!=-1){

          if(Character.isDigit(c)){

            num ++;

          }else if(Character.isLetter(c)){

            letter++;

          }else if(Character.isSpaceChar(c)){

            space++;

          }else{

              other ++;

          }

        }

        fw.write("Numbers : " + num + "\nLetters : "+letter+"\nSpace : "+space+"\nSpecial Characters : "+other);

        fr.close();

        fw.close();

    }

}

//Slip 24 B) Create a package TYBBACA with two classes as class Student (Rno, SName, Per) with a method disp() to display details of N Students and class Teacher (TID, TName, Subject) with a method disp() to display the details of teacher who is teaching Java subject. (Make use of finalize() method and array of Object)

//Answer :

import TYBBACA.*;

import java.io.*;

 

public class Slip24B {

    public static void main(String args[])throws Exception{

        int r,n1,n2,t;

        String snm, tnm, sub;

        float per;

        DataInputStream dr = new DataInputStream(System.in);

        System.out.println("How Many Student's record You Want :");

        n1 = Integer.parseInt(dr.readLine());

        System.out.println("How Many Teacher's record You Want :");

        n2 = Integer.parseInt(dr.readLine());

        Student s1[] = new Student[n1];

        Teacher t1[] = new Teacher[n2];

        System.out.println("Enter Student Details");

        for (int i=0; i<n1; i++){

            System.out.println("Enter roll no, Student name and Percentage");

            r = Integer.parseInt(dr.readLine());

            snm=dr.readLine();

            per=Float.parseFloat(dr.readLine());

            s1[i] = new Student(r,snm,per);

        }

        System.out.println("Enter Teacher Details");

        for (int j=0; j<n2; j++){

            System.out.println("Enter Teacher id , Teacher name and Subject");

            t = Integer.parseInt(dr.readLine());

            tnm=dr.readLine();

            sub=dr.readLine();

            t1[j] = new Teacher(t,tnm,sub);

        }

        System.out.println("Student Details");

        for (int i=0; i<n1; i++){

            ((Student) s1[i]).disp();

        }

        System.out.println("Teacher Details");

        String str ="java";

        for (int j=0; j<n2; j++){

            if(str.equals(t1[j].sub)){

                t1[j].disp();

            }

        }

    }

}