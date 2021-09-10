package com.rick.dao;


import org.apache.ibatis.annotations.Mapper;
import com.rick.domain.Item;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface ItemMapper {

    public Item findByName(String name);

}
