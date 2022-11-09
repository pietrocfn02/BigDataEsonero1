package org.example;

import com.google.gson.Gson;

public class City {

    private String name;
    private String province;


        public String getJson() {
            Gson g = new Gson();
            return g.toJson(this);

        }

    public City (String name, String province) {
        this.name = name;
        this.province = province;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}