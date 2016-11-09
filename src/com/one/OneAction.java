package com.one;

import com.one.service.IUserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wyj on 2016/9/22.
 */
public class OneAction {
    private String name;
    private String pwd;
    private IUserService service;
    public String execute(){
        System.out.print("name:"+getName()+",pwd:"+getPwd());
        Map map = new HashMap();
        map.put("name",name);
        map.put("pwd",pwd);
        map = service.login(map);
        if(map.get("result")==null){
            return "error";
        }else {
            return "success";
        }
    }
    public String query(){
        System.out.print("进入query方法...");
        List list = service.query();
        System.out.println("查询的结果是:"+list);
        ActionContext.getContext().put("users",list);
        return "users";
    }
    public String save(){
        System.out.print("进入保存方法");
        Map map = ActionContext.getContext().getParameters();
        getService().save(map);
        return "success";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name==null?"":name;
    }

    public String getPwd() {
        return pwd==null?"":pwd;
    }

    public void setService(IUserService service) {
        this.service = service;
    }

    public IUserService getService() {
        return service;
    }
}
