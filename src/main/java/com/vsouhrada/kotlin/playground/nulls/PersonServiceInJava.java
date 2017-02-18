package com.vsouhrada.kotlin.playground.nulls;

import com.vsouhrada.kotlin.playground.beans.PersonInJava;

/**
 * @author vsouhrada
 */
public class PersonServiceInJava {

    public void validateFulabMember(PersonInJava person) throws IllegalStateException {
        if (person != null) {
            if (person.getFirstName() != null) {
                if (person.getFirstName().startsWith(" ")) {
                    throw new IllegalStateException("First Name is not allowed to beginning with empty string");
                }
            }
            if (person.getLastName() != null) {
                if (person.getFirstName().startsWith(" ")) {
                    throw new IllegalStateException("Last Name is not allowed to beginning with empty string");
                }
            }
            if (person.getEmail() != null) {
                if (!person.getEmail().contains("@gmail..com")) {
                    throw new IllegalStateException("Only GMAIL domains are allowed!!!");
                }
            }
        }
    }
}
