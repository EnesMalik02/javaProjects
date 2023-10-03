package patika_obs;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Enes", "BIO", 3000);
        Teacher t2 = new Teacher("Malik", "MAT", 2000);
        Teacher t3 = new Teacher("Arı", "FZK", 1000);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t1);

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(t2);

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t3);

        Student s1 = new Student("Kerem", "1414", "4", biyoloji, fizik, matematik);
        System.out.println("###############");
        s1.addBulkExamNote(100, 100, 150);
        System.out.println("###############");
        s1.isPass();
        System.out.println("###############");
        t1.printInfo();
        System.out.println("###############");
        biyoloji.printTeacher();
    }
}
