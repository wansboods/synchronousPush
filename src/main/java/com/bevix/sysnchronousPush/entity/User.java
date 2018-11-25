package com.bevix.sysnchronousPush.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
@ToString
public class User {
    private String id;
    private String ip;//用户的id
    private String seeTime;//用户访问的时间
    private int seeCount;//用户访问的次数

}
