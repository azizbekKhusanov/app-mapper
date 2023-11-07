package uz.pdp.appmappertest.mapper.personMapper;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class AddressDTO {

    private String city;
    private int apartment;

}
