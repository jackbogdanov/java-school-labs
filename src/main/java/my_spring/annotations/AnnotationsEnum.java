package my_spring.annotations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AnnotationsEnum {

    INJECT(Inject.class, new InjectAnnotationsHandler()),
    INJECT_RANDOM(InjectRandomInt.class, new InjectRandomAnnotationHandler());

    private final Class classType;
    private final AnnotationsHandler handler;

    public void runHandler(Object o) {
        handler.handle(o);
    }

}
