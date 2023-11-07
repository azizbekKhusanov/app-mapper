package uz.pdp.appmappertest.mapper.personMapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {


    @Mapping(target = "name", source = "personDTO.fullName")
    @Mapping(target = "age", source = "personDTO.personAge")
    @Mapping(target = "addressApartment", source = "addressDTO.apartment")
    @Mapping(target = "addressCity", source = "addressDTO.city")
    @Mapping(target = "passportNumber", source = "passportDTO.number")
    @Mapping(target = "passportSerial", source = "passportDTO.serial")
    Person toEntity(PersonDTO personDTO, PassportDTO passportDTO, AddressDTO addressDTO);


    @InheritInverseConfiguration // default mapping
    PersonDTO toPersonDTO(Person person);

    @InheritInverseConfiguration // default mapping
    AddressDTO toAddressDTO(Person person);

    @InheritInverseConfiguration  // default mapping
    PassportDTO toPassportDTO(Person person);


}
