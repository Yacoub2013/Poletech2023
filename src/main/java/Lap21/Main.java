package Lap21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ronald Turner ", Person.Gender.Male," Computer science ", Professor.academicDegree.DcD, " Programming paradigm");
        Professor professor2 = new Professor("Ruth Hollings ", Person.Gender.Female," Jurisprudence ", Professor.academicDegree.PhD, " Domestic atbitration");
        Student student1 = new Student("Leo Wilkinson ", Person.Gender.Male," Computer science ", Student.levelOfEducation.bachelor, 3);
        Student student2 = new Student("Anna Cunningam ", Person.Gender.Female," World economy ", Student.levelOfEducation.bachelor, 1);
        Student student3 = new Student("Jill Lundqvist ", Person.Gender.Female," Jurisprudence ", Student.levelOfEducation.master, 1);
        Student student4 = new Student("Ronald Correa ", Person.Gender.Male," Computer science ", " Design of a functional programming language");

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(professor1);
        personList.add(professor2);
        personList.add(student1);
        personList.add(student2);
        personList.add(student3);
        personList.add(student4);

        Person.printALL(personList);






    }

}
