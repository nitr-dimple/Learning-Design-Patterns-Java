package com.neu.dimple.creationaldesignpatterns.BuilderDesignPattern.builder2;


import com.neu.dimple.creationaldesignpatterns.BuilderDesignPattern.builder.Address;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class UserDTO {

    private String name;
    private String address;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "name = " + name +
                "\n age = " + age +
                "\n address = " + address;
    }

    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }
    
    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO dto;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address= address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + ", "+ address.getZipcode();
            return this;
        }

        public UserDTO build() {
            this.dto = new UserDTO();
            dto.setName(firstName + " " + lastName);
            dto.setAddress(address);
            dto.setAge(age);
            return dto;
        }

        public UserDTO getUserDTO() {
            return dto;
        }
    }
}
