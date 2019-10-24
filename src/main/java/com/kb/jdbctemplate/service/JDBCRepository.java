package com.kb.jdbctemplate.service;

/**
 * @description:
 * @Author: kb
 * @Date: 2019-10-24 13:14
 */

import com.kb.jdbctemplate.po.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JDBCRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createWeather(Integer id, String name, String url) {
        jdbcTemplate.update("INSERT INTO website_jdbc(id,name,url) VALUES (?,?,?)", id, name, url);
    }

    public void updateWeather(Integer id, String name, String url) {
        jdbcTemplate.update("update website_jdbc set name=?,url=? where id=?", name, url, id);
    }

    public void deleteWeather(Integer id) {
        jdbcTemplate.update("delete from website_jdbc where id=?", id);
    }

    public Weather getWeather(Integer id) {
        List<Weather> list = jdbcTemplate.query("select * from website_jdbc where id=" + id, new BeanPropertyRowMapper(Weather.class));
        if (list != null && list.size() > 0) {
            Weather weather = list.get(0);
            return weather;
        }
        return null;
    }

}
