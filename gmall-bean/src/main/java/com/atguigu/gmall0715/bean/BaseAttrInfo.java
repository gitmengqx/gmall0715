package com.atguigu.gmall0715.bean;

import lombok.Data;

import javax.persistence.*;
import javax.sound.midi.Soundbank;
import java.io.Serializable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 获取主键自增
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    @Transient // 表示数据库中没有的字段，但是在业务中需要！
    private List<BaseAttrValue>  attrValueList;

}
