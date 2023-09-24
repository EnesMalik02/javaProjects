package Pass_class;

import  java.util.Scanner;
public class grade_average {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double math, physic, chemistry, biology, gradeAverage;

        System.out.print("Math grade :");
        math = inp.nextDouble();

        System.out.print("Physic grade ");
        physic = inp.nextDouble();

        System.out.print("Chemistry grade ");
        chemistry = inp.nextDouble();

        System.out.print("Biology grade ");
        biology = inp.nextDouble();

        gradeAverage = (math + physic + chemistry + biology)/4;
        if (gradeAverage <= 55){
            System.out.println("You fail the class");
        }else {
            System.out.println("You passed the class");
        }

    }
}
