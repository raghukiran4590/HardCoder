package lambdas.mapreducefilter;

public class EmployeeGrades {
    private int id;
    private String name;
    private String grade;
    private String dept;
    private long salary;

    public EmployeeGrades(int id, String name, String grade, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeGrades{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
