package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sky16005 on 2017/10/31.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName=countryName;
    }
    public String  getweatherId(){
        return  weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }

}
