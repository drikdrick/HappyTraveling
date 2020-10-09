package del.ac.id.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import del.ac.id.model.Departure;
import del.ac.id.service.DepartureService;

@Controller
public class DepartureController {

	@Autowired
	private DepartureService departureService;
	
	@GetMapping("/showNewDepartureForm")
	public String showNewDepartureForm(Model model) {
		Departure departure = new Departure();
		model.addAttribute("departure", departure);
		return "new_departure";
	}
	
	@PostMapping("/saveDeparture")
	public String saveDeparture(@ModelAttribute("departure") Departure departure) {
		departureService.saveDeparture(departure);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value="id") long id, Model model) {
		Departure departure = departureService.getDeparturebyId(id);
		model.addAttribute("departure", departure);
		return "update_departure";
	}
	
	@GetMapping("/deleteDeparture/{id}")
	public String deleteDeparture(@PathVariable(value="id") long id) {
		this.departureService.deleteDepartureById(id);
		return "redirect:/";
	}
}
