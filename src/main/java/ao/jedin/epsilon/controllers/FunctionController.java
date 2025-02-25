package ao.jedin.epsilon.controllers;


import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analisar")
public class FunctionController {

    @GetMapping
    public String analisar(@RequestParam String expre){

        ExprEvaluator engine = new ExprEvaluator();

        IExpr integration = engine.evaluate("Integrate("+expre+",x)");
        return "result: "+engine.evaluate("Expand("+integration+")");
    }
}
