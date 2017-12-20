//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:04 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step2bServiceQOS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The definition of an ECOA service, including a set of operations.
 * 
 * 
 * <p>
 * Java class for ServiceInstanceQoS complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstanceQoS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operations" type="{http://www.ecoa.technology/interface-qos-1.0}Operations"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstanceQoS", propOrder = { "operations" })
@XmlRootElement(name = "serviceInstanceQoS")
public class ServiceInstanceQoS {

	@XmlElement(required = true)
	protected Operations operations;

	/**
	 * Gets the value of the operations property.
	 * 
	 * @return possible object is {@link Operations }
	 * 
	 */
	public Operations getOperations() {
		return operations;
	}

	/**
	 * Sets the value of the operations property.
	 * 
	 * @param value
	 *            allowed object is {@link Operations }
	 * 
	 */
	public void setOperations(Operations value) {
		this.operations = value;
	}

}
