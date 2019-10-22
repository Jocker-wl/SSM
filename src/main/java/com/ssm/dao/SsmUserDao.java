package com.ssm.dao;

import com.ssm.model.SsmUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ssmUserDao")
public interface SsmUserDao
{
    List<SsmUser> findAll();
}
