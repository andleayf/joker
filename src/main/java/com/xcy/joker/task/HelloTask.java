package com.xcy.joker.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: joker
 * @Description:
 * @author: YeMao
 * @create: 2019-08-07 22:29
 */
//@Component
public class HelloTask {

    @Scheduled(cron = "0/3 * * ? * *")
    public void hello(){
        System.out.println("hello 七夕!"+System.currentTimeMillis()/1000);
    }
}
