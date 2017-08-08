package lining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	
		
		@RequestMapping()
		public String hello(ModelMap model){
			model.addAttribute("msg","this is hello world!");
			
			return "hello";
		}
		
		@RequestMapping("/form")
		public String showForm(@RequestParam("name") String name,ModelMap model){
			model.addAttribute("name",name);
			return "showForm";
		}

	
}
