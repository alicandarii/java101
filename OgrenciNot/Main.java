public class Main {
    public static void main(String[] args) {
    Teacher t1 = new Teacher("Mahmut", "TRH","555");
    Teacher t2 = new Teacher("Graham bell","FZK","6666");
    Teacher t3 = new Teacher("Kül Yutmaz","Bio","66665");

    Course tarih = new Course("Tarih", "101", "TRH");
    tarih.addTeacher(t1);
    Course fizik = new Course("Fizik", "102", "FZK");
    fizik.addTeacher(t2);
    Course biyo = new Course("Biyoloji", "103", "Bio");
    biyo.addTeacher(t3);

    Student  s1 = new Student("Ali","123","4",tarih,fizik,biyo);
    s1.addBulkExamNote(60,50,50);
    s1.addVerbal(20,20,20);
    s1.isPass();
    s1.printNote();


    Student  s2 = new Student("Maho","1234","4",tarih,fizik,biyo);
    s2.addBulkExamNote(50,50,50);
    s2.addVerbal(10,10,10);
    s2.isPass();
    s2.printNote();


    }
}
