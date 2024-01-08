package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestA21 {

  @Test
  public void testHelloWorld() {
    int result;
    PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));

    // action
    // A21.main(null);
    result = A21.getMed(10, 20, 30);

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    assertEquals(result, 20);

    result = A21.getMed(15, 10, 30);
    assertEquals(result, 15);
    result = A21.getMed(15, 10, 5);
    assertEquals(result, 10);
    result = A21.getMed(10, 20, 15);
    assertEquals(result, 15);
    // undo the binding in System
    System.setOut(originalOut);
  }
}
