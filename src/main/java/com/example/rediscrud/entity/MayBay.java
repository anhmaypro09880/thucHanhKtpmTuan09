package com.example.rediscrud.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "maybay")
@Getter
@Setter
@RedisHash("maybay")
public class MayBay implements Serializable {
    @Id
    private int maMB;
    private String loai;
    private int tamBay;
}