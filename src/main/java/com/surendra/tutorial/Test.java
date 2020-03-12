package com.surendra.tutorial;

import com.google.gson.Gson;
import com.surendra.tutorial.reqest.InventoryReqest;
import com.surendra.tutorial.reqest.MultipleRequest;
import com.surendra.tutorial.reqest.ProductRequest;

public class Test {

	public static void main(String[] args) {
		InventoryReqest ir =new InventoryReqest();
		ir.setInventoryId("AA");
		ir.setInventoryName("BB");
		ProductRequest pr = new ProductRequest();
		pr.setProductId("CC");
		pr.setProductName("DD");
		MultipleRequest mr = new MultipleRequest();
		mr.setInventoryReqest(ir);
		mr.setProductRequest(pr);
		System.out.println(mr);
		Gson gson = new Gson();
		String json = gson.toJson(mr);
		System.out.println(json);

	}

}
