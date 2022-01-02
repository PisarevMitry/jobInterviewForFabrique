package ru.PisarevDmitrii.poll.dto.api.respomce;

import lombok.Data;

import java.util.List;

@Data
public class PersonDTO {

    int id;
    String email;
    List<AnswerDTO> answers;
}
