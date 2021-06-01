package com.mayikt.pay.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@TableName("payment_channel")
public class PaymentChannelEntity {
    /**
     * ID
     */
    @Id
    @TableId
    private Integer id;
    /**
     * 渠道名称
     */
    private String channelName;
    /**
     * 渠道ID
     */
    private String channelId;
    /**
     * 商户id
     */
    private String merchantId;
    /**
     * 同步回调URL
     */
    private String syncUrl;
    /**
     * 异步回调URL
     */
    private String asynUrl;
    /**
     * 公钥
     */
    private String publicKey;
    /**
     * 私钥
     */
    private String privateKey;
    /**
     * 渠道状态;0开启1关闭
     */
    @TableLogic
    private Integer isDelete;
    /**
     * 乐观锁
     */
    private Integer revision;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * payBeanId
     */
    private String payBeanId;


    private String synCallbackBeanId;
    private String asynCallbackBeanId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSyncUrl() {
        return syncUrl;
    }

    public void setSyncUrl(String syncUrl) {
        this.syncUrl = syncUrl;
    }

    public String getAsynUrl() {
        return asynUrl;
    }

    public void setAsynUrl(String asynUrl) {
        this.asynUrl = asynUrl;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getPayBeanId() {
        return payBeanId;
    }

    public void setPayBeanId(String payBeanId) {
        this.payBeanId = payBeanId;
    }

    public String getSynCallbackBeanId() {
        return synCallbackBeanId;
    }

    public void setSynCallbackBeanId(String synCallbackBeanId) {
        this.synCallbackBeanId = synCallbackBeanId;
    }

    public String getAsynCallbackBeanId() {
        return asynCallbackBeanId;
    }

    public void setAsynCallbackBeanId(String asynCallbackBeanId) {
        this.asynCallbackBeanId = asynCallbackBeanId;
    }
}