package ao.jedin.epsilon.controllers;

import ao.jedin.epsilon.models.ProductModel;
import ao.jedin.epsilon.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping
    public Iterable<ProductModel> index(){
        return ps.list();
    }

//    @GetMapping(name = "/save")
//    public String store(){
//        return "product created successfully!";
//    }
}
