package lining;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lining.bean.Info;
import lining.service.InfoService;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
		private InfoService ds03;
	
		@Resource
		public void setDs03(InfoService ds03) {
			this.ds03 = ds03;
		}
		
		@RequestMapping()
		public String hello(ModelMap model){
			List<Info> infoList = ds03.getInfo(5);
			
			model.addAttribute("info",infoList.get(0));
			
			return "hello";
		}
		
	
		@RequestMapping("/form")
		public String showForm(@RequestParam("name") String name,ModelMap model){
			model.addAttribute("name",name);
			return "showForm";
		}

	
}
