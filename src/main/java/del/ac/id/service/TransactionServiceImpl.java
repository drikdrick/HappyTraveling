package del.ac.id.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.Transaction;
import del.ac.id.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public void saveTransaction(Transaction transaction) {
		this.transactionRepository.save(transaction);
	}

	@Override
	public List<Transaction> getAllTransaction() {
		return this.transactionRepository.findAll();
	}

	@Override
	public void deleteTransactionById(long id) {
		this.transactionRepository.deleteById(id);
	}

}
