public class GraduatedStudent extends Student {
    private String degree;
    private String graduationDate;

    public GraduatedStudent(String name, String pass, int Id, String degree, String graduationDate) {
        super(name, pass, Id);
        this.degree = degree;
        this.graduationDate = graduationDate;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    @Override
    public void setGrades(int numOfSessions, int numOfAttended, int numOfAssignments, int numOfSubmitted, float finalExamGrade) {
        super.setGrades(numOfSessions, numOfAttended, numOfAssignments, numOfSubmitted, finalExamGrade);
        // You can add any graduated-specific grade adjustments here if needed
    }

    @Override
    public boolean login(int Id, String pass) {
        if (isGraduated()) {
            System.out.println("This student has already graduated and cannot log in.");
            return false;
        }
        return super.login(Id, pass);
    }

    public boolean isGraduated() {
        return graduationDate != null && !graduationDate.isEmpty();
    }
}
