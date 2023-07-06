package com.neu.dimple.creationaldesignpatterns.builder2;

import com.neu.dimple.creationaldesignpatterns.builder.Address;
import com.neu.dimple.creationaldesignpatterns.builder.User;

import java.time.LocalDate;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Client {

    public static void main(String args[]){

        User user = createUser();

        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
    }

    public static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user){
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
