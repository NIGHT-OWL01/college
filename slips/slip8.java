//Slip 8 A) Define an Interface Shape with abstract method area(). Write a java program to calculate an area of Circle and Sphere.(use final keyword)

import java.util.*;

 

interface Shape{

    final float pi= 3.14F;

    double area();

}

class Circle implements Shape{

    int rad;

    Circle(int r){

        rad=r;

    }

    public double area(){

        return pi*rad*rad;

    }

}

class Sphere implements Shape{

     int rad;

     Sphere(int r){

         rad =r;

     }

     public double area(){

         return 4*pi*rad*rad;

     }

}

 

class Slip8A {

    public static void main(String args[]) throws Exception{

        int r;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius : ");

        r=sc.nextInt();

 

        Shape sh;

        Circle cl=new Circle(r);

        sh=cl;

        System.out.println("Area of Circle : " + sh.area());

 

        Sphere sp=new Sphere(r);

        sh=sp;

        System.out.println("Area of Sphare : "+sh.area());

    }

}




//Slip 8 B) Write a java program to display the files having extension .txt from a given directory.



import java.io.File;

class Slip8B {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Saurabh_Sapkal\\Desktop\\ln\\java\\Slips");

        String[] fileList = file.list();

        for(String str : fileList) {

            if(str.endsWith(".txt")){

                System.out.println(str);

            }

        }

    }

}