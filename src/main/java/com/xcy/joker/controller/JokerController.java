package com.xcy.joker.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xcy.joker.entry.Joker;
import com.xcy.joker.service.JokerService;
import com.xcy.joker.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: joker
 * @author: YeMao
 * @create: 2019-08-07 09:27
 */

@CrossOrigin
@RestController
@Api(value = "笑话大全",tags = "笑话大全")
public class JokerController {

    @Autowired
    JokerService jokerService;

    //新增
    @PutMapping("/joker/save.do")
    @ApiOperation("新增笑话")
    public Result save(@RequestBody Joker joker){
        return Result.execute(jokerService.save(joker),"新增");
    }

    //查询全部
    @ApiOperation(value = "查询全部笑话",notes = "查询全部笑话")
    @GetMapping("/joker/getAll.do")
    public Result getAll(){
        return Result.setOk("查询全部笑话",jokerService.list());
    }

    //分页查询
    @ApiOperation("分页查询")
    @GetMapping("/joker/page/{page}/{count}")
    public Result page(@PathVariable int page,@PathVariable int count){
        Page<Joker> jokerPage = new Page<Joker>(page,count);
        return Result.setOk("OK",jokerService.page(jokerPage));
    }
}
