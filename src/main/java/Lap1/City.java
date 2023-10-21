package Lap1;

class Country {
    private String countryName; // название страны
    private float square; // площадь страны
    private float populationCity;  // население
    private String capital;  // название столицы
    private float populationCapital; // население столицы


    public Country(String countryName, float square, float populationCity, String capital, float populationCapital) {
        setCountryName(countryName);
        setSquare(square);
        setPopulationCity(populationCity);
        setCapital(capital);
        setPopulationCapital(populationCapital);
    }

    public Country(String countryName, float square, float populationCity) {
        setCountryName(countryName);
        setSquare(square);
        setPopulationCity(populationCity);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if (countryName.isEmpty()) {
            throw new IllegalArgumentException("Введите коректное название страны");
        } else {
            this.countryName = countryName;
        }
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        if (square <= 0) {
            throw new IllegalArgumentException("Введите коректные данные площади");
        } else {
            this.square = square;
        }
    }


    public float getPopulationCity() {
        return populationCity;
    }

    public void setPopulationCity(float populationCity) {
        if (populationCity <= 0) {
            throw new IllegalArgumentException("Введите коректные данные населения");
        } else {
            this.populationCity = populationCity;
        }
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        if (capital.isEmpty()) {
            throw new IllegalArgumentException("Введите коректное название столицы");
        } else {
            this.capital = capital;

        }
    }

    public float getPopulationCapital() {
        return populationCapital;
    }

    public void setPopulationCapital(float populationCapital) {
        if (populationCapital <= 0) {
            throw new IllegalArgumentException("Введите коректные данные населения столицы");
        } else {
            this.populationCapital = populationCapital;
        }
    }

    public void print() {
        System.out.print(countryName + ",");
        System.out.print(square + " млн.кв.км" + ",");
        System.out.print(populationCity + " млн.чел" + ",");
        if(capital!=null) {
            System.out.print(capital + ",");
        }else{
            System.out.print("");
        }
        if(capital!=null) {
            System.out.println(populationCapital + " млн.чел");
        }else{
            System.out.println("");
        }



        }



    public static void printALL(Country[] countrys) {
        for (Country country : countrys) {
            country.print();
        }
    }



        public static void main(String[] args) {
            Country[] countries = new Country[5];
            countries[0] = new Country("Russia", 17.23F, 15F, "Moscow", 12);
            countries[1] = new Country("Finland",338, 5.5F,"Helsinki", 655);
            countries[2] = new Country("France",643.8F,67.8F,"Paris",2.1F);
            countries[3] = new Country("Andorra", 467,85.4F,"Andorra la Vella", 22.6F);
            countries[4] = new Country("Singapore",725, 5.7f);

            printALL(countries);
        }
    }









