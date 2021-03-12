package com.example.feignservice2.service;

import java.util.List;

import com.example.feignservice2.impl.UserFallbackService;
import com.example.feignservice2.pojo.Result;
import com.example.feignservice2.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "user-service", fallback = UserFallbackService.class)
public interface UserService {

	@PostMapping("/user/insert")
	Result insert(@RequestBody User user);

	@GetMapping("/user/{id}")
	Result<User> getUser(@PathVariable("id") Long id);

	@GetMapping("/user/listUsersByIds")
	Result<List<User>> listUsersByIds(@RequestParam("ids") List<Long> ids);

	@GetMapping("/user/getByUsername")
	Result<User> getByUsername(@RequestParam("username") String username);

	@PostMapping("/user/update")
	Result update(@RequestBody User user);

	@PostMapping("/user/delete/{id}")
	Result delete(@PathVariable("id") Long id);

}
