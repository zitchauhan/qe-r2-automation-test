package com.aso.qe.test.pageobject.ios;

import java.util.List;

public class Context {
private static  String ProductPriceOnPDP;
private static List<String> subCategoryNameList;
private static String categoryTitleOnPLP;

public String getProductPriceOnPDP() {
	return ProductPriceOnPDP;
}

public void setProductPriceOnPDP(String productPriceOnPDP) {
	ProductPriceOnPDP = productPriceOnPDP;
}

public List<String> getSubCategoryNameList() {
	return subCategoryNameList;
}

public void setSubCategoryNameList(List<String> subCategoryNameList) {
	this.subCategoryNameList = subCategoryNameList;
}

public String getCategoryTitleOnPLP() {
	return categoryTitleOnPLP;
}

public void setCategoryTitleOnPLP(String categoryTitleOnPLP) {
	this.categoryTitleOnPLP = categoryTitleOnPLP;
}

}
