package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserTest {

    public void testGetAllUsers() {
        User user1 = new User("Jhonny", 35, Sex.MALE);
        User user2 = new User("Марго", 35, Sex.FEMALE);
        User user3 = new User("Петя", 35, Sex.MALE);


        List<User> expected = new ArrayList<>();
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);


        List<User> actual = User.getAllUsers();


        assertEquals(expected, actual);
    }

    public void testTestGetAllUsers() {
    }

    public void testGetHowManyUsers() {
        User user1 = new User("Jhonny", 35, Sex.MALE);
        User user2 = new User("Марго", 30, Sex.FEMALE);
        User user3 = new User("Петя", 25, Sex.MALE);


        int expected = 3;
        int actual = User.getHowManyUsers();


        assertEquals(expected, actual);
    }

    public void testTestGetHowManyUsers() {
        new User("Jhonny", 35, Sex.MALE);
        new User("Петя", 25, Sex.MALE);


        int expected = 2;


        int actual = User.getHowManyUsers(Sex.MALE);


        assertEquals(expected, actual);
    }

    public void testGetAllAgeUsers() {
        new User("Jhonny", 35, Sex.MALE);
        new User("Марго", 30, Sex.FEMALE);
        new User("Петя", 25, Sex.MALE);


        int expected = 35 + 30 +25;


        int actual = User.getAllAgeUsers();


        assertEquals(expected, actual);
    }

    public void testTestGetAllAgeUsers() {
        new User("Jhonny", 35, Sex.MALE);
        new User("Петя", 25, Sex.MALE);
        new User("Марго", 30, Sex.FEMALE);


        int expected = 35 + 25;


        int actual = User.getAllAgeUsers(Sex.MALE);


        assertEquals(expected, actual);
    }

    public void testGetAverageAgeOfAllUsers() {
        new User("Jhonny", 35, Sex.MALE);
        new User("Марго", 30, Sex.FEMALE);
        new User("Петя", 25, Sex.MALE);


        int expected = 30; // (35 + 30 + 25) / 3


        int actual = User.getAverageAgeOfAllUsers();


        assertEquals(expected, actual);
    }

    public void testTestGetAverageAgeOfAllUsers() {
        new User("Jhonny", 35, Sex.MALE);
        new User("Петя", 25, Sex.MALE);
        new User("Марго", 30, Sex.FEMALE);


        int expected = 35 + 25 / 2;


        int actual = User.getAverageAgeOfAllUsers(Sex.MALE);


        assertEquals(expected, actual);
    }
}