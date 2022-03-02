//Slip 14 A) Write a Java program to calculate power of a number using recursion.

import java.util.*;

class Slip14A {

    public static void main(String args[]){

        int base,exp;

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Base Number : ");

        base = sc.nextInt();

        System.out.print("Enter the Exponent Number : ");

        exp = sc.nextInt();

        int result = power(base, exp);

        System.out.print("Answer : "+ result);

    }

    private static int power(int base, int exp) {

        if(exp!=0){

            return (base * power(base, exp-1));

        }else{

            return 1;

        }

    }

}


//Slip 14 B) Write a java program to accept the details of employee (Eno, EName, Sal) and display it on next frame using appropriate event .

import java.awt.*;

import java.awt.event.*;

 

class Emp_details implements ActionListener {

    Frame f;

    Label empno, empname, sal;

    TextField tempno, tempname, tsal;

    Button next;

 

    Emp_details() {

        f = new Frame("\t Employee Details:");

        empno = new Label("\t Employee Id:");

        empname = new Label("\t Employee Name:");

        sal = new Label("\t Employee Sal:");

        tempno = new TextField(25);

        tempname = new TextField(25);

        tsal = new TextField(25);

        next = new Button("Next");

        f.add(empno);

        f.add(tempno);

        f.add(empname);

        f.add(tempname);

        f.add(sal);

        f.add(tsal);

        f.add(next);

        next.addActionListener(this);

        f.setLayout(new FlowLayout());

        f.setSize(400, 400);

        f.setVisible(true);

    }

 

    public void actionPerformed(ActionEvent ae) {

        String empno, empname, sal;

        empno = tempno.getText();

        empname = tempname.getText();

        sal = tsal.getText();

        f.setVisible(false);

        new FrameDetails(empno, empname, sal);

    }

}

 

class FrameDetails extends Frame {

    Frame f;

    Label empno, empname, sal;

    TextField tempno, tempname, tsal;

 

    FrameDetails(String no, String name, String s) {

        f = new Frame("Employee Details:");

        empno = new Label("Employee ID:");

        empname = new Label("Employee Name:");

        sal = new Label("Employee Salary:");

        tempno = new TextField(25);

        tempname = new TextField(25);

        tsal = new TextField(25);

        f.add(empno);

        f.add(tempno);

        f.add(empname);

        f.add(tempname);

        f.add(sal);

        f.add(tsal);

        tempno.setText(no);

        tempname.setText(name);

        tsal.setText(s);

        f.setLayout(new FlowLayout());

        f.setSize(400, 400);

        f.setVisible(true);

    }

}

 

class Slip14B {

    public static void main(String args[]) {

        new Emp_details();

    }


}