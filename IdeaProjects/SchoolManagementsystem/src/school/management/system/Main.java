package school.management.system;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Teacher linda = new Teacher(1 ,"Linda" ,500);
        Teacher melissa = new Teacher(2, "Melissa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);
        List<Teacher> teacherList = new ArrayList();
        teacherList.add(linda);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tasha = new Student( 1, "Tasha",78);
        Student tania = new Student(2,"Tania" ,89);
        Student teddy = new Student(3,"Teddy",75);
        List<Student>studentList= new ArrayList();
        studentList.add(tasha);
        studentList.add(tania);
        studentList.add(teddy);

        School epfc = new School(teacherList,studentList);
        System.out.println("EPFC has earned"+ epfc.getTotalMoneyEarned() );


    }
}
