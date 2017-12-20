//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:10 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step5bFinalAssembly;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Reference complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Contract">
 *       &lt;attribute name="multiplicity" use="required" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Multiplicity" />
 *       &lt;attribute name="promote" use="required" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}listOfAnyURIs" />
 *       &lt;attribute ref="{http://www.ecoa.technology/sca}promoteRankList use="required""/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference")
public class Reference extends Contract {

	@XmlAttribute(name = "multiplicity", required = true)
	protected String multiplicity;
	@XmlAttribute(name = "promote", required = true)
	protected List<String> promotes;
	@XmlAttribute(name = "promoteRankList", namespace = "http://www.ecoa.technology/sca", required = true)
	protected List<BigInteger> promoteRankLists;

	/**
	 * Gets the value of the multiplicity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * Sets the value of the multiplicity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMultiplicity(String value) {
		this.multiplicity = value;
	}

	/**
	 * Gets the value of the promotes property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the promotes property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPromotes().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getPromotes() {
		if (promotes == null) {
			promotes = new ArrayList<String>();
		}
		return this.promotes;
	}

	/**
	 * Gets the value of the promoteRankLists property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the promoteRankLists property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPromoteRankLists().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link BigInteger }
	 * 
	 * 
	 */
	public List<BigInteger> getPromoteRankLists() {
		if (promoteRankLists == null) {
			promoteRankLists = new ArrayList<BigInteger>();
		}
		return this.promoteRankLists;
	}

}
