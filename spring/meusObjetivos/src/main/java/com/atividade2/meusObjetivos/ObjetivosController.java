package com.atividade2.meusObjetivos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivosController {
@RequestMapping("/objetivos")
public String objetivos() {
	return"Aprender MySQL e Spring boot";
}

}
