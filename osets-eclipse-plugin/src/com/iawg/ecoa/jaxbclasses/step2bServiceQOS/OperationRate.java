//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:04 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step2bServiceQOS;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for OperationRate complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="OperationRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="numberOfOccurrences" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="timeFrame" type="{http://www.ecoa.technology/interface-qos-1.0}TimeDuration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationRate")
public class OperationRate {

	@XmlAttribute(name = "numberOfOccurrences")
	protected BigDecimal numberOfOccurrences;
	@XmlAttribute(name = "timeFrame")
	protected Double timeFrame;

	/**
	 * Gets the value of the numberOfOccurrences property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getNumberOfOccurrences() {
		return numberOfOccurrences;
	}

	/**
	 * Sets the value of the numberOfOccurrences property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setNumberOfOccurrences(BigDecimal value) {
		this.numberOfOccurrences = value;
	}

	/**
	 * Gets the value of the timeFrame property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getTimeFrame() {
		return timeFrame;
	}

	/**
	 * Sets the value of the timeFrame property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setTimeFrame(Double value) {
		this.timeFrame = value;
	}

}
