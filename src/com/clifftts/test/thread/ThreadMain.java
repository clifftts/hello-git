package com.clifftts.test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadMain {
  
  public static void main(String[] args) {
    ExecutorService execute = Executors.newFixedThreadPool(3);
    
    List<FutureTask<Object>> tasklist = new  ArrayList<FutureTask<Object>>() ;
    for(int i=0;i<10000;i++){
      FutureTask<Object> task = new FutureTask<Object>(new ExecutClass(i+""));
      execute.execute(task);
      tasklist.add(task);
    }
    
    try {
      
      if(tasklist!=null){
         for(int j=0;j<tasklist.size();j++){
          // Thread.sleep(5000);
           System.out.println((String)(tasklist.get(j).get()));
         }
       
      }
       
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
  
}
