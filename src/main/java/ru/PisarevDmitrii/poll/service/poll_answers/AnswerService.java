package ru.PisarevDmitrii.poll.service.poll_answers;

import ru.PisarevDmitrii.poll.entity.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> getAllAnswers();

    void createOrUpdateAnswer(Answer answer);

    Answer getAnswer(int id);

    void deleteAnswer(int id);
}
