package kr.xit.inf.iros.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.inf.iros.model
 * fileName    : DrugPrdtMcpnDtlDto
 * author      : limju
 * date        : 2024-03-20
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-20    limju       최초 생성
 *
 * </pre>
 */
@Builder
public record DrugPrdtMcpnDtlRequest(
    String serviceKey,
    Integer pageNo,
    Integer numOfRows,
    String type,

    @JsonProperty("Entrps_prmisn_no")
    String entrpsPrmisnNo,
    @JsonProperty("Prduct")
    String prduct,
    @JsonProperty("Entrps")
    String entrps,
    @JsonProperty("Bizrno")
    String bizrno

) {
}
