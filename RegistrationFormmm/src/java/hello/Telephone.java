package hello;

public class Telephone {
    private String country;
    private String area;
    private String number;
    
    private String full_number;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFull_number() {
        return full_number;
    }

    public void setFull_number(String full_number) {
        this.full_number = full_number;
    }

    @Override
    public String toString() {
        return full_number;
    }
}
