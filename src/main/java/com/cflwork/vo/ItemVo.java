package com.cflwork.vo;

import java.io.Serializable;
import java.util.Date;

public class ItemVo implements Serializable {
    //第二域  LLVAR BCD 订单编号
    private Long id;
    //第五域  LLVAR BCD 卡号
    private Long idCard;
    //第七域 长度8 ASCII 类型，0：是充值，1，是消费
    private Integer type;
    //第十域 LLVAR BCD 消费金额
    private Integer money;
    //第十八域 LLLVAR ASCII 标题，
    private String title;
    //第二十七域 长度8 ASCII 订单状态
    private Byte status;
    //第四十 BCD 长度8 创建时间
    private String createTime;
    //0100 1010 0100 0000 0100 0000 0010 0000 0000 0001 0000 0000 0000 0000 0000 0000
    //0100 1010 0100 0000 0000 0000 0010 0000 0000 0001 0000 0000 0000 0000 0000 0000
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCard() {
        return idCard;
    }

    public void setIdCard(Long idCard) {
        this.idCard = idCard;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
