package com.jeff.springquotemachine.controllers;

import com.jeff.springquotemachine.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {
  private final QuoteService quoteService;

  public QuoteController(QuoteService quoteService) {
    this.quoteService = quoteService;
  }

  @RequestMapping({"/", ""})
  public String showQuote(Model model) {
    model.addAttribute("quote", quoteService.getQuote());
    return "index";
  }
}
