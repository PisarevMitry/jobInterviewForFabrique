package ru.PisarevDmitrii.poll.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.PisarevDmitrii.poll.dto.api.respomce.PollDTO;
import ru.PisarevDmitrii.poll.entity.Poll;

@Mapper
public interface PollMapper {

    PollMapper INSTANCE = Mappers.getMapper(PollMapper.class);

    PollDTO toDTO(Poll poll);
}
