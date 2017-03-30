package com.jzyuchen.ssm.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public interface BaseService<T, PK extends Serializable> {

    T find(PK primaryKey);

    List<T> findAll();

    PK insert(T entity);

    void delete(PK primaryKey);

    void update(T entity);

}
