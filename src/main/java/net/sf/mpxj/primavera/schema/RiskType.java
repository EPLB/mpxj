//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.11 at 07:44:45 PM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for RiskType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="RiskType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Cause" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Description" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Effect" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Exposure" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExposureFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExposureStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Id" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IdentifiedByResourceId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IdentifiedByResourceName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IdentifiedByResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IdentifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="200"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Note" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="4000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="20"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResponseTotalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RiskCategoryName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RiskCategoryObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ScoreColor" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;pattern value="#[A-Fa-f0-9]{6}"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ScoreText" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Status" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Proposed"/&amp;gt;
 *               &amp;lt;enumeration value="Open"/&amp;gt;
 *               &amp;lt;enumeration value="Active"/&amp;gt;
 *               &amp;lt;enumeration value="Rejected"/&amp;gt;
 *               &amp;lt;enumeration value="Managed"/&amp;gt;
 *               &amp;lt;enumeration value="Impacted"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Type" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Threat"/&amp;gt;
 *               &amp;lt;enumeration value="Opportunity"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UDF" type="{http://xmlns.oracle.com/Primavera/P6/V20.12/API/BusinessObjects}UDFAssignmentType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "RiskType", propOrder =
{
   "cause",
   "createDate",
   "createUser",
   "description",
   "effect",
   "exposure",
   "exposureFinishDate",
   "exposureStartDate",
   "id",
   "identifiedByResourceId",
   "identifiedByResourceName",
   "identifiedByResourceObjectId",
   "identifiedDate",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "name",
   "note",
   "objectId",
   "projectId",
   "projectName",
   "projectObjectId",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "responseTotalCost",
   "riskCategoryName",
   "riskCategoryObjectId",
   "score",
   "scoreColor",
   "scoreText",
   "status",
   "type",
   "udf"
}) public class RiskType
{

   @XmlElement(name = "Cause") protected String cause;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "Description") protected String description;
   @XmlElement(name = "Effect") protected String effect;
   @XmlElement(name = "Exposure", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double exposure;
   @XmlElement(name = "ExposureFinishDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date exposureFinishDate;
   @XmlElement(name = "ExposureStartDate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date exposureStartDate;
   @XmlElement(name = "Id") protected String id;
   @XmlElement(name = "IdentifiedByResourceId") protected String identifiedByResourceId;
   @XmlElement(name = "IdentifiedByResourceName") protected String identifiedByResourceName;
   @XmlElement(name = "IdentifiedByResourceObjectId", nillable = true) protected Integer identifiedByResourceObjectId;
   @XmlElement(name = "IdentifiedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date identifiedDate;
   @XmlElement(name = "IsBaseline") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "Note") protected String note;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectName") protected String projectName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "ResourceId") protected String resourceId;
   @XmlElement(name = "ResourceName") protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "ResponseTotalCost", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double responseTotalCost;
   @XmlElement(name = "RiskCategoryName") protected String riskCategoryName;
   @XmlElement(name = "RiskCategoryObjectId", nillable = true) protected Integer riskCategoryObjectId;
   @XmlElement(name = "Score", nillable = true) protected Integer score;
   @XmlElement(name = "ScoreColor", nillable = true) protected String scoreColor;
   @XmlElement(name = "ScoreText") protected String scoreText;
   @XmlElement(name = "Status") protected String status;
   @XmlElement(name = "Type") protected String type;
   @XmlElement(name = "UDF") protected List<UDFAssignmentType> udf;

   /**
    * Gets the value of the cause property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCause()
   {
      return cause;
   }

   /**
    * Sets the value of the cause property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCause(String value)
   {
      this.cause = value;
   }

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
    * Gets the value of the description property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * Sets the value of the description property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDescription(String value)
   {
      this.description = value;
   }

   /**
    * Gets the value of the effect property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getEffect()
   {
      return effect;
   }

   /**
    * Sets the value of the effect property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setEffect(String value)
   {
      this.effect = value;
   }

   /**
    * Gets the value of the exposure property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getExposure()
   {
      return exposure;
   }

   /**
    * Sets the value of the exposure property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExposure(Double value)
   {
      this.exposure = value;
   }

   /**
    * Gets the value of the exposureFinishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getExposureFinishDate()
   {
      return exposureFinishDate;
   }

   /**
    * Sets the value of the exposureFinishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExposureFinishDate(Date value)
   {
      this.exposureFinishDate = value;
   }

   /**
    * Gets the value of the exposureStartDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getExposureStartDate()
   {
      return exposureStartDate;
   }

   /**
    * Sets the value of the exposureStartDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setExposureStartDate(Date value)
   {
      this.exposureStartDate = value;
   }

   /**
    * Gets the value of the id property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the id property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setId(String value)
   {
      this.id = value;
   }

   /**
    * Gets the value of the identifiedByResourceId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getIdentifiedByResourceId()
   {
      return identifiedByResourceId;
   }

   /**
    * Sets the value of the identifiedByResourceId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setIdentifiedByResourceId(String value)
   {
      this.identifiedByResourceId = value;
   }

   /**
    * Gets the value of the identifiedByResourceName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getIdentifiedByResourceName()
   {
      return identifiedByResourceName;
   }

   /**
    * Sets the value of the identifiedByResourceName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setIdentifiedByResourceName(String value)
   {
      this.identifiedByResourceName = value;
   }

   /**
    * Gets the value of the identifiedByResourceObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getIdentifiedByResourceObjectId()
   {
      return identifiedByResourceObjectId;
   }

   /**
    * Sets the value of the identifiedByResourceObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setIdentifiedByResourceObjectId(Integer value)
   {
      this.identifiedByResourceObjectId = value;
   }

   /**
    * Gets the value of the identifiedDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getIdentifiedDate()
   {
      return identifiedDate;
   }

   /**
    * Sets the value of the identifiedDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setIdentifiedDate(Date value)
   {
      this.identifiedDate = value;
   }

   /**
    * Gets the value of the isBaseline property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isTemplate property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isIsTemplate()
   {
      return isTemplate;
   }

   /**
    * Sets the value of the isTemplate property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
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
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the note property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getNote()
   {
      return note;
   }

   /**
    * Sets the value of the note property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setNote(String value)
   {
      this.note = value;
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
    * Gets the value of the projectId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectName()
   {
      return projectName;
   }

   /**
    * Sets the value of the projectName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectName(String value)
   {
      this.projectName = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the resourceId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceId()
   {
      return resourceId;
   }

   /**
    * Sets the value of the resourceId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceId(String value)
   {
      this.resourceId = value;
   }

   /**
    * Gets the value of the resourceName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceName()
   {
      return resourceName;
   }

   /**
    * Sets the value of the resourceName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceName(String value)
   {
      this.resourceName = value;
   }

   /**
    * Gets the value of the resourceObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getResourceObjectId()
   {
      return resourceObjectId;
   }

   /**
    * Sets the value of the resourceObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setResourceObjectId(Integer value)
   {
      this.resourceObjectId = value;
   }

   /**
    * Gets the value of the responseTotalCost property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getResponseTotalCost()
   {
      return responseTotalCost;
   }

   /**
    * Sets the value of the responseTotalCost property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResponseTotalCost(Double value)
   {
      this.responseTotalCost = value;
   }

   /**
    * Gets the value of the riskCategoryName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRiskCategoryName()
   {
      return riskCategoryName;
   }

   /**
    * Sets the value of the riskCategoryName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRiskCategoryName(String value)
   {
      this.riskCategoryName = value;
   }

   /**
    * Gets the value of the riskCategoryObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRiskCategoryObjectId()
   {
      return riskCategoryObjectId;
   }

   /**
    * Sets the value of the riskCategoryObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRiskCategoryObjectId(Integer value)
   {
      this.riskCategoryObjectId = value;
   }

   /**
    * Gets the value of the score property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getScore()
   {
      return score;
   }

   /**
    * Sets the value of the score property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setScore(Integer value)
   {
      this.score = value;
   }

   /**
    * Gets the value of the scoreColor property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getScoreColor()
   {
      return scoreColor;
   }

   /**
    * Sets the value of the scoreColor property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setScoreColor(String value)
   {
      this.scoreColor = value;
   }

   /**
    * Gets the value of the scoreText property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getScoreText()
   {
      return scoreText;
   }

   /**
    * Sets the value of the scoreText property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setScoreText(String value)
   {
      this.scoreText = value;
   }

   /**
    * Gets the value of the status property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

   /**
    * Gets the value of the type property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getType()
   {
      return type;
   }

   /**
    * Sets the value of the type property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setType(String value)
   {
      this.type = value;
   }

   /**
    * Gets the value of the udf property.
    * 
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the udf property.
    * 
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getUDF().add(newItem);
    * &lt;/pre&gt;
    * 
    * 
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link UDFAssignmentType }
    * 
    * 
    */
   public List<UDFAssignmentType> getUDF()
   {
      if (udf == null)
      {
         udf = new ArrayList<>();
      }
      return this.udf;
   }

}
