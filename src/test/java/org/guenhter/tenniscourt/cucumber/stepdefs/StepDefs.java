package org.guenhter.tenniscourt.cucumber.stepdefs;

import org.guenhter.tenniscourt.TennisCourtApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TennisCourtApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
