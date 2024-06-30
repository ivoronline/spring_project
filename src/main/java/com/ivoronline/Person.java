package com.ivoronline;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter                 //Needed for ObjectMapper
@AllArgsConstructor     //Needed to create Person Object
public class Person {
  private String  name;
  private Integer age;
}
