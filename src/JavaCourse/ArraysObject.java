package JavaCourse;
public class ArraysObject {
    public static void main(String[] args) {
    student [] s = new student[5];
    for(int i = 0; i < 5 ; i++){
        s[i]=new student();
        s[i].setData(i+1,50000*(i+1));
    }
    for(int i = 0; i < 5 ;i++){
        s[i].getData();
    }
    }
}
class student{
    private int id;
    private float salary;
    public void setData(int StdId, float StdSalary){
        id = StdId;
        salary = StdSalary;
    }
    public void getData(){
        System.out.println("Student Id : "+id+" Salary :"+salary);
    }
}