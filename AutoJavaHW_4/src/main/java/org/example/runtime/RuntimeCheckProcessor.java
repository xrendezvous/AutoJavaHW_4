package src.main.java.org.example.runtime;

import src.main.java.org.example.annotations.RunTimeCheck;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RuntimeCheckProcessor {
    public static void process(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(RunTimeCheck.class)) {
                RunTimeCheck annotation = field.getAnnotation(RunTimeCheck.class);
                System.out.println("Runtime Check on Field: " + field.getName() + " - " + annotation.value());
            }
        }

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunTimeCheck.class)) {
                RunTimeCheck annotation = method.getAnnotation(RunTimeCheck.class);
                System.out.println("Runtime Check on Method: " + method.getName() + " - " + annotation.value());
            }
        }
    }
}
