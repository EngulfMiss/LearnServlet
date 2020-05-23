package cn.Engulf.server.impl;

import cn.Engulf.dao.UserDao;
import cn.Engulf.dao.impl.UserDaoImpl;
import cn.Engulf.domain.User;
import cn.Engulf.server.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
}
