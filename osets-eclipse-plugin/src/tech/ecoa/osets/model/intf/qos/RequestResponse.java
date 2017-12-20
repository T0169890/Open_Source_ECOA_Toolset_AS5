//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 09:12:16 AM IST 
//

package tech.ecoa.osets.model.intf.qos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Use of the "request-reply" exchange mechanism.
 * 
 * 
 * <p>
 * Java class for RequestResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="highestRate" type="{http://www.ecoa.technology/interface-qos-1.0}OperationRate" minOccurs="0"/>
 *         &lt;element name="lowestRate" type="{http://www.ecoa.technology/interface-qos-1.0}OperationRate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.ecoa.technology/interface-qos-1.0}NameId" />
 *       &lt;attribute name="maxResponseTime" type="{http://www.ecoa.technology/interface-qos-1.0}TimeDuration" />
 *       &lt;attribute name="callbackMaxHandlingTime" type="{http://www.ecoa.technology/interface-qos-1.0}TimeDuration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestResponse", propOrder = { "highestRate", "lowestRate" })
public class RequestResponse {

	protected OperationRate highestRate;
	protected OperationRate lowestRate;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "maxResponseTime")
	protected Double maxResponseTime;
	@XmlAttribute(name = "callbackMaxHandlingTime")
	protected Double callbackMaxHandlingTime;

	/**
	 * Gets the value of the highestRate property.
	 * 
	 * @return possible object is {@link OperationRate }
	 * 
	 */
	public OperationRate getHighestRate() {
		return highestRate;
	}

	/**
	 * Sets the value of the highestRate property.
	 * 
	 * @param value
	 *            allowed object is {@link OperationRate }
	 * 
	 */
	public void setHighestRate(OperationRate value) {
		this.highestRate = value;
	}

	/**
	 * Gets the value of the lowestRate property.
	 * 
	 * @return possible object is {@link OperationRate }
	 * 
	 */
	public OperationRate getLowestRate() {
		return lowestRate;
	}

	/**
	 * Sets the value of the lowestRate property.
	 * 
	 * @param value
	 *            allowed object is {@link OperationRate }
	 * 
	 */
	public void setLowestRate(OperationRate value) {
		this.lowestRate = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the maxResponseTime property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getMaxResponseTime() {
		return maxResponseTime;
	}

	/**
	 * Sets the value of the maxResponseTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setMaxResponseTime(Double value) {
		this.maxResponseTime = value;
	}

	/**
	 * Gets the value of the callbackMaxHandlingTime property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCallbackMaxHandlingTime() {
		return callbackMaxHandlingTime;
	}

	/**
	 * Sets the value of the callbackMaxHandlingTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCallbackMaxHandlingTime(Double value) {
		this.callbackMaxHandlingTime = value;
	}

}
