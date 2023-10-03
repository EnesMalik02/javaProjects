package patika_obs;

public class Teacher {
    String name;
    String branch;
    int phoneN;
    
    Teacher(String name, String branch, int phoneN){
        this.name = name;
        this.branch = branch;
        this.phoneN = phoneN;
    }

    void printInfo(){
        System.out.println("Adı : " + this.name);
        System.out.println("Branşı : " + this.branch);
        System.out.println("Telefon numarası : " + this.phoneN);
    }
}
