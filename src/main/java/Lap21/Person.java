package Lap21;

import java.util.ArrayList;

public class Person {
    private String name; //фамилия и имя персоны

    private  Gender status;
    enum Gender{Male, Female};
    private String  faculty;


    public Person(String name, Gender status, String faculty) {
        this.name = name;
        this.status = status;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Gender getStatus() {
        return status;
    }

    public void setStatus(Gender status) {
        this.status = status;

        }
        public void print() {
            System.out.print("This is " + name+"." );
            switch (status){
                case Male -> {
                    System.out.print("He ");
                    break;
                }

                    case Female ->{
                        System.out.print("She ");
                        break;
                    }
                }


        }
            public static void printALL(ArrayList<Person> personList){
                    personList.forEach(Person :: print);
            }


        }







