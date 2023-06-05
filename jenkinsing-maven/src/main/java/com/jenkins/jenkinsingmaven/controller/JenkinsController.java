package com.jenkins.jenkinsingmaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("/jenkins")
	public String returnWelcome() {
//		StringBuffer sb = new StringBuffer();
//		sb.append("<html>");
//		sb.append("<head>");
//		sb.append("<title> My First HTML Page - Changed</title>");
//		sb.append("</head>");
//		sb.append("<body>");
//		sb.append("My first html page with body - Changed");
//		sb.append("</body>");
//		sb.append("</html>");
//		return sb.toString();
		return "welcome";
	}
	
}
