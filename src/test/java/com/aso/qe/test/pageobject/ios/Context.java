package com.aso.qe.test.pageobject.ios;

import java.util.List;

public class Context {
private String ProductPriceOnPDP;
private List<String> subCategoryNameList;
private String categoryTitle;

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

public String getCategoryTitle() {
	return categoryTitle;
}

public void setCategoryTitle(String categoryTitle) {
	this.categoryTitle = categoryTitle;
}


}
