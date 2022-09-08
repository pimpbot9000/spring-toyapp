package com.makecraplosemoney.testapp.DTOs;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.makecraplosemoney.testapp.deserializers.TestBodyDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@Data
@Getter
@Setter
@JsonDeserialize(using = TestBodyDeserializer.class)
public class TestBody implements Serializable {
    private String hello;
    private String helloThere;
}
