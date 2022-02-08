package com.nttdata.singleton;

public class Singleton {

	 private static Singleton INSTANCE;

	   private Singleton() {}

	   public static Singleton getInstance() {
	       if (INSTANCE == null) {
	           INSTANCE = new Singleton();
	           System.out.println("instancia creada");
	       }
	       return INSTANCE;
	   }
	}