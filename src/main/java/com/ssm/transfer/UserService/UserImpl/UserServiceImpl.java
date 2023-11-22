package com.ssm.transfer.UserService.Impl;

import com.ssm.transfer.UserDao.UserDao;
import com.ssm.transfer.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void transfer(String out, String in, Double money) {
        userDao.income(in, money);
        userDao.outgo(out, money);
    }
}
