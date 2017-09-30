package com.enhinck.demo.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "t_app")
@Data
public class App
{
    @Id
    private ObjectId id;
    @Field("api_key")
    private String apiKey;
    private String appname;
    private List<Object> activities;
}
