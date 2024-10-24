package com.example.backend.dto.request;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.example.backend.model.enums.Status;

import lombok.Data;

@Data
public class UpdateTaskRequest {
  private LocalDate time;
  private Status status;
  public void setTime(String time) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    this.time = LocalDate.parse(time, formatter);
  }

}
