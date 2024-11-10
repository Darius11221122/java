public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses < MAX_COURSES) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }

        else {
            System.out.println("Cannot add more courses. Max limit reached");
        }
    }
    public void printGrades(){
        for(int i = 0; i < numCourses; i++){
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }
    public double getAverageGrade(){
        int sum = 0;
        for(int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        return numCourses > 0 ? (double) sum /numCourses : 0.0;
    }
    @Override
    public String toString(){
        return "Student: " + super.toString();
    }
}

