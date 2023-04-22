//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.12.01 at 11:46:04 AM GMT
//

package net.sf.mpxj.planner.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &amp;lt;element ref="{}properties" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}phases" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}calendars" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}tasks" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}resource-groups" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}resources" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}allocations" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="mrproject-version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="company" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="manager" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="project-start" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="calendar" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="phase" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "properties",
   "phases",
   "calendars",
   "tasks",
   "resourceGroups",
   "resources",
   "allocations"
}) @XmlRootElement(name = "project") public class Project
{

   protected List<Properties> properties;
   protected Phases phases;
   protected Calendars calendars;
   protected Tasks tasks;
   @XmlElement(name = "resource-groups") protected ResourceGroups resourceGroups;
   protected Resources resources;
   protected Allocations allocations;
   @XmlAttribute(name = "mrproject-version", required = true) @XmlJavaTypeAdapter(Adapter1.class) protected String mrprojectVersion;
   @XmlAttribute(name = "name", required = true) @XmlJavaTypeAdapter(Adapter1.class) protected String name;
   @XmlAttribute(name = "company") @XmlJavaTypeAdapter(Adapter1.class) protected String company;
   @XmlAttribute(name = "manager") @XmlJavaTypeAdapter(Adapter1.class) protected String manager;
   @XmlAttribute(name = "project-start", required = true) @XmlJavaTypeAdapter(Adapter1.class) protected String projectStart;
   @XmlAttribute(name = "calendar") @XmlJavaTypeAdapter(Adapter1.class) protected String calendar;
   @XmlAttribute(name = "phase") @XmlJavaTypeAdapter(Adapter1.class) protected String phase;

   /**
    * Gets the value of the properties property.
    *
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the properties property.
    *
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getProperties().add(newItem);
    * &lt;/pre&gt;
    *
    *
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link Properties }
    *
    *
    */
   public List<Properties> getProperties()
   {
      if (properties == null)
      {
         properties = new ArrayList<>();
      }
      return this.properties;
   }

   /**
    * Gets the value of the phases property.
    *
    * @return
    *     possible object is
    *     {@link Phases }
    *
    */
   public Phases getPhases()
   {
      return phases;
   }

   /**
    * Sets the value of the phases property.
    *
    * @param value
    *     allowed object is
    *     {@link Phases }
    *
    */
   public void setPhases(Phases value)
   {
      this.phases = value;
   }

   /**
    * Gets the value of the calendars property.
    *
    * @return
    *     possible object is
    *     {@link Calendars }
    *
    */
   public Calendars getCalendars()
   {
      return calendars;
   }

   /**
    * Sets the value of the calendars property.
    *
    * @param value
    *     allowed object is
    *     {@link Calendars }
    *
    */
   public void setCalendars(Calendars value)
   {
      this.calendars = value;
   }

   /**
    * Gets the value of the tasks property.
    *
    * @return
    *     possible object is
    *     {@link Tasks }
    *
    */
   public Tasks getTasks()
   {
      return tasks;
   }

   /**
    * Sets the value of the tasks property.
    *
    * @param value
    *     allowed object is
    *     {@link Tasks }
    *
    */
   public void setTasks(Tasks value)
   {
      this.tasks = value;
   }

   /**
    * Gets the value of the resourceGroups property.
    *
    * @return
    *     possible object is
    *     {@link ResourceGroups }
    *
    */
   public ResourceGroups getResourceGroups()
   {
      return resourceGroups;
   }

   /**
    * Sets the value of the resourceGroups property.
    *
    * @param value
    *     allowed object is
    *     {@link ResourceGroups }
    *
    */
   public void setResourceGroups(ResourceGroups value)
   {
      this.resourceGroups = value;
   }

   /**
    * Gets the value of the resources property.
    *
    * @return
    *     possible object is
    *     {@link Resources }
    *
    */
   public Resources getResources()
   {
      return resources;
   }

   /**
    * Sets the value of the resources property.
    *
    * @param value
    *     allowed object is
    *     {@link Resources }
    *
    */
   public void setResources(Resources value)
   {
      this.resources = value;
   }

   /**
    * Gets the value of the allocations property.
    *
    * @return
    *     possible object is
    *     {@link Allocations }
    *
    */
   public Allocations getAllocations()
   {
      return allocations;
   }

   /**
    * Sets the value of the allocations property.
    *
    * @param value
    *     allowed object is
    *     {@link Allocations }
    *
    */
   public void setAllocations(Allocations value)
   {
      this.allocations = value;
   }

   /**
    * Gets the value of the mrprojectVersion property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getMrprojectVersion()
   {
      return mrprojectVersion;
   }

   /**
    * Sets the value of the mrprojectVersion property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setMrprojectVersion(String value)
   {
      this.mrprojectVersion = value;
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
    * Gets the value of the company property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCompany()
   {
      return company;
   }

   /**
    * Sets the value of the company property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCompany(String value)
   {
      this.company = value;
   }

   /**
    * Gets the value of the manager property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getManager()
   {
      return manager;
   }

   /**
    * Sets the value of the manager property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setManager(String value)
   {
      this.manager = value;
   }

   /**
    * Gets the value of the projectStart property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectStart()
   {
      return projectStart;
   }

   /**
    * Sets the value of the projectStart property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectStart(String value)
   {
      this.projectStart = value;
   }

   /**
    * Gets the value of the calendar property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCalendar()
   {
      return calendar;
   }

   /**
    * Sets the value of the calendar property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCalendar(String value)
   {
      this.calendar = value;
   }

   /**
    * Gets the value of the phase property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPhase()
   {
      return phase;
   }

   /**
    * Sets the value of the phase property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPhase(String value)
   {
      this.phase = value;
   }

}
