/**
 * Person
 */
public class Person  {
    private Address address;
    private String firstName;
    private String lastName;
    private long phoneNumber;

    

    public Person(String firstName, String lastName, Address address, long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Address getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getCity(){
        
    }
    

} 
