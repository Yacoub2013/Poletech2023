package Lab1.Country;

class Country {
    private String countrename; // название страны
    private float square; // площадь страны
    private float populationcity;  // население
    private String capital;  // название столицы
    private float populationcapital; // население столицы


    public Country(String countrename, float square, float populationcity, String capital, float populationcapital) {
        setCountrename(countrename);
        setSquare(square);
        setPopulationcity(populationcity);
        setCapital(capital);
        setPopulationcapital(populationcapital);
    }

    public Country(String countrename, float square, float populationcity) {
        setCountrename(countrename);
        setSquare(square);
        setPopulationcity(populationcity);
    }

    public String getCountrename() {
        return countrename;
    }

    public void setCountrename(String countrename) {
        if (countrename.isEmpty()) {
            throw new IllegalArgumentException("Введите коректное название страны");
        } else {
            this.countrename = countrename;
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


    public float getPopulationcity() {
        return populationcity;
    }

    public void setPopulationcity(float populationcity) {
        if (populationcity <= 0) {
            throw new IllegalArgumentException("Введите коректные данные населения");
        } else {
            this.populationcity = populationcity;
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

    public float getPopulationcapital() {
        return populationcapital;
    }

    public void setPopulationcapital(float populationcapital) {
        if (populationcapital <= 0) {
            throw new IllegalArgumentException("Введите коректные данные населения столицы");
        } else {
            this.populationcapital = populationcapital;
        }
    }

    public void print() {
        System.out.print(countrename + ",");
        System.out.print(square + " млн.кв.км" + ",");
        System.out.print(populationcity + " млн.чел" + ",");
        if(capital!=null) {
            System.out.print(capital + ",");
        }else{
            System.out.print("");
        }
        if(capital!=null) {
            System.out.println(populationcapital + " млн.чел");
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









