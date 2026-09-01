public class Student {
    String name;
    int age;
    int grade;

    void checkGrade(){
        if(this.grade >= 75){
            System.out.println("Passed!");
        } else{
            System.out.println("Failed!");
        }
    }
}
