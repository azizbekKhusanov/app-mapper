package uz.pdp.appmappertest.mapper.projectMapper;


import org.mapstruct.Mapper;

@Mapper
public interface ProjectMapper {

    Project toEntity(ProjectDTO projectDTO);
    

}
