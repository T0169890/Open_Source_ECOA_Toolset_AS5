//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 09:10:02 AM IST 
//

package tech.ecoa.osets.model.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Variable-size (bounded capacity) array
 * 
 * 
 * <p>
 * Java class for Array complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Array">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="itemType" use="required" type="{http://www.ecoa.technology/types-1.0}TypeQName" />
 *       &lt;attribute name="maxNumber" use="required" type="{http://www.ecoa.technology/types-1.0}ConstantReferenceOrPositiveIntegerValue" />
 *       &lt;attribute name="name" use="required" type="{http://www.ecoa.technology/types-1.0}TypeName" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Array")
public class Array {

	@XmlAttribute(name = "itemType", required = true)
	protected String itemType;
	@XmlAttribute(name = "maxNumber", required = true)
	protected String maxNumber;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "comment")
	protected String comment;

	/**
	 * Gets the value of the itemType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * Sets the value of the itemType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setItemType(String value) {
		this.itemType = value;
	}

	/**
	 * Gets the value of the maxNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaxNumber() {
		return maxNumber;
	}

	/**
	 * Sets the value of the maxNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaxNumber(String value) {
		this.maxNumber = value;
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
	 * Gets the value of the comment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the value of the comment property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setComment(String value) {
		this.comment = value;
	}

}
