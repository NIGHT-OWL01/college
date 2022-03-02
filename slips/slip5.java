/*Slip 5 A) Write a java program to display following pattern:

5

4 5

3 4 5

2 3 4 5

1 2 3 4 5

Answer :*/

class Slip5A {

    public static void main(String args[]){

        int i,j;

        for(i=5; i>=1; i--){

            for(j=i; j<=5; j++){

                System.out.print(j + " ");

            }

            System.out.println();

        }

    }

}



//Slip 5 B) Write a java program to accept list of file names through command line. Delete the files having extension .txt. Display name, location and size of remaining files.

//Answer :

import java.io.*;

class Slip5B{

    public static void main(String args[]) throws Exception{

        for(int i=0;i<args.length;i++){

            File file=new File(args[i]);

            if(file.isFile()){

                String name = file.getName();

                if(name.endsWith(".txt")){

                    file.delete();

                    System.out.println("file is deleted " + file);

                }else{

                    System.out.println("File Name : " + name + "\nFile Location : " +file.getAbsolutePath()+"\nFile Size : "+file.length()+" bytes");

                }

            }

            else{

                System.out.println(args[i]+ "is not a file");

            }

        }

    }

}



