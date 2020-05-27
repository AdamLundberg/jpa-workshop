package se.kalmar.adam.jpaworkshop.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    AppUser testObject;
    int id = 10;
    String firstName = "Adam";
    String lastName = "Lundberg";
    String email = "adam@lundberg.com";

    @BeforeEach
    void setUp() {
        testObject = new AppUser(id, firstName, lastName, email);
    }

    @Test
    void testSuccessfullyCreated() {
       assertEquals(testObject.getAppUserId(), id);
       assertEquals(testObject.getFirstName(), firstName);
       assertEquals(testObject.getLastName(), lastName);
       assertEquals(testObject.getEmail(), email);
    }

    @Test
    void testEquals() {
        AppUser isEqual = new AppUser(id, firstName, lastName, email);

        assertTrue(testObject.equals(isEqual));
    }

    @Test
    void testHashCode() {
        AppUser isEqual = new AppUser(id, firstName, lastName, email);

        assertEquals(testObject.hashCode(), isEqual.hashCode());
    }

    @Test
    void testToString() {
        String toString = testObject.toString();

        assertTrue(toString.contains(firstName));
    }
}