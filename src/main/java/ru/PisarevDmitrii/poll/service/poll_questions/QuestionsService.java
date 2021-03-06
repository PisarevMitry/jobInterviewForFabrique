package ru.PisarevDmitrii.poll.service.poll_questions;

import ru.PisarevDmitrii.poll.entity.Question;

import java.util.List;

public interface QuestionsService {

    List<Question> getQuestionList(int pollId);

    Question getQuestion(int pollId, int questionId);

    void createQuestion(int pollId, Question question);

    void updateQuestion(int pollId, Question question);

    void deleteQuestion(int pollId, int questionId);
}
