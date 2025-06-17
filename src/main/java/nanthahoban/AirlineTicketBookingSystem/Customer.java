package nanthahoban.AirlineTicketBookingSystem;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String dob;
    private String nic;
    private String passport;
    private String gender;
    private String contact;
    private String address;

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return dob;
    }

    public String getNIC() {
        return nic;
    }

    public String getPassport() {
        return passport;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

}
