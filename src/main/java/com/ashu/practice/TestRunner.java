package com.ashu.practice;

import java.util.stream.Stream;

public final class TestRunner {
    public static final String PLUGIN = "--plugin";
    private static String[] defaultOptions = {
            "--glue", "com.ashu.practice", "classpath:com/ashu/practice",
            PLUGIN, "pretty",
            //   PLUGIN, "json:reports/cucumber-report.json",
            PLUGIN, "html:reports/cucumber-report.html"
    };

    public static void main(String[] args) {
        Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));
        SecurityManager manager = new IgnoreExitCall();
        System.setSecurityManager(manager);
        try {
            io.cucumber.core.cli.Main.main(cucumberOptions.toArray(String[]::new));
        } catch (SecurityException ex) {
            System.out.println("Ignore exit");
        }
    }
}