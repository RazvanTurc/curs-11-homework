package ro.fasttrackit.curs11.homework11.ex1;

import ro.fasttrackit.curs11.homework11.ex2.ReportGenerator;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentsFromFile reader = new StudentsFromFile();
        Classroom classroom = new Classroom(reader.readStudents("files/students.txt"));

        System.out.println(classroom);
        System.out.println("------------");
        System.out.println(classroom.getWorstGrade("Physics"));
        System.out.println("------------");
        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println("------------");
        System.out.println(classroom.getMaxGrade());
        System.out.println("------------");
        System.out.println(classroom.getMaxGrade("Mathematics"));
        System.out.println("------------");
        System.out.println(classroom.getGradesForStudent("Marina Alimjan"));
        System.out.println("------------");
        System.out.println(classroom.getGradesForDiscipline("Computer Science"));

        ReportGenerator report = new ReportGenerator();
        report.generateReport(classroom);
    }
}
