package guru.springframework.sfgdi.servicesDI;


import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "hello world from Setter's implementation";
    }
}
