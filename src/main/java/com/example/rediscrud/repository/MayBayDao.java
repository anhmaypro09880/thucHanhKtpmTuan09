package com.example.rediscrud.repository;

import com.example.rediscrud.entity.MayBay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MayBayDao {
    @Autowired
    private RedisTemplate template;
    public MayBay save(MayBay mayBay){
        template.opsForHash().put("maybay",mayBay.getMaMB(),mayBay.getLoai());
        return mayBay;
    }
    public List<MayBay> findAll(){
        List<MayBay> list = template.opsForHash().values("maybay");
        return template.opsForHash().values("maybay");

    }
    public MayBay findByMayBayId(int id){
        return (MayBay) template.opsForHash().get("maybay",id);

    }
    public String deleteMayBay(int id){
        template.opsForHash().delete("maybay",id);
        return "remove successfully";
    }
}
