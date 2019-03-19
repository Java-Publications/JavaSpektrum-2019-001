package org.rapidpm.java.spektrum;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class V002 {


  public static class Worker {
    public Integer doSomething(String value) {
      return Integer.parseInt(value);
    }
  }

  public static class DoNext {
    public Integer transform(Function<String, Integer> fA ,
                      String value) {
      return fA.apply(value);
    }
  }


  {
    final Worker worker = new Worker();
    final Integer a = worker.doSomething("2");

    final Function<String, Integer> fA = worker::doSomething;
    final Integer rA = fA.apply("2");

    final ToIntFunction<String> fB = worker::doSomething;
    final int rB = fB.applyAsInt("2");

    final Integer integer = fA.apply("2");

    final Integer tA = new DoNext().transform(worker::doSomething , "2");

  }


}
