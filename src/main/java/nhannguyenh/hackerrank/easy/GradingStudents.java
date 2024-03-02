package nhannguyenh.hackerrank.easy;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public List<Integer> gradingStudents(List<Integer> grades) {
        // Check the number of student is valid or not. If not, throw an exception
        if (grades.isEmpty() || grades.size() > 60) {
            throw new InvalidParameterException("The numbers of student is invalid");
        }

        // Create the output
        List<Integer> roundedGrades = new ArrayList<>();

        // Go through each element, check and round the value
        for (Integer grade : grades) {
            // Check the grade value is valid or not
            if (grade < 0 || grade > 100) {
                throw new InvalidParameterException("The grade value is invalid");
            }

            int mod5 = grade % 5;
            if ((grade > 35) && ((5 - mod5) < 3)) {
                roundedGrades.add(grade + (5- mod5));
            } else {
                roundedGrades.add(grade);
            }
        }
        return roundedGrades;
    }
}
