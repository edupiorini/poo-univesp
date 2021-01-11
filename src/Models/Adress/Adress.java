package Models.Adress;

public class Adress {
    private String street, city, state, country, zipCode;
    private int houseNumber;

    public Adress(String street, int houseNumber, String city, String state, String country, String zipCode) {
        //throw exceptions
        if (houseNumber <= 0) {
            throw new IllegalArgumentException("Invalid house number");
            
        }

        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreet() {
      return street;
    }

    public void setStreet(String street) {
      this.street = street;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public String getState() {
      return state;
    }

    public void setState(String state) {
      this.state = state;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public String getZipCode() {
      return zipCode;
    }

    public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
    }

    public int getHouseNumber() {
      return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
      this.houseNumber = houseNumber;
    }

    
}
