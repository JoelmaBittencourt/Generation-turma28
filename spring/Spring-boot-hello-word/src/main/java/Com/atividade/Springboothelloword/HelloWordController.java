package Com.atividade.Springboothelloword;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
@RequestMapping("/")
public String hello() {
	return"Hello World auuu";
}
}
