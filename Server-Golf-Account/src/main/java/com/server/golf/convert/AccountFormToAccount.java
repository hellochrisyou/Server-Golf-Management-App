package com.server.golf.convert;

import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.server.golf.command.AccountForm;
import com.server.golf.domain.Account;

public class AccountFormToAccount implements Converter<AccountForm, Account> {

    @Override
    public Account convert(AccountForm accountForm) {
    	Account account = new Account();
        if (accountForm.getId() != null  && !StringUtils.isEmpty(accountForm.getId())) {
            account.set_id(new ObjectId(accountForm.getId()));
        }
        account.setCity(accountForm.getCity());
        account.setAge(accountForm.getAge());
        account.setEmail(accountForm.getEmail());
        account.setGender(accountForm.getGender());
        account.setName(accountForm.getName());
        account.setHandicap(accountForm.getHandicap());
        account.setPassword(accountForm.getPassword());
        account.setState(accountForm.getState());
        return account;
    }
}
