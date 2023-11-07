package uz.pdp.appmappertest.mapper.personMapper;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
//@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String passportSerial;
    @Column(nullable = false)
    private String passportNumber;

    @Column(nullable = false)
    private String addressCity;
    @Column(nullable = false)
    private String addressApartment;



}
