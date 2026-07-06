package day10;
class calculator{
    int a;
    int b;

    public calculator(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void add(){
        int add=a+b;
        System.out.println(add+ " ");

    }
    public void sub(){
        int sub=a-b;
        System.out.println(sub);
    }
}
public class oops {
    public static void main(String[] args){
        calculator cal=new calculator(10,5);
        cal.add();
        cal.sub();
    }
}
