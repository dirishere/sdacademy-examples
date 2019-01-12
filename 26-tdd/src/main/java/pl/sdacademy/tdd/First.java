package pl.sdacademy.tdd;

public class First {
  static String msg(String text) {
    if(text.charAt(0) == 'a' ||text.charAt(0) == 'A' ){
      return String.valueOf(text.length());
    }

    if(text.charAt(0) == 'd' ||text.charAt(0) == 'D' ){
    return String.valueOf(5);
    }

    if(text.charAt(0) == 'b' ||text.charAt(0) == 'B' ){
      String text2 = text.replaceAll(" ", "");
      return String.valueOf(text2.length());
    }

    if(text.charAt(0) == 'c' ||text.charAt(0) == 'C' ){
      String text2 = text.replaceAll("\\s+", " ");
      String splittedText[] = text2.split(" ");
      return String.valueOf(splittedText.length);
    }

    return "japko";
  }
}
