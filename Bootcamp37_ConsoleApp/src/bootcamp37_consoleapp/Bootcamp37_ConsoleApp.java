/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

import bootcamp37_consoleapp.Person.Gender;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aqira
 */
public class Bootcamp37_ConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Person> person = getPerson();
        System.out.println(person);
        System.out.println(Person.makananFaforit());
    }

    private static List<Person> getPerson() {
        List<Person> person = new ArrayList<>();
        //ctrl + shift + i
        person.add(new Person("Aqira", 23, Gender.MALE));
        person.add(new Person("Iqwal", 23, Gender.MALE));
        person.add(new Person("Nisa", 23, Gender.FEMALE));
        person.add(new Person("Fikri", 23, Gender.MALE));
        person.add(new Person("Zakky", 23, Gender.MALE));

        try {

            person.get(5).setAge(24);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return person;
    }

}
