package uz.pdp.appmappertest.mapper.postMapper;

import jakarta.validation.constraints.NotBlank;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class PostDTO {

    @NotBlank
    private Integer postId;

    @NotBlank
    private String postTitle;

    @NotBlank
    private String postBody;


}
