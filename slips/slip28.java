//Slip 28 A) Write a java program to count the number of integers from a given list. (Use Command line arguments).

//Answer :

import java.util.*;



public class Slip28A {

    public static void main(String[] args) {

        int count = 0;

        List<String> al = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {

            al.add(args[i]);

        }

        for (int i = 0; i < al.size(); i++) {

            String element = al.get(i);

            try {

                int j = Integer.parseInt(element);

                count++;

            } catch (NumberFormatException e) {}

        }

        System.out.println(count + " integers present in list");

    }


}

//Slip 28 B) Write a java Program to accept the details of 5 employees (Eno, Ename, Salary) and display it onto the JTable.

//Answer :

import javax.swing.*;

public class Slip28B {

    JFrame f;

    JTable j;

    Slip28B(){

        f = new JFrame();

        f.setTitle("Employee Details");

        String data[][] = {

            {"1","Radhika Sapkal","50,000"},

            {"2","Ramesh Devakar","20,000"},

            {"3","Hardik Shrinivas","25,000"},

            {"4","Bhihari Kumar","20,000"},

            {"5","Swaraghini Pawar","15,000"},

        };

        String[] columnNames = {"Eno", "Ename", "Salary" };

        j = new JTable(data, columnNames);

        j.setBounds(30,40,200,300);

        JScrollPane sp = new JScrollPane(j);

        f.add(sp);

        f.setSize(500,200);

        f.setVisible(true);

    }

 

    public static void main(String args[]) {

        new Slip28B();

    }

}