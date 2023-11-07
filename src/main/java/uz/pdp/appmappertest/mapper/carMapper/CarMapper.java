package uz.pdp.appmappertest.mapper.carMapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.nio.file.Path;

@Mapper
public interface CarMapper {


    @Mapping(source = "photoPath", target = "photoPath", qualifiedByName = "pathToString")
    CarDTO toDTO(Car car);


    @Named(value = "pathToString")
    default String pathToString(Path path){

        if(path == null)
            return null;

        return path.toString();
    }


}
