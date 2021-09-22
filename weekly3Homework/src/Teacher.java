public class Teacher extends Person{
    @Override
    public void addCourse(Course c1){
        if (courses.size()<3){
            courses.add(c1);
        }
        else
            System.out.println("Teachers can give maximum 3 courses");
    }
}
