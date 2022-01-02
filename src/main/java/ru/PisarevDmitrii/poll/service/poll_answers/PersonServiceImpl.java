package ru.PisarevDmitrii.poll.service.poll_answers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.PisarevDmitrii.poll.repository.poll_answers.PersonRepository;
import ru.PisarevDmitrii.poll.entity.Person;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    @Transactional
    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    @Override
    @Transactional
    public void createOrUpdatePerson(Person person) {
        personRepository.createOrUpdatePerson(person);
    }

    @Override
    @Transactional
    public Person getPerson(int id) {
        return personRepository.getPerson(id);
    }

    @Override
    @Transactional
    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }
}
