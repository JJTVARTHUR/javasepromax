package d14_extends_this;

public class Student {
    private String schoolName;
    private String name;

    public Student(String name){
        this(name,"黑马培训中心");
    }

    public Student(String name,String schoolName){
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
