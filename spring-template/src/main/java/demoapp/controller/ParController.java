package demoapp.controller;

import demoapp.service.ParService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ParController {

    @Autowired
    private ParService parService;

    @GetMapping("/par")
    public String formPar(Model model) {
        model.addAttribute("numeroData", new NumeroData());
        return "formPar";
    }

    @PostMapping("/par")
    public String checkPar(@Valid @ModelAttribute("numeroData") NumeroData numeroData,
                           BindingResult bindingResult,
                           Model model) {
        if (bindingResult.hasErrors()) {
            return "formPar";
        }

        boolean resultado = parService.isPar(numeroData.getNumero());
        model.addAttribute("numero", numeroData.getNumero());
        model.addAttribute("esPar", resultado);
        return "resultadoPar";
    }
}