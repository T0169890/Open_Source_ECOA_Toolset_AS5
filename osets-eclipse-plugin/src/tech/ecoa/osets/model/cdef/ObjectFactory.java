//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.02 at 02:26:48 PM IST 
//

package tech.ecoa.osets.model.cdef;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the tech.ecoa.osets.model.cdef package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Composite_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "composite");
	private final static QName _Documentation_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "documentation");
	private final static QName _Implementation_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "implementation");
	private final static QName _ImplementationType_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "implementationType");
	private final static QName _ComponentType_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "componentType");
	private final static QName _Interface_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "interface");
	private final static QName _Value_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "value");
	private final static QName _Instance_QNAME = new QName("http://www.ecoa.technology/sca", "instance");
	private final static QName _WireFormat_QNAME = new QName("http://docs.oasis-open.org/ns/opencsa/sca/200912", "wireFormat");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: tech.ecoa.osets.model.cdef
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Instance }
	 * 
	 */
	public Instance createInstance() {
		return new Instance();
	}

	/**
	 * Create an instance of {@link ComponentType }
	 * 
	 */
	public ComponentType createComponentType() {
		return new ComponentType();
	}

	/**
	 * Create an instance of {@link ImplementationType }
	 * 
	 */
	public ImplementationType createImplementationType() {
		return new ImplementationType();
	}

	/**
	 * Create an instance of {@link Extensions }
	 * 
	 */
	public Extensions createExtensions() {
		return new Extensions();
	}

	/**
	 * Create an instance of {@link Composite }
	 * 
	 */
	public Composite createComposite() {
		return new Composite();
	}

	/**
	 * Create an instance of {@link Documentation }
	 * 
	 */
	public Documentation createDocumentation() {
		return new Documentation();
	}

	/**
	 * Create an instance of {@link ValueType }
	 * 
	 */
	public ValueType createValueType() {
		return new ValueType();
	}

	/**
	 * Create an instance of {@link Reference }
	 * 
	 */
	public Reference createReference() {
		return new Reference();
	}

	/**
	 * Create an instance of {@link tech.ecoa.osets.model.cdef.Service }
	 * 
	 */
	public tech.ecoa.osets.model.cdef.Service createService() {
		return new tech.ecoa.osets.model.cdef.Service();
	}

	/**
	 * Create an instance of {@link PropertyValue }
	 * 
	 */
	public PropertyValue createPropertyValue() {
		return new PropertyValue();
	}

	/**
	 * Create an instance of {@link Wire }
	 * 
	 */
	public Wire createWire() {
		return new Wire();
	}

	/**
	 * Create an instance of {@link ComponentTypeReference }
	 * 
	 */
	public ComponentTypeReference createComponentTypeReference() {
		return new ComponentTypeReference();
	}

	/**
	 * Create an instance of {@link SCAPropertyBase }
	 * 
	 */
	public SCAPropertyBase createSCAPropertyBase() {
		return new SCAPropertyBase();
	}

	/**
	 * Create an instance of {@link ComponentReference }
	 * 
	 */
	public ComponentReference createComponentReference() {
		return new ComponentReference();
	}

	/**
	 * Create an instance of {@link CommonExtensionBase }
	 * 
	 */
	public CommonExtensionBase createCommonExtensionBase() {
		return new CommonExtensionBase();
	}

	/**
	 * Create an instance of {@link ComponentService }
	 * 
	 */
	public ComponentService createComponentService() {
		return new ComponentService();
	}

	/**
	 * Create an instance of {@link Component }
	 * 
	 */
	public Component createComponent() {
		return new Component();
	}

	/**
	 * Create an instance of {@link Property }
	 * 
	 */
	public Property createProperty() {
		return new Property();
	}

	/**
	 * Create an instance of {@link EcoaInterface }
	 * 
	 */
	public EcoaInterface createEcoaInterface() {
		return new EcoaInterface();
	}

	/**
	 * Create an instance of {@link WireInformation }
	 * 
	 */
	public WireInformation createWireInformation() {
		return new WireInformation();
	}

	/**
	 * Create an instance of {@link Instance.Implementation }
	 * 
	 */
	public Instance.Implementation createInstanceImplementation() {
		return new Instance.Implementation();
	}

	/**
	 * Create an instance of {@link ComponentType.Service }
	 * 
	 */
	public ComponentType.Service createComponentTypeService() {
		return new ComponentType.Service();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Composite
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "composite")
	public JAXBElement<Composite> createComposite(Composite value) {
		return new JAXBElement<Composite>(_Composite_QNAME, Composite.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Documentation
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "documentation")
	public JAXBElement<Documentation> createDocumentation(Documentation value) {
		return new JAXBElement<Documentation>(_Documentation_QNAME, Documentation.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link tech.ecoa.osets.model.cdef.Implementation }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "implementation")
	public JAXBElement<tech.ecoa.osets.model.cdef.Implementation> createImplementation(tech.ecoa.osets.model.cdef.Implementation value) {
		return new JAXBElement<tech.ecoa.osets.model.cdef.Implementation>(_Implementation_QNAME, tech.ecoa.osets.model.cdef.Implementation.class, null, value);
	}

	/**
	 * Create an instance of {@link EcoaInterfaceElement }}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/sca", name = "interface", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", substitutionHeadName = "interface")
	public EcoaInterfaceElement createEcoaInterfaceElement(EcoaInterface value) {
		return new EcoaInterfaceElement(value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ImplementationType }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "implementationType")
	public JAXBElement<ImplementationType> createImplementationType(ImplementationType value) {
		return new JAXBElement<ImplementationType>(_ImplementationType_QNAME, ImplementationType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "componentType")
	public JAXBElement<ComponentType> createComponentType(ComponentType value) {
		return new JAXBElement<ComponentType>(_ComponentType_QNAME, ComponentType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Interface
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "interface")
	public JAXBElement<Interface> createInterface(Interface value) {
		return new JAXBElement<Interface>(_Interface_QNAME, Interface.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ValueType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "value")
	public JAXBElement<ValueType> createValue(ValueType value) {
		return new JAXBElement<ValueType>(_Value_QNAME, ValueType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Instance
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/sca", name = "instance", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", substitutionHeadName = "implementation")
	public JAXBElement<Instance> createInstance(Instance value) {
		return new JAXBElement<Instance>(_Instance_QNAME, Instance.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link WireFormatType
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/opencsa/sca/200912", name = "wireFormat")
	public JAXBElement<WireFormatType> createWireFormat(WireFormatType value) {
		return new JAXBElement<WireFormatType>(_WireFormat_QNAME, WireFormatType.class, null, value);
	}

}
