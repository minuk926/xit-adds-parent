package kr.xit.inf.mois.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * description : 온나라시스템연계 dtd 구조 정의
 *               온나라전자문서(exchange_mis.dtd)와 온나라전자결재(exchange.dtd)의 공통 구조 정의
 *
 * packageName : kr.xit.inf.mois.model
 * fileName    : ExchangeCommon
 * author      : limju
 * date        : 2024-03-22
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-22    limju       최초 생성
 *
 * </pre>
 */
public class ExchangeCommon {
    @JacksonXmlRootElement(localName = "COMMON")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Common {
        @JsonProperty(value = "SENDER", required = true)
        private Sender sender;
        @JsonProperty(value = "RECEIVER", required = true)
        private Receiver receiver;
        @JsonProperty(value = "TITLE", required = true)
        private String title;
        @JsonProperty(value = "CREATED_DATE", required = true)
        private String createdDate;
        @JsonProperty(value = "ATTACHNUM", required = true)
        private int attachnum;
        @JsonProperty(value = "ADMINISTRATIVE_NUM", required = true)
        private String administrativeNum;
    }

    @JacksonXmlRootElement(localName = "SENDER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Sender {
        @JsonProperty(value = "SERVERID", required = true)
        private String serverid;
        @JsonProperty(value = "USERID", required = true)
        private String userid;
        @JsonProperty("EMAIL")
        private String email;
    }

    @JacksonXmlRootElement(localName = "RECEIVER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Receiver {
        @JsonProperty(value = "SERVERID", required = true)
        private String serverid;
        @JsonProperty(value = "USERID", required = true)
        private String userid;
        @JsonProperty("EMAIL")
        private String email;
    }

    @JacksonXmlRootElement(localName = "TO_ADMINISTRATIVE_SYSTEM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToAdministrativeSystem {
        @JsonProperty("DOCNUM")
        private Docnum docnum;
        @JsonProperty("SANCTION_INFO")
        private SanctionInfo sanctionInfo;
        @JsonProperty("MODIFICATION_FLAG")
        private ModificationFlag modificationFlag;
    }

    @JacksonXmlRootElement(localName = "DOCNUM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Docnum {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "docnumcode")
        private String docnumcode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "SANCTION_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class SanctionInfo {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "status")
        private String status;

        @JsonProperty("LINES")
        private Lines lines;
    }

    @JacksonXmlRootElement(localName = "LINES")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Lines {
        @XmlElementWrapper
        @JsonProperty("LINE")
        private List<Line> line;
    }

    @JacksonXmlRootElement(localName = "LINE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Line {
        @JsonProperty("LEVEL")
        private String level;
        @JsonProperty("SANCTION")
        private Sanction sanction;
    }

    @JacksonXmlRootElement(localName = "SANCTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Sanction {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "result")
        private String result;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JsonProperty("PERSON")
        private Person person;

        @JsonProperty("COMMENT")
        private String comment;

        @JsonProperty("DATE")
        private String date;
    }

    @JacksonXmlRootElement(localName = "PERSON")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Person {
        @JsonProperty("USERID")
        private String userid;
        @JsonProperty("NAME")
        private String name;
        @JsonProperty("POSITION")
        private String position;
        @JsonProperty("DEPT")
        private String dept;
        @JsonProperty("ORG")
        private String org;
    }

    @JacksonXmlRootElement(localName = "MODIFICATION_FLAG")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ModificationFlag {
        @JsonProperty("MODIFIABLE")
        private Modifiable modifiable;

        @JsonProperty("MODIFIED")
        private String modified;
    }

    @JacksonXmlRootElement(localName = "MODIFIABLE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Modifiable {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        private String modifyflag;
    }

    @JacksonXmlRootElement(localName = "ADDENDA")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Addenda {
        @JsonProperty("ADDENDUM")
        private Addendum addendum;
    }

    @JacksonXmlRootElement(localName = "ADDENDUM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Addendum {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "comment")
        private String comment;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "name")
        private String name;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "ATTACHMENTS")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Attachments {
        private AdministrativeDB administrativeDB;
        @XmlElementWrapper
        @JsonProperty("ATTACHMENT")
        private List<Attachment> attachment;
    }

    @JacksonXmlRootElement(localName = "ADMINISTRATIVE_DB")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AdministrativeDB {
        @JsonProperty("XMLFILE")
        private XMLFile xmlfile;
        @JsonProperty("XSLFILE")
        private XSLFile xslfile;
    }

    @JacksonXmlRootElement(localName = "XMLFILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class XMLFile {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        String desc;
    }

    @JacksonXmlRootElement(localName = "XSLFILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class XSLFile {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        String desc;
    }

    @JacksonXmlRootElement(localName = "ATTACHMENT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Attachment {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        private String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        private String desc;
        @XmlValue
        @JacksonXmlText
        private String value;
    }
}
