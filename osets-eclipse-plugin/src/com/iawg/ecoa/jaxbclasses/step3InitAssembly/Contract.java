//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:05 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step3InitAssembly;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java class for Contract complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}CommonExtensionBase">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ecoa.technology/sca}interface" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = { "_interface" })
@XmlSeeAlso({ Service.class, Reference.class, ComponentReference.class, ComponentService.class })
public abstract class Contract extends CommonExtensionBase {

	@XmlElementRef(name = "interface", namespace = "http://www.ecoa.technology/sca", type = EcoaInterfaceElement.class, required = false)
	protected EcoaInterfaceElement _interface;
	@XmlAttribute(name = "name", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String name;

	/**
	 * Gets the value of the interface property.
	 * 
	 * @return possible object is {@link EcoaInterfaceElement }
	 * 
	 */
	public EcoaInterfaceElement getInterface() {
		return _interface;
	}

	/**
	 * Sets the value of the interface property.
	 * 
	 * @param value
	 *            allowed object is {@link EcoaInterfaceElement }
	 * 
	 */
	public void setInterface(EcoaInterfaceElement value) {
		this._interface = value;
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

}
