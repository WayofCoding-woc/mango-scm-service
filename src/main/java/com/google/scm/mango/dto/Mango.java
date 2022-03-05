package com.google.scm.mango.dto;

import java.io.Serializable;

public class Mango implements Serializable {

    private String productId;

    private String productDescription;

    private String producerName;

    private String producerAddress;

    private String distributorName;

    private String distributorAddress;

    private String retailerName;

    private String retailerAddress;

    private String harvestDate;

    private String distToRetailDate;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerAddress() {
        return producerAddress;
    }

    public void setProducerAddress(String producerAddress) {
        this.producerAddress = producerAddress;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getDistributorAddress() {
        return distributorAddress;
    }

    public void setDistributorAddress(String distributorAddress) {
        this.distributorAddress = distributorAddress;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getRetailerAddress() {
        return retailerAddress;
    }

    public void setRetailerAddress(String retailerAddress) {
        this.retailerAddress = retailerAddress;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getDistToRetailDate() {
        return distToRetailDate;
    }

    public void setDistToRetailDate(String distToRetailDate) {
        this.distToRetailDate = distToRetailDate;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "productId='" + productId + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", producerName='" + producerName + '\'' +
                ", producerAddress='" + producerAddress + '\'' +
                ", distributorName='" + distributorName + '\'' +
                ", distributorAddress='" + distributorAddress + '\'' +
                ", retailerName='" + retailerName + '\'' +
                ", retailerAddress='" + retailerAddress + '\'' +
                ", harvestDate='" + harvestDate + '\'' +
                ", distToRetailDate='" + distToRetailDate + '\'' +
                '}';
    }
}
