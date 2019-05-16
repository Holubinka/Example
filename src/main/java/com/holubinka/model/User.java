package com.holubinka.model;

import com.sun.istack.NotNull;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "USERS")
@Entity
public class User {

    @Id
    private Long idl;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "BUSINESS_ADDRESS_COUNTRY")),
            @AttributeOverride(name = "city", column = @Column(name = "BUSINESS_ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "BUSINESS_ADDRESS_STREET"))
    })
    private Address address1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "LIVING_ADDRESS_COUNTRY")),
            @AttributeOverride(name = "city", column = @Column(name = "LIVING_ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "LIVING_ADDRESS_STREET"))
    })
    private Address address2;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "SHIPPING_ADDRESS_COUNTRY")),
            @AttributeOverride(name = "city", column = @Column(name = "SHIPPING_ADDRESS_CITY")),
            @AttributeOverride(name = "street", column = @Column(name = "SHIPPING_ADDRESS_STREET"))
    })
    private Address address3;

    public User() {
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }

    public Address getAddress3() {
        return address3;
    }

    public void setAddress3(Address address3) {
        this.address3 = address3;
    }

    public Long getIdl() {
        return idl;
    }

    public void setIdl(Long idl) {
        this.idl = idl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
