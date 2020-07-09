package edu.pdx.cs410J.sahaskew;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void romanNumeralfor1isI() {
    assertThat(Kata.romanNumeralfor(1), equalTo("I"));
  }
  @Test
  public void romanNumeralfor5isV() {
    assertThat(Kata.romanNumeralfor(5), equalTo("V"));
  }

}
