package io.github.mohamedrenov.application.cucumber.stepdefs;

import io.github.mohamedrenov.application.MohamedrenovApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MohamedrenovApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
