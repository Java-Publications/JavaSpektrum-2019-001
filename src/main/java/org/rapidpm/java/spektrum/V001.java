package org.rapidpm.java.spektrum;

import java.util.Optional;
import java.util.function.Consumer;

public class V001 {

  {
    final Optional<String> o = Optional.ofNullable("");

    o.ifPresent(new Consumer<String>() {
      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    });
    o.ifPresent((value) -> System.out.println(value));

    o.ifPresent(System.out::println);



    final boolean present = o.isPresent();

  }


}
