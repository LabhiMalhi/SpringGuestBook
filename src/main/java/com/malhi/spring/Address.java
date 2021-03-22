package com.malhi.spring;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Address {
    private String id;
    private addressType addressType;
    private String city;
    private String postal;

}
