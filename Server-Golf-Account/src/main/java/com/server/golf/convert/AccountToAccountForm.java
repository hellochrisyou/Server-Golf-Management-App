package com.server.golf.convert;

import org.springframework.core.convert.converter.Converter;

import com.server.golf.command.AccountForm;
import com.server.golf.domain.Account;

public class AccountToAccountForm implements Converter<Account, AccountForm> {
	@Override
    public AccountForm convert(Account account) {
		AccountForm accountForm = new AccountForm();
		accountForm.setId(account.get_id().toHexString());
		accountForm.setCity(account.getCity());
		accountForm.setAge(account.getAge());
		accountForm.setEmail(account.getEmail());
		accountForm.setGender(account.getGender());
		accountForm.setName(account.getName());
		accountForm.setHandicap(account.getHandicap());
		accountForm.setPassword(account.getPassword());
		accountForm.setState(account.getState());
        return accountForm;
	}
	
}
