package kr.xit.inf.nims.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public record NimsApiResult<T>(
    Header header,
    Body<T> body
) {
    @Builder
    public static record Header(
        /**
         * 결과코드
         * 0 : 성공, 1:실패, 8:인증완료, 9:인증실패
         */
        @JsonProperty(value = "RESULT_CD", required = true)
        Integer resultCd,
        @JsonProperty(value = "RESULT_MSG", required = true)
        String resultMsg

    ) {}

    @Builder
    public static record Body<T>(
        @JsonProperty(value = "TOTAL_COUNT", required = true)
        Integer totalCount,
        /**
         * 마지막 데이타 여부
         * Y: 마지막 데이타, N : 마지막 데이타 아님
         */
        @JsonProperty(value = "IS_END_YN", required = true)
        String isEndYn,
        @JsonProperty(value = "nRecord", required = true)
        Integer nRecord,
        @JsonProperty(value = "list")
        List<T> list
    ) {
    }
}
