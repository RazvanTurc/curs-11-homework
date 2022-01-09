package ro.fasttrackit.curs11.homework11.ex2;

import ro.fasttrackit.curs11.homework11.ex1.Classroom;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class ReportGenerator {

    public void generateReport(Classroom classroom) throws Exception {
//        StudentsFromFile reader = new StudentsFromFile();
//        Classroom classroom = new Classroom(reader.readStudents("files/students.txt"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out"))) {

            writer.write(
                    "Biggest Grade: " + classroom.getMaxGrade().getName() +
                            " with grade: " + classroom.getMaxGrade().getGrade() + "\n");

            writer.write(
                    "Average Grade in Mathematics: " + classroom.getAverageGrade("Mathematics") + "\n" +
                            "Average Grade in Computer Science: " + classroom.getAverageGrade("Computer Science") + "\n" +
                            "Average Grade in Physics: " + classroom.getAverageGrade("Physics") + "\n");

            writer.write(
                    "Lowest Grade in Mathematics: " + classroom.getWorstGrade("Mathematics").getName() +
                            " with grade: " + classroom.getWorstGrade("Mathematics").getGrade() + "\n" +

                            "Lowest Grade in Computer Science: " + classroom.getWorstGrade("Computer Science").getName() +
                            " with grade: " + classroom.getWorstGrade("Computer Science").getGrade() + "\n" +

                            "Lowest Grade in Physics: " + classroom.getWorstGrade("Physics").getName() +
                            " with grade: " + classroom.getWorstGrade("Physics").getGrade());
        }
    }
}
