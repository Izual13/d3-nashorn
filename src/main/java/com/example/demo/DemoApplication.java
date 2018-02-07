package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(DemoApplication.class, args);
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("nashorn");
        engine.eval("var console=666;");
        engine.eval("var setTimeout=666;");
        engine.eval("var clearTimeout=666;");
        engine.eval("var setInterval=666;");
        engine.eval("var clearInterval=666;");
        engine.eval("load('classpath:app-bundle.js')");
        engine.eval("function sum(a, b) { return a + b; }");
        System.out.println(engine.eval("sum(1, 2);"));
        System.out.println(engine.eval("aaa"));
    }
}
