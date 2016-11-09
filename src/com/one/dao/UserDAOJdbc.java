package com.one.dao;

import com.one.pojos.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlFunction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * Created by wyj on 2016/9/22.
 */
public class UserDAOJdbc extends HibernateDaoSupport implements IUserDAO {
//    private DataSource dataSource;
    @Override
    public Map login(Map map) {
        String name = (String) map.get("name");
        String pwd = (String) map.get("pwd");
//        String sql = "select count(1) from users where name=? and pwd=?";
//        SqlFunction sf = new SqlFunction(getDataSource(),sql);
//        sf.declareParameter(new SqlParameter(Types.VARCHAR));
//        sf.declareParameter(new SqlParameter(Types.VARCHAR));
//        sf.compile();
//        int i = sf.run(new Object[]{name,pwd});
//        System.out.print("此用户名的数量："+i);
//        if(i>=1){
//            map.put("result","1");
//        }
//        return map;

        String sql = "select count(1) from users where name=:name and pwd=:pwd";
        List users = getSession().createSQLQuery(sql).setParameter("name","name").setParameter("pwd","pwd").list();
        System.out.println("users---------------::::::::::::"+users);
        if(users.size()>=1){
            map.put("result","1");
        }
        return map;
    }

    @Override
    public List query() {
//        String sql ="select name,pwd from users";
//        JdbcTemplate jt = new JdbcTemplate(getDataSource());
//        List list =jt.queryForList(sql);

        List list = getSession().createCriteria(User.class).list();
        return list;
    }

    @Override
    public void save(Map map) {
        String[] names = (String[]) map.get("name");
        String[] pwds = (String[]) map.get("pwd");
        for (int i=0;i<names.length;i++){
            if (!names[i].trim().equals("") && !pwds[i].trim().equals("")){
                User user = new User();
                user.setName(names[i]);
                user.setPwd(pwds[i]);
                getSession().save(user);
            }
        }
    }

//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    public DataSource getDataSource() {
//        return dataSource;
//    }



}
