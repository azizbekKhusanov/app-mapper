package uz.pdp.appmappertest.mapper.personMapper;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class PersonDTO {

    private String fullName;
    private int personAge;

}
