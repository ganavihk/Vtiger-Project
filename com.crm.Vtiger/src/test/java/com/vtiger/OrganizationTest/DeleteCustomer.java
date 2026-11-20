package com.vtiger.OrganizationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericLibrary.Baseclass;
import com.crm.Vtiger.GenericLibrary.FileUtility;
import com.crm.Vtiger.GenericLibrary.ListenerImplementation;
import com.crm.Vtiger.GenericLibrary.Seleniumutility;

import ObejctRepository.HomePage;
import ObejctRepository.Organaizationpage;
@Listeners(ListenerImplementation.class)

public class DeleteCustomer extends Baseclass{
	@Test
	public void createorg1() throws EncryptedDocumentException, IOException {
		 HomePage hp=new HomePage(driver);
		 hp.getOrglink().click();
		 Organaizationpage op=new Organaizationpage(driver);
		 op.getPlusicon().click();
		 FileUtility f=new FileUtility();
		String name = f.readDataFromExcelString("Organaization Details", 1, 1);
		op.getOrgname().sendKeys(name);
		String email = f.readDataFromExcelString("Organaization Details", 1, 2);
		op.getEmailaddress().sendKeys(email);
		WebElement industry = op.getIndustrydrop();
		Seleniumutility s=new Seleniumutility();
		s.selectOptionfromDropdownByContainsText(industry,"Education");
		WebElement type=op.getTypedrop();
		s.selectOptionfromDropdownByContainsText(type, "Customer");
		String billingaddress = f.readDataFromExcelString("Organaization Details", 1, 3);
		String shipaddress = f.readDataFromExcelString("Organaization Details", 1, 4);
		op.getBillingaddress().sendKeys(billingaddress);
		op.getShipcityaddress().sendKeys(shipaddress);
		String billingcity = f.readDataFromExcelString("Organaization Details", 1, 5);
		String shipcity = f.readDataFromExcelString("Organaization Details", 1, 6);
		op.getBillcityaddress().sendKeys(billingcity);
		op.getShipcityaddress().sendKeys(shipcity);
		String billingstate = f.readDataFromExcelString("Organaization Details", 1, 7);
		String shipstate = f.readDataFromExcelString("Organaization Details", 1, 8);
		op.getBillstate().sendKeys(billingstate);
		op.getShipstate().sendKeys(shipstate);
		String billingcountry = f.readDataFromExcelString("Organaization Details", 1, 9);
		String shipcountry = f.readDataFromExcelString("Organaization Details", 1, 10);
		op.getBillcountry().sendKeys( billingcountry );
		op.getShipcountry().sendKeys(shipcountry);
		String desp = f.readDataFromExcelString("Organaization Details", 1, 11);
		op.getDesp().sendKeys(desp);
		op.getSave().click();
	}
	
	@Test
	public void createorg() throws EncryptedDocumentException, IOException {
		 HomePage hp=new HomePage(driver);
		 hp.getOrglink().click();
		 Organaizationpage op=new Organaizationpage(driver);
		 op.getPlusicon().click();
		 FileUtility f=new FileUtility();
		String name = f.readDataFromExcelString("Organaization Details", 1, 1);
		op.getOrgname().sendKeys(name);
		String email = f.readDataFromExcelString("Organaization Details", 1, 2);
		op.getEmailaddress().sendKeys(email);
		WebElement industry = op.getIndustrydrop();
		Seleniumutility s=new Seleniumutility();
		s.selectOptionfromDropdownByContainsText(industry,"Education");
		WebElement type=op.getTypedrop();
		s.selectOptionfromDropdownByContainsText(type, "Customer");
		String billingaddress = f.readDataFromExcelString("Organaization Details", 1, 3);
		String shipaddress = f.readDataFromExcelString("Organaization Details", 1, 4);
		op.getBillingaddress().sendKeys(billingaddress);
		op.getShipcityaddress().sendKeys(shipaddress);
		String billingcity = f.readDataFromExcelString("Organaization Details", 1, 5);
		String shipcity = f.readDataFromExcelString("Organaization Details", 1, 6);
		op.getBillcityaddress().sendKeys(billingcity);
		op.getShipcityaddress().sendKeys(shipcity);
		String billingstate = f.readDataFromExcelString("Organaization Details", 1, 7);
		String shipstate = f.readDataFromExcelString("Organaization Details", 1, 8);
		op.getBillstate().sendKeys(billingstate);
		op.getShipstate().sendKeys(shipstate);
		String billingcountry = f.readDataFromExcelString("Organaization Details", 1, 9);
		String shipcountry = f.readDataFromExcelString("Organaization Details", 1, 10);
		op.getBillcountry().sendKeys( billingcountry );
		op.getShipcountry().sendKeys(shipcountry);
		String desp = f.readDataFromExcelString("Organaization Details", 1, 11);
		op.getDesp().sendKeys(desp);
		op.getSave().click();
	}
	

}
