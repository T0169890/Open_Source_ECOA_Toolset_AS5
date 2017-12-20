//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 05:54:52 PM IST 
//

package tech.ecoa.osets.model.pconfig;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the tech.ecoa.osets.model.pconfig package.
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

	private final static QName _ECOAProject_QNAME = new QName("http://www.ecoa.technology/project-1.0", "ECOAProject");
	private final static QName _EcoaProjectComponentImplementations_QNAME = new QName("http://www.ecoa.technology/project-1.0", "componentImplementations");
	private final static QName _EcoaProjectLogicalSystem_QNAME = new QName("http://www.ecoa.technology/project-1.0", "logicalSystem");
	private final static QName _EcoaProjectImplementationAssembly_QNAME = new QName("http://www.ecoa.technology/project-1.0", "implementationAssembly");
	private final static QName _EcoaProjectTypes_QNAME = new QName("http://www.ecoa.technology/project-1.0", "types");
	private final static QName _EcoaProjectComponentDefinitions_QNAME = new QName("http://www.ecoa.technology/project-1.0", "componentDefinitions");
	private final static QName _EcoaProjectServiceDefinitions_QNAME = new QName("http://www.ecoa.technology/project-1.0", "serviceDefinitions");
	private final static QName _EcoaProjectDeploymentSchema_QNAME = new QName("http://www.ecoa.technology/project-1.0", "deploymentSchema");
	private final static QName _EcoaProjectInitialAssembly_QNAME = new QName("http://www.ecoa.technology/project-1.0", "initialAssembly");
	private final static QName _EcoaProjectOutputDirectory_QNAME = new QName("http://www.ecoa.technology/project-1.0", "outputDirectory");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: tech.ecoa.osets.model.pconfig
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Use }
	 * 
	 */
	public Use createUse() {
		return new Use();
	}

	/**
	 * Create an instance of {@link EcoaProject }
	 * 
	 */
	public EcoaProject createEcoaProject() {
		return new EcoaProject();
	}

	/**
	 * Create an instance of {@link Files }
	 * 
	 */
	public Files createFiles() {
		return new Files();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EcoaProject
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "ECOAProject")
	public JAXBElement<EcoaProject> createECOAProject(EcoaProject value) {
		return new JAXBElement<EcoaProject>(_ECOAProject_QNAME, EcoaProject.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Files
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "componentImplementations", scope = EcoaProject.class)
	public JAXBElement<Files> createEcoaProjectComponentImplementations(Files value) {
		return new JAXBElement<Files>(_EcoaProjectComponentImplementations_QNAME, Files.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "logicalSystem", scope = EcoaProject.class)
	public JAXBElement<String> createEcoaProjectLogicalSystem(String value) {
		return new JAXBElement<String>(_EcoaProjectLogicalSystem_QNAME, String.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "implementationAssembly", scope = EcoaProject.class)
	public JAXBElement<String> createEcoaProjectImplementationAssembly(String value) {
		return new JAXBElement<String>(_EcoaProjectImplementationAssembly_QNAME, String.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Files
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "types", scope = EcoaProject.class)
	public JAXBElement<Files> createEcoaProjectTypes(Files value) {
		return new JAXBElement<Files>(_EcoaProjectTypes_QNAME, Files.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Files
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "componentDefinitions", scope = EcoaProject.class)
	public JAXBElement<Files> createEcoaProjectComponentDefinitions(Files value) {
		return new JAXBElement<Files>(_EcoaProjectComponentDefinitions_QNAME, Files.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Files
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "serviceDefinitions", scope = EcoaProject.class)
	public JAXBElement<Files> createEcoaProjectServiceDefinitions(Files value) {
		return new JAXBElement<Files>(_EcoaProjectServiceDefinitions_QNAME, Files.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "deploymentSchema", scope = EcoaProject.class)
	public JAXBElement<String> createEcoaProjectDeploymentSchema(String value) {
		return new JAXBElement<String>(_EcoaProjectDeploymentSchema_QNAME, String.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "initialAssembly", scope = EcoaProject.class)
	public JAXBElement<String> createEcoaProjectInitialAssembly(String value) {
		return new JAXBElement<String>(_EcoaProjectInitialAssembly_QNAME, String.class, EcoaProject.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/project-1.0", name = "outputDirectory", scope = EcoaProject.class)
	public JAXBElement<String> createEcoaProjectOutputDirectory(String value) {
		return new JAXBElement<String>(_EcoaProjectOutputDirectory_QNAME, String.class, EcoaProject.class, value);
	}

}
