package com.xcy.joker.task;

import com.alibaba.fastjson.JSON;
import com.xcy.joker.entry.Joker;
import com.xcy.joker.model.JokerJson;
import com.xcy.joker.service.JokerService;
import com.xcy.joker.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: joker
 * @Description:
 * @author: YeMao
 * @create: 2019-08-08 00:39
 */
@Component
public class JokerTask {

    @Autowired
    JokerService jokerService;
    private static int page = 2;
    @Scheduled(cron = "0 0 12 * * ?")
    public void getJoker(){
        System.out.println("开始抓取");
        page++;
        String url="http://v.juhe.cn/joke/content/text.php?key=4bb5787067fcd6124debda95ee91e37f&page="+page+"&pagesize=10";

        String jokerJson = HttpUtil.getStr(url);
        if(jokerJson != null){
            JokerJson json = JSON.parseObject(jokerJson,JokerJson.class);
            List<Joker> jokers = json.getResult().getData();
            jokerService.saveBatch(jokers);
        }
    }
}
