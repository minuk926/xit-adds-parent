package kr.xit.inf.mois.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
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
 * description : 온나라전자문서연계 exchange_mis.dtd 구조 정의
 *
 * packageName : kr.xit.inf.mois.model
 * fileName    : ExchangeMisDto
 * author      : limju
 * date        : 2024-03-14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-14    limju       최초 생성
 *
 * </pre>
 */
@JacksonXmlRootElement(localName = "EXCHANGE")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeMisDto extends ExchangeCommon {
    @JsonProperty(value = "HEADER", required = true)
    private Header header;

    @JsonProperty("BODY")
    private Body body;

    @JsonProperty("ATTACHMENTS")
    private Attachments attachments;

    @JsonProperty("ADMINISTRATIVE_INFO")
    private AdminstrativeInfo administrativeInfo;

    @JacksonXmlRootElement(localName = "HEADER")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Header {
        @JsonProperty(value = "COMMON", required = true)
        private Common common;
        @JsonProperty(value = "DIRECTION", required = true)
        private Direction direction;
        @JsonProperty("ADDENDA")
        private Addenda addenda;
    }

    @JacksonXmlRootElement(localName = "DIRECTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Direction {
        @JsonProperty("TO_DOCUMENT_SYSTEM")
        private ToDocumentSystem toDocumentSystem;
        @JsonProperty("TO_ADMINISTRATIVE_SYSTEM")
        private ToAdministrativeSystem toAdministrativeSystem;
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
        @JsonProperty("BODY_MODIFICATIONFLAG")
        private BodyModificationflag bodyModificationflag;
        @JsonProperty("BODY_TEXT")
        private String bodyText;
    }

    @JacksonXmlRootElement(localName = "BODY_MODIFICATIONFLAG")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BodyModificationflag {
        @JsonProperty("BODY_MODIFIABLE")
        private BodyModifiable bodyModifiable;

        @JsonProperty("BODY_MODIFIED")
        private String bodyModified;
    }

    @JacksonXmlRootElement(localName = "BODY_MODIFIABLE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BodyModifiable {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        private String modifyflag;
    }


    @JacksonXmlRootElement(localName = "TO_DOCUMENT_SYSTEM")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToDocumentSystem {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "notification")
        String notification;

        @JsonProperty("LINES")
        private Lines lines;

        @JsonProperty("MODIFICATION_FLAG")
        private ModificationFlag modificationFlag;

        @JsonProperty("BODY_MODIFICATIONFLAG")
        private BodyModificationflag bodyModificationflag;
        @JsonProperty("DOC_INFO")
        private DocInfo docInfo;
    }

    @JacksonXmlRootElement(localName = "DOC_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DocInfo {
        @JsonProperty("SUMMARY")
        private String summary;

        @JsonProperty("DOCGUBUN")
        private Docgubun docgubun;

        @JsonProperty("READINGBOUND")
        private Readingbound readingbound;

        @JsonProperty("READINGLIMIT")
        private Readinglimit readinglimit;

        @JsonProperty("PUBLICATION")
        private Publication publication;

        @XmlElementWrapper
        @JsonProperty("TASKCARDS")
        private List<Taskcard> taskcards;

        @JsonProperty("SOURCES")
        private Sources sources;

        @JsonProperty("TO_KMS")
        private ToKms toKms;

        @JsonProperty("TO_UNIKMS")
        private ToUnikms toUnikms;

        @JsonProperty("SENDORGNAME")
        private String sendorgname;

        @JsonProperty("ENFORCEMENT")
        private Enforcement enforcement;
    }

    @JacksonXmlRootElement(localName = "TASKCARD")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Taskcard {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JsonProperty("CARDNAME")
        private String cardname;
        @JsonProperty("CARDID")
        private String cardid;
    }

    @JacksonXmlRootElement(localName = "DOCGUBUN")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Docgubun {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        String type;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "READINGBOUND")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Readingbound {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        String type;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "READINGLIMIT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Readinglimit {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        String type;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "PUBLICATION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Publication {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "code")
        String code;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "reason")
        String reason;
        @XmlValue
        @JacksonXmlText
        String value;
    }

    @JacksonXmlRootElement(localName = "SOURCES")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Sources {
        @JsonProperty("DIRECT")
        private Direct direct;
        @JsonProperty("INSTRUCTION")
        private List<Instruction> instruction;
        @JsonProperty("DOCUMENT")
        private List<Document> document;
        @JsonProperty("MEMO")
        private List<Memo> memo;
    }

    @JacksonXmlRootElement(localName = "DIRECT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Direct {
        @JsonProperty("TITLE")
        private String title;
        @JsonProperty("INSTRUCTED")
        private Instructed instructed;
    }

    @JacksonXmlRootElement(localName = "INSTRUCTED")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Instructed {
        @JsonProperty("FILE")
        private List<File> file;
    }

    @JacksonXmlRootElement(localName = "FILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class File {
        @JsonProperty("ORDER")
        private String order;
        @JsonProperty("FILENAME")
        private String filename;
        @JsonProperty("DISPLAYNAME")
        private String displayname;
    }

    @JacksonXmlRootElement(localName = "INSTRUCTION")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Instruction{
        @JsonProperty("TITLE")
        private String title;
        @JsonProperty("INSTRUCTIONID")
        private String instructionid;
    }

    @JacksonXmlRootElement(localName = "DOCUMENT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Document {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JsonProperty("TITLE")
        private String title;
        @JsonProperty("DOCID")
        private String docid;
    }

    @JacksonXmlRootElement(localName = "MEMO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Memo {
        @JsonProperty("TITLE")
        private String title;
        @JsonProperty("MEMOID")
        private String memoid;
    }

    @JacksonXmlRootElement(localName = "TO_KMS")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToKms {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "sendflag")
        private String sendflag;
        @JsonProperty("MAPCODE")
        private String mapcode;
        @JsonProperty("MAPNAME")
        private String mapname;
    }

    @JacksonXmlRootElement(localName = "TO_UNIKMS")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ToUnikms {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "sendflag")
        private String sendflag;
    }

    @JacksonXmlRootElement(localName = "ENFORCEMENT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Enforcement {
        @JsonProperty("SENDNAME")
        private String sendname;
        @XmlElementWrapper
        @JsonProperty("RECEIPT")
        private List<Receipt> receipt;
        @JsonProperty("EXRECEIPT")
        private ExReceipt exreceipt;
    }

    @JacksonXmlRootElement(localName = "RECEIPT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Receipt {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "refer")
        private String refer;
        @JsonProperty("ORG")
        private String org;
        @JsonProperty("ORGCODE")
        private String orgcode;
        @JsonProperty("DEPT")
        private String dept;
        @JsonProperty("DEPTCODE")
        private String deptcode;
    }

    @JacksonXmlRootElement(localName = "EXRECEIPT")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ExReceipt {
        @JsonProperty("EXTERNAL")
        private External external;
    }

    @JacksonXmlRootElement(localName = "EXTERNAL")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class External {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "refer")
        private String refer;
        @JsonProperty("ORG")
        private String org;
        @JsonProperty("ORGCODE")
        private String orgcode;
        @JsonProperty("DEPT")
        private String dept;
        @JsonProperty("DEPTCODE")
        private String deptcode;
        @JsonProperty("ORGTYPE")
        private Orgtype orgtype;
        @JsonProperty("SYSTEMTYPE")
        private Systemtype systemtype;
        @JsonProperty("FLOWTYPE")
        private Flowtype flowtype;
    }

    @JacksonXmlRootElement(localName = "ORGTYPE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Orgtype {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "typecode")
        private String typecode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "SYSTEMTYPE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Systemtype {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "typecode")
        private String typecode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "FLOWTYPE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Flowtype {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "typecode")
        private String typecode;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @JacksonXmlRootElement(localName = "BODY")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Body {
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

    @JacksonXmlRootElement(localName = "ADMINISTRATIVE_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AdminstrativeInfo {
        @JsonProperty("FORM_FILE")
        private FormFile formFile;
        @JsonProperty("FORM_INFO")
        private FormInfo formInfo;
        @JsonProperty("FORM_DATA")
        private FormData formData;
    }

    @JacksonXmlRootElement(localName = "FORM_FILE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FormFile {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        String filename;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        String desc;
    }

    @JacksonXmlRootElement(localName = "FORM_INFO")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FormInfo {
        @XmlAttribute(name = "sys_id")
        @JacksonXmlProperty(isAttribute = true, localName = "sys_id")
        private String sysId;
        @XmlAttribute(name = "biz_id")
        @JacksonXmlProperty(isAttribute = true, localName = "biz_id")
        private String bizId;
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "seq")
        private String seq;
    }

    //@Getter
    @JacksonXmlRootElement(localName = "FORM_DATA")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FormData {
        @XmlElementWrapper
        @JsonProperty("DATA_FIELD")
        private List<DataField> dataField;
        @XmlElementWrapper
        @JsonProperty("REPETITION_DATA_FIELD")
        private List<RepetitionDataField> repetitionDataField;
    }

    @JacksonXmlRootElement(localName = "DATA_FIELD")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DataField {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        private String modifyflag;
        @JsonProperty("FIELD_NAME")
        private String fieldName;
        @JsonProperty("FIELD_VALUE")
        private String fieldValue;
    }

    @JacksonXmlRootElement(localName = "REPETITION_DATA_FIELD")
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class RepetitionDataField {
        @XmlAttribute
        @JacksonXmlProperty(isAttribute = true, localName = "modifyflag")
        String modifyFlag;
        @JsonProperty("FIELD_NAME")
        String fieldName;
        @JsonProperty("FIELD_VALUE")
        String fieldValue;
        @JsonProperty("ROW")
        String row;
        @JsonProperty("COLUMN")
        String column;
    }
}
