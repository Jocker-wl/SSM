package com.ssm.controller;

import com.ssm.model.SsmUser;
import com.ssm.service.SsmUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping( value = "/user")
public class SsmUserController
{
    @Resource
    private SsmUserService ssmUserService;

    @GetMapping(value = "/findAll")
    public String findAll()
    {
        List<SsmUser> SsmUserList = ssmUserService.findAll();
        for ( SsmUser ssmUser:SsmUserList )
        {
            System.out.println( "name:"+ssmUser.getName()+"password:"+ssmUser.getPassword() );
        }
        return "Hello";
    }
}
