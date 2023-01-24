package aop;

public class Student {
    private String nameSurname;
    private int curse;
    private double avgGrade;

    public Student(String nameSurname, int curse, double avgGrade) {
        this.nameSurname = nameSurname;
        this.curse = curse;
        this.avgGrade = avgGrade;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public int getCurse() {
        return curse;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", curse=" + curse +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
