//Slip 17 A) Write a java Program to accept ‘n’ no’s through command line and store only armstrong no’s into the array and display that array.

//Answer :

class Slip17A{

    public static void main(String args[]){

        int num,i,r,sum=0,temp,count=0;;

        num = args.length;

        int a[]= new int[num];

        int b[]= new int[10];

        for(i=0; i<num; i++){

           a[i] = Integer.parseInt(args[i]);

           sum =0;

           temp =a[i];

           while(a[i]!=0){

               r = a[i]%10;

               sum = sum+r*r*r;

               a[i] = a[i]/10;

           }

           if(temp==sum){

            b[count] = temp;

            count++;

           }

        }

        for(i=0; i<count; i++){

            System.out.print(b[i] + " ");

        }

    }

}


 



//Slip 17 B) Define a class Product (pid, pname, price, qty). Write a function to accept the product details, display it and calculate total amount. (use array of Objects)

//Answer :

import java.io.*;

 

class Product{

    String pname;

    int pid, qty;

    float price, total;

    void accept(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Enter the producat Name : ");

            pname=br.readLine();

            System.out.println("Enter pid, qty and price : ");

            pid = Integer.parseInt(br.readLine());

            qty = Integer.parseInt(br.readLine());

            price = Float.parseFloat(br.readLine());

        } catch (Exception e) { }

    }

    void display(){

        total = qty*price;

        System.out.println("pid : " + pid + "\nProduct Nmae : "+pname+"\nQuantity : "+qty + "\nPrice : "+price+"\n Total Amount : "+total);

    }

}

 

class Slip17B {

    public static void main(String args[]) throws IOException{

        int n;

        float to=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many Product you want to enter : ");

        n = Integer.parseInt(br.readLine());

        Product p1[]=new Product[n];

        for(int i=0; i<n; i++){

            p1[i]=new Product();

            p1[i].accept();

        }

        for(int i=0; i<n; i++){

            p1[i].display();

        }

        for(int i=0; i<n; i++){

            to=to+p1[i].total;

            System.out.println("Total Cost : "+to);

        }

    }

}