public class Student extends Person{
    private int year;

    public int getYear(){
        return year;
    }
    public void setYear(){
        this.year = year;
    }

    @Override
    public void addCourse(Course c1){
        int toplamCredit=0;
        for(Course c : courses ){
            toplamCredit+= c.getCredit();
        }
        toplamCredit+= c1.getCredit();
        if (toplamCredit < 20){
            courses.add(c1);
        }
        else
            System.out.println("Students can take maximum 20 credits");
    }
}
