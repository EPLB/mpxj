//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.12.21 at 06:33:54 PM GMT
//

package net.sf.mpxj.primavera.schema;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for ResourceAssignmentCreateType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ResourceAssignmentCreateType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualUnits" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="AssignmentIsRead" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="10"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RemainingDuration" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RemainingFinishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RemainingUnits" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceAssignmentCreateObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceAssignmentObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Status" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Pending"/&amp;gt;
 *               &amp;lt;enumeration value="Held"/&amp;gt;
 *               &amp;lt;enumeration value="Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Rejected"/&amp;gt;
 *               &amp;lt;enumeration value="Partially Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Withdrawn"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ResourceAssignmentCreateType", propOrder =
{
   "activityObjectId",
   "actualFinishDate",
   "actualStartDate",
   "actualUnits",
   "assignmentIsRead",
   "changeSetObjectId",
   "date",
   "projectObjectId",
   "remainingDuration",
   "remainingFinishDate",
   "remainingUnits",
   "requestUserObjectId",
   "resourceAssignmentCreateObjectId",
   "resourceAssignmentObjectId",
   "resourceObjectId",
   "status"
}) public class ResourceAssignmentCreateType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "ActualFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime actualFinishDate;
   @XmlElement(name = "ActualStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime actualStartDate;
   @XmlElement(name = "ActualUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double actualUnits;
   @XmlElement(name = "AssignmentIsRead") @XmlJavaTypeAdapter(Adapter1.class) protected String assignmentIsRead;
   @XmlElement(name = "ChangeSetObjectId") protected Integer changeSetObjectId;
   @XmlElement(name = "Date", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime date;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "RemainingDuration", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double remainingDuration;
   @XmlElement(name = "RemainingFinishDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime remainingFinishDate;
   @XmlElement(name = "RemainingUnits", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter3.class) protected Double remainingUnits;
   @XmlElement(name = "RequestUserObjectId", nillable = true) protected Integer requestUserObjectId;
   @XmlElement(name = "ResourceAssignmentCreateObjectId") protected Integer resourceAssignmentCreateObjectId;
   @XmlElement(name = "ResourceAssignmentObjectId", nillable = true) protected Integer resourceAssignmentObjectId;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "Status") @XmlJavaTypeAdapter(Adapter1.class) protected String status;

   /**
    * Gets the value of the activityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the actualFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getActualFinishDate()
   {
      return actualFinishDate;
   }

   /**
    * Sets the value of the actualFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualFinishDate(LocalDateTime value)
   {
      this.actualFinishDate = value;
   }

   /**
    * Gets the value of the actualStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getActualStartDate()
   {
      return actualStartDate;
   }

   /**
    * Sets the value of the actualStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualStartDate(LocalDateTime value)
   {
      this.actualStartDate = value;
   }

   /**
    * Gets the value of the actualUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getActualUnits()
   {
      return actualUnits;
   }

   /**
    * Sets the value of the actualUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActualUnits(Double value)
   {
      this.actualUnits = value;
   }

   /**
    * Gets the value of the assignmentIsRead property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getAssignmentIsRead()
   {
      return assignmentIsRead;
   }

   /**
    * Sets the value of the assignmentIsRead property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAssignmentIsRead(String value)
   {
      this.assignmentIsRead = value;
   }

   /**
    * Gets the value of the changeSetObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getChangeSetObjectId()
   {
      return changeSetObjectId;
   }

   /**
    * Sets the value of the changeSetObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setChangeSetObjectId(Integer value)
   {
      this.changeSetObjectId = value;
   }

   /**
    * Gets the value of the date property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDate(LocalDateTime value)
   {
      this.date = value;
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
    * Gets the value of the remainingDuration property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getRemainingDuration()
   {
      return remainingDuration;
   }

   /**
    * Sets the value of the remainingDuration property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRemainingDuration(Double value)
   {
      this.remainingDuration = value;
   }

   /**
    * Gets the value of the remainingFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getRemainingFinishDate()
   {
      return remainingFinishDate;
   }

   /**
    * Sets the value of the remainingFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRemainingFinishDate(LocalDateTime value)
   {
      this.remainingFinishDate = value;
   }

   /**
    * Gets the value of the remainingUnits property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Double getRemainingUnits()
   {
      return remainingUnits;
   }

   /**
    * Sets the value of the remainingUnits property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRemainingUnits(Double value)
   {
      this.remainingUnits = value;
   }

   /**
    * Gets the value of the requestUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRequestUserObjectId()
   {
      return requestUserObjectId;
   }

   /**
    * Sets the value of the requestUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRequestUserObjectId(Integer value)
   {
      this.requestUserObjectId = value;
   }

   /**
    * Gets the value of the resourceAssignmentCreateObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getResourceAssignmentCreateObjectId()
   {
      return resourceAssignmentCreateObjectId;
   }

   /**
    * Sets the value of the resourceAssignmentCreateObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setResourceAssignmentCreateObjectId(Integer value)
   {
      this.resourceAssignmentCreateObjectId = value;
   }

   /**
    * Gets the value of the resourceAssignmentObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getResourceAssignmentObjectId()
   {
      return resourceAssignmentObjectId;
   }

   /**
    * Sets the value of the resourceAssignmentObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setResourceAssignmentObjectId(Integer value)
   {
      this.resourceAssignmentObjectId = value;
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

}
