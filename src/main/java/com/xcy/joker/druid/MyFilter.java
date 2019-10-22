package com.xcy.joker.druid;/**
 * @author Feri
 */

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 15:09
 */
@WebFilter(urlPatterns = "/*")
public class MyFilter extends WebStatFilter {
}
