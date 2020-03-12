package idv.wayne.ledger.rest.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.wayne.ledger.service.StudentService;

@RestController
public class FunRestController {
	
	// inject properties for: coach.name and team.name
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@Autowired
	private StudentService studentService;

	// expose "/" that return "Hello world"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Training hard!";
	}
	
	// expose new endpoint for "teaminfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName +", Team name: " + teamName;
	}
	
	
	@GetMapping("/getAllStudent")
	public String getAllStudent() {
		return studentService.findAll().toString();
	}

	
	
}
