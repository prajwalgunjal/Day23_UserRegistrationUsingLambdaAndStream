package com.bridgelabz;
import bridgelabz.UserRegistrationUsingLambda;
import org.junit.jupiter.api.*;
public class UserRegistrationUsingLambdaTest {
    static UserRegistrationUsingLambda userRegistration;

    @BeforeAll
    public static void init(){
        System.out.println("Before all");
        userRegistration = new UserRegistrationUsingLambda();
    }
    @Test
    void givenFirstnameshouldreturnTrue() {
        boolean value = userRegistration.validate("Prajwal");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully passed UC1");
    }

}
