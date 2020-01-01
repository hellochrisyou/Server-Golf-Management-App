package com.server.golf.service;

import java.util.List;

import com.server.golf.command.AccountForm;
import com.server.golf.domain.Account;

public interface AccountService {
	List<Account> listAll();

    Account getById(String id);

    Account saveOrUpdate(Account account);

    void delete(String id);

    Account saveOrUpdateProductForm(AccountForm accountForm);
}
