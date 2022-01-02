package ru.PisarevDmitrii.poll.service.poll_answers;

import ru.PisarevDmitrii.poll.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    void createOrUpdatePerson(Person person);

    Person getPerson(int id);

    void deletePerson(int id);
}
