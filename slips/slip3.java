//Slip 3 A) Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword)

//Answer :

import java.io.DataInputStream;

class Slip3A {

    static int temp;

    public static void main(String args[]){

        int n,r,sum=0;

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("Enter Number");

            n = Integer.parseInt(dr.readLine());

            temp=n;

            while(n>0){

                r = n%10;

                sum=sum+(r*r*r);

                n=n/10;

            }

            if(temp==sum){

                System.out.println(temp +  " Is Armstrong Number : ");

            }else{

                System.out.println(temp +  " Is Not Armstrong Number : ");

            }

        } catch (Exception e) {}

    }

} 

//Slip 3 B) Define an abstract class Shape with abstract methods area () and volume (). Derive abstract class Shape into two classes Cone and Cylinder. Write a java Program to calculate area and volume of Cone and Cylinder.(Use Super Keyword.)

//Answer :

import java.io.*;

 

abstract class Shape{

    int a,b;

    Shape(int x, int y){

        a = x;

        b = y;

    }

    abstract double area();

    abstract double volume();

}

class Cone extends Shape{

    Cone(int x, int y){

        super(x,y);

    }

    double area(){

        return (a*b*3.14);

    }

    double volume(){

        return (3.14*a*a*b);

    }

}

class Cylinder extends Shape{

 

    Cylinder(int x, int y){

        super(x,y);

    }

 

    double area(){

        return (2*3.14*a*b*3.14*a*b);

    }

 

    double volume(){

        return (3.14*a*a*b);

    }

 

}

 

class Slip3B{

    public static void main(String args[]) throws Exception{

        int r,h,s;

        DataInputStream dr = new DataInputStream(System.in);

        System.out.println("Enter Radius, Height and Side Values : ");

        r = Integer.parseInt(dr.readLine());

        h = Integer.parseInt(dr.readLine());

        s = Integer.parseInt(dr.readLine());

        Shape s1;

 

        Cone c1 = new Cone(r,s);

        s1=c1;

            System.out.println("Area of Cone  is : " + s1.area());

            System.out.println("Volume of Cone is : " +s1.volume());

 

        Cylinder cy = new Cylinder(r,h);

        s1 =cy;

            System.out.println("Area of Cylinder  is : " + s1.area());

            System.out.println("Area of Cylinder  is : " + s1.volume());

    }

}

