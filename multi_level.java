package day10;

import java.util.Scanner;

class A{
    private int bb;
    public int getA(int bb){
        return bb;
    }
    public void setA(int bb){
        if(bb>0){
            this.bb=bb;
        }
        else{
            System.out.println("invalid input");
        }
    }
    public void bank(){
        System.out.print("Bank Balance :"+bb);
    }
}
public class encap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        A a1=new A();
        a1.setA(a);
        a1.bank();
    }
}
