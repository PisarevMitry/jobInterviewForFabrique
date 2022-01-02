package ru.PisarevDmitrii.poll.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.PisarevDmitrii.poll.dto.api.respomce.AnswerDTO;
import ru.PisarevDmitrii.poll.entity.Answer;

@Mapper
public interface AnswerMapper {

    AnswerMapper INSTANCE = Mappers.getMapper(AnswerMapper.class);

    AnswerDTO toDTO(Answer answer);
}
