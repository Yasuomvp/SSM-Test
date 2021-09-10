package com.rick.service.impl;

import com.rick.dao.ItemMapper;
import com.rick.domain.Item;
import com.rick.service.ItemService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findByName(String name) {
        return itemMapper.findByName(name);
    }
}
