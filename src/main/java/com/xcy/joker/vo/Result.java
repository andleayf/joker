package com.xcy.joker.vo;

import lombok.Data;

/**
 * @program: joker
 * @author: YeMao
 * @create: 2019-08-07 01:04
 */

@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;

    public static <E> Result setOk(String msg,E data){
        Result<E> result = new Result<E>();
        result.setStatus(200);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <E> Result setOk(String msg){
        Result<E> result = new Result<E>();
        result.setStatus(200);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    public static <E> Result setError(String msg){
        Result<E> result = new Result<E>();
        result.setStatus(400);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    public static <E> Result execute(boolean isSuccess,String msg){
        return isSuccess ? setOk(msg):setError(msg);
    }
}
