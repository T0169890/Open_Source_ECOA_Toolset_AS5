//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.23 at 07:36:06 AM IST 
//

package tech.ecoa.osets.model.cimp;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * Link between RR operations. Must have exactly one server. Can have many
 * clients.
 * 
 * 
 * <p>
 * Java class for RequestLink complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RequestLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clients">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;choice>
 *                     &lt;element name="service" type="{http://www.ecoa.technology/implementation-1.0}OpRef"/>
 *                     &lt;element name="moduleInstance" type="{http://www.ecoa.technology/implementation-1.0}OpRefActivatable"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="server">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="reference" type="{http://www.ecoa.technology/implementation-1.0}OpRef"/>
 *                   &lt;element name="moduleInstance" type="{http://www.ecoa.technology/implementation-1.0}OpRefServer"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestLink", propOrder = { "clients", "server" })
public class RequestLink {

	@XmlElement(required = true)
	protected RequestLink.Clients clients;
	@XmlElement(required = true)
	protected RequestLink.Server server;
	@XmlAttribute(name = "id")
	protected Integer id;

	/**
	 * Gets the value of the clients property.
	 * 
	 * @return possible object is {@link RequestLink.Clients }
	 * 
	 */
	public RequestLink.Clients getClients() {
		return clients;
	}

	/**
	 * Sets the value of the clients property.
	 * 
	 * @param value
	 *            allowed object is {@link RequestLink.Clients }
	 * 
	 */
	public void setClients(RequestLink.Clients value) {
		this.clients = value;
	}

	/**
	 * Gets the value of the server property.
	 * 
	 * @return possible object is {@link RequestLink.Server }
	 * 
	 */
	public RequestLink.Server getServer() {
		return server;
	}

	/**
	 * Sets the value of the server property.
	 * 
	 * @param value
	 *            allowed object is {@link RequestLink.Server }
	 * 
	 */
	public void setServer(RequestLink.Server value) {
		this.server = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence maxOccurs="unbounded">
	 *         &lt;choice>
	 *           &lt;element name="service" type="{http://www.ecoa.technology/implementation-1.0}OpRef"/>
	 *           &lt;element name="moduleInstance" type="{http://www.ecoa.technology/implementation-1.0}OpRefActivatable"/>
	 *         &lt;/choice>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "serviceOrModuleInstance" })
	public static class Clients {

		@XmlElements({ @XmlElement(name = "service"), @XmlElement(name = "moduleInstance", type = OpRefActivatable.class) })
		protected List<OpRef> serviceOrModuleInstance;

		/**
		 * Gets the value of the serviceOrModuleInstance property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the serviceOrModuleInstance property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getServiceOrModuleInstance().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link OpRef
		 * } {@link OpRefActivatable }
		 * 
		 * 
		 */
		public List<OpRef> getServiceOrModuleInstance() {
			if (serviceOrModuleInstance == null) {
				serviceOrModuleInstance = new ArrayList<OpRef>();
			}
			return this.serviceOrModuleInstance;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;choice>
	 *         &lt;element name="reference" type="{http://www.ecoa.technology/implementation-1.0}OpRef"/>
	 *         &lt;element name="moduleInstance" type="{http://www.ecoa.technology/implementation-1.0}OpRefServer"/>
	 *       &lt;/choice>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "reference", "moduleInstance" })
	public static class Server {

		protected OpRef reference;
		protected OpRefServer moduleInstance;

		/**
		 * Gets the value of the reference property.
		 * 
		 * @return possible object is {@link OpRef }
		 * 
		 */
		public OpRef getReference() {
			return reference;
		}

		/**
		 * Sets the value of the reference property.
		 * 
		 * @param value
		 *            allowed object is {@link OpRef }
		 * 
		 */
		public void setReference(OpRef value) {
			this.reference = value;
		}

		/**
		 * Gets the value of the moduleInstance property.
		 * 
		 * @return possible object is {@link OpRefServer }
		 * 
		 */
		public OpRefServer getModuleInstance() {
			return moduleInstance;
		}

		/**
		 * Sets the value of the moduleInstance property.
		 * 
		 * @param value
		 *            allowed object is {@link OpRefServer }
		 * 
		 */
		public void setModuleInstance(OpRefServer value) {
			this.moduleInstance = value;
		}

	}

}
