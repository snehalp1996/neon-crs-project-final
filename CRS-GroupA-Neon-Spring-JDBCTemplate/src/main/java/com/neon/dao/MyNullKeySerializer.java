package com.neon.dao;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MyNullKeySerializer extends JsonSerializer<Object> {

	@Override
	public void serialize(Object nullKey, JsonGenerator jsonGenerator, SerializerProvider unused) 
		      throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		{
		    jsonGenerator.writeFieldName("");
		  }
	}

}
