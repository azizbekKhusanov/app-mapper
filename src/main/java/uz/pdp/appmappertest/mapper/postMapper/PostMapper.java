package uz.pdp.appmappertest.mapper.postMapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PostMapper {

    @Mapping(target = "body", source = "postBody")
    @Mapping(target = "title", source = "postTitle")
//    @Mapping(target = "body", source = "postTitle", ignore = true)  // ignore the body field
//    @Mapping(target = "id", expression = "java(generateId())")   // java methods generateId()
    Post toEntity(PostDTO postDTO);

    @InheritInverseConfiguration  // Mapping(target = "postBody", source = "body") ....
    PostDTO toDTO(Post post);





//    default String generateId(){
//        return UUID.randomUUID().toString();
//    }


    // CUSTOM MAPPER
//    default Post customToEntity(PostDTO postDTO){
//
//        Post.PostBuilder postBuilder = new Post.PostBuilder();
//
//        postBuilder.title(postDTO.getPostBody());
//        postBuilder.body(postDTO.getPostBody());
//
//        return postBuilder.build();
//    }

}