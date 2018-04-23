package com.alct.integration.lbs.model;

import com.alct.integration.lbs.dao.entity.PhoneLbsTraceEntity;
import com.alct.integration.lbs.handler.DateAdapter;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


@XmlRootElement(name="info")

public class LbsResponse {

    private String msid;
    private int result;
    private float latitude;
    private float  longitude;
    private float altitude;
    private float radius;
    private int posour;
    private Date localtime;
    private String province;
    private String city;
    private String country;
    private String textDesc;
    private int roamcity;

    public String getMsid() {
        return msid;
    }

    public void setMsid(String msid) {
        this.msid = msid;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getPosour() {
        return posour;
    }

    public void setPosour(int posour) {
        this.posour = posour;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getLocaltime() {
        return localtime;
    }

    public void setLocaltime(Date localtime) {
        this.localtime = localtime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }

    public int getRoamcity() {
        return roamcity;
    }

    public void setRoamcity(int roamcity) {
        this.roamcity = roamcity;
    }

    public PhoneLbsTraceEntity toEntity() {
        PhoneLbsTraceEntity obj = new PhoneLbsTraceEntity();
        obj.setOriginCooridnationType("WGS-84");
        obj.setMobile(this.getMsid());
        obj.setOriginLatitude(BigDecimal.valueOf(this.getLatitude()));
        obj.setOriginLongitude(BigDecimal.valueOf(this.getLongitude()));
        obj.setLocateTime(this.getLocaltime());
        obj.setProvince(this.getProvince());
        obj.setCity(this.getCity());
        obj.setCountry(this.getCountry());
        obj.setTextDesc(this.getTextDesc());
        obj.setId(UUID.randomUUID().toString());
        obj.setCreatedTime(Calendar.getInstance().getTime());

        return obj;
    }
}
