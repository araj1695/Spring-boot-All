public class Address {
    String city;
    String state;
    String street;
    String houseNameOrNumber;


    public Address(String city, String state, String street, String houseNameOrNumber) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.houseNameOrNumber = houseNameOrNumber;
    }


    public String changeCity(String newCity){
        this.city = newCity;
        return "City is successfully changed to: "+this.city;
    }
    

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + ", street=" + street + ", houseNameOrNumber="
                + houseNameOrNumber + "]";
    }


    public static void main(String[] args){
        Address a = new Address("Kolkata", "west Bangal", "Sector-v", "23");
        System.out.println(a.toString());
        System.out.println(a.changeCity("Howrah"));
    }
}
