//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:10 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step5bFinalAssembly;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ComponentTypeReference complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentTypeReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}ComponentReference">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/opencsa/sca/200912}documentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ecoa.technology/sca}interface"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="multiplicity" type="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Multiplicity" default="1..1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentTypeReference")
public class ComponentTypeReference extends ComponentReference {

}
