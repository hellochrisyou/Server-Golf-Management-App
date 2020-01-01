package com.server.golf.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.golf.command.AccountForm;
import com.server.golf.convert.AccountFormToAccount;
import com.server.golf.domain.Account;
import com.server.golf.repository.AccountRepository;
import com.server.golf.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
    private AccountFormToAccount accountFormToAccount;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository, AccountFormToAccount accountFormToAccount) {
        this.accountRepository = accountRepository;
        this.accountFormToAccount = accountFormToAccount;
    }


    @Override
    public List<Account> listAll() {
        List<Account> products = new ArrayList<>();
        accountRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public Account getById(String id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account saveOrUpdate(Account account) {
        accountRepository.save(account);
        return account;
    }

    @Override
    public void delete(String id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account saveOrUpdateProductForm(AccountForm accountForm) {
    	Account savedAccount = saveOrUpdate(accountFormToAccount.convert(accountForm));

        System.out.println("Saved Account Id: " + savedAccount.get_id());
        return savedAccount;
    }
}
