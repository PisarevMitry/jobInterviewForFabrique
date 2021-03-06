package ru.PisarevDmitrii.poll.service.poll_answers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.PisarevDmitrii.poll.repository.poll_answers.AnswerRepository;
import ru.PisarevDmitrii.poll.entity.Answer;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    @Override
    @Transactional
    public List<Answer> getAllAnswers() {
        return answerRepository.getAllAnswers();
    }

    @Override
    @Transactional
    public void createOrUpdateAnswer(Answer answer) {
        answerRepository.createOrUpdateAnswer(answer);
    }

    @Override
    @Transactional
    public Answer getAnswer(int id) {
        return answerRepository.getAnswer(id);
    }

    @Override
    @Transactional
    public void deleteAnswer(int id) {
        answerRepository.deleteAnswer(id);
    }
}
