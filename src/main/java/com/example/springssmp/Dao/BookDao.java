package com.example.springssmp.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springssmp.domain.book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BookDao extends BaseMapper<book> {

}
