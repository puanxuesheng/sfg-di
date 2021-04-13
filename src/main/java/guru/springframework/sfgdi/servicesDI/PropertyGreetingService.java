package guru.springframework.sfgdi.servicesDI;


import org.springframework.stereotype.Service;


@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "hello world from Property's implementation";
    }
}
