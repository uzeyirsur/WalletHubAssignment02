package com.wallethub.utilities;

import com.wallethub.pages.ProfilePage;
import com.wallethub.pages.TestInsuranceCompanyPage;
import com.wallethub.pages.HomePage;
import com.wallethub.pages.VerifyActPage;

public class Pages {
    private TestInsuranceCompanyPage testInsuranceCompanyPage;
    private HomePage homePage;

    private VerifyActPage verifyActPage;
private ProfilePage profilePage;
    public Pages() {
        this.homePage = new HomePage();
        this.testInsuranceCompanyPage = new TestInsuranceCompanyPage();
        this.verifyActPage = new VerifyActPage();
        this.profilePage = new ProfilePage();
    }

    public HomePage homePage() {
        return homePage;
    }

    public TestInsuranceCompanyPage testInsuranceCompanyPage() {
        return testInsuranceCompanyPage;
    }

    public VerifyActPage verifyActPage() {
        return verifyActPage;
    }
    public ProfilePage profilePage(){
        return profilePage;
    }
}
