package com.google.scm.mango.util;


import com.google.gson.Gson;

public class JsonUtil<T> {
    private static Gson gson = new Gson();

    public static <T> String toJson(T obj){
        String json = gson.toJson(obj);
        return json;
    }

    public static <T> T fromJson(String json, Class<T> classType){
        T deserialize = gson.fromJson(json, classType);
        return deserialize;
    }

}
