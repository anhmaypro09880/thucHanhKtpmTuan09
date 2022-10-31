package com.example.rediscrud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "nhanvien")
@RedisHash("nhanvien")
public class NhanVien implements Serializable {
    @Id

    private String maNV;

    private String tenNV;

    private double luong;
}