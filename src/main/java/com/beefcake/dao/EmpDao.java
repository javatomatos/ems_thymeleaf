package com.beefcake.dao;

import com.beefcake.entity.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    Emp find(String id);

    void update(Emp emp);


}
