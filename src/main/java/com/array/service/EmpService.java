package com.array.service;

import com.array.domain.Emp;
import com.array.mapper.EmpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @classDesc: 员工表 业务逻辑处理类
 * @author: Vipin Zheng
 * @createDate: 2018-05-23 10:33:17
 * @version: v1.0
 */
@Service
public class EmpService {
    @Resource
    private EmpMapper empMapper;

    public int removeBatch(Integer[] idArr) {
        return empMapper.modifyStateBatch(idArr,0);
    }

    public int recoveryBatch(Integer[] idArr) {
        return empMapper.modifyStateBatch(idArr,1);
    }

    public List<Emp> findAll(){
        return empMapper.findAll();
    }
}
