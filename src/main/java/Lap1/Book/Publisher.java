package Lap1.Book;

public class Publisher {
    private String namepublisher;  // название издательство
    private String city; // город

    public Publisher(String namepublisher, String city) {
        this.namepublisher = namepublisher;
        this.city = city;
    }

    public String getNamepublisher() {
        return namepublisher;
    }

    public void setNamepublisher(String namepublisher) {
        if(namepublisher.isBlank()){
            throw new IllegalArgumentException("Укажите название издательство");
        }else{
            this.namepublisher = namepublisher;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.isBlank()){
            throw new IllegalArgumentException("Укажите город ");
        }else {
            this.city = city;
        }

   }
   public void print(){
        System.out.println(namepublisher+" , "+city);
   }
}

