package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class SandwichSpiceController {
    @GetMapping("/calculate")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping("/save")
    public String save(ModelMap model, @RequestParam("number1") int number1,@RequestParam("number2") int number2,@RequestParam("butt") String butt) {
        float result=0;
        if (butt.equals("add")){
            result=number1+number2;
        }else if (butt.equals("sub")){
            result=number1-number2;
        }else if (butt.equals("multi")) {
            result=number1*number2;
        }else{
            result=number1/number2;
        }
        model.addAttribute("result",result);
        return "result";
    }

}
