package kr.xit.inf.nims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <pre>
 * description :
 *
 * packageName : kr.xit.inf.nims.model
 * fileName    : NimsApiRequest
 * author      : limju
 * date        : 2024-03-21
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024-03-21    limju       최초 생성
 *
 * </pre>
 */

public class NimsApiRequest {
    public static record BsshInfo(
        /**
         * 인증키
         */
        @JsonProperty(value = "k", required = true)
        String k,
        /**
         * 조회범위
         * 1-전체, 2-내거래처
         */
        @JsonProperty(value = "fg", required = true)
        String fg,
        /**
         * 조회 페이지
         */
        @JsonProperty(value = "pg", required = true)
        String pg,
        /**
         * 사업자 등록 번호
         */
        String bi,
        /**
         * 요양기관번호
         */
        String hp,
        /**
         * 업체명
         * like 검색
         */
        String bn,
        /**
         * 취급자식별번호
         * 보고자의 마약류취급자 식별번호
         */
        String bc,
        /**
         * 기준일자 이후
         * yyyyMMdd
         */
        String ymd,
        /**
         * 조회범위2
         * 1:NK(취급승인)포함 - default
         * 2:NK(취급승인)제외
         */
        String fg2
    ){}
}
