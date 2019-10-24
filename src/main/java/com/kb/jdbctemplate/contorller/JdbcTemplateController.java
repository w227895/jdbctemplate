package com.kb.jdbctemplate.contorller;

import com.kb.jdbctemplate.po.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 简单测试
 * @Author: kb
 * @Date: 2019-10-24 12:57
 */
@RestController
@RequestMapping("/jdbc")
public class JdbcTemplateController {
    private Logger logger = LoggerFactory.getLogger(JdbcTemplateController.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 简单测试下JdbcTemplate
     *
     * @return
     */
    @GetMapping("/selectAll")
    public List<Weather> selectAll() {
        logger.info("使用JdbcTemplate查询数据库");
        String sql = "SELECT * FROM website_jdbc ";
        List<Weather> queryAllList = jdbcTemplate.query(sql, new Object[]{},
                new BeanPropertyRowMapper<>(Weather.class));
        logger.info("查询天气状况" + queryAllList);
        return queryAllList;
    }
}
