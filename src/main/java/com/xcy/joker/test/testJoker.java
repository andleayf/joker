package com.xcy.joker.test;

import com.xcy.joker.utils.HttpUtil;
import org.junit.Test;

/**
 * @program: joker
 * @Description:
 * @author: YeMao
 * @create: 2019-08-07 21:08
 */

public class testJoker {
    @Test
    public void getJoker(){
        //b12d46180eda262ec3a1cec558aa950e
        String url="http://v.juhe.cn/joke/content/text.php?key=4bb5787067fcd6124debda95ee91e37f&page=1&pagesize=1";
        System.out.println("笑话："+HttpUtil.getStr(url));
    }

    public int feibonaqie(int a){
        if(a == 1 || a ==2){
            return a;
        }else{
            return feibonaqie(a -1) + feibonaqie(a -2);
        }
    }

    @Test
    public void t(){
        System.out.println(feibonaqie(30));
    }
}
