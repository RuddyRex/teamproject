import spark.ModelAndView;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (request , response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "hello.ftl");
        },new FreeMarkerEngine());
    }
}
