package del.ac.id.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import del.ac.id.service.DepartureService;
import del.ac.id.service.TransactionService;

@Controller
public class LoginController {

	@Autowired
	private DepartureService departureService;
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("listDeparture", departureService.getAllDepartures());
		model.addAttribute("listTransaction", transactionService.getAllTransaction());
		return "index";
	}
	
	
}
