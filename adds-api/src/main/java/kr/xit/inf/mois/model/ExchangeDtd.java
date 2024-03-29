package kr.xit.inf.mois.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import jakarta.xml.bind.annotation.XmlValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@JacksonXmlRootElement(localName = "EXCHANGE")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeDtd {


    @JacksonXmlProperty(localName =  "fileList")
    private FileList fileList;

    @JacksonXmlProperty(localName =  "attachments")
    private Attachments attachments;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Attachments {
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "attachment")
        private List<Attachment> attachment;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Attachment {
        @JacksonXmlProperty(isAttribute = true, localName = "filename")
        private String filename;
        @JacksonXmlProperty(isAttribute = true, localName = "desc")
        private String desc;
        @XmlValue
        @JacksonXmlText
        private String value;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class FileList {
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName =  "filename")
        private List<String> filename;
    }
}
