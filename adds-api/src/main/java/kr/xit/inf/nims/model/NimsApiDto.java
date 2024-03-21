package kr.xit.inf.nims.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.inf.nims.model
 * fileName    : NimsApiDto
 * author      : limju
 * date        : 2024-03-21
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-21    limju       최초 생성
 *
 * </pre>
 */
public class NimsApiDto {

    /**
     * 품목정보
     * @param prductCd 제품코드
     * @param prdlstMstCd 제품대표코드
     * @param prductNm 제품명
     * @param nrcdSeNm 마약/항정 구분명
     * @param prtmSeNm 중점/일반 구분
     * @param prdMinDstrbQy 제품최소유통단위수량 제품규격정보(고정값 = 1)
     * @param stdPackngStleNm 제품최소유통단위
     * @param prdTotPceQy 제품총낱개단위수량
     * @param pceCoUnitNm 제품낱개단위
     * @param bsshCd 마약류취급자식별번호
     * @param rgsDt 등록일
     * @param updDt 변경일
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static record ProductInfoKd(
       @JsonProperty(value = "PRDUCT_CD", required = true)
        String prductCd,
        @JsonProperty(value = "PRDLST_MST_CD")
        String prdlstMstCd,
        @JsonProperty(value = "PRDUCT_NM", required = true)
        String prductNm,
        @JsonProperty(value = "NRCD_SE_NM", required = true)
        String nrcdSeNm,
        @JsonProperty(value = "PRTM_SE_NM", required = true)
        String prtmSeNm,
        @JsonProperty(value = "PRD_MIN_DSTRB_QY", required = true)
        Integer prdMinDstrbQy,
        @JsonProperty(value = "STD_PACKNG_STLE_NM", required = true)
        String stdPackngStleNm,
        @JsonProperty(value = "PRD_TOT_PCE_QY", required = true)
        Integer prdTotPceQy,
        @JsonProperty(value = "PCE_CO_UNIT_NM", required = true)
        String pceCoUnitNm,
        @JsonProperty(value = "BSSH_CD", required = true)
        String bsshCd,
        @JsonProperty(value = "RGS_DT")
        String rgsDt,
        @JsonProperty(value = "UPD_DT")
        String updDt

        ) {
    }

    /**
     * 마약류취급자정보
     * @param bsshCd 마약류취급자식별번호
     * @param bsshNm 업체명
     * @param indutyNm 업종명
     * @param hdntCd 의료업자구분
     * @param htntNm 의료업자구분명
     * @param bizrno 사업자등록번호
     * @param rprsntvNm 대표자명
     * @param chrgNm 담당자명
     * @param hptnNo 요양기관번호
     * @param joinYn 회원가입여부 가입|미가입|탈퇴
     * @param bsshSttusNm 상태
     * @param prmisnNo 허가번호
     */
    public static record BsshInfoSt(
        @JsonProperty(value = "BSSH_CD", required = true)
        String bsshCd,
        @JsonProperty(value = "BSSH_NM", required = true)
        String bsshNm,
        @JsonProperty(value = "INDUTY_NM", required = true)
        String indutyNm,
        @JsonProperty(value = "HDNT_CD", required = true)
        String hdntCd,
        @JsonProperty(value = "HTNT_NM", required = true)
        String htntNm,
        @JsonProperty(value = "BIZRNO", required = true)
        String bizrno,
        @JsonProperty(value = "RPRSNTV_NM", required = true)
        String rprsntvNm,
        @JsonProperty(value = "CHRG_NM", required = true)
        String chrgNm,
        @JsonProperty(value = "HPTN_NO", required = true)
        String hptnNo,
        @JsonProperty(value = "JOIN_YN", required = true)
        String joinYn,
        @JsonProperty(value = "BSSH_STTUS_NM", required = true)
        String bsshSttusNm,
        @JsonProperty(value = "PRMISN_NO", required = true)
        String prmisnNo
    ) {
    }


}
