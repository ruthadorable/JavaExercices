package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and students using an ArrayList
 */

public class School{

    private List<Teacher> teachers ;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;
    public School (List<Teacher> teachers, List <Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=100*students.size();
        totalMoneySpent=0;
    }
    /** Getters and Setters
     *  */
    public List<Teacher> getTeachers(){
        return teachers;
    }
    public List<Student> getStudents(){
        return students;
    }
    public void setTeachers(List<Teacher>teachers){
        this.teachers=teachers;
    }
    public void addTeacher (Teacher teacher)
    {
        teachers.add(teacher);
    }
    public void setStudents(List<Student>students){
        this.students=students;
    }
    public void  addStudent(Student student){
        students.add(student);
    }
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public int getTotalMoneySpent(){
        /**
         * Money given to teachers
         * */
        return totalMoneySpent;
    }
    public void updateTotalMoneyEarned(int moneyspent){
        totalMoneyEarned-=moneyspent;
    }
    public void updateTotalMoneySpent(int moneyspent){
        totalMoneySpent+=moneyspent;
    }
}
