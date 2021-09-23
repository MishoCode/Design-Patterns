package command;

import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    //private int totalNumberOfStudents;
    private List<String> students = new ArrayList<>();
    private String universityName;

    public UniversitySystem(String universityName) {
        this.universityName = universityName;
    }

    public void addStudent(String name) {
        if (students.contains(name)) {
            System.out.println(name + " is already admitted!");
        } else {
            System.out.println("Hi, " + name + "! Welcome to " + universityName);
            students.add(name);
        }
    }

    public void removeStudent(String name) {
        if (!students.contains(name)) {
            System.out.println(name + " is not studying in the university!");
        } else {
            System.out.println(name + " left " + universityName + "!");
            students.remove(name);
        }
    }

    public void printStudents() {
        for (String s : students) {
            System.out.println(s);
        }
    }
}
