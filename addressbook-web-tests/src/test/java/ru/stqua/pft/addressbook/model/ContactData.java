package ru.stqua.pft.addressbook.model;

public class ContactData {


  private final String first_name;
  private final String midlle_name;
  private final String last_name;
  private final String nick_name;
  private final String title;
  private final String company;
  private final String address;
 // private final PhoneContactData phoneContactData;


  public ContactData(String last_name, String midlle_name,String first_name ,String nick_name,
                     String title, String company, String address
                  //   String home_telephone, String mobile_phone, String work_phone, String fax
                    )
  {
    //phoneContactData = new PhoneContactData(home_telephone, mobile_phone, work_phone, fax);

    this.first_name = first_name;
    this.midlle_name = midlle_name;
    this.last_name = last_name;
    this.nick_name = nick_name;
    this.title = title;
    this.company = company;
    this.address = address;

  }


  public String getFirst_name() {
    return first_name;
  }
  public String getMidlle_name() {
    return midlle_name;
  }
  public String getLast_name() {
    return last_name;
  }
  public String getNick_name() {
    return nick_name;
  }

  public String getTitle() {
    return title;
  }
  public String getCompany() {
    return company;
  }
  public String getAddress() {
    return address;
  }


}
