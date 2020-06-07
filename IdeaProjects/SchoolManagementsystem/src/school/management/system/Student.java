package school.management.system;

/**
 * Created by Ruth A on 29/04/2020
 * This class is responsible for keeping the
 * track of students fees , name, grade & fees
 *
 */
public class Student {
    private int id;
    private String name;
    private int grade ;
    private int feesPaid;
    private int feesTotal;
    /**
    * To create a new student by initializing.
    * Fees for every student is 30,000
     * Fees paid initially is 0
    * @param id id for the student : unique
    * @param name name of the student
    * @param grade grade of the student
    */
    public Student(int id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        this.feesTotal=30000;
    }
    /** Getters and setters*/
    public void setGrade(int grade)
    {
        this.grade=grade;
    }
    public void updateFeesPaid(int fees)
    {
        feesPaid+=fees;

    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return id;
    }
    public int getGrade()
    {
        return grade;
    }
    public int getFeesTotal()
    {
        return (this.feesTotal);
    }


}
