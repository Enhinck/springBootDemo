package com.enhinck.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.enhinck.demo.entity.Demo;
import com.enhinck.demo.repository.DemoRepository;


@Controller
@RequestMapping("view")
public class DemoController extends BaseAPI {

	@Autowired
	DemoRepository demoRepository;

	@GetMapping("hello")
	public String getFarm(Model model) {
		model.addAttribute("user", "");
		return "hello";
	}

	@GetMapping("demo/{demoId}")
	public String getArea(Model model, @PathVariable("demoId") Integer demoId) {
		if (demoId <= 0) {
			return "404";
		}

		Demo demo = demoRepository.findOne(demoId);
		if (demo == null) {
			return "404";
		}

		model.addAttribute("demo", demo);
		return "demo";
	}
	

	

}
