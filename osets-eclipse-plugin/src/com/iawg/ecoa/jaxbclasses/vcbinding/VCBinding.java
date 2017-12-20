//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:16 AM BST 
//

package com.iawg.ecoa.jaxbclasses.vcbinding;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for vcbindingtype complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="vcbindingtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logicalComputingPlatform" type="{http://www.ecoa.technology/vcbinding-1.0}logicalComputingPlatformType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vcbindingtype", propOrder = { "logicalComputingPlatforms" })
@XmlRootElement(name = "VCBinding")
public class VCBinding {

	@XmlElement(name = "logicalComputingPlatform", required = true)
	protected List<LogicalComputingPlatformType> logicalComputingPlatforms;

	/**
	 * Gets the value of the logicalComputingPlatforms property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the logicalComputingPlatforms property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLogicalComputingPlatforms().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LogicalComputingPlatformType }
	 * 
	 * 
	 */
	public List<LogicalComputingPlatformType> getLogicalComputingPlatforms() {
		if (logicalComputingPlatforms == null) {
			logicalComputingPlatforms = new ArrayList<LogicalComputingPlatformType>();
		}
		return this.logicalComputingPlatforms;
	}

}
