package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {

   public static class A {
      public String meth()
      {
         return "Invoking method from class A";
      }


   }
   public static class B extends A {
      @Override
      public String meth()
      {
         return "Method is overridden in Extendend class B";

      }
   }
   public static void main(String []a) {
      B ob = new B();
      System.out.println(ob.meth());

      B ob1 = new B();
      System.out.println(ob1.meth());
   }
}
