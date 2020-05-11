package com.cgh.demo.controller;

import com.cgh.demo.entity.Carousel;
import com.cgh.demo.service.CarouselService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 轮播图 (Carousel)表控制层
 *
 * @author makejava
 * @since 2020-05-11 13:05:13
 */
@RestController
@RequestMapping("carousel")
public class CarouselController {
    /**
     * 服务对象
     */
    @Resource
    private CarouselService carouselService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Carousel selectOne(String id) {
        return this.carouselService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<Carousel> selectAll() {
        return this.carouselService.queryAllByLimit(0,100);
    }

}