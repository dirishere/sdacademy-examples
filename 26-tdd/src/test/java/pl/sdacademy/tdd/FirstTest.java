package pl.sdacademy.tdd;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class FirstTest {
 /** @DisplayName("Odpalenie pierwszego testu")
  @Test
  public void test(){
    // when
    String msg = First.msg(1);

    // then
    assertThat(msg).isEqualTo("1");
  }**/

  @DisplayName("Jeżeli zaczyna się na D to zwraca 5")
  @Test
  public void test(){
    // when
    String msg = First.msg("daria");

    // then
    assertThat(msg).isEqualTo("5");
  }

  @DisplayName("Jeżeli zaczyna się na A to zwraca długość Stringa")
  @Test
  public void test2(){
    // when
    String msg = First.msg("aria");

    // then
    assertThat(msg).isEqualTo("4");
  }

  @DisplayName("Jeżeli zaczyna się na B to zwraca długość Stringa bez spacji")
  @Test
  public void test3(){
    // when
    String msg = First.msg("baria aria");

    // then
    assertThat(msg).isEqualTo("9");
  }

  @DisplayName("Jeżeli zaczyna się na C to zwraca ilość wyrazów")
  @Test
  public void test4(){
    // when
    String msg = First.msg("Caria  aria    babar");

    // then
    assertThat(msg).isEqualTo("3");
  }

}
