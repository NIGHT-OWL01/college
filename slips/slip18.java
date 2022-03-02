//Slip 18 A) Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading)

//Answer :

import java.util.*;

class AreaCalculate{

 

    void area(int r){

        System.out.println("Area of Cirlce = " + (3.14*r*r));

    }

 

    float area(int b, float h){

        return b*h/2;

    }

 

    double area(Float l, Float db){

        return l+db;

    }

   

}

class Slip18A {

    public static void main(String args[]){

        int r, b, l, db;

        float h;

        Scanner br = new Scanner(System.in);

        System.out.println("Enter the radius, base, height, length and breadth : ");

        r = br.nextInt();

        b = br.nextInt();

        h = br.nextFloat();

        l = br.nextInt();

        db = br.nextInt();

        AreaCalculate ac = new AreaCalculate();

        ac.area(r);

        System.out.println("Area of Triangle = " +ac.area(b,h));

        System.out.println("Area of Rectange = " +ac.area(l,db));

 

    }

}



//Slip 18 B) Write a java program to copy the data from one file into another file, while copying change the case of characters in target file and replaces all digits by ‘*’ symbol.

//Answer :

import java.io.*;

class Slip18B{

    public static void main(String args[]) throws IOException{

        FileReader fr = new FileReader("a.txt");

        FileWriter fw = new FileWriter("b.txt");

        int c;

        while ((c=fr.read())!=-1){

          if(Character.isDigit(c)==false){

              if(Character.isUpperCase(c)){

                fw.write(Character.toLowerCase(c));

              }else if(Character.isLowerCase(c)){

                fw.write(Character.toUpperCase(c));

              }

          }else{

              fw.write('*');

          }

        }

        fr.close();

        fw.close();

    }

}