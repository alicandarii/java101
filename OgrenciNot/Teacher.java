public class Teacher {
    String name ;
    String mpno;
    String branch;

    Teacher(String name , String branch, String mpno) {
    this.name = name;
    this.mpno=mpno;
    this.branch=branch;
    }
    void print()
    {
        System.out.println("Adı : " + this.name);
        System.out.println("mpno : " + this.mpno);
        System.out.println("branch : " + this.branch);
    }
}

