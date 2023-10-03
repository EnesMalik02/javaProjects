package patika_obs;

class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            printTeacher();
        }else {
            System.out.println("Öğretmenin branşı eşleşmiyor");

        }
    }

    void printTeacher(){
        if (teacher != null) {
            System.out.println(this.name + " dersinin akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine akademisyen atanmamıştır.");
        }
    }
}
