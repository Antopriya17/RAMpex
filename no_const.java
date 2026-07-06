import java.util.Scanner;

class student {
    String nameS;
    int id;
    public student(String nameS, int id) {
        this.nameS = nameS;
        this.id = id;
    }
    public void display_stu() {
        System.out.println("Name of Student: " + nameS);
        System.out.println("ID: " + id);
    }
}

class mentor extends student {

    String name;
    int year;
    String stream;

    public mentor(String nameS, int id, String name, int year, String stream) {
        super(nameS, id);
        this.name = name;
        this.year = year;
        this.stream = stream;
    }

    public void mentorinfo() {
        System.out.println("Name of Mentor: " + name);
        System.out.println("Year of Join: " + year);
        System.out.println("Stream: " + stream);
    }
}

class hod extends mentor {

    String nameh;

    public hod(String nameS, int id, String name, int year, String stream, String nameh) {
        super(nameS, id, name, year, stream);
        this.nameh = nameh;
    }

    public void hoddis() {
        System.out.println("Name of HOD: " + nameh);
    }
}

public class multi_level {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Sname= sc.next();
        int idS= sc.nextInt();
        String Mname=sc.next();
        int yr=sc.nextInt();
        String str=sc.next();
        String Hname=sc.next();
        student s=new student(Sname,idS);
        mentor m=new mentor(Sname,idS,Mname,yr,str);
        hod h = new hod(Sname,idS,Mname,yr,str,Hname);
        s.display_stu();
        m.display_stu();
        m.mentorinfo();
        h.display_stu();
        h.mentorinfo();
        h.hoddis();
    }
}