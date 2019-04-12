/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author Be A Coder
 */


public class Person 
{
  private String Name;
  private String AddressLine1;
  private String AddressLine2;
  private String Gender;
  private String Relationship;
  private String Emaild;
  private String PhoneNo;

  
  public Person(String Name,String AddressLine1,String AddressLine2,String Gender,String Relationship,String PhoneNo,String EmailId)
  {
    this.Name = Name;
    this.AddressLine1=AddressLine1;
    this.AddressLine2=AddressLine2;
    this.Gender = Gender;
    this.Relationship = Relationship;
    this.PhoneNo = PhoneNo;
    this.Emaild = EmailId;
  }
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the AddressLine1
     */
    public String getAddressLine1() {
        return AddressLine1;
    }

    /**
     * @param AddressLine1 the AddressLine1 to set
     */
    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    /**
     * @return the AddressLine2
     */
    public String getAddressLine2() {
        return AddressLine2;
    }

    /**
     * @param AddressLine2 the AddressLine2 to set
     */
    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the RelationShip
     */
    public String getRelationship() {
        return Relationship;
    }

    /**
     * @param RelationShip the RelationShip to set
     */
    public void setRelationship(String Relationship) {
        this.Relationship = Relationship;
    }

    /**
     * @return the Emaild
     */
    public String getEmaild() {
        return Emaild;
    }

    /**
     * @param Emaild the Emaild to set
     */
    public void setEmaild(String Emaild) {
        this.Emaild = Emaild;
    }

    /**
     * @return the PhoneNo
     */
    public String getPhoneNo() {
        return PhoneNo;
    }

    /**
     * @param PhoneNo the PhoneNo to set
     */
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
  
}
