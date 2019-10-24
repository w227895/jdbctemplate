package com.kb.jdbctemplate.contorller;

import com.kb.jdbctemplate.po.Weather;
import com.kb.jdbctemplate.service.JDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @Author: kb
 * @Date: 2019-10-24 13:13
 */
@RestController
public class JDBCController {

    @Autowired
    private JDBCRepository jdbcRepository;

    @GetMapping(value="/get/{id}")
    public Weather testList(@PathVariable("id") Integer id){
        return jdbcRepository.getWeather(id);
    }

    @PostMapping(value="/add")
    public void testAdd(@RequestParam("id")Integer id, @RequestParam("name")String name, @RequestParam("url")String url){
        jdbcRepository.createWeather(id,name,url);
    }

    @PutMapping(value="/update/{id}")
    public void testUpdate(@PathVariable("id") Integer id,@RequestParam("name")String name,@RequestParam("url")String url){
        jdbcRepository.updateWeather(id, name, url);
    }

    @DeleteMapping(value="/delete/{id}")
    public void testDelete(@PathVariable("id") Integer id){
        jdbcRepository.deleteWeather(id);
    }

}
