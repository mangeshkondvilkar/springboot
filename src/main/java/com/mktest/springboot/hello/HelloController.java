/**
 * 
 */
package com.mktest.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mangesh K
 *
 */
@RestController
public class HelloController {


	@RequestMapping("/hello")
	public String getAllTopics(){
		
		return "Get All topics";
	}
}
