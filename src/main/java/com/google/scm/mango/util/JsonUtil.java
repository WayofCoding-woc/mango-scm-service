package com.google.scm.mango.util;

import com.owlike.genson.Genson;

public class JsonUtil<T> {
    private static Genson genson = new Genson();

    public static <T> String toJson(T obj){
        String json = genson.serialize(obj);
        return json;
    }

    public static <T> T fromJson(String json, Class<T> classType){
        T deserialize = genson.deserialize(json, classType);
        return deserialize;
    }

}
