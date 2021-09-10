package com.rick.service;

import com.rick.domain.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    public Item findByName(String name);

}
