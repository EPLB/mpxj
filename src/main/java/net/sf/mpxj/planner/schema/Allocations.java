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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &amp;lt;element ref="{}allocation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
   "allocation"
}) @XmlRootElement(name = "allocations") public class Allocations
{

   protected List<Allocation> allocation;

   /**
    * Gets the value of the allocation property.
    * 
    * &lt;p&gt;
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the allocation property.
    * 
    * &lt;p&gt;
    * For example, to add a new item, do as follows:
    * &lt;pre&gt;
    *    getAllocation().add(newItem);
    * &lt;/pre&gt;
    * 
    * 
    * &lt;p&gt;
    * Objects of the following type(s) are allowed in the list
    * {@link Allocation }
    * 
    * 
    */
   public List<Allocation> getAllocation()
   {
      if (allocation == null)
      {
         allocation = new ArrayList<>();
      }
      return this.allocation;
   }

}
