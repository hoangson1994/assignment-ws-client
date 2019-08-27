/**
 * Place.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class Place  implements java.io.Serializable {
    private java.lang.String district;

    private long id;

    private java.lang.String image;

    private java.lang.String information;

    private java.lang.String name;

    private java.lang.String province;

    private double rate;

    public Place() {
    }

    public Place(
           java.lang.String district,
           long id,
           java.lang.String image,
           java.lang.String information,
           java.lang.String name,
           java.lang.String province,
           double rate) {
           this.district = district;
           this.id = id;
           this.image = image;
           this.information = information;
           this.name = name;
           this.province = province;
           this.rate = rate;
    }


    /**
     * Gets the district value for this Place.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this Place.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the id value for this Place.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Place.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the image value for this Place.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this Place.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the information value for this Place.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this Place.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the name value for this Place.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Place.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the province value for this Place.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this Place.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the rate value for this Place.
     * 
     * @return rate
     */
    public double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this Place.
     * 
     * @param rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Place)) return false;
        Place other = (Place) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            this.id == other.getId() &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            this.rate == other.getRate();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        _hashCode += new Double(getRate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Place.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "place"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("information");
        elemField.setXmlName(new javax.xml.namespace.QName("", "information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
