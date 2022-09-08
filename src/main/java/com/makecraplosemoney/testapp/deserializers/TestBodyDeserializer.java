package com.makecraplosemoney.testapp.deserializers;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.makecraplosemoney.testapp.DTOs.TestBody;
import com.makecraplosemoney.testapp.DTOs.TestTest;

import java.io.IOException;
import java.util.Optional;

//@JsonComponent
public class TestBodyDeserializer extends JsonDeserializer<TestBody> {

    @Override
    public TestBody deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        //JsonNode n = jsonParser.getCodec().readTree(jsonParser);
        TestTest before = new ObjectMapper().readValue(jsonParser, TestTest.class);
        TestBody after = new TestBody();
        //t.setHelloThere(tt.getHelloThere() + "hello there!");
        Optional.ofNullable(before.getHelloThere()).ifPresent(s -> after.setHelloThere(s + "hsdflsdfkdf"));
        return after;
    }
}
