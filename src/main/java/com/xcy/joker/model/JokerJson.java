package com.xcy.joker.model;

import com.xcy.joker.entry.Joker;
import com.xcy.joker.vo.Result;

import java.util.List;

/**
 * @program: joker
 * @Description:
 * @author: YeMao
 * @create: 2019-08-07 21:54
 */

public class JokerJson {

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean{

        private List<Joker> data;

        public List<Joker> getData() {
            return data;
        }

        public void setData(List<Joker> data) {
            this.data = data;
        }
    }
}
