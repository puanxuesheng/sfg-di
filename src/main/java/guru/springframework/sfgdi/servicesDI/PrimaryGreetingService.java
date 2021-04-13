package guru.springframework.sfgdi.servicesDI;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "This is the default greeting";
    }
}
