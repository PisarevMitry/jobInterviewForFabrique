package ru.PisarevDmitrii.poll.repository.poll_questions;

import ru.PisarevDmitrii.poll.entity.Question;

import java.util.List;

public interface QuestionsRepository {

    List<Question> getQuestionList(int pollId);

    Question getQuestion(int pollId, int questionId);

    void createOrUpdateQuestion(Question question);

    void deleteQuestion(int pollId, int questionId);
}
