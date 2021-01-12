//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.11 at 07:44:45 PM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for RoleRateType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="RoleRateType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="MaxUnitsPerTime" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PricePerUnit" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *               &amp;lt;maxInclusive value="9.99999999999999E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PricePerUnit2" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *               &amp;lt;maxInclusive value="9.99999999999999E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PricePerUnit3" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *               &amp;lt;maxInclusive value="9.99999999999999E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PricePerUnit4" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *               &amp;lt;maxInclusive value="9.99999999999999E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PricePerUnit5" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *               &amp;lt;maxInclusive value="9.99999999999999E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RoleId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RoleName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RoleObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RoleRateType", propOrder =
{
   "createDate",
   "createUser",
   "effectiveDate",
   "lastUpdateDate",
   "lastUpdateUser",
   "maxUnitsPerTime",
   "objectId",
   "pricePerUnit",
   "pricePerUnit2",
   "pricePerUnit3",
   "pricePerUnit4",
   "pricePerUnit5",
   "roleId",
   "roleName",
   "roleObjectId"
}) public class RoleRateType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "EffectiveDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date effectiveDate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "MaxUnitsPerTime", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected Double maxUnitsPerTime;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "PricePerUnit", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected Double pricePerUnit;
   @XmlElement(name = "PricePerUnit2", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected Double pricePerUnit2;
   @XmlElement(name = "PricePerUnit3", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected Double pricePerUnit3;
   @XmlElement(name = "PricePerUnit4", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected Double pricePerUnit4;
   @XmlElement(name = "PricePerUnit5", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) protected Double pricePerUnit5;
   @XmlElement(name = "RoleId") protected String roleId;
   @XmlElement(name = "RoleName") protected String roleName;
   @XmlElement(name = "RoleObjectId") protected Integer roleObjectId;

   /**
    * Gets the value of the createDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the effectiveDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getEffectiveDate()
   {
      return effectiveDate;
   }

   /**
    * Sets the value of the effectiveDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setEffectiveDate(Date value)
   {
      this.effectiveDate = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the maxUnitsPerTime property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getMaxUnitsPerTime()
   {
      return maxUnitsPerTime;
   }

   /**
    * Sets the value of the maxUnitsPerTime property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setMaxUnitsPerTime(Double value)
   {
      this.maxUnitsPerTime = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the pricePerUnit property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getPricePerUnit()
   {
      return pricePerUnit;
   }

   /**
    * Sets the value of the pricePerUnit property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPricePerUnit(Double value)
   {
      this.pricePerUnit = value;
   }

   /**
    * Gets the value of the pricePerUnit2 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getPricePerUnit2()
   {
      return pricePerUnit2;
   }

   /**
    * Sets the value of the pricePerUnit2 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPricePerUnit2(Double value)
   {
      this.pricePerUnit2 = value;
   }

   /**
    * Gets the value of the pricePerUnit3 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getPricePerUnit3()
   {
      return pricePerUnit3;
   }

   /**
    * Sets the value of the pricePerUnit3 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPricePerUnit3(Double value)
   {
      this.pricePerUnit3 = value;
   }

   /**
    * Gets the value of the pricePerUnit4 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getPricePerUnit4()
   {
      return pricePerUnit4;
   }

   /**
    * Sets the value of the pricePerUnit4 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPricePerUnit4(Double value)
   {
      this.pricePerUnit4 = value;
   }

   /**
    * Gets the value of the pricePerUnit5 property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getPricePerUnit5()
   {
      return pricePerUnit5;
   }

   /**
    * Sets the value of the pricePerUnit5 property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPricePerUnit5(Double value)
   {
      this.pricePerUnit5 = value;
   }

   /**
    * Gets the value of the roleId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleId()
   {
      return roleId;
   }

   /**
    * Sets the value of the roleId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleId(String value)
   {
      this.roleId = value;
   }

   /**
    * Gets the value of the roleName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRoleName()
   {
      return roleName;
   }

   /**
    * Sets the value of the roleName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRoleName(String value)
   {
      this.roleName = value;
   }

   /**
    * Gets the value of the roleObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRoleObjectId()
   {
      return roleObjectId;
   }

   /**
    * Sets the value of the roleObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRoleObjectId(Integer value)
   {
      this.roleObjectId = value;
   }

}
