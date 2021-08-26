package my_spring.annotations;

import java.util.List;

public interface HandlerProvider {
    List<AnnotationsHandler> getHandlers();
}
