//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:05 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step3InitAssembly;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class EcoaInterfaceElement extends JAXBElement<EcoaInterface> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4629962585400011323L;
	protected final static QName INAME = new QName("http://www.ecoa.technology/sca", "interface");

	public EcoaInterfaceElement(EcoaInterface value) {
		super(INAME, ((Class) EcoaInterface.class), null, value);
	}

	public EcoaInterfaceElement() {
		super(INAME, ((Class) EcoaInterface.class), null, null);
	}

}
