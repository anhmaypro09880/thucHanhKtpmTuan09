package com.example.rediscrud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "nhanvien")
@RedisHash("nhanvien")
public class NhanVien implements Serializable {
    @Id
    @Column(name = "MaNV")
    private String maNV;
    @Column(name = "Ten")
    private String tenNV;
    @Column(name = "Luong")
    private double luong;
}