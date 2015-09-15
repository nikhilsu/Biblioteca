package com.thoughtworks.librarysys;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldBeEqualToAnotherUserWithTheSameName() {
        User userOne = new User("111-1111", "passwd");
        User userTwo = new User("111-1111", "passwd");

        assertEquals(userOne, userTwo);
    }

    @Test
    public void shouldBeEqualToAnotherUserWithTheSameLibraryIDAndPassword() {
        User userOne = new User("111-1111", "passwd");
        User userTwo = new User("111-1111", "passwd");

        assertEquals(userOne, userTwo);
    }

    @Test
    public void shouldNotBeEqualToAnotherUserWithSameLibraryIDButDifferentPassword() {
        User userOne = new User("111-1111", "passwd");
        User userTwo = new User("111-1111", "Not a Password");

        assertNotEquals(userOne, userTwo);
    }

    @Test
    public void shouldNotBeEqualToSomethingThatIsNotAUser() {
        User userOne = new User("111-1111", "passwd");

        assertNotEquals(userOne, "User");
    }

    @Test
    public void shouldNotBeEqualToNull() {
        User userOne = new User("111-1111", "passwd");

        assertNotEquals(userOne, null);
    }

    @Test
    public void shouldHaveTheSameHashCodeAsAnotherObjectHavingTheSameState() {
        User userOne = new User("111-1111", "passwd");
        User userTwo = new User("111-1111", "passwd");

        assertEquals(userOne.hashCode(), userTwo.hashCode());
    }

    @Test
    public void sameObjectsHaveEqualHashCodes() {
        User userOne = new User("111-1111", "passwd");

        assertEquals(userOne.hashCode(), userOne.hashCode());
    }
}