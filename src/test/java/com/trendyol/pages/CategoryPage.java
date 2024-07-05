package com.trendyol.pages;

import com.trendyol.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{
    @FindBy(xpath = "//a[@href='/butik/liste/5/elektronik']")
    public WebElement subCategory;
    @FindBy(xpath = "//div[@class='component-list component-small-list']")
    public WebElement listOfElectronics;
    @FindBy(xpath="//div[@title=\'Kapat\']")
    public WebElement closeIcon;
    //@FindBy(xpath="//input[@data-testid='suggestion']")
    @FindBy(xpath="//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")
    public WebElement searchArea;
    //@FindBy(xpath="//i[@data-testid='search-icon']")
    @FindBy(xpath="//i[@class='cyrzo7gC']")
    public WebElement searchButton;

    @FindBy(xpath="//div[@class='dscrptn dscrptn-V2']/h1")
    public WebElement resultSearch;
    @FindBy(xpath="(//div[@class=\"chckbox\"])[6]")
    public WebElement appleCheckbox;
    @FindBy(xpath="//a[@href='/sr?wc=109460,109459,109461,104034']")
    public WebElement phone;
    @FindBy(xpath="(//span[@class='prdct-desc-cntnr-name hasRatings'])[1]")
    public WebElement productName;
    @FindBy(xpath="(//div[@class='product-desc-sub-text'])[1]")
    public WebElement productDesc;
    @FindBy(xpath="(//div[@class=\'prc-box-dscntd\'])[1]")
    public WebElement productPrice;
    @FindBy(xpath="//a[contains(@href, \'/panasonic/kx-tg1611-siyah\')]")
    public WebElement buyProduct;
    @FindBy(xpath="//button[@component-id='1']")
    public WebElement addToCardBtn;
    @FindBy(xpath="(//p[@class=\'link-text\'])[3]")
    public WebElement MyBasket;
    @FindBy(xpath="//div[@class='basket-item-count-container visible']")
    public WebElement NumberOfProducts;



    public void searchProduct(){
        searchArea.click();
        BrowserUtils.waitFor(2);
        searchArea.sendKeys("Laptop");
        BrowserUtils.waitFor(2);
        searchButton.click();
        BrowserUtils.waitFor(2);
    }

}
