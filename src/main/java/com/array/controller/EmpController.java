package com.array.controller;

import com.array.domain.CustomType;
import com.array.domain.Emp;
import com.array.service.EmpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @classDesc: 员工表 控制器类
 * @author: Vipin Zheng
 * @createDate: 2018-05-23 10:33:39
 * @version: v1.0
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private EmpService empService;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<Emp> list = empService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/removeBatch")
    public ResponseEntity<?> removeBatch(@RequestParam("id") Integer[] idArr) {
        CustomType customType = new CustomType(200, "删除失败！");
        int rows = empService.removeBatch(idArr);
        if (rows > 0) {
            customType.setCode(200);
            customType.setMessage("删除成功！");
        }
        return ResponseEntity.ok(customType);
    }

    @PostMapping("/recoveryBatch")
    public ResponseEntity<?> recoveryBatch(@RequestParam("id") Integer[] idArr) {
        CustomType customType = new CustomType(200, "恢复失败！");
        int rows = empService.recoveryBatch(idArr);
        if (rows > 0) {
            customType.setCode(200);
            customType.setMessage("恢复成功！");
        }
        return ResponseEntity.ok(customType);
    }
}
