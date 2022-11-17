public class LogicalOperator {
    public static void main(String[] args) {
        // int chemistryGrade = 66;
        // int englishGrade = 65;
        // String language = "Java";
        // if (chemistryGrade >= 75 || englishGrade >= 75 || language.equals("Java")) {
        //     System.out.println("Congratulations, you got the scholarship!");
        // } else {
        //     System.out.println("We're really sorry, You didn't get the scholarship!");
        // }
        int credits = 56;
        double gpa = 3.2;
        if (credits >= 50 && gpa >= 3.0) {
            System.out.println("Congratulations, you meet all the requirements to receive the scholarship!");
        } else {
            System.out.println("Sorry You didn't meet all the requirements!");
        }
    }
    
}
