package day23Exceptions;

public class ExceptionRunner {
    public static void main(String[] args) {
        //getStudentGrade(130);
        try {
            getTheNumberOfStudents(-12);
        } catch (InvalidNumberException e) {
            System.err.println(e.getMessage());
        }

    }
    public static void getTheNumberOfStudents(int numOfStudent) {
        if (numOfStudent < 0)
            throw new InvalidNumberException("Student number cannot be negative");

        else
            System.out.println(numOfStudent);
    }
        public static void getStudentGrade(int grade){
        if(grade<0 || grade>100)
            try {
                throw new InvalidStudentGradeException("Student grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        System.out.println(grade);
    }
}
