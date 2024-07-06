package com.solux.greenish.dto;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@XmlRootElement(name = "response")
public class PlantDetail {
    @XmlElement(name = "header")
    private Header header;
    @XmlElement(name = "body")
    private Body body;
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Header{
        private String resultCode;
        private String resultMsg;

    }
    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Body{
        @XmlElement(name="item")
        private Plantdtl plantdtl;
        @Data
        public static class Plantdtl{
            private String adviseInfo;
            private String distbNm;
            private String dlthtsCodeNm;
        }

    }


}
