package com.xcy.joker.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @program: joker
 * @author: YeMao
 * @create: 2019-08-07 00:58
 */
@Data
@TableName("t_joker")
public class Joker {

    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("hashCode")
    private String hashCode;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("updateDate")
    private Date updateDate;
}
