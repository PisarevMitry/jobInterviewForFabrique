package ru.PisarevDmitrii.poll.dto.api.respomce;

import lombok.Data;
import ru.PisarevDmitrii.poll.entity.AnswerVariant;
import ru.PisarevDmitrii.poll.entity.Person;
import ru.PisarevDmitrii.poll.entity.Poll;
import ru.PisarevDmitrii.poll.entity.Question;

import java.util.List;

@Data
public class AnswerDTO {

    int id;
    Person person;
    Poll poll;
    Question question;
    List<AnswerVariant> answerVariantList;
}
