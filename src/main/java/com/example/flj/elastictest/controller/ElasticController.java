package com.example.flj.elastictest.controller;

import com.example.flj.elastictest.model.DocBean;
import com.example.flj.elastictest.model.SearchReq;
import com.example.flj.elastictest.service.IElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author flj
 * @Description:
 * @date 2020/3/24 下午4:39
 **/
@RestController
@RequestMapping("/elastic")
public class ElasticController {

    @Autowired
    private IElasticService elasticService;

    @GetMapping("/init")
    public void init(){
        elasticService.createIndex();
        List<DocBean> list =new ArrayList<>();
        list.add(new DocBean(1L,"XX0193","XX8064","xxxxxx",1));
        list.add(new DocBean(2L,"XX0210","XX7475","xxxxxxxxxx",1));
        list.add(new DocBean(3L,"XX0257","XX8097","xxxxxxxxxxxxxxxxxx",1));
        elasticService.saveAll(list);

    }

    @GetMapping("/all")
    public Iterator<DocBean> all(){
        return elasticService.findAll();
    }

    @PostMapping("/findByContent")
    public Page<DocBean> findByContent(@RequestBody SearchReq req){
        System.out.println("-----");
        return elasticService.findByContent(req.getContent());
    }

}
