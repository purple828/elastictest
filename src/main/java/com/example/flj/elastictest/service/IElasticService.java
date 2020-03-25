package com.example.flj.elastictest.service;

import com.example.flj.elastictest.model.DocBean;
import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

/**
 * @author flj
 * @Description:
 * @date 2020/3/24 下午4:36
 **/
public interface IElasticService {

    void createIndex();

    void deleteIndex(String index);

    void save(DocBean docBean);

    void saveAll(List<DocBean> list);

    Iterator<DocBean> findAll();

    Page<DocBean> findByContent(String content);

    Page<DocBean> findByFirstCode(String firstCode);

    Page<DocBean> findBySecordCode(String secordCode);

    Page<DocBean> query(String key);
}
