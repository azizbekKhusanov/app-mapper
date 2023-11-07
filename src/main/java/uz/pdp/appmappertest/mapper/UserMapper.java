package uz.pdp.appmappertest.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import uz.pdp.appmapper.dto.CreateUserDTO;
import uz.pdp.appmapper.dto.UserDTO;
import uz.pdp.appmapper.entity.User;

@Mapper
public interface UserMapper {

    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    User toEntity(CreateUserDTO createUserDTO);

    UserDTO toDTO(User user);


}
