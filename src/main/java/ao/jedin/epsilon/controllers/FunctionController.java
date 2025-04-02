package ao.jedin.epsilon.controllers;


import ao.jedin.epsilon.services.FunctionStudyService;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/")
public class FunctionController{

    @GetMapping("/solve")
    public ResponseEntity<HashMap<String, Object>> solve(@RequestParam(required = false) String expression){
        HashMap<String, Object> response = new FunctionStudyService(expression).getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
