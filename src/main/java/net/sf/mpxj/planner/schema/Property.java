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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &amp;lt;element ref="{}list-item" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="type"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *             &amp;lt;enumeration value="date"/&amp;gt;
 *             &amp;lt;enumeration value="duration"/&amp;gt;
 *             &amp;lt;enumeration value="float"/&amp;gt;
 *             &amp;lt;enumeration value="int"/&amp;gt;
 *             &amp;lt;enumeration value="text"/&amp;gt;
 *             &amp;lt;enumeration value="text-list"/&amp;gt;
 *             &amp;lt;enumeration value="cost"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="owner"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *             &amp;lt;enumeration value="project"/&amp;gt;
 *             &amp;lt;enumeration value="task"/&amp;gt;
 *             &amp;lt;enumeration value="resource"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@SuppressWarnings("all") @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "listItem"
}) @XmlRootElement(name = "property") public class Property
{

   @XmlElement(name = "list-item") protected List<ListItem> listItem;
   @XmlAttribute(name = "name", required = true) @XmlJavaTypeAdapter(Adapter1.class) protected String name;
   @XmlAttribute(name = "type") @XmlJavaTypeAdapter(CollapsedStringAdapter.class) protected String type;
   @XmlAttribute(name = "owner") @XmlJavaTypeAdapter(CollapsedStringAdapter.class) protected String owner;
   @XmlAttribute(name = "label") @XmlJavaTypeAdapter(Adapter1.class) protected String label;
   @XmlAttribute(name = "description") @XmlJavaTypeAdapter(Adapter1.class) protected String description;
   @XmlAttribute(name = "value") @XmlJavaTypeAdapter(Adapter1.class) protected String value;

   /**
    * Gets the value of the listItem property.
    *
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the listItem property.
    *
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getListItem().add(newItem);
    * &lt;/pre&gt;
    *
    *
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link ListItem }
    *
    *
    */
   public List<ListItem> getListItem()
   {
      if (listItem == null)
      {
         listItem = new ArrayList<>();
      }
      return this.listItem;
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
    * Gets the value of the owner property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOwner()
   {
      return owner;
   }

   /**
    * Sets the value of the owner property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOwner(String value)
   {
      this.owner = value;
   }

   /**
    * Gets the value of the label property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLabel()
   {
      return label;
   }

   /**
    * Sets the value of the label property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLabel(String value)
   {
      this.label = value;
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
    * Gets the value of the value property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getValue()
   {
      return value;
   }

   /**
    * Sets the value of the value property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setValue(String value)
   {
      this.value = value;
   }

}
