package com.hexun.busi.config.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yl
 * @date 2019/8/14
 */
@RestController
public class ConfigTestController {

    @Resource
    Environment environment;

    @RequestMapping("/")
    public String index(@RequestParam(value = "key", required = false) String key ) {
        if(StringUtils.isEmpty(key)){
            return environment.toString();
        }
        return environment.getProperty(key);
    }

    @RequestMapping("/config")
    public String getProperty(@RequestParam(value = "key", required = false) String key ) {
        if(StringUtils.isEmpty(key)){
            return environment.toString();
        }
        return environment.getProperty(key);
    }

}
