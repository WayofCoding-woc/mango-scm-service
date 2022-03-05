/*
SPDX-License-Identifier: Apache-2.0
*/

package com.google.scm.mango.chaincode.client;

import com.google.scm.mango.dto.Mango;
import com.google.scm.mango.util.JsonUtil;
import org.hyperledger.fabric.gateway.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ClientApp {

	static {
		System.setProperty("org.hyperledger.fabric.sdk.service_discovery.as_localhost", "true");
	}


	/*public static void main(String[] args) throws Exception {
			Contract contract = ChainCodeUtil.getContract();
			Mango m01 = getMango("m01");

			byte[] result;

			System.out.println("________________");
			System.out.println(new String(contract.evaluateTransaction("viewAsset", "m02")));
//			System.out.println("****************************");
//			System.out.println(new String(contract.evaluateTransaction("viewAsset", "m03")));

			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

			//public Product addAsset(Context context, String id, String description, String producerName, String producerAddress, String harvestDate) {
			try {
				result = contract.submitTransaction("addAsset", "m05", "mallika mango", "Harish Kumar", "709 tk village", "2022-02-20");
				System.out.println(new String(result));
			}catch (Exception e){
				e.printStackTrace();
			}
			System.out.println("====================");
			//System.out.println(new String(contract.evaluateTransaction("viewAsset", "m05")));

			//public String transferAssetFromProducerToDistributor(Context context, String id, String distributorName, String distributorAddress, String transferDate) {

			result = contract.submitTransaction("transferAssetFromProducerToDistributor", "m05", "Jay", "Noida", "2022-02-21");
			System.out.println("product has been transferred to distributor, reference id = "  + new String(result));

			System.out.println(new String(contract.evaluateTransaction("viewAsset", new String(result))));

			System.out.println("______________________________________________________________");
			//public String transferAssetFromDistributorToRetailer(Context context, String id, String retailerName, String retailerAddress, String transferDate) {

			result = contract.submitTransaction("transferAssetFromDistributorToRetailer", "m05", "Manendra", "Bangalore", "2022-02-23");
			System.out.println("product has been transferred to retailer, reference id = "  + new String(result));
			System.out.println(new String(contract.evaluateTransaction("viewAsset", new String(result))));

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			System.out.println(new String(contract.evaluateTransaction("viewHistory", new String("m05"))));

	}*/

	public static Mango addMango(Mango mango){
		try {
			byte[] result = ChainCodeUtil.getContract().submitTransaction("addAsset", mango.getProductId(),
					mango.getProductDescription(), mango.getProducerName(),
					mango.getProducerAddress(), mango.getHarvestDate());
			return JsonUtil.fromJson(new String(result), Mango.class);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static Mango getMango(String id) {
		try {
			byte[] mangoDetails = ChainCodeUtil.getContract().evaluateTransaction("viewAsset", id);
			String json = new String(mangoDetails);
			Mango mango = JsonUtil.fromJson(json, Mango.class);
			return mango;
		}catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
