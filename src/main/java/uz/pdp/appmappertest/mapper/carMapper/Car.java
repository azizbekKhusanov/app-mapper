package uz.pdp.appmappertest.mapper.carMapper;

import jakarta.persistence.*;
import lombok.*;

import java.nio.file.Path;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
//@Entity
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Path photoPath;

}
