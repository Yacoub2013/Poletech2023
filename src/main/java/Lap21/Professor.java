package Lap21;

public class Professor extends Person{

    private academicDegree statusDegree;
    enum academicDegree{PhD,DcD}; //Phd кандидат наук, DcD это доктор наук
    private String speciality;

    public Professor(String name, Gender status, String faculty, academicDegree statusDegree, String speciality) {
        super(name, status, faculty);
        this.statusDegree = statusDegree;
        this.speciality = speciality;
    }

    public academicDegree getStatusDegree() {
        return statusDegree;
    }

    public void setStatusDegree(academicDegree statusDegree) {
        this.statusDegree = statusDegree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void print(){
        super.print();
        System.out.print("teachers at "+ getFaculty()+ ".");
        switch (getStatus()){
            case Male -> {
                System.out.print("He ");
                break;
            }

            case Female ->{
                System.out.print("She ");
                break;
            }
        }

        System.out.println("has  "+getStatusDegree()+" degree in "+ getSpeciality()+ ".");
    }
}
