package cn.carry.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Result {
	private boolean success = true;
	private String msg;

	public Result() {
		super();
	}

	public Result(String msg) {
		super();
		this.msg = msg;
	}

	public Result(Boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

}
