package com.ivoronline;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
  public static void main(String[] args) throws JsonProcessingException {

    //CREATE PERSON
    Person person = new Person("John", 50);

    //DISPLAY PERSON AS JSON
    ObjectMapper mapper = new ObjectMapper();
    String       json   = mapper.writeValueAsString(person);
    System.out.println(json);

  }

}