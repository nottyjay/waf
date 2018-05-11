package com.d3code.waf.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Nottyjay
 * @date 2017/3/15
 */
public abstract class BaseEntity implements Serializable {
    //@JsonInclude(JsonInclude.Include.NON_NULL)
    @TableId(value = "id")
    private Long id;
    //@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @TableField(value = "create_date")
    private Date createDate;
    //@JsonInclude(JsonInclude.Include.NON_EMPTY)
    @TableField(value = "modify_date")
    private Date modifyDate;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}