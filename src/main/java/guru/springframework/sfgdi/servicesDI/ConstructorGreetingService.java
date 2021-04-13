package guru.springframework.sfgdi.servicesDI;


import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "hello world from Constructor's implementation";
    }

}
