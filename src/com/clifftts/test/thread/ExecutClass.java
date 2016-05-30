package com.clifftts.test.thread;

import java.util.concurrent.Callable;

public class ExecutClass implements Callable<Object> {
  private String name;
  public ExecutClass(String name){
    this.name = name;
  }

@Override
public String call() throws Exception {
  
  return this.name+"--"+Thread.currentThread().getName();
}}
