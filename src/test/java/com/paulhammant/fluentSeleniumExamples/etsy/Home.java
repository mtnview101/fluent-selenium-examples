package com.paulhammant.fluentSeleniumExamples.etsy;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriverImpl;
import org.seleniumhq.selenium.fluent.FluentWebElement;

import static org.openqa.selenium.By.id;

public class Home extends FluentWebDriverImpl {
    public Home(WebDriver delegate) {
        super(delegate, Context.singular(null, "SearchCriteria", ""));

        url().shouldMatch(".*etsy.com/");
    }

    protected FluentWebElement searchButton() {
        return button(id("search_submit"));
    }

    protected FluentWebElement searchFor() {
        return input(id("search-query"));
    }


}
