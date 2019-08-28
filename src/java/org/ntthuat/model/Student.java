package org.ntthuat.model;

import lombok.Data;

import java.util.List;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/28 4:26 PM
 * $Log: Student.java
 */
@Data
public class Student
{
  private String name;
  private List<String> books;
}
