package com.xcy.joker.utils;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: joker
 * @author: YeMao
 * @create: 2019-08-07 11:08
 */

public class HttpUtil {

    public static String getStr(String url){

        URL myUrl = null;
        HttpURLConnection conn = null;
        InputStream in = null;
        try {
            //1、创建连接对象
            myUrl = new URL(url);
            //2、获取连接对象
            conn = (HttpURLConnection) myUrl.openConnection();
            //3、设置请求信息
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            //4、发起请求
            conn.connect();
            //5、验证响应状态码
            if(conn.getResponseCode() == 200){
                //6、获取响应接口
                in = conn.getInputStream();
                byte[] data = new byte[1024];
                int len = 0;
                StringBuffer buffer = new StringBuffer();
                while((len = in.read(data)) != -1){
                    buffer.append(new String(data,0,len));
                }
                if(buffer.length() > 0){
                    return buffer.toString();
                }else {
                    return null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //7、销毁
            try {
                if(in != null){
                    in.close();
                }
                if(conn != null){
                    conn.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
