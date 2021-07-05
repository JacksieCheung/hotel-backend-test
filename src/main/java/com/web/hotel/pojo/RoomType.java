package com.web.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomType {
    private Integer id;
    private Integer price;
    private String info;

    public RoomType(Integer price,String info){
        this.price = price;
        this.info = info;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }
}
