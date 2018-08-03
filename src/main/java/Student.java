import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "MYTEST")
public class Student {
    @Id
    private int number;
    private String Name;
    private String fName;
    private Date BDate;
    private String Address;
    private String description;
    @Embedded
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student(int number, String name, String fName, Date BDate, String address, String description) {
        this.number = number;
        Name = name;
        this.fName = fName;

        this.BDate = BDate;
        Address = address;
        this.description = description;
    }

    public Student() {
    }

    @Column (name = "User_ID")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return Name;
    }

    @Column (name = "LittleName")
    public void setName(String name) {
        Name = name;
    }

    @Column (name = "FamilyName")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Date getBDate() {
        return BDate;
    }

    @Column(name = "Birth_date")
    public void setBDate(Date BDate) {
        this.BDate = BDate;
    }
}
