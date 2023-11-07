package uz.pdp.appmappertest.mapper.personMapper;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class PassportDTO {

    private String serial;
    private String number;

}
