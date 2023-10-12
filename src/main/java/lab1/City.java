package lab1;

class CityModel {
    private String city_name;
    private float square;
    private float population;

    private String name_of_the_capital;
    private float population_of_the_capital;


    public void setCity_name(String cityName) {
        if (cityName.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        } else {
            city_name = cityName;
        }
    }

    public String getCity_name() {
        return city_name;
    }

    public void setSquare(float SquareNum) {
        if (SquareNum < 0) {
            System.out.println("Ты ввёл не правильный возрасть");
        } else {
            square = SquareNum;
        }
    }

    public float getSquare() {
        return square;
    }

    public void setPopulation(float Population) {
        if (Population < 0) {
            System.out.println("Ты ввёл не правильный возрасть");
        } else {
            population = Population;
        }
    }

    public float getPopulation() {
        return population;
    }

    public void setName_of_the_capital(String Name_of_the_capital) {
        if (Name_of_the_capital.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        } else {
            name_of_the_capital = Name_of_the_capital;
        }
    }


    public String getName_of_the_capital() {
        return name_of_the_capital;
    }

    public void setPopulation_of_the_capital(float Population_of_the_capital) {
        population_of_the_capital = Population_of_the_capital;
    }

    public float getPopulation_of_the_capital() {
        return population_of_the_capital;
    }

    void cityprint() {
        System.out.println(city_name + ", " + square + " млн кв.км" + ", " + population + " млн чел." + ", " + name_of_the_capital + ", " + population_of_the_capital + " млн чел.;");
    }
}

public class City {
    public static void main(String[] args) {
        CityModel city1 = new CityModel();
        city1.setCity_name("Russia");
        city1.setSquare(17.1F);
        city1.setPopulation(146.7F);
        city1.setName_of_the_capital("Moscow");
        city1.setPopulation_of_the_capital(12.6F);
        city1.cityprint();


        CityModel city2 = new CityModel();
        city2.setCity_name("Finland");
        city2.setSquare(338);
        city2.setPopulation(5.5F);
        city2.setName_of_the_capital("Helsinki");
        city2.setPopulation_of_the_capital(665);
        city2.cityprint();


        CityModel city3 = new CityModel();
        city3.setCity_name("France");
        city3.setSquare(643.8F);
        city3.setPopulation(67.8F);
        city3.setName_of_the_capital("Paris");
        city3.setPopulation_of_the_capital(2.1F);
        city3.cityprint();


        CityModel city4 = new CityModel();
        city4.setCity_name("Andorra");
        city4.setSquare(467);
        city4.setPopulation(85.4F);
        city4.setName_of_the_capital("Andorra La Vella");
        city4.setPopulation_of_the_capital(22.6F);
        city4.cityprint();


        CityModel city5 = new CityModel();
        city5.setCity_name("Singapore");
        city5.setSquare(725);
        city5.setPopulation(5.7F);
        city5.setName_of_the_capital("---");
        city5.setPopulation_of_the_capital(0);
        city5.cityprint();



    }
}
















