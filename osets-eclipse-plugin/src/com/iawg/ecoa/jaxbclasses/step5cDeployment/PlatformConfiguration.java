//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:12 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step5cDeployment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PlatformConfiguration complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PlatformConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="computingNodeConfiguration" type="{http://www.ecoa.technology/deployment-1.0}ComputingNodeConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="computingPlatform" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *       &lt;attribute name="notificationMaxNumber" use="required" type="{http://www.ecoa.technology/deployment-1.0}FifoSize" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformConfiguration", propOrder = { "computingNodeConfigurations" })
public class PlatformConfiguration {

	@XmlElement(name = "computingNodeConfiguration")
	protected List<ComputingNodeConfiguration> computingNodeConfigurations;
	@XmlAttribute(name = "computingPlatform", required = true)
	protected String computingPlatform;
	@XmlAttribute(name = "notificationMaxNumber", required = true)
	protected BigDecimal notificationMaxNumber;

	/**
	 * Gets the value of the computingNodeConfigurations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the computingNodeConfigurations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComputingNodeConfigurations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ComputingNodeConfiguration }
	 * 
	 * 
	 */
	public List<ComputingNodeConfiguration> getComputingNodeConfigurations() {
		if (computingNodeConfigurations == null) {
			computingNodeConfigurations = new ArrayList<ComputingNodeConfiguration>();
		}
		return this.computingNodeConfigurations;
	}

	/**
	 * Gets the value of the computingPlatform property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComputingPlatform() {
		return computingPlatform;
	}

	/**
	 * Sets the value of the computingPlatform property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComputingPlatform(String value) {
		this.computingPlatform = value;
	}

	/**
	 * Gets the value of the notificationMaxNumber property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getNotificationMaxNumber() {
		return notificationMaxNumber;
	}

	/**
	 * Sets the value of the notificationMaxNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setNotificationMaxNumber(BigDecimal value) {
		this.notificationMaxNumber = value;
	}

}
