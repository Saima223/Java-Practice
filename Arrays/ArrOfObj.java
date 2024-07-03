package Arrays;

// Define the Student class
class Student {
    String name;
    int age;
    String gender;
}

public class ArrOfObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.gender = "Male";

        Student s2 = new Student();
        s2.name = "Aanu";
        s2.age = 21;
        s2.gender = "Female";

        Student s3 = new Student();
        s3.name = "Kareem";
        s3.age = 22;
        s3.gender = "Male";

        System.out.println(s1.name + ":" + s1.age);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ":" + students[i].gender);
        }
    }
}
