package com.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {
    private long id;
    private String text;
    private String type; //plot, house etc
    private String shortDesc;
    private String longDesc;
    private long askingPrice;
    private String ownerName;
    private boolean isOwnerAgent;
    private String currency; //INR , USD etc for future project expansion
    private String status; //Live,deleted,sold
    private Date soldDate;
    private long sellingPrice;
    private Date firstPostedDate;
    private Date lastUpdatedDate;

    //TODO image processing

    public Message() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public long getAskingPrice() {
        return askingPrice;
    }

    public void setAskingPrice(long askingPrice) {
        this.askingPrice = askingPrice;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean isOwnerAgent() {
        return isOwnerAgent;
    }

    public void setOwnerAgent(boolean ownerAgent) {
        isOwnerAgent = ownerAgent;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    public long getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(long sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Date getFirstPostedDate() {
        return firstPostedDate;
    }

    public void setFirstPostedDate(Date firstPostedDate) {
        this.firstPostedDate = firstPostedDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}