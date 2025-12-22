public class Address {
    String street;
    String city;
    String house;
    String code;

    public Address(String street, String city, String house, String code) {
        this.street = street;
        this.city = city;
        this.house = house;
        this.code = code;
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

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", house='" + house + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}