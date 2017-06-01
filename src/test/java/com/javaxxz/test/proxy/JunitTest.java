package com.javaxxz.test.proxy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.javaxxz.core.shiro.ShiroKit;
import com.javaxxz.test.base.BaseTest;

public class JunitTest extends BaseTest{

	@After
	public void test1() {
		System.out.println("结束");
	}

	@Test
	public void test2() {
		System.out.println(ShiroKit.md5("admin", "admin"));
	}

	@Before
	public void test3() {
		System.out.println("开始");
	}

}
