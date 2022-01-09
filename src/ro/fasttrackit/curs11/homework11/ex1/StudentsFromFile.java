package ro.fasttrackit.curs11.homework11.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

 public class StudentsFromFile {

        private String studentToLine(StudentGrade student) {
            return student.getName() + " studies " + student.getDiscipline() + " with the grade " + student.getGrade();
        }

        public List<StudentGrade> readStudents(String filePath) throws Exception {
            List<StudentGrade> result = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.add(readPersonFromLine(line));
                }
            }
            return result;
        }

        //format: NAME|DISCIPLINE|GRADE
        private StudentGrade readPersonFromLine(String line) {
            String[] tokens = line.split(Pattern.quote("|"));

            return new StudentGrade(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
        }
 }
