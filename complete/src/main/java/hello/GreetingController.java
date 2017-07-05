package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value="/employee/{empid}", method=RequestMethod.GET)
    public String getEmployeeDetails(@PathVariable String empid, Model model){
    	model.addAttribute("firstname", DefaultValues.FIRSTNAME);
    	model.addAttribute("lastname", DefaultValues.LASTNAME);
    	model.addAttribute("empid", empid);
    	model.addAttribute("userid", DefaultValues.USERID);
    	
    	return "employee";
    }
}
