package com.mkyong.core;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

class Temp {
    String Desc;

    @XmlElement
    public String getDesc() {
        return Desc;
    }

    public void setName(String Desc) {
        this.Desc = Desc;
    }
}

@XmlRootElement
@XmlType(propOrder = {"Desc", "Request"})
public class Resource extends Temp{

      class Request extends Temp{
        String Sql;
        String id;
        String method;

         @XmlAttribute
         public String geteMethod() {
             return method;
         }

         public void setMethod(String method) {
             this.method = method;
         }

         @XmlAttribute
         public String getId() {
             return id;
         }

         public void setId(String id) {
             this.id = id;
         }

         @XmlElement
         public String getSql() {
             return Sql;
         }

         public void setDept(String Sql) {
             this.Sql = Sql;
         }
    }

    @XmlElement
    public Request getRequest() {
        return Request;
    }

    public void setRequest() {
        final Request request = new Request();
        this.Request = Request;
    }

}
