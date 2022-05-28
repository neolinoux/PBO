import java.util.ArrayList;

public class University {
    public String name;
    public ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    
    University() {
        this.name = "";
    }

    University(String name) {
        this.name = name;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" + "name=" + name + '}';
    }
}

// University
// Faculty
// Institute
// Employee <<abstract>>
//     Research
//         Lecturer
//     Administrative
//     Dean
// Project
// Course
// Address
// Attendance <<interface>>
