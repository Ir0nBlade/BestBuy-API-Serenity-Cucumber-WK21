package com.bestbuy.cucumber;

import com.bestbuy.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-Serenity-Cucumber
 * @created 23/01/2022
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/")
public class CucumberRunner extends TestBase {
}
