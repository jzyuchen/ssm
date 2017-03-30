package com.jzyuchen.ssm.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public interface BaseMapper<T, PK extends Serializable> {
    T find(PK primaryKey);

    List<T> findAll();

    PK insert(T entity);

    void delete(PK primaryKey);

    void update(T entity);
}
