package com.web.hotel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rooms {
    private Integer id;
    private Integer typeId;
    private Integer status;

    public Rooms(Integer typeId){
        this.typeId = typeId;
        this.status = 0;
    }

    public void setTypeId(Integer typeId){
        this.typeId = typeId;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public Integer getStatus() {
        return status;
    }
}
