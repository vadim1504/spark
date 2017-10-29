package by.vadim.spark.helloworld;

import static spark.Spark.get;

public class HelloWorldService {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello");
        get("/hello/:name", (req, res) -> "Hello: " + req.params(":name"));
    }
}
