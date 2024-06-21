package src.main.java.org.example.processor;

import src.main.java.org.example.annotations.CompileTimeCheck;
import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.lang.model.SourceVersion;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("com.example.annotations.CompileTimeCheck")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CompileTimeCheckProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(CompileTimeCheck.class)) {
            CompileTimeCheck annotation = element.getAnnotation(CompileTimeCheck.class);
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "Processing " + annotation.value());
        }
        return true;
    }
}
