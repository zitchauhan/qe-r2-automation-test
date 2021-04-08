package com.aso.qe.test.pageobject.ios;

import java.util.List;

public class Context {
public static String CurrentProductTitle;
private static  String ProductPriceOnPDP;
private static List<String> shopBySubCategoryList;
private static List<String> plpSubCategoryList;
private static String categoryTitleOnPLP;
private static List<String> L1CategoryList;
private static List<String> L2CategoryList;
private static List<String> L3CategoryList;
private static List<String> savedAddressesList;
private static String updatedAddressField;
private static String storeName;
private static String defaultStore;
private static String totalQtyOnCart;

public String getProductPriceOnPDP() {
	return ProductPriceOnPDP;
}

public void setProductPriceOnPDP(String productPriceOnPDP) {
	ProductPriceOnPDP = productPriceOnPDP;
}

public String getCategoryTitleOnPLP() {
	return categoryTitleOnPLP;
}

public void setCategoryTitleOnPLP(String categoryTitleOnPLP) {
	Context.categoryTitleOnPLP = categoryTitleOnPLP;
}


public static List<String> getSavedAddressesList() {
	return savedAddressesList;
}

public static void setSavedAddressesList(List<String> savedAddressesList) {
	Context.savedAddressesList = savedAddressesList;
}

public static String getUpdatedAddressField() {
	return updatedAddressField;
}

public static void setUpdatedAddressField(String updatedAddressField) {
	Context.updatedAddressField = updatedAddressField;
}

public static String getStoreName() {
	return storeName;
}

public static void setStoreName(String storeName) {
	Context.storeName = storeName;
}

public static String getDefaultStore() {
	return defaultStore;
}

public static void setDefaultStore(String defaultStore) {
	Context.defaultStore = defaultStore;
}

public static List<String> getShopBySubCategoryList() {
	return shopBySubCategoryList;
}

public static void setShopBySubCategoryList(List<String> shopBySubCategoryList) {
	Context.shopBySubCategoryList = shopBySubCategoryList;
}

public static List<String> getPlpSubCategoryList() {
	return plpSubCategoryList;
}

public static void setPlpSubCategoryList(List<String> plpSubCategoryList) {
	Context.plpSubCategoryList = plpSubCategoryList;
}

public static List<String> getL1CategoryList() {
	return L1CategoryList;
}

public static void setL1CategoryList(List<String> l1CategoryList) {
	L1CategoryList = l1CategoryList;
}

public static List<String> getL2CategoryList() {
	return L2CategoryList;
}

public static void setL2CategoryList(List<String> l2CategoryList) {
	L2CategoryList = l2CategoryList;
}

public static List<String> getL3CategoryList() {
	return L3CategoryList;
}

public static void setL3CategoryList(List<String> l3CategoryList) {
	L3CategoryList = l3CategoryList;
}
public static String getCurrentProductTitle() {
	return CurrentProductTitle;
}

public static void setCurrentProductTitle(String currentProductTitle) {
	CurrentProductTitle = currentProductTitle;
}

public static String getTotalQtyOnCart() {
	return totalQtyOnCart;
}

public static void setTotalQtyOnCart(String totalQtyOnCart) {
	Context.totalQtyOnCart = totalQtyOnCart;
}
}
