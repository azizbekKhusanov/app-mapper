package uz.pdp.appmappertest.mapper.projectMapper;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class ProjectDTO {

    @NotBlank
    private String name;

    @NotBlank
    private List<ProjectColumnDTO> listOfColumn;

    @NotBlank
    private LocalDateTime localDateTime;

}
