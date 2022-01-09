package ro.fasttrackit.curs11.homework11.ex1;

import java.util.Objects;

public class StudentGrade {
    private final String name;
    private final String discipline;
    private final double grade;

    public StudentGrade(String name, String discipline, double grade) {
        this.name = Objects.requireNonNull(name, "-");
        this.discipline = Objects.requireNonNull(discipline, "-");
        this.grade = grade >= 1 && grade <= 10 ? grade : 5;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student: \n" +
                "Name: " + name + '\n' +
                "Discipline: " + discipline + '\n' +
                "Grade: " + grade + '\n';
    }
}
