package ru.PisarevDmitrii.poll.service.poll_questions;

import ru.PisarevDmitrii.poll.entity.Poll;

import java.util.List;

public interface PollService {

    List<Poll> getAllPolls();

    Poll createPoll(Poll poll);

    Poll updatePoll(Poll poll);

    Poll getPoll(int id);

    void deletePoll(int id);
}
