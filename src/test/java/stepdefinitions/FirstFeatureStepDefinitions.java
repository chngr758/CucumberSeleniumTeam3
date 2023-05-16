package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FirstFeatureStepDefinitions {

    int int1,int2,toplam;
    @Given("Elimizde 3 sayısı mevcut")
    public void elimizde3SayısıMevcut() {
        int1 =3;
    }

    @Given("Elimizde 5 sayısı mevcut")
    public void elimizdeSayısıMevcut() {
        int2 =5;
    }

    @When("Bu sayılar toplandığında")
    public void buSayılarToplandığında() {
        toplam = int1+int2;
    }

    @Then("Toplamın 8 olduğu görülmelidir")
    public void toplamınOlduğuGörülmelidir() {
        Assert.assertEquals(8,toplam);
        System.out.println("Toplam değerleri kaşılaştırıldı");
    }
}
