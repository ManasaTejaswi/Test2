package com.bank.dto;

public class TransactionDetails {
	long transactionId;
	long fromAccountNo;
	long toAccountNo;
	double amountTranferred;
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(long fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public long getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(long toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public double getAmountTranferred() {
		return amountTranferred;
	}
	public void setAmountTranferred(double amountTranferred) {
		this.amountTranferred = amountTranferred;
	}
}
