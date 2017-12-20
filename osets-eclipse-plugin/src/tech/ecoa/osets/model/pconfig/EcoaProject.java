//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 05:54:52 PM IST 
//

package tech.ecoa.osets.model.pconfig;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Describes a whole ECOA project
 * 
 * 
 * <p>
 * Java class for EcoaProject complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EcoaProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="serviceDefinitions" type="{http://www.ecoa.technology/project-1.0}Files" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="componentDefinitions" type="{http://www.ecoa.technology/project-1.0}Files" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="types" type="{http://www.ecoa.technology/project-1.0}Files" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="initialAssembly" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="componentImplementations" type="{http://www.ecoa.technology/project-1.0}Files" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="logicalSystem" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="deploymentSchema" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="implementationAssembly" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcoaProject", propOrder = { "serviceDefinitionsOrComponentDefinitionsOrTypes" })
public class EcoaProject {

	@XmlElementRefs({ @XmlElementRef(name = "deploymentSchema", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "initialAssembly", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "componentDefinitions", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "types", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "logicalSystem", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "outputDirectory", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "implementationAssembly", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false), @XmlElementRef(name = "serviceDefinitions", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "componentImplementations", namespace = "http://www.ecoa.technology/project-1.0", type = JAXBElement.class, required = false) })
	protected List<JAXBElement<?>> serviceDefinitionsOrComponentDefinitionsOrTypes;
	@XmlAttribute(name = "name", required = true)
	protected String name;

	/**
	 * Gets the value of the serviceDefinitionsOrComponentDefinitionsOrTypes
	 * property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the
	 * serviceDefinitionsOrComponentDefinitionsOrTypes property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getServiceDefinitionsOrComponentDefinitionsOrTypes().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement
	 * }{@code <}{@link String }{@code >} {@link JAXBElement
	 * }{@code <}{@link Files }{@code >} {@link JAXBElement
	 * }{@code <}{@link Files }{@code >} {@link JAXBElement
	 * }{@code <}{@link String }{@code >} {@link JAXBElement
	 * }{@code <}{@link String }{@code >} {@link JAXBElement
	 * }{@code <}{@link String }{@code >} {@link JAXBElement
	 * }{@code <}{@link Files }{@code >} {@link JAXBElement
	 * }{@code <}{@link Files }{@code >}
	 * 
	 * 
	 */
	public List<JAXBElement<?>> getServiceDefinitionsOrComponentDefinitionsOrTypes() {
		if (serviceDefinitionsOrComponentDefinitionsOrTypes == null) {
			serviceDefinitionsOrComponentDefinitionsOrTypes = new ArrayList<JAXBElement<?>>();
		}
		return this.serviceDefinitionsOrComponentDefinitionsOrTypes;
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
