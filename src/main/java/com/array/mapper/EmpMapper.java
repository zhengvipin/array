package com.array.mapper;

import com.array.domain.Emp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @classDesc: 员工表 数据操作接口
 * @author: Vipin Zheng
 * @createDate: 2018-05-23 10:32:59
 * @version: v1.0
 */
@Repository
public interface EmpMapper {
    @Select("select id,username,password,state from emp where state=1")
    List<Emp> findAll();

    int modifyStateBatch(@Param("idArr") Integer[] idArr,
                         @Param("state") Integer state);
}
