package exhibitmanagement.domain;

import exhibitmanagement.Factory.PersonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Leonard Dukashe on 2016/03/28.
 */
public class PersonTest {

    private Person person;


    @Before
    public void setUp() throws Exception {

        person = PersonFactory.getPerson("Bonga","Mabulu", "05436800");
    }

    @Test
    public void testPerson() throws Exception {
        Assert.assertEquals(person.getName(),"Bonga");
        Assert.assertEquals(person.getSurname(), "Mabulu");
        Assert.assertEquals(person.getPersalNumber(), "05436800");

    }

    @Test
    public void testNewUpdate() throws Exception {
        Person personUpdate = new Person.Builder(person.getName())
                .copy(person)
                .persalNumber("05436801")
                .surname("Mabuli")
                .build();
        Assert.assertEquals(personUpdate.getName(),"Bonga");
        Assert.assertEquals(personUpdate.getSurname(), "Mabuli");
        Assert.assertEquals(personUpdate.getPersalNumber(), "05436801");

    }
}


