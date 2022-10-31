package com.example.rediscrud.controller;

import com.example.rediscrud.entity.MayBay;
import com.example.rediscrud.repository.MayBayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class MayBayController {
    @Autowired
    private MayBayDao mayBayDao;
    @PostMapping
    public MayBay saveMayBay(@RequestBody MayBay mayBay){
        return mayBayDao.save(mayBay);
    }
    @GetMapping("/{id}")
    public List<MayBay> getAllMayBay(){
        return mayBayDao.findAll();
    }
    @GetMapping("/{id}")
    public MayBay findMayBayById(@PathVariable int id){
        return mayBayDao.findByMayBayId(id);
    }
    @DeleteMapping("/{id}")
    public String deleteMayBayById(@PathVariable int id){
        return mayBayDao.deleteMayBay(id);
    }

}
