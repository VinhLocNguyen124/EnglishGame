package com.locslender.englishgame.model;

import com.ramotion.expandingcollection.ECCardData;

import java.util.List;
import java.util.Random;

public class CardData implements ECCardData<BaiHoc> {
    private String headTitle;
    private Integer headBackgroundResource;
    private Integer mainBackgroundResource;

    private Integer personPictureResource;
    private String personName;
    private String personMessage;
    private int personViewsCount;
    private int personCommentsCount;
    private int personLikesCount;
    private List<BaiHoc> listItems;

    public CardData() {
        Random rnd = new Random();
        this.personViewsCount = 50 + rnd.nextInt(950);
        this.personCommentsCount = 35 + rnd.nextInt(170);
        this.personLikesCount = 10 + rnd.nextInt(1000);
    }

    public String getHeadTitle() {
        return headTitle;
    }

    public void setHeadTitle(String headTitle) {
        this.headTitle = headTitle;
    }

    @Override
    public List<BaiHoc> getListItems() {
        return listItems;
    }

    public void setListItems(List<BaiHoc> listItems) {
        this.listItems = listItems;
    }

    @Override
    public Integer getHeadBackgroundResource() {
        return headBackgroundResource;
    }



    public void setHeadBackgroundResource(Integer headBackgroundResource) {
        this.headBackgroundResource = headBackgroundResource;
    }

    @Override
    public Integer getMainBackgroundResource() {
        return mainBackgroundResource;
    }

    public void setMainBackgroundResource(Integer mainBackgroundResource) {
        this.mainBackgroundResource = mainBackgroundResource;
    }

    public Integer getPersonPictureResource() {
        return personPictureResource;
    }

    public void setPersonPictureResource(Integer personPictureResource) {
        this.personPictureResource = personPictureResource;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonMessage() {
        return personMessage;
    }

    public void setPersonMessage(String personMessage) {
        this.personMessage = personMessage;
    }

    public int getPersonViewsCount() {
        return personViewsCount;
    }

    public void setPersonViewsCount(int personViewsCount) {
        this.personViewsCount = personViewsCount;
    }

    public int getPersonCommentsCount() {
        return personCommentsCount;
    }

    public void setPersonCommentsCount(int personCommentsCount) {
        this.personCommentsCount = personCommentsCount;
    }

    public int getPersonLikesCount() {
        return personLikesCount;
    }

    public void setPersonLikesCount(int personLikesCount) {
        this.personLikesCount = personLikesCount;
    }


}
