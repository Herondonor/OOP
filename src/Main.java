//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Maria";
        s1.age = 20;
        s1.grade = 60;
        s2.name = "Khugo";
        s2.age = 19;
        s2.grade = 100;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Grade: " + s1.grade);
        s1.checkGrade();

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Grade: " + s2.grade);
        s2.checkGrade();


    }
}