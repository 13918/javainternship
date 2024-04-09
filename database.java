import java.util.ArrayList;

class Course_base {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    Course_base(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    void courseinfro() {
        System.out.println("Course Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Capacity: " + capacity);
        System.out.println("Schedule: " + schedule);
    }
}

class Student {
    int id;
    String name;
    ArrayList< Course_base> registeredCourses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    void Courseregister( Course_base course) {
        if (course.capacity > 0) {
            registeredCourses.add(course);
            course.capacity--;
            System.out.println("Successfully registered for course: " + course.title);
        } else {
            System.out.println("Sorry, the course is already full.");
        }
    }

    void Coursedrop( Course_base course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.capacity++;
            System.out.println("Successfully dropped course: " + course.title);
        } else {
            System.out.println("You are not registered for this course.");
        }
    }

    void CoursesdisplayRegistered() {
        System.out.println("Registered Courses for Student " + id + ":");
        for ( Course_base course : registeredCourses) {
            course.courseinfro();
            System.out.println();
        }
    }
}

public class database{
    public static void main(String[] args) {
        Course_base course1 = new  Course_base("101", "Science", "physis, chemistry, biology.", 30, "Mon/Wed/Fri 10:00 AM");
        Course_base course2 = new  Course_base("201", "Maths", "MATHEMATICS.", 25, "Tue/Thu 9:00 AM");

        Student student1 = new Student(21, "ABC");
        Student student2 = new Student(22, "XYZ");

        student1.Courseregister(course1);
        student1.Courseregister(course2);
        student2.Courseregister(course1);

        student1.CoursesdisplayRegistered();
        System.out.println();

        student1.Coursedrop(course2);
        student1.CoursesdisplayRegistered();
    }
}
 
    

