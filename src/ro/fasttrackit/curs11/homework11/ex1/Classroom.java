package ro.fasttrackit.curs11.homework11.ex1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> classroom;

    public Classroom(List<StudentGrade> classroom) {
        this.classroom = new ArrayList<>(classroom);
    }

    public List<Double> getGradesForDiscipline(String discipline) {
        List<Double> gradesForDiscipline = new ArrayList<>();
        for(StudentGrade student : classroom) {
            if(student.getDiscipline().equalsIgnoreCase(discipline)) {
                gradesForDiscipline.add(student.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Double> getGradesForStudent(String studentName) {
        List<Double> gradesForDiscipline = new ArrayList<>();
        for(StudentGrade student : classroom) {
            if(student.getName().equalsIgnoreCase(studentName)) {
                gradesForDiscipline.add(student.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public StudentGrade getMaxGrade(String discipline) {
//        List<StudentGrade> maxGradeDiscipline = new ArrayList<>();

        double min = 1;
        int index = 0;
        for(StudentGrade student : classroom) {
            if(student.getDiscipline().equalsIgnoreCase(discipline) && student.getGrade() > min) {
                min = student.getGrade();
                index = classroom.indexOf(student);
            }
//        }
//        for(StudentGrade student : classroom) {
//            if(student.getDiscipline().equalsIgnoreCase(discipline) && student.getGrade() == classroom.get(index).getGrade()) {
//                maxGradeDiscipline.add(student);
//            }
        }
        return classroom.get(index);
    }

    public StudentGrade getMaxGrade() {
//        List<StudentGrade> maxGrades = new ArrayList<>();
        double max = 1;
        int index = 0;
        for(StudentGrade student : classroom) {
            if(student.getGrade() > max) {
                max = student.getGrade();
                index = classroom.indexOf(student);
            }
        }
//        for(StudentGrade student : classroom) {
//            if(student.getGrade() == classroom.get(index).getGrade()) {
//                maxGrades.add(student);
//            }
//        }
        return classroom.get(index);
    }

    public Double getAverageGrade(String discipline) {
        List<StudentGrade> gradesForDiscipline = new ArrayList<>();
        double grades = 0;
        int students = 0;

        for(StudentGrade student : classroom) {
            if(student.getDiscipline().equalsIgnoreCase(discipline)) {
                grades += student.getGrade();
                students++;
            }
        }

        return grades/students;
    }

    public StudentGrade getWorstGrade(String discipline) {
//        List<StudentGrade> worstGrades = new ArrayList<>();

        double min = 10;
        int index = 0;
        for(StudentGrade student : classroom) {
            if(student.getDiscipline().equalsIgnoreCase(discipline) && student.getGrade() < min) {
                min = student.getGrade();
                index = classroom.indexOf(student);
            }
        }
//        for(StudentGrade student : classroom) {
//            if(student.getDiscipline().equalsIgnoreCase(discipline) && student.getGrade() == classroom.get(index).getGrade()) {
//                worstGrades.add(student);
//            }
//        }
        return classroom.get(index);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroom=" + classroom +
                '}';
    }
}
