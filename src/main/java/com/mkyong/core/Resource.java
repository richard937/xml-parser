package com.mkyong.core;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(propOrder = {"Desc", "Request"})
public class Resource {

    FChild Desc;
    SChild Request;

    @XmlElement
    public FChild getFChild() {
        return Desc;
    }

    public void setFChild(FChild Desc) {
        this.Desc = Desc;
    }

    @XmlElement
    public SChild getSChild() {
        return Request;
    }

    public void setSChild(SChild Request) {
        this.Request = Request;
    }
}

public class FChild {
    String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}


@XmlType(propOrder={"Desc", "Sql"})
public class SChild {

    String method;
    FChild Desc;
    TChild Sql;

    @XmlAttribute
    public String geteMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public FChild getDesc() {
        return Desc;
    }

    public void setDesc(FChild Desc) {
        this.Desc = Desc;
    }

    public TChild getSql() {
        return Sql;
    }

    public void setSql(TChild Sql) {
        this.Sql = Sql;
    }
}

public class TChild {
    String id;
    String sqlinfo;

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getSqlinfo() {
        return sqlinfo;
    }

    public void setSqlinfo(String sqlinfo) {
        this.sqlinfo = sqlinfo;
    }
}

