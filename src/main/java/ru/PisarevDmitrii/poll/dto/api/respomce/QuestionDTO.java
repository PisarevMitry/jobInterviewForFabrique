package ru.PisarevDmitrii.poll.dto.api.respomce;

import lombok.Data;
import ru.PisarevDmitrii.poll.enums.QuestionType;

@Data
public class QuestionDTO {

    int id;
    int pollId;
    QuestionType questionType;
    String name;
}
