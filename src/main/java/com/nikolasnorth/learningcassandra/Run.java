package com.nikolasnorth.learningcassandra;

import static spark.Spark.*;

public class Run {

  public static void main(String[] args) {
    get("/hello", (req, res) -> {
      return "Hello world";
    });
  }
}
