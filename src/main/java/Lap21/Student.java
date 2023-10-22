package Lap21;

import static Lap21.Person.Gender.Male;

public class Student extends Person{

    private levelOfEducation statusEducation;
    enum levelOfEducation{bachelor, master}; // бакалавра или магистор
    private int courseNum;  //номер курса
    private String dissertationTopic; // тема дисертации, если аспирант


    public Student(String name, Gender status, String faculty, String dissertationTopic) {
        super(name, status, faculty);
        this.dissertationTopic = dissertationTopic;
    }

    public Student(String name, Gender status, String faculty, levelOfEducation statusEducation, int courseNum) {

        super(name, status, faculty);
        this.statusEducation = statusEducation;
        this.courseNum = courseNum;

    }

    public levelOfEducation getStatusEducation() {
        return statusEducation;
    }

    public void setStatusEducation(levelOfEducation statusEducation) {
        this.statusEducation = statusEducation;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getDissertationTopic() {
        return dissertationTopic;
    }

    public void setDissertationTopic(String dissertationTopic) {
        this.dissertationTopic = dissertationTopic;
    }



    public void print(){
        super.print();
        System.out.print("studies at "+ getFaculty()+ ".");
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
        System.out.println("is " + getCourseNum()+ "th year "+ getStatusEducation()+ " student.") ;
    }


 }



