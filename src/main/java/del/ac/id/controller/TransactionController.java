package del.ac.id.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import del.ac.id.model.Transaction;
import del.ac.id.service.DepartureService;
import del.ac.id.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private DepartureService departureService;
	
	@GetMapping("/showNewDepartureBook")
	public String showNewDepartureBook(Model model) {
		Transaction transaction = new Transaction();
		model.addAttribute("transaction", transaction);
		model.addAttribute("listDeparture", departureService.getAllDepartures());
		return "add_user_transaction";
	}
	
	@PostMapping("/saveTransaksi")
	public String saveDeparture(@ModelAttribute("transaction") Transaction transaction) {
		transactionService.saveTransaction(transaction);
		return "redirect:/";
	}
	
	@GetMapping("/deleteTransaction/{id}")
	public String deleteTransaction(@PathVariable(value="id") long id) {
		this.transactionService.deleteTransactionById(id);
		return "redirect:/";
	}
}
