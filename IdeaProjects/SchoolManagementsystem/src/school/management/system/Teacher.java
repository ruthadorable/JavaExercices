package school.management.system;

public class Teacher {
    /** Created by Ruth A on 29/04/2020
     * This class is responsible for keeping the track
     * of the teacher's name , id , salary
     *
     */
    private int id;
    private String name;
    private int salary;
    public Teacher (int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    /**Getters and setters*/
    public String getName(){
        return this.name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }

}
