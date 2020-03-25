package com.example.flj.elastictest.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author flj
 * @Description:
 * @date 2020/3/25 上午10:17
 **/
@Data
@Accessors(chain = true)
public class SearchReq implements Serializable {

    private String content;

}
