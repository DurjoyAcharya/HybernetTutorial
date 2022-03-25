package ORM;

import javax.persistence.Entity;

@Entity
public class Student {

    @javax.persistence.Id
    private int Id;

    private String Name;
    private String Department;

    public Student() {
        super();
    }

    public Student(int id, String name, String department) {
        Id = id;
        Name = name;
        Department = department;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
