package day10;

import java.util.Scanner;

class student1 {
    private String studname;
    private int stuid;

    public String getStudname() {
        return studname;
    }

    public int getid() {
        return stuid;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public void setid(int stuid) {
        this.stuid = stuid;
    }

    public void displaystudent() {
        System.out.println("Student Details");
        System.out.println("Student Name: " + studname);
        System.out.println("Student ID: " + stuid);
    }
}

class mentee extends student1 {
    private String mentname;
    private int year;

    public String getMentname() {
        return mentname;
    }

    public int getYear() {
        return year;
    }

    public void setMentname(String mentname) {
        this.mentname = mentname;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public void mentedetails() {
        System.out.println("Mentee Details");
        System.out.println("Mentor Name: " + mentname);
        System.out.println("Year of Joining: " + year);
    }
}

class hod extends mentee {
    private String hname;

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public void displayhod() {
        System.out.println("HOD Name: " + hname);
    }
}

public class school_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        hod h1 = new hod();

        System.out.print("Enter Student Name: ");
        String n = sc.next();
        h1.setStudname(n);

        System.out.print("Enter Student ID: ");
        int i = sc.nextInt();
        h1.setid(i);

        System.out.print("Enter Mentor Name: ");
        String m = sc.next();
        h1.setMentname(m);

        System.out.print("Enter Year of Joining: ");
        int y = sc.nextInt();
        h1.setYear(y);

        System.out.print("Enter HOD Name: ");
        String h = sc.next();
        h1.setHname(h);

        System.out.println();
        h1.displaystudent();
        h1.mentedetails();
        h1.displayhod();

        sc.close();
    }
}