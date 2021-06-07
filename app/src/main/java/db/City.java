package db;

import org.litepal.crud.LitePalSupport;

/**
 * @author 81067
 * cityName 市的名字
 * cityCode 市的代号
 * provinceID 归属省的id
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }
}
