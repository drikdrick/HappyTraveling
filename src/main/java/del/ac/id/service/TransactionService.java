package del.ac.id.service;

import java.util.List;

import del.ac.id.model.Transaction;

public interface TransactionService {
	
	List<Transaction> getAllTransaction();
	void saveTransaction(Transaction transaction);
	void deleteTransactionById(long id);
}
