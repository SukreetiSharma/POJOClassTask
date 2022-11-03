public class POJOClass {
    private String city;
    private String country;
    private String name;
    private String area;
    private String address;
    public POJOClass(String city,String country) {
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City : " + city +" "+ "Country : " +country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
