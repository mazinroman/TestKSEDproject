package learntest;

import java.util.Arrays;
import java.util.List;

// Использование списков и итерация по ним
public class Collection {

  public static void main(String[] args){

    /*Можно не указывать тип занчений <String>, тогла в цикле необходимо
    * вместо "String" использовать "Object", тогда можно использовать элементы
    * произвольного типа. Но тогда необходимо будет приравнивать переменную
    * к определенному типу данных, которые будут использоваться далее.
    * Если же мы оставляем "String", тогда значение
    * можно будет приспаивать переменной сразу. */
    List<String> languages = Arrays.asList("Java","Python","PHP");

    for(String l : languages){
      System.out.println(l);
    }
  }
}
