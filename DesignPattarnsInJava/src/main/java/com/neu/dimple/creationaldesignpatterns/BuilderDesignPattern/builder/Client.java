package com.neu.dimple.creationaldesignpatterns.BuilderDesignPattern.builder;

import java.time.LocalDate;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {
    public static void main(String args[]){

        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user){
         return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1960,5,6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("45677");
        user.setAddress(address);
        return user;
    }
}
