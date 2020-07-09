package edu.pdx.cs410J.sahaskew;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.in;

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
  @Test
  public void romanNumeralfor10isX() {
    assertThat(Kata.romanNumeralfor(10), equalTo("X"));
  }
  @Test
  public void romanNumeralfor9isIX(){
    assertThat(Kata.romanNumeralfor(9), equalTo("IX"));
  }
  @Test
  public void romanNumeralfor8isVIII(){
    assertThat(Kata.romanNumeralfor(8), equalTo("VIII"));
  }
}
