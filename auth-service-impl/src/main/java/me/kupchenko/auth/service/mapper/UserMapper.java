package me.kupchenko.auth.service.mapper;

import me.kupchenko.auth.service.dto.UserDto;
import me.kupchenko.auth.service.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(ignore = true, target = "roles")
    UserDto userToUserDto(User noteDto);
}
