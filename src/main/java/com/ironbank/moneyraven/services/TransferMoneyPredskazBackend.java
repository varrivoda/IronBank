package com.ironbank.moneyraven.services;

import com.ironbank.moneyraven.dao.MoneyDao;
import com.ironbank.moneyraven.model.Bank;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class TransferMoneyPredskazBackend implements TransferMoneyService {
    private final MoneyDao moneyDao;
    private final PredskazService predskazService;

    @Override
    public long transfer(String name, int amount) {
        Bank bank = moneyDao.findAll().get(0);

        if(bank.getTotalAmount()>amount && predskazService.willSurvive(name)){
            bank.credit(amount);
            return moneyDao.save(bank).getTotalAmount();
        }

        return -1;
    }
}
