/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.Date;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Be A Coder
 */
public class PersonTableData 
{
        private SimpleStringProperty Name;
	private SimpleStringProperty AddressLine1;
	private SimpleStringProperty AddressLine2;
	private SimpleStringProperty Gender;
	private SimpleStringProperty Relationship;
        private SimpleStringProperty PhoneNo;
	private SimpleStringProperty EmailId;
        
   public PersonTableData(Person p)
   {
       this.Name = new SimpleStringProperty(p.getName());
       this.AddressLine1 = new SimpleStringProperty(p.getAddressLine1());
       this.AddressLine2 = new SimpleStringProperty(p.getAddressLine2());
       this.Gender = new SimpleStringProperty(p.getGender());
       this.Relationship = new SimpleStringProperty(p.getRelationship());
       this.PhoneNo = new SimpleStringProperty(p.getPhoneNo());
       this.EmailId = new SimpleStringProperty(p.getEmaild());
   }
   public String getName()
   {
       return Name.get();
   }
   public String getAddressLine1()
   {
       return AddressLine1.get();
   }
   public String getAddressLine2()
   {
       return AddressLine2.get();
   }
   public String getGender()
   {
       return Gender.get();
   }
   public String getRelationship()
   {
       return Relationship.get();
   }
   public String getPhoneNo()
   {
       return PhoneNo.get();
   }
   public String getEmailId()
   {
       return EmailId.get();
   }
   public void setName(String newValue)
   {
       this.Name.set(newValue);
   }
   public void setEmailId(String newValue)
   {
       this.EmailId.set(newValue);
   }
   public void setPhoneNo(String newValue)
   {
       this.PhoneNo.set(newValue);
   }
    public void setAddressLine1(String newValue)
   {
       this.AddressLine1.set(newValue);
   }
     public void setAddressLine2(String newValue)
   {
       this.AddressLine2.set(newValue);
   }
     public void setGender(String newValue)
   {
       this.Gender.set(newValue);
   }
       public void setRelationship(String newValue)
   {
       this.Relationship.set(newValue);
   }
}
