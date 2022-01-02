package ru.PisarevDmitrii.poll.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.PisarevDmitrii.poll.entity.Question;
import ru.PisarevDmitrii.poll.dto.api.respomce.QuestionDTO;

@Mapper
public interface QuestionMapper {

    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    @Mapping(target = "pollId", source = "poll.id")
    QuestionDTO toDTO(Question question);
}
