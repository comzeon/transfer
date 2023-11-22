package com.ssm.transfer.UserService.LogImpl;

import com.ssm.transfer.UserDao.LogDao;
import com.ssm.transfer.UserService.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    public void log(String in, String out, Double money, String flag){
        logDao.log(out + "向" + in + "转入金额" + money, flag);
    }
}
