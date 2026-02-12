public class GradeCalculator {
    private static int assignmentPoint;
    private static int examPoints;
    private static int projectPoints;

    public void addAssignmentPoints(int assignmentPoint) {
        GradeCalculator.assignmentPoint = assignmentPoint;
    }
    public void addExamPoints(int examPoints) {
        GradeCalculator.examPoints = examPoints;
    }
    public void addProjectPoints(int projectPoints) {
        GradeCalculator.projectPoints = projectPoints;
    }
    public String printTotalAssignmentPoints() {
        int total = GradeCalculator.assignmentPoint+GradeCalculator.projectPoints+GradeCalculator.examPoints;
        if (total <= 50 ) {
            return "-3";
        } else if (total <= 70) {
            return "00";
        } else if (total <= 85) {
            return "7";
        } else {
            return "12";
        }

    }
    void main(String[] args) {
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(35);
        printTotalAssignmentPoints();
        System.out.println("Your grade is " + printTotalAssignmentPoints());
    }
}
