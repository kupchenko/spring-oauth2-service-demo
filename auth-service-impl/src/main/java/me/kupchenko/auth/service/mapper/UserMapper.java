package me.kupchenko.auth.service.mapper;

import me.kupchenko.auth.service.dto.UserDto;
import me.kupchenko.auth.service.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserDto(User noteDto);
}
