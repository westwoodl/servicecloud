package com.xu.springcloud.dao;

import com.xu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //与spring-boot整合（也可以在main方法上面写@MapperScan）
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findDept(Long id);

    public List<Dept> findAll();
}
