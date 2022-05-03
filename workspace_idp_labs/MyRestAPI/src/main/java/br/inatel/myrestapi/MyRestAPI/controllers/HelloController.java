package br.inatel.myrestapi.MyRestAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.myrestapi.MyRestAPI.models.MyMessage;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public MyMessage getMessage() {
		MyMessage msg = new MyMessage();
		msg.setInfo("Hello World");
		return msg;
	}
	
}
