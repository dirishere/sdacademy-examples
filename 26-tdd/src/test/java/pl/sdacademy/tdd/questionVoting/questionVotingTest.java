package pl.sdacademy.tdd.questionVoting;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class questionVotingTest {
  @DisplayName("Given question with initial score 0 and given author (goobar), when upvoteBy the question by user (foobar), then score is 1")

  @Test
  public void test1() throws  Exception{
    //given
    Question question = new Question(0, "goobar");

    //when
    question.upvoteBy("foobar");

    //then
    Assertions.assertThat(question.score()).isEqualTo(1);
  }

  @DisplayName("When upvote question twice by the same user, then upvote only one.")

  @Test
  public void test2() throws  Exception{
    //given
    Question question = new Question(0, "goobar");

    //when
    question.upvoteBy("foobar");
    question.upvoteBy("foobar");

    //then
    Assertions.assertThat(question.score()).isEqualTo(1);
  }

  @DisplayName("When upvote question by author, then question will not be upvote")

  @Test
  public void test3() throws Exception{
    //given
    Question question = new Question(0, "qoobar");

    //when
    question.upvoteBy("qoobar");

    //then
    Assertions.assertThat(question.score()).isEqualTo(0);
  }

  @DisplayName("Given question with initial score 0 and author 'goobar' when upvote the question by 'foobar' and 'hoobar' then score is 2.")

  @Test
  public void test4() throws Exception{
    //given
    Question question = new Question(0, "goobar");

    //when
    question.upvoteBy("hoobar");
    question.upvoteBy("foobar");

    //then
    Assertions.assertThat(question.score()).isEqualTo(2);
  }

  @DisplayName("Given question with initial score 100 and given author (goobar), when upvoteBy the question by user (foobar), then score is 101")

  @Test
  public void test5() throws  Exception{
    //given
    Question question = new Question(100, "goobar");

    //when
    question.upvoteBy("foobar");

    //then
    Assertions.assertThat(question.score()).isEqualTo(101);
  }

  @DisplayName("Given question with initial score 50, upvote by different user 20 times, then score 70")

  @Test
  public void test6() throws  Exception{
    //given
    String author = "goobar";
    Question question = new Question(50, "goobar");

    //when
    upvoteNTimesByDifferentUser(20, author, question);

    //then
    Assertions.assertThat(question.score()).isEqualTo(70);
  }

  private void upvoteNTimesByDifferentUser(int score, String author, Question question){
    for(int i = 0; i<20; i++){
      question.upvoteBy("otherUser" + i);
    }
  }

}
