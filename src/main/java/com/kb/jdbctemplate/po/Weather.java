package com.kb.jdbctemplate.po;

/**
 * @description: po层
 * @Author: kb
 * @Date: 2019-10-24 12:59
 */
public class Weather {

    private Integer id;

    private String name;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Weather(Integer id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Weather(){}

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
