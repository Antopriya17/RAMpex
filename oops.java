package day10;

import java.util.Scanner;

class car1{
    int a;
    int b;
    public void display(){
        System.out.println(a+b);
    }
}
public class no_const {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        car1 c1=new car1();
        c1.a=sc.nextInt();
        c1.b=sc.nextInt();
        c1.display();
    }
}
