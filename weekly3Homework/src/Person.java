import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;
    protected List<Course> courses;

    public Person(){
        super();
        courses = new ArrayList<Course>();
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }
    public void setGender(){
        this.gender = gender;
    }
    public void deleteCourse(Course c1){
        courses.remove(c1);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course c1){
        courses.add(c1);
    }
}
