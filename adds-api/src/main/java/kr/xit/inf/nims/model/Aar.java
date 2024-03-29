package kr.xit.inf.nims.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@JacksonXmlRootElement(localName = "aar_regist", namespace = "https://www.nims.or.kr/schema/nims")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aar {
    @JacksonXmlProperty(localName = "REPORT_SET")
    private ReportSet reportSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @XmlAccessorType(XmlAccessType.FIELD)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ReportSet {
        @JacksonXmlProperty(localName = "UID")
        private String uid;

        @JacksonXmlProperty(localName = "SW_ID")
        private String swId;

        @JacksonXmlProperty(localName = "RND_RMK")
        private String rndRmk;

        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "HEADER")
        private List<Header> header;

    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Header {
        @JacksonXmlProperty(localName = "HDR_DE")
        private String hdrDe;

        @JacksonXmlProperty(localName = "BSSH_CD")
        private String bsshCd;

        @JacksonXmlProperty(localName = "RPT_SE_CD")
        private String rptSeCd;

        @JacksonXmlProperty(localName = "USR_RPT_ID_NO")
        private String usrRptIdNo;

        @JacksonXmlProperty(localName = "REF_USR_RPT_ID_NO")
        private String refUsrRptIdNo;

        @JacksonXmlProperty(localName = "RPT_TY_CD")
        private String rptTyCd;

        @JacksonXmlProperty(localName = "RMK")
        private String rmk;

        @JacksonXmlProperty(localName = "RPTR_NM")
        private String rptrNm;

        @JacksonXmlProperty(localName = "RPTR_ENTRPS_NM")
        private String rptrEntrpsNm;

        @JacksonXmlProperty(localName = "CHRG_NM")
        private String chrgNm;

        @JacksonXmlProperty(localName = "CHRG_TEL_NO")
        private String chrgTelNo;

        @JacksonXmlProperty(localName = "CHRG_MP_NO")
        private String chrgMpNo;

        @JacksonXmlProperty(localName = "RND_DTL_RPT_CNT")
        private String rndDtlRptCnt;

        @JacksonXmlProperty(localName = "DSUSE_SE_CD")
        private String dsuseSeCd;

        @JacksonXmlProperty(localName = "DSUSE_PRV_CD")
        private String dsusePrvCd;

        @JacksonXmlProperty(localName = "DSUSE_MTH_CD")
        private String dsuseMthCd;

        @JacksonXmlProperty(localName = "DSUSE_LOC")
        private String dsuseLoc;

        @JacksonXmlProperty(localName = "DSUSE_DE")
        private String dsuseDe;

        @JacksonXmlProperty(localName = "DSUSE_INSTT_CD")
        private String dsuseInsttCd;

        @JacksonXmlProperty(localName = "ATCH_FILE_CO")
        private String atchFileCo;

        @JacksonXmlProperty(localName = "REGISTER_ID")
        private String registerId;

        @JacksonXmlProperty(localName = "FILE_CREAT_DT")
        private String fileCreatDt;

        @JacksonXmlProperty(localName = "LINES")
        private Lines lines;

        @JacksonXmlProperty(localName = "ATCH_FILES")
        private AtchFiles atchFiles;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Lines {
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "LINE")
        private List<Line> line;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Line {
        @JacksonXmlProperty(localName = "USR_RPT_ID_NO")
        private String usrRptIdNo;

        @JacksonXmlProperty(localName = "USR_RPT_LN_ID_NO")
        private String usrRptLnIdNo;

        @JacksonXmlProperty(localName = "STORGE_NO")
        private String storgeNo;

        @JacksonXmlProperty(localName = "MVMN_TY_CD")
        private String mvmnTyCd;

        @JacksonXmlProperty(localName = "PRDUCT_CD")
        private String prductCd;

        @JacksonXmlProperty(localName = "MNF_NO")
        private String mnfNo;
        @JacksonXmlProperty(localName = "MNF_SEQ")
        private String mnfSeq;

        @JacksonXmlProperty(localName = "MIN_DISTB_QY")
        private String minDistbQy;

        @JacksonXmlProperty(localName = "PRD_MIN_DISTB_UNIT")
        private String prdMinDistbUnit;

        @JacksonXmlProperty(localName = "PCE_QY")
        private String pceQy;

        @JacksonXmlProperty(localName = "PRD_PCE_UNIT")
        private String prdPceUnit;

        @JacksonXmlProperty(localName = "PRDUCT_NM")
        private String prductNm;

        @JacksonXmlProperty(localName = "PRD_SGTIN")
        private String prdSgtin;

        @JacksonXmlProperty(localName = "PRD_MIN_DISTB_QY")
        private String prdMinDistbQy;

        @JacksonXmlProperty(localName = "PRD_TOT_PCE_QY")
        private String prdTotPceQy;

        @JacksonXmlProperty(localName = "PRD_VALID_DE")
        private String prdValidDe;

        @JacksonXmlProperty(localName = "FILE_CREAT_DT")
        private String fileCreatDt;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AtchFiles{
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "ATCH_FILE_NM")
        private List<String> atchFileNm;
    }
}
