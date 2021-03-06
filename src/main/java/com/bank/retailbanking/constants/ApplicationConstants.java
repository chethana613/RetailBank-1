package com.bank.retailbanking.constants;

import org.springframework.stereotype.Component;

@Component
public class ApplicationConstants {
	private ApplicationConstants() {

	}

	public static final Integer FUND_TRANSFER_SUCCESS_CODE = 200;
	public static final String FUND_TRANSFER_SUCCESS_MESSAGE = "Your transaction is successfull";

	public static final String FUND_TRANSFER_PURPOSE_MESSAGE = "Food";

	public static final String FUND_TRANSFER_ACCOUNT_TYPE = "Savings";

	public static final String CUSTOMER_NOT_FOUND_MESSAGE = "Please check your id entered";

	public static final String AMOUNT_LESSBALANCE_MESSAGE = "You don't have a sufficicent balance in your account";

	public static final String TRANSACTION_SUCCESS_MESSAGE = "Success";

	public static final String TRANSACTION_FAILURE_MESSAGE = "Failure";

	public static final String TRANSACTION_DEBIT_MESSAGE = "Debit";

	public static final String TRANSACTION_CREDIT_MESSAGE = "Credit";

	public static final String ACCOUNTNUMBER_INVALID_MESSAGE = "You cannot transfer amount to your account itself";
	
	public static final String LOGIN_ERROR="Invalid Credentials";
	public static final String SUCCESS="Success";
	public static final Integer TRANSACTION_HISTORY_COUNT=5;

public static final String SAVING_ACCOUNT = "Saving";
	public static final Double OPENING_BALANCE = 3000.00;
	public static final Integer AGE_LIMIT = 18;
	public static final String INVALID_MOBILE = "Invalid mobile number";
	public static final String NOT_ELIGIBLE_FOR_ACCOUNT = "You are not eligible for individual bank account";
	public static final String INVALID_REGISTRATION_FOR_ACCOUNT = "Account with same email Id and mobile number already exists";
	public static final String INVALID_OPENING_BALANCE = "Account needs a minimum balance of 3000";

	public static final Integer SUCESS_STATUS_CODE = HttpStatus.OK.value();
	
	public static final String FAILURE = "Failure";

}
