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
 * &lt;p&gt;Java class for ResourceRequestType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ResourceRequestType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="FinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MatchAllCriteria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequestedUnits" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShowOnlyLaborResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ShowOverallocatedResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SortResultsByAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseActivityDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceRequestCriterion" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="CriterionType"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;enumeration value="Primary Role"/&amp;gt;
 *                         &amp;lt;enumeration value="Role"/&amp;gt;
 *                         &amp;lt;enumeration value="Resource"/&amp;gt;
 *                         &amp;lt;enumeration value="Resource Code"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="Proficiency" minOccurs="0"&amp;gt;
 *                     &amp;lt;simpleType&amp;gt;
 *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                         &amp;lt;enumeration value="1 - Master"/&amp;gt;
 *                         &amp;lt;enumeration value="2 - Expert"/&amp;gt;
 *                         &amp;lt;enumeration value="3 - Skilled"/&amp;gt;
 *                         &amp;lt;enumeration value="4 - Proficient"/&amp;gt;
 *                         &amp;lt;enumeration value="5 - Inexperienced"/&amp;gt;
 *                       &amp;lt;/restriction&amp;gt;
 *                     &amp;lt;/simpleType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                   &amp;lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ResourceRequestType", propOrder =
{
   "finishDate",
   "matchAllCriteria",
   "name",
   "requestedUnits",
   "sequenceNumber",
   "showOnlyLaborResources",
   "showOverallocatedResources",
   "sortResultsByAvailability",
   "startDate",
   "useActivityDates",
   "resourceRequestCriterion"
}) public class ResourceRequestType
{

   @XmlElement(name = "FinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date finishDate;
   @XmlElement(name = "MatchAllCriteria") protected Boolean matchAllCriteria;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "RequestedUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "double") protected Double requestedUnits;
   @XmlElement(name = "SequenceNumber") protected Integer sequenceNumber;
   @XmlElement(name = "ShowOnlyLaborResources") protected Boolean showOnlyLaborResources;
   @XmlElement(name = "ShowOverallocatedResources") protected Boolean showOverallocatedResources;
   @XmlElement(name = "SortResultsByAvailability") protected Boolean sortResultsByAvailability;
   @XmlElement(name = "StartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "dateTime") protected Date startDate;
   @XmlElement(name = "UseActivityDates") protected Boolean useActivityDates;
   @XmlElement(name = "ResourceRequestCriterion") protected List<ResourceRequestType.ResourceRequestCriterion> resourceRequestCriterion;

   /**
    * Gets the value of the finishDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getFinishDate()
   {
      return finishDate;
   }

   /**
    * Sets the value of the finishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setFinishDate(Date value)
   {
      this.finishDate = value;
   }

   /**
    * Gets the value of the matchAllCriteria property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isMatchAllCriteria()
   {
      return matchAllCriteria;
   }

   /**
    * Sets the value of the matchAllCriteria property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setMatchAllCriteria(Boolean value)
   {
      this.matchAllCriteria = value;
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
    * Gets the value of the requestedUnits property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Double getRequestedUnits()
   {
      return requestedUnits;
   }

   /**
    * Sets the value of the requestedUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRequestedUnits(Double value)
   {
      this.requestedUnits = value;
   }

   /**
    * Gets the value of the sequenceNumber property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getSequenceNumber()
   {
      return sequenceNumber;
   }

   /**
    * Sets the value of the sequenceNumber property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setSequenceNumber(Integer value)
   {
      this.sequenceNumber = value;
   }

   /**
    * Gets the value of the showOnlyLaborResources property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isShowOnlyLaborResources()
   {
      return showOnlyLaborResources;
   }

   /**
    * Sets the value of the showOnlyLaborResources property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setShowOnlyLaborResources(Boolean value)
   {
      this.showOnlyLaborResources = value;
   }

   /**
    * Gets the value of the showOverallocatedResources property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isShowOverallocatedResources()
   {
      return showOverallocatedResources;
   }

   /**
    * Sets the value of the showOverallocatedResources property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setShowOverallocatedResources(Boolean value)
   {
      this.showOverallocatedResources = value;
   }

   /**
    * Gets the value of the sortResultsByAvailability property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isSortResultsByAvailability()
   {
      return sortResultsByAvailability;
   }

   /**
    * Sets the value of the sortResultsByAvailability property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setSortResultsByAvailability(Boolean value)
   {
      this.sortResultsByAvailability = value;
   }

   /**
    * Gets the value of the startDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getStartDate()
   {
      return startDate;
   }

   /**
    * Sets the value of the startDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setStartDate(Date value)
   {
      this.startDate = value;
   }

   /**
    * Gets the value of the useActivityDates property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isUseActivityDates()
   {
      return useActivityDates;
   }

   /**
    * Sets the value of the useActivityDates property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setUseActivityDates(Boolean value)
   {
      this.useActivityDates = value;
   }

   /**
    * Gets the value of the resourceRequestCriterion property.
    * 
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resourceRequestCriterion property.
    * 
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getResourceRequestCriterion().add(newItem);
    * &lt;/pre&gt;
    * 
    * 
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link ResourceRequestType.ResourceRequestCriterion }
    * 
    * 
    */
   public List<ResourceRequestType.ResourceRequestCriterion> getResourceRequestCriterion()
   {
      if (resourceRequestCriterion == null)
      {
         resourceRequestCriterion = new ArrayList<>();
      }
      return this.resourceRequestCriterion;
   }

   /**
    * &lt;p&gt;Java class for anonymous complex type.
    * 
    * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
    * 
    * &lt;pre&gt;
    * &amp;lt;complexType&amp;gt;
    *   &amp;lt;complexContent&amp;gt;
    *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
    *       &amp;lt;sequence&amp;gt;
    *         &amp;lt;element name="CriterionType"&amp;gt;
    *           &amp;lt;simpleType&amp;gt;
    *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
    *               &amp;lt;enumeration value="Primary Role"/&amp;gt;
    *               &amp;lt;enumeration value="Role"/&amp;gt;
    *               &amp;lt;enumeration value="Resource"/&amp;gt;
    *               &amp;lt;enumeration value="Resource Code"/&amp;gt;
    *             &amp;lt;/restriction&amp;gt;
    *           &amp;lt;/simpleType&amp;gt;
    *         &amp;lt;/element&amp;gt;
    *         &amp;lt;element name="Proficiency" minOccurs="0"&amp;gt;
    *           &amp;lt;simpleType&amp;gt;
    *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
    *               &amp;lt;enumeration value="1 - Master"/&amp;gt;
    *               &amp;lt;enumeration value="2 - Expert"/&amp;gt;
    *               &amp;lt;enumeration value="3 - Skilled"/&amp;gt;
    *               &amp;lt;enumeration value="4 - Proficient"/&amp;gt;
    *               &amp;lt;enumeration value="5 - Inexperienced"/&amp;gt;
    *             &amp;lt;/restriction&amp;gt;
    *           &amp;lt;/simpleType&amp;gt;
    *         &amp;lt;/element&amp;gt;
    *         &amp;lt;element name="ValueObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
    *       &amp;lt;/sequence&amp;gt;
    *     &amp;lt;/restriction&amp;gt;
    *   &amp;lt;/complexContent&amp;gt;
    * &amp;lt;/complexType&amp;gt;
    * &lt;/pre&gt;
    * 
    * 
    */
   @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
   {
      "criterionType",
      "proficiency",
      "valueObjectId"
   }) public static class ResourceRequestCriterion
   {

      @XmlElement(name = "CriterionType", required = true) protected String criterionType;
      @XmlElement(name = "Proficiency") protected String proficiency;
      @XmlElement(name = "ValueObjectId") protected int valueObjectId;

      /**
       * Gets the value of the criterionType property.
       * 
       * @return
       *     possible object is
       *     {@link String }
       *     
       */
      public String getCriterionType()
      {
         return criterionType;
      }

      /**
       * Sets the value of the criterionType property.
       * 
       * @param value
       *     allowed object is
       *     {@link String }
       *     
       */
      public void setCriterionType(String value)
      {
         this.criterionType = value;
      }

      /**
       * Gets the value of the proficiency property.
       * 
       * @return
       *     possible object is
       *     {@link String }
       *     
       */
      public String getProficiency()
      {
         return proficiency;
      }

      /**
       * Sets the value of the proficiency property.
       * 
       * @param value
       *     allowed object is
       *     {@link String }
       *     
       */
      public void setProficiency(String value)
      {
         this.proficiency = value;
      }

      /**
       * Gets the value of the valueObjectId property.
       * 
       */
      public int getValueObjectId()
      {
         return valueObjectId;
      }

      /**
       * Sets the value of the valueObjectId property.
       * 
       */
      public void setValueObjectId(int value)
      {
         this.valueObjectId = value;
      }

   }

}
