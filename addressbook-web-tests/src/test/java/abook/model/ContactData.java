package abook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String title;
    private final String company;
    private final String address;
    private final String homeTelNumber;
    private final String mobileTelNumber;
    private final String email;

    public ContactData(String firstName, String middleName, String lastName, String title, String company, String address, String homeTelNumber, String mobileTelNumber, String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homeTelNumber = homeTelNumber;
        this.mobileTelNumber = mobileTelNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeTelNumber() {
        return homeTelNumber;
    }

    public String getMobileTelNumber() {
        return mobileTelNumber;
    }

    public String getEmail() {
        return email;
    }
}
