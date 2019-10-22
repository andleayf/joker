package com.xcy.joker.druid;
import com.alibaba.druid.support.http.StatViewServlet;
import javax.servlet.annotation.WebServlet;
/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 15:10
 */
@WebServlet("/druid/*")
public class MyServlet extends StatViewServlet {

}
