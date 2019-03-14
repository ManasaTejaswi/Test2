package com.bank.dao;

import com.bank.dto.TransactionDetails;

public interface TransactionDAO {
	TransactionDetails transactionDetails(TransactionDetails transaction) throws Exception;
}
