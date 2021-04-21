package com.seculyzer.cucumber;

import com.seculyzer.ApiwatcherApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ApiwatcherApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
