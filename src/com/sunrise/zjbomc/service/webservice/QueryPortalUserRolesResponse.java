
package com.sunrise.zjbomc.service.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryPortalUserRolesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryPortalUserRolesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webService.service.zjbomc.sunrise.com/}queryPortalUserRolesResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryPortalUserRolesResponse", propOrder = {
    "_return"
})
public class QueryPortalUserRolesResponse {

    @XmlElement(name = "return")
    protected QueryPortalUserRolesResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPortalUserRolesResp }
     *     
     */
    public QueryPortalUserRolesResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPortalUserRolesResp }
     *     
     */
    public void setReturn(QueryPortalUserRolesResp value) {
        this._return = value;
    }

}
