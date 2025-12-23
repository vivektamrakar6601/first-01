package practice.First.entity;

import jakarta.persistence.*;

@Entity
@Table(name="persons")
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long id;
    @Column(name="name",nullable = false,unique = false)
    private String name;
    @Column(name="address",nullable = false,unique = false)
    private String address;
    @Column(name="phoneNo",nullable = false,unique = true)
    private String phoneNo;
    @Column(name="email",nullable = false,unique = true)
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
