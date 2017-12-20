//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 07:36:06 AM IST 
//

package tech.ecoa.osets.model.cimp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * To define a new QoS for a provided or required service
 * 
 * 
 * <p>
 * Java class for ServiceQoS complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceQoS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.ecoa.technology/implementation-1.0}NameId" />
 *       &lt;attribute name="newQoS" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceQoS")
public class ServiceQoS {

	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "newQoS", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String newQoS;

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
	 * Gets the value of the newQoS property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNewQoS() {
		return newQoS;
	}

	/**
	 * Sets the value of the newQoS property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNewQoS(String value) {
		this.newQoS = value;
	}

}
