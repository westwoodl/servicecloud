package com.xu.springcloud.service.serviceImpl;

import com.xu.springcloud.dao.DeptDao;
import com.xu.springcloud.entities.Dept;
import com.xu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept get(Long id) {
        return deptDao.findDept(id);
    }

    public List<Dept> list() {
        return deptDao.findAll();
    }
}
