package com.web.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomInfo {
    private Integer id;
    private Integer typeId;
    private Integer status;
    private Integer price;
    private String info;

    public RoomInfo(Integer typeId,Integer status,Integer price,String info){
        this.typeId = typeId;
        this.status = status;
        this.price = price;
        this.info = info;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getTypeId(){
        return this.typeId;
    }

    public void setTypeId(Integer typeId){
        this.typeId = typeId;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPrice(){
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getInfo(){
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
