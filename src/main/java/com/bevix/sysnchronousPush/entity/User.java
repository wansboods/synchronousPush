package com.bevix.sysnchronousPush.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
@ToString
public class User {
    private Integer id;
    private String name;

}
