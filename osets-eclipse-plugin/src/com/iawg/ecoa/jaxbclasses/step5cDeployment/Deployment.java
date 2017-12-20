//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:12 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step5cDeployment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Deployment complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Deployment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protectionDomain" type="{http://www.ecoa.technology/deployment-1.0}ProtectionDomain" maxOccurs="unbounded"/>
 *         &lt;element name="logPolicy" type="{http://www.ecoa.technology/deployment-1.0}LogPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="platformConfiguration" type="{http://www.ecoa.technology/deployment-1.0}PlatformConfiguration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="finalAssembly" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *       &lt;attribute name="logicalSystem" use="required" type="{http://www.ecoa.technology/deployment-1.0}NameId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deployment", propOrder = { "protectionDomains", "logPolicies", "platformConfigurations" })
@XmlRootElement(name = "deployment")
public class Deployment {

	@XmlElement(name = "protectionDomain", required = true)
	protected List<ProtectionDomain> protectionDomains;
	@XmlElement(name = "logPolicy")
	protected List<LogPolicy> logPolicies;
	@XmlElement(name = "platformConfiguration", required = true)
	protected List<PlatformConfiguration> platformConfigurations;
	@XmlAttribute(name = "finalAssembly", required = true)
	protected String finalAssembly;
	@XmlAttribute(name = "logicalSystem", required = true)
	protected String logicalSystem;

	/**
	 * Gets the value of the protectionDomains property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the protectionDomains property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProtectionDomains().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ProtectionDomain }
	 * 
	 * 
	 */
	public List<ProtectionDomain> getProtectionDomains() {
		if (protectionDomains == null) {
			protectionDomains = new ArrayList<ProtectionDomain>();
		}
		return this.protectionDomains;
	}

	/**
	 * Gets the value of the logPolicies property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the logPolicies property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLogPolicies().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link LogPolicy
	 * }
	 * 
	 * 
	 */
	public List<LogPolicy> getLogPolicies() {
		if (logPolicies == null) {
			logPolicies = new ArrayList<LogPolicy>();
		}
		return this.logPolicies;
	}

	/**
	 * Gets the value of the platformConfigurations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the platformConfigurations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPlatformConfigurations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PlatformConfiguration }
	 * 
	 * 
	 */
	public List<PlatformConfiguration> getPlatformConfigurations() {
		if (platformConfigurations == null) {
			platformConfigurations = new ArrayList<PlatformConfiguration>();
		}
		return this.platformConfigurations;
	}

	/**
	 * Gets the value of the finalAssembly property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFinalAssembly() {
		return finalAssembly;
	}

	/**
	 * Sets the value of the finalAssembly property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFinalAssembly(String value) {
		this.finalAssembly = value;
	}

	/**
	 * Gets the value of the logicalSystem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLogicalSystem() {
		return logicalSystem;
	}

	/**
	 * Sets the value of the logicalSystem property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLogicalSystem(String value) {
		this.logicalSystem = value;
	}

}
