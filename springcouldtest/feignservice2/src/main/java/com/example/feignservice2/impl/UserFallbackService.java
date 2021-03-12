package com.example.feignservice2.impl;

import java.util.List;

import com.example.feignservice2.pojo.Result;
import com.example.feignservice2.pojo.User;
import com.example.feignservice2.service.UserService;
import org.springframework.stereotype.Component;


@Component
public class UserFallbackService implements UserService {

	@Override
	public Result insert(User user) {
		return new Result("调用失败，服务被降级", 500);
	}

	@Override
	public Result<User> getUser(Long id) {
		return new Result("调用失败，服务被降级", 500);
	}

	@Override
	public Result<List<User>> listUsersByIds(List<Long> ids) {
		return new Result("调用失败，服务被降级", 500);
	}

	@Override
	public Result<User> getByUsername(String username) {
		return new Result("调用失败，服务被降级", 500);
	}

	@Override
	public Result update(User user) {
		return new Result("调用失败，服务被降级", 500);
	}

	@Override
	public Result delete(Long id) {
		return new Result("调用失败，服务被降级", 500);
	}

}
