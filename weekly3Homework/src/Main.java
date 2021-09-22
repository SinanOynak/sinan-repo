import java.util.List;

public class Main {
    public static void main(String [] args) {
        Student std = new Student();
        Teacher tch = new Teacher();
        Course crsMath = new Course();
        crsMath.setCredit(10);
        crsMath.setName("math");
        std.addCourse(crsMath);
        tch.addCourse(crsMath);
        List<Course> stdtcourses = std.getCourses();
        for(Course c : stdtcourses){
            System.out.println(c.getName()  +  c.getCredit());
        }

    }
}
