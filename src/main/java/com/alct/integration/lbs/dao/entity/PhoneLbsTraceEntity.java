package com.alct.integration.lbs.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PhoneLbsTraceEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.locate_time
     *
     * @mbg.generated
     */
    private Date locateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.origin_latitude
     *
     * @mbg.generated
     */
    private BigDecimal originLatitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.origin_longitude
     *
     * @mbg.generated
     */
    private BigDecimal originLongitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.origin_cooridnation_type
     *
     * @mbg.generated
     */
    private String originCooridnationType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.baidu_latitude
     *
     * @mbg.generated
     */
    private BigDecimal baiduLatitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.baidu_longitude
     *
     * @mbg.generated
     */
    private BigDecimal baiduLongitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.text_desc
     *
     * @mbg.generated
     */
    private String textDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_lbs_trace.created_time
     *
     * @mbg.generated
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.id
     *
     * @return the value of phone_lbs_trace.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.id
     *
     * @param id the value for phone_lbs_trace.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.mobile
     *
     * @return the value of phone_lbs_trace.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.mobile
     *
     * @param mobile the value for phone_lbs_trace.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.locate_time
     *
     * @return the value of phone_lbs_trace.locate_time
     *
     * @mbg.generated
     */
    public Date getLocateTime() {
        return locateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.locate_time
     *
     * @param locateTime the value for phone_lbs_trace.locate_time
     *
     * @mbg.generated
     */
    public void setLocateTime(Date locateTime) {
        this.locateTime = locateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.origin_latitude
     *
     * @return the value of phone_lbs_trace.origin_latitude
     *
     * @mbg.generated
     */
    public BigDecimal getOriginLatitude() {
        return originLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.origin_latitude
     *
     * @param originLatitude the value for phone_lbs_trace.origin_latitude
     *
     * @mbg.generated
     */
    public void setOriginLatitude(BigDecimal originLatitude) {
        this.originLatitude = originLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.origin_longitude
     *
     * @return the value of phone_lbs_trace.origin_longitude
     *
     * @mbg.generated
     */
    public BigDecimal getOriginLongitude() {
        return originLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.origin_longitude
     *
     * @param originLongitude the value for phone_lbs_trace.origin_longitude
     *
     * @mbg.generated
     */
    public void setOriginLongitude(BigDecimal originLongitude) {
        this.originLongitude = originLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.origin_cooridnation_type
     *
     * @return the value of phone_lbs_trace.origin_cooridnation_type
     *
     * @mbg.generated
     */
    public String getOriginCooridnationType() {
        return originCooridnationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.origin_cooridnation_type
     *
     * @param originCooridnationType the value for phone_lbs_trace.origin_cooridnation_type
     *
     * @mbg.generated
     */
    public void setOriginCooridnationType(String originCooridnationType) {
        this.originCooridnationType = originCooridnationType == null ? null : originCooridnationType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.baidu_latitude
     *
     * @return the value of phone_lbs_trace.baidu_latitude
     *
     * @mbg.generated
     */
    public BigDecimal getBaiduLatitude() {
        return baiduLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.baidu_latitude
     *
     * @param baiduLatitude the value for phone_lbs_trace.baidu_latitude
     *
     * @mbg.generated
     */
    public void setBaiduLatitude(BigDecimal baiduLatitude) {
        this.baiduLatitude = baiduLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.baidu_longitude
     *
     * @return the value of phone_lbs_trace.baidu_longitude
     *
     * @mbg.generated
     */
    public BigDecimal getBaiduLongitude() {
        return baiduLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.baidu_longitude
     *
     * @param baiduLongitude the value for phone_lbs_trace.baidu_longitude
     *
     * @mbg.generated
     */
    public void setBaiduLongitude(BigDecimal baiduLongitude) {
        this.baiduLongitude = baiduLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.province
     *
     * @return the value of phone_lbs_trace.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.province
     *
     * @param province the value for phone_lbs_trace.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.city
     *
     * @return the value of phone_lbs_trace.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.city
     *
     * @param city the value for phone_lbs_trace.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.country
     *
     * @return the value of phone_lbs_trace.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.country
     *
     * @param country the value for phone_lbs_trace.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.text_desc
     *
     * @return the value of phone_lbs_trace.text_desc
     *
     * @mbg.generated
     */
    public String getTextDesc() {
        return textDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.text_desc
     *
     * @param textDesc the value for phone_lbs_trace.text_desc
     *
     * @mbg.generated
     */
    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc == null ? null : textDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_lbs_trace.created_time
     *
     * @return the value of phone_lbs_trace.created_time
     *
     * @mbg.generated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_lbs_trace.created_time
     *
     * @param createdTime the value for phone_lbs_trace.created_time
     *
     * @mbg.generated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}