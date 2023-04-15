package rest;

import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class App extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(RestService.class);
    }



//    private Set<Object> singletons = new HashSet<Object>();
//
//    public App() {
//        singletons.add(new RestService());
//    }
//
//    @Override
//    public Set<Object> getSingletons() {
//        return singletons;
//    }

}
