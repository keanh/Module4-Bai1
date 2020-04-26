package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversion {
    @GetMapping("/CurrencyConversion")
    public String currencyConversion(@RequestParam int money, Model model){
        int total = money * 23000;
        model.addAttribute("money",total);
        return "money";
    }
}
