package com.one.service;

import java.util.List;
import java.util.Map;

/**
 * Created by wyj on 2016/9/22.
 */
public interface IUserService {
    public Map login(Map map);
    List query();
    void save(Map map);
}
