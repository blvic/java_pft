package ru.stqua.pft.addressbook.model;

public class PhoneContactData {
  private final String home_telephone;
  private final String mobile_phone;
  private final String work_phone;
  private final String fax;

  public PhoneContactData(String home_telephone, String mobile_phone, String work_phone, String fax) {
    this.home_telephone = home_telephone;
    this.mobile_phone = mobile_phone;
    this.work_phone = work_phone;
    this.fax = fax;
  }

  public String getHome_telephone() {return home_telephone;}

  public String getMobile_phone() {return mobile_phone;}

  public String getWork_phone() {return work_phone;}

  public String getFax() {return fax;}
}
