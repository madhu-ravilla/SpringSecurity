/**
 * 
 */
package com.madhu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mravilla
 *
 */

@RestController
@RequestMapping("/app")
public class WebController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World...";
	}
}
