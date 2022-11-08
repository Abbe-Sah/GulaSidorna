package ApplicationFiles;

public class ProfileInfo {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String city;
    private int zipCode;
    private String streetName;
    private int streetNumber;
    private int apartmentNumber;

    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }


    public String getCity() {
        return city;
    }


    public int getZipCode() {
        return zipCode;
    }


    public String getStreetName() {
        return streetName;
    }


    public int getStreetNumber() {
        return streetNumber;
    }


    public int getApartmentNumber() {
        return apartmentNumber;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public ProfileInfo(String firstName, String lastName, int age,
                       String phoneNumber, String streetName, int streetNumber,
                       int apartmentNumber, int zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
        this.phoneNumber = phoneNumber;
        this.address = ", Address: " + streetName + " "
                + streetNumber + ", Apartment number: " + apartmentNumber
                + ", ZipCode: " + zipCode + ", City: " + city;
    }

}
