package com.javaxxz.test.beetlsql;

import java.sql.Connection;
import java.sql.SQLException;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.DefaultNameConversion;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.db.MySqlStyle;
import org.junit.Test;

import com.javaxxz.core.beetl.ReportInterceptor;
import com.javaxxz.platform.model.Notice;

public class BeetlTest {

	@Test
	public void test(){
		MySqlStyle style = new MySqlStyle();
		MySqlConnection cs = new MySqlConnection();
		SQLLoader loader = new ClasspathLoader("/beetlsql");
		SQLManager 	sql = new SQLManager(style, loader, cs, new DefaultNameConversion(), new Interceptor[]{new ReportInterceptor()});

		Notice notice = new Notice();
		notice.setF_vc_bt("123");

		Connection conn = sql.getDs().getMaster();
		
		sql.insert(notice);
		
		
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		
		

	}
	
}
