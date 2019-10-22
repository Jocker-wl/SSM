package com.ssm.service.impl;

import com.ssm.dao.SsmUserDao;
import com.ssm.model.SsmUser;
import com.ssm.service.SsmUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SsmUserServiceImpl implements SsmUserService
{
    @Resource
    private SsmUserDao ssmUserDao;

    public List<SsmUser> findAll()
    {
        return ssmUserDao.findAll();
    }
}
