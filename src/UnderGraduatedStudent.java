public class UnderGraduatedStudent extends Student {
    private String major;

    public UnderGraduatedStudent (String name, String pass, int Id, String major) {
        super(name, pass, Id);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void setGrades(int numOfSessions, int numOfAttended, int numOfAssignments, int numOfSubmitted, float finalExamGrade) {
        super.setGrades(numOfSessions, numOfAttended, numOfAssignments, numOfSubmitted, finalExamGrade);
    }

}
