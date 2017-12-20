//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 02:26:48 PM IST 
//

package tech.ecoa.osets.model.cdef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ComponentReference complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Contract">
 *       &lt;attribute name="multiplicity" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Multiplicity" default="1..1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentReference")
@XmlSeeAlso({ ComponentTypeReference.class })
public class ComponentReference extends Contract {

	@XmlAttribute(name = "multiplicity")
	protected String multiplicity;

	/**
	 * Gets the value of the multiplicity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMultiplicity() {
		if (multiplicity == null) {
			return "1..1";
		} else {
			return multiplicity;
		}
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

}
