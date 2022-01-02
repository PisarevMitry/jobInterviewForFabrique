package ru.PisarevDmitrii.poll.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.PisarevDmitrii.poll.dto.api.respomce.AnswerVariantDTO;
import ru.PisarevDmitrii.poll.entity.AnswerVariant;

@Mapper
public interface AnswerVariantMapper {

    AnswerVariantMapper INSTANCE = Mappers.getMapper(AnswerVariantMapper.class);

    AnswerVariantDTO toDTO(AnswerVariant answerVariant);
}
