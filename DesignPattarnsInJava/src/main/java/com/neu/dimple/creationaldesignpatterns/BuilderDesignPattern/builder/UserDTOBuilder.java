package com.neu.dimple.creationaldesignpatterns.BuilderDesignPattern.builder;

import java.time.LocalDate;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    UserDTO build();

    UserDTO getUserDTO();

}
