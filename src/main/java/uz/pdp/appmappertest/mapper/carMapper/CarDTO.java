package uz.pdp.appmappertest.mapper.carMapper;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class CarDTO {

    @NotBlank
    private String name;

    @NotBlank
    private double price;

    @NotBlank
    private String photoPath;
}
