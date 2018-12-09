package pl.sdacademy.mapa.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    //pepperExample();
    countWordsExample();
  }

  private static void countWordsExample(){
    String anyString = "Skala Scoville’a (oznaczana skrótem SHU, od Scoville Hotness Unit – z ang. jednostka ostrości Scoville’a) – skala ostrości, czyli pikantności danej potrawy, głównie używana w stosunku do papryk. Określa ona ilość kapsaicyny, czyli substancji powodującej uczucie ostrości w produkcie. Skala została wprowadzona przez amerykańskiego chemika Wilbura Scoville’a w roku 1912. Zgodnie z pierwotną metodyką ostrość w skali Scoville’a wyznaczano organoleptycznie. Najpierw tworzono roztwór cukru z wodą, a następnie dodawano znaną ilość alkoholowego ekstraktu z badanej papryki do roztworu. Gdy testerzy (zazwyczaj pięciu) zaczynali odczuwać pieczenie, wyznaczano stopień rozcieńczenia roztworu, co dawało wynik na scali Scoville’a, np. SHU papryki habanero odmiany ‘Red Savina’ o wartości 580 000 oznacza, że jej ekstrakt musi zostać rozcieńczony w stosunku 1:580 000, zanim przestanie być odczuwane uczucie ostrości.";
    List<String> listfOfWords = Arrays.asList(anyString.split("\\s"));
    Map<String, Integer> words = new HashMap<>();
    for (String word: listfOfWords) {
      if(words.containsKey(word)){
        words.put(word, words.get(word)+1);
      } else {
        words.put(word, 1);
      }
    }
    System.out.println(words);
  }

  private static void pepperExample() {
    Map<String, Integer> peppers = new HashMap<>(); //empty map
    peppers.put("Pepperoni", 100);
    peppers.put("Jalapeno", 2500);
    peppers.put("Habanero", 100_000);
    peppers.put("Pepper X", 3_180_000);

    System.out.println(peppers);

    //find value for key
    System.out.println(peppers.get("Pepper X"));

    //find key for value
    for (Map.Entry<String, Integer> entry: peppers.entrySet()) { //Map.Entry<String, Integer> << pojedynczy wpis w mapie

      if(entry.getValue() == 2500){
        System.out.println(entry.getKey());
      }

    }
  }
}
