package com.ironbank.moneyraven.controller;

import com.ironbank.moneyraven.services.TransferMoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IronBankController {

    private final TransferMoneyService transferMoneyService;

    @GetMapping("/credit")
    public String credit(@RequestParam String name, @RequestParam int amount){
        long resultDeposit = transferMoneyService.transfer(name, amount);
        if(resultDeposit == -1){
            return "Rejected \n You won't survive this winter";
        }
        return String.format("Accepter \n Current deposit: %s", resultDeposit);
    }
}
