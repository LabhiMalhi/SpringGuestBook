package com.malhi.spring;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Guest {
    private int id;
    private String firstName;
    private String lastName;
    private String phonenumber;
    private Address address;
}
