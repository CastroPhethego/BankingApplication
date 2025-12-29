package net.castrocodes.banking.service;

import net.castrocodes.banking.dto.AccountDto;
import net.castrocodes.banking.entity.Account;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id,double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccount();
}
