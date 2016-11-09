package com.one.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by wyj on 2016/9/22.
 */
public interface IUserDAO {
    public Map login(Map map);
    List query();
    void save(Map map);
}
