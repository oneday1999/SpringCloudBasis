package com.example.feignservice2.controller;

import java.util.List;

import com.example.feignservice2.pojo.Result;
import com.example.feignservice2.pojo.User;
import com.example.feignservice2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserFeignController {

	@Qualifier("com.example.feignservice2.service.UserService")
	@Autowired
	private UserService userService;

	@PostMapping("/insert")
	public Result insert(@RequestBody User user) {
		return userService.insert(user);
	}

	@GetMapping("/{id}")
	public Result<User> getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}

	@GetMapping("/listUsersByIds")
	public Result<List<User>> listUsersByIds(@RequestParam("ids") List<Long> ids) {
		return userService.listUsersByIds(ids);
	}

	@GetMapping("/getByUsername")
	public Result<User> getByUsername(@RequestParam("ids") String username) {
		return userService.getByUsername(username);
	}

	@PostMapping("/update")
	public Result update(@RequestBody User user) {
		return userService.update(user);
	}

	@PostMapping("/delete/{id}")
	public Result delete(@PathVariable("id") Long id) {
		return userService.delete(id);
	}

}
