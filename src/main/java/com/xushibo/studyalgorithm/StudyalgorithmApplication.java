package com.xushibo.studyalgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class StudyalgorithmApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(StudyalgorithmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       showConnection();
	}


	/**
	 * 展示数据库链接
	 * */
	private void showConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
        connection.close();
	}
}
