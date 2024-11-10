public class Teacher extends Person {
    private int numCourses;
    private String [] courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }
    public boolean addCourse(String course){
        for (int i = 0; i < numCourses; i++){
            if (courses[i].equals(course)){
                return false;
            }
        }
        if (numCourses < MAX_COURSES){
            courses [numCourses] = course;
            numCourses++;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course){
        for (int i = 0; i <numCourses; i++){
            if (courses[i].equals(course)){
                for (int j = i; j < numCourses -1; j++){
                    courses[j] = courses[ j + 1];
                }
                courses[numCourses - 1] = null;
                numCourses--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "Teacher: " + super.toString();
    }
}
