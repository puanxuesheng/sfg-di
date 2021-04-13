package guru.springframework.sfgdi.servicesProfile;

import guru.springframework.sfgdi.servicesDI.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("greetings-in-dif-lang")
public class greetingsEnglish implements GreetingService {

    @Override
    public String sayGreetings() {
        return "HEllO";
    }
}
