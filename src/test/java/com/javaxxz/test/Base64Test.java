package com.javaxxz.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.springframework.util.Base64Utils;

import com.javaxxz.core.toolbox.kit.CharsetKit;

public class Base64Test {


    public static void main(String[] args) {
        String keyStr = "SpringBlade";
        
        byte[] keys;
		try {
			keys = keyStr.getBytes(CharsetKit.UTF_8);
	        System.out.println(Base64Utils.encodeToString(Arrays.copyOf(keys, 16)));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        
    }

}
