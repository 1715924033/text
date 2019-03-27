package cn.qi.service.impl;

import cn.qi.dao.UserMapper;
import cn.qi.domain.User;
import cn.qi.service.UserSercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserSerciceImpl implements UserSercice {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<User> list = userMapper.selectByExample(null);
        return list;
    }
}
