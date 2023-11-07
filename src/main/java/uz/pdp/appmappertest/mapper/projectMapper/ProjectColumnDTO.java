package uz.pdp.appmappertest.mapper.projectMapper;

import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class ProjectColumnDTO {
    private String name;
    private String order;
    private LocalDateTime createdAt;
}
