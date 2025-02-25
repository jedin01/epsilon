package ao.jedin.epsilon.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(name="/analizar")
public class FunctionController {

    @GetMapping
    public String analisar(@RequestParam String expression){
        return "Animal se comunicando...";
    }
}
