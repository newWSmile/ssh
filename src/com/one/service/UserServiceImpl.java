package com.one.service;

import com.one.dao.IUserDAO;

import java.util.List;
import java.util.Map;

/**
 * Created by wyj on 2016/9/22.
 */
public class UserServiceImpl implements IUserService {
//    通过配置文件注入dao
    private IUserDAO dao ;
    @Override
    public Map login(Map map) {
        return dao.login(map);
    }

    @Override
    public List query() {
        return getDao().query();
    }

    @Override
    public void save(Map map) {
        getDao().save(map);
    }

    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }

    public IUserDAO getDao() {
        return dao;
    }
}
