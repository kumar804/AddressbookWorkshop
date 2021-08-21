package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    @Test
    void givenfirstname_shouldreturnTrue() {
        AddressBook FirstName = new AddressBook();
        boolean result = FirstName.nameValidation("Manish");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenLastnameshouldreturnTrue() {
        AddressBook LastName = new AddressBook();
        boolean result = LastName.nameValidation("Singh");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenemailshouldreturnTrue() {
        AddressBook email = new AddressBook();
        boolean result = email.email("abc@gmail.com");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenmobilenumbershouldreturnTrue() {
        AddressBook mobileNum = new AddressBook();
        boolean result = mobileNum.mobileNumValidation("91 9523546770");
        Assertions.assertEquals(result,true);
    }
}
