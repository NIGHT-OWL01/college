/*Slip 9 A) Write a java Program to display following pattern:

1

0 1

0 1 0

1 0 1 0

Answer :*/

class Slip9A {

    public static void main(String args[]){

        int i,j,k=1;;

        for(i=1; i<=4; i++){

            for(j=1; j<=i; j++){

                if(k%2==1){

                    System.out.print(1 + " ");

                }else{

                    System.out.print(0 + " ");

                }

                k++;

            }

            System.out.println();

        }

    }

}


//Slip 9 B) Write a java program to validate PAN number and Mobile Number. If it is invalid then throw user defined Exception “Invalid Data”, otherwise display it.


import java.io.*;

class invaliddetails extends Exception{}

class Slip9B{

    static int n;

    public static void main( String args[]){

        DataInputStream dr = new DataInputStream(System.in);

        try {

            System.out.print("********* Do you Want to Validate ********* \n1. Mobile Number Press : 1 \n2. PAN Card Press : 2 \nEnter Number : ");

            n = Integer.parseInt(dr.readLine());

            switch(n){

                case 1 :

                System.out.print("Enter Mobile Number : ");

                Long num = Long.parseLong(dr.readLine());

                    if(num.toString().matches("(0/91)?[7-9][0-9]{9}")){

                        System.out.print("Enter Valid Mobile Number..!");

                    }else{

                        throw new invaliddetails();

                    }

                break;

                case 2 :

                System.out.print("Enter PAN Number : ");

                String str= dr.readLine();

                if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){

                    System.out.print("Enter Valid PAN CARD Number..!");

                }else{

                    throw new invaliddetails();

                }

                break;

                default :

                    throw new invaliddetails();

            }

        } catch (invaliddetails nz) {

            System.out.println("You Enter Invalid Details...!");

        }

        catch (NumberFormatException e){

            System.out.println("You Enter Invalid Details...!");

        }

        catch(Exception e){}

    }

}

