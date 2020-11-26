
package com.example.wallpaper.Model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "owner",
    "secret",
    "server",
    "farm",
    "title",
    "ispublic",
    "isfriend",
    "isfamily",
    "date_faved",
    "url_sq",
    "height_sq",
    "width_sq",
    "url_t",
    "height_t",
    "width_t",
    "url_s",
    "height_s",
    "width_s",
    "url_q",
    "height_q",
    "width_q",
    "url_m",
    "height_m",
    "width_m",
    "url_n",
    "height_n",
    "width_n",
    "url_z",
    "height_z",
    "width_z",
    "url_c",
    "height_c",
    "width_c",
    "url_l",
    "height_l",
    "width_l",
    "url_o",
    "height_o",
    "width_o"
})
public class Photo {

    @JsonProperty("id")
    private String id;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("server")
    private String server;
    @JsonProperty("farm")
    private Integer farm;
    @JsonProperty("title")
    private String title;
    @JsonProperty("ispublic")
    private Integer ispublic;
    @JsonProperty("isfriend")
    private Integer isfriend;
    @JsonProperty("isfamily")
    private Integer isfamily;
    @JsonProperty("date_faved")
    private String dateFaved;
    @JsonProperty("url_sq")
    private String urlSq;
    @JsonProperty("height_sq")
    private Integer heightSq;
    @JsonProperty("width_sq")
    private Integer widthSq;
    @JsonProperty("url_t")
    private String urlT;
    @JsonProperty("height_t")
    private Integer heightT;
    @JsonProperty("width_t")
    private Integer widthT;
    @JsonProperty("url_s")
    private String urlS;
    @JsonProperty("height_s")
    private String heightS;
    @JsonProperty("width_s")
    private String widthS;
    @JsonProperty("url_q")
    private String urlQ;
    @JsonProperty("height_q")
    private String heightQ;
    @JsonProperty("width_q")
    private String widthQ;
    @JsonProperty("url_m")
    private String urlM;
    @JsonProperty("height_m")
    private String heightM;
    @JsonProperty("width_m")
    private String widthM;
    @JsonProperty("url_n")
    private String urlN;
    @JsonProperty("height_n")
    private String heightN;
    @JsonProperty("width_n")
    private String widthN;
    @JsonProperty("url_z")
    private String urlZ;
    @JsonProperty("height_z")
    private String heightZ;
    @JsonProperty("width_z")
    private String widthZ;
    @JsonProperty("url_c")
    private String urlC;
    @JsonProperty("height_c")
    private String heightC;
    @JsonProperty("width_c")
    private String widthC;
    @JsonProperty("url_l")
    private String urlL;
    @JsonProperty("height_l")
    private String heightL;
    @JsonProperty("width_l")
    private String widthL;
    @JsonProperty("url_o")
    private String urlO;
    @JsonProperty("height_o")
    private String heightO;
    @JsonProperty("width_o")
    private String widthO;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photo() {
    }

    /**
     * 
     * @param widthM
     * @param server
     * @param widthL
     * @param urlC
     * @param isfriend
     * @param urlM
     * @param widthT
     * @param urlN
     * @param widthS
     * @param heightZ
     * @param secret
     * @param urlSq
     * @param urlL
     * @param title
     * @param widthQ
     * @param widthO
     * @param widthN
     * @param heightO
     * @param heightQ
     * @param widthZ
     * @param heightT
     * @param heightS
     * @param ispublic
     * @param farm
     * @param id
     * @param heightL
     * @param heightN
     * @param heightM
     * @param owner
     * @param heightC
     * @param dateFaved
     * @param widthSq
     * @param isfamily
     * @param urlS
     * @param urlT
     * @param urlQ
     * @param urlO
     * @param widthC
     * @param heightSq
     * @param urlZ
     */
    public Photo(String id, String owner, String secret, String server, Integer farm, String title, Integer ispublic, Integer isfriend, Integer isfamily, String dateFaved, String urlSq, Integer heightSq, Integer widthSq, String urlT, Integer heightT, Integer widthT, String urlS, String heightS, String widthS, String urlQ, String heightQ, String widthQ, String urlM, String heightM, String widthM, String urlN, String heightN, String widthN, String urlZ, String heightZ, String widthZ, String urlC, String heightC, String widthC, String urlL, String heightL, String widthL, String urlO, String heightO, String widthO) {
        super();
        this.id = id;
        this.owner = owner;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.title = title;
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
        this.dateFaved = dateFaved;
        this.urlSq = urlSq;
        this.heightSq = heightSq;
        this.widthSq = widthSq;
        this.urlT = urlT;
        this.heightT = heightT;
        this.widthT = widthT;
        this.urlS = urlS;
        this.heightS = heightS;
        this.widthS = widthS;
        this.urlQ = urlQ;
        this.heightQ = heightQ;
        this.widthQ = widthQ;
        this.urlM = urlM;
        this.heightM = heightM;
        this.widthM = widthM;
        this.urlN = urlN;
        this.heightN = heightN;
        this.widthN = widthN;
        this.urlZ = urlZ;
        this.heightZ = heightZ;
        this.widthZ = widthZ;
        this.urlC = urlC;
        this.heightC = heightC;
        this.widthC = widthC;
        this.urlL = urlL;
        this.heightL = heightL;
        this.widthL = widthL;
        this.urlO = urlO;
        this.heightO = heightO;
        this.widthO = widthO;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
    }

    @JsonProperty("farm")
    public Integer getFarm() {
        return farm;
    }

    @JsonProperty("farm")
    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("ispublic")
    public Integer getIspublic() {
        return ispublic;
    }

    @JsonProperty("ispublic")
    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    @JsonProperty("isfriend")
    public Integer getIsfriend() {
        return isfriend;
    }

    @JsonProperty("isfriend")
    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    @JsonProperty("isfamily")
    public Integer getIsfamily() {
        return isfamily;
    }

    @JsonProperty("isfamily")
    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    @JsonProperty("date_faved")
    public String getDateFaved() {
        return dateFaved;
    }

    @JsonProperty("date_faved")
    public void setDateFaved(String dateFaved) {
        this.dateFaved = dateFaved;
    }

    @JsonProperty("url_sq")
    public String getUrlSq() {
        return urlSq;
    }

    @JsonProperty("url_sq")
    public void setUrlSq(String urlSq) {
        this.urlSq = urlSq;
    }

    @JsonProperty("height_sq")
    public Integer getHeightSq() {
        return heightSq;
    }

    @JsonProperty("height_sq")
    public void setHeightSq(Integer heightSq) {
        this.heightSq = heightSq;
    }

    @JsonProperty("width_sq")
    public Integer getWidthSq() {
        return widthSq;
    }

    @JsonProperty("width_sq")
    public void setWidthSq(Integer widthSq) {
        this.widthSq = widthSq;
    }

    @JsonProperty("url_t")
    public String getUrlT() {
        return urlT;
    }

    @JsonProperty("url_t")
    public void setUrlT(String urlT) {
        this.urlT = urlT;
    }

    @JsonProperty("height_t")
    public Integer getHeightT() {
        return heightT;
    }

    @JsonProperty("height_t")
    public void setHeightT(Integer heightT) {
        this.heightT = heightT;
    }

    @JsonProperty("width_t")
    public Integer getWidthT() {
        return widthT;
    }

    @JsonProperty("width_t")
    public void setWidthT(Integer widthT) {
        this.widthT = widthT;
    }

    @JsonProperty("url_s")
    public String getUrlS() {
        return urlS;
    }

    @JsonProperty("url_s")
    public void setUrlS(String urlS) {
        this.urlS = urlS;
    }

    @JsonProperty("height_s")
    public String getHeightS() {
        return heightS;
    }

    @JsonProperty("height_s")
    public void setHeightS(String heightS) {
        this.heightS = heightS;
    }

    @JsonProperty("width_s")
    public String getWidthS() {
        return widthS;
    }

    @JsonProperty("width_s")
    public void setWidthS(String widthS) {
        this.widthS = widthS;
    }

    @JsonProperty("url_q")
    public String getUrlQ() {
        return urlQ;
    }

    @JsonProperty("url_q")
    public void setUrlQ(String urlQ) {
        this.urlQ = urlQ;
    }

    @JsonProperty("height_q")
    public String getHeightQ() {
        return heightQ;
    }

    @JsonProperty("height_q")
    public void setHeightQ(String heightQ) {
        this.heightQ = heightQ;
    }

    @JsonProperty("width_q")
    public String getWidthQ() {
        return widthQ;
    }

    @JsonProperty("width_q")
    public void setWidthQ(String widthQ) {
        this.widthQ = widthQ;
    }

    @JsonProperty("url_m")
    public String getUrlM() {
        return urlM;
    }

    @JsonProperty("url_m")
    public void setUrlM(String urlM) {
        this.urlM = urlM;
    }

    @JsonProperty("height_m")
    public String getHeightM() {
        return heightM;
    }

    @JsonProperty("height_m")
    public void setHeightM(String heightM) {
        this.heightM = heightM;
    }

    @JsonProperty("width_m")
    public String getWidthM() {
        return widthM;
    }

    @JsonProperty("width_m")
    public void setWidthM(String widthM) {
        this.widthM = widthM;
    }

    @JsonProperty("url_n")
    public String getUrlN() {
        return urlN;
    }

    @JsonProperty("url_n")
    public void setUrlN(String urlN) {
        this.urlN = urlN;
    }

    @JsonProperty("height_n")
    public String getHeightN() {
        return heightN;
    }

    @JsonProperty("height_n")
    public void setHeightN(String heightN) {
        this.heightN = heightN;
    }

    @JsonProperty("width_n")
    public String getWidthN() {
        return widthN;
    }

    @JsonProperty("width_n")
    public void setWidthN(String widthN) {
        this.widthN = widthN;
    }

    @JsonProperty("url_z")
    public String getUrlZ() {
        return urlZ;
    }

    @JsonProperty("url_z")
    public void setUrlZ(String urlZ) {
        this.urlZ = urlZ;
    }

    @JsonProperty("height_z")
    public String getHeightZ() {
        return heightZ;
    }

    @JsonProperty("height_z")
    public void setHeightZ(String heightZ) {
        this.heightZ = heightZ;
    }

    @JsonProperty("width_z")
    public String getWidthZ() {
        return widthZ;
    }

    @JsonProperty("width_z")
    public void setWidthZ(String widthZ) {
        this.widthZ = widthZ;
    }

    @JsonProperty("url_c")
    public String getUrlC() {
        return urlC;
    }

    @JsonProperty("url_c")
    public void setUrlC(String urlC) {
        this.urlC = urlC;
    }

    @JsonProperty("height_c")
    public String getHeightC() {
        return heightC;
    }

    @JsonProperty("height_c")
    public void setHeightC(String heightC) {
        this.heightC = heightC;
    }

    @JsonProperty("width_c")
    public String getWidthC() {
        return widthC;
    }

    @JsonProperty("width_c")
    public void setWidthC(String widthC) {
        this.widthC = widthC;
    }

    @JsonProperty("url_l")
    public String getUrlL() {
        return urlL;
    }

    @JsonProperty("url_l")
    public void setUrlL(String urlL) {
        this.urlL = urlL;
    }

    @JsonProperty("height_l")
    public String getHeightL() {
        return heightL;
    }

    @JsonProperty("height_l")
    public void setHeightL(String heightL) {
        this.heightL = heightL;
    }

    @JsonProperty("width_l")
    public String getWidthL() {
        return widthL;
    }

    @JsonProperty("width_l")
    public void setWidthL(String widthL) {
        this.widthL = widthL;
    }

    @JsonProperty("url_o")
    public String getUrlO() {
        return urlO;
    }

    @JsonProperty("url_o")
    public void setUrlO(String urlO) {
        this.urlO = urlO;
    }

    @JsonProperty("height_o")
    public String getHeightO() {
        return heightO;
    }

    @JsonProperty("height_o")
    public void setHeightO(String heightO) {
        this.heightO = heightO;
    }

    @JsonProperty("width_o")
    public String getWidthO() {
        return widthO;
    }

    @JsonProperty("width_o")
    public void setWidthO(String widthO) {
        this.widthO = widthO;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", secret='" + secret + '\'' +
                ", server='" + server + '\'' +
                ", farm=" + farm +
                ", title='" + title + '\'' +
                ", ispublic=" + ispublic +
                ", isfriend=" + isfriend +
                ", isfamily=" + isfamily +
                ", dateFaved='" + dateFaved + '\'' +
                ", urlSq='" + urlSq + '\'' +
                ", heightSq=" + heightSq +
                ", widthSq=" + widthSq +
                ", urlT='" + urlT + '\'' +
                ", heightT=" + heightT +
                ", widthT=" + widthT +
                ", urlS='" + urlS + '\'' +
                ", heightS='" + heightS + '\'' +
                ", widthS='" + widthS + '\'' +
                ", urlQ='" + urlQ + '\'' +
                ", heightQ='" + heightQ + '\'' +
                ", widthQ='" + widthQ + '\'' +
                ", urlM='" + urlM + '\'' +
                ", heightM='" + heightM + '\'' +
                ", widthM='" + widthM + '\'' +
                ", urlN='" + urlN + '\'' +
                ", heightN='" + heightN + '\'' +
                ", widthN='" + widthN + '\'' +
                ", urlZ='" + urlZ + '\'' +
                ", heightZ='" + heightZ + '\'' +
                ", widthZ='" + widthZ + '\'' +
                ", urlC='" + urlC + '\'' +
                ", heightC='" + heightC + '\'' +
                ", widthC='" + widthC + '\'' +
                ", urlL='" + urlL + '\'' +
                ", heightL='" + heightL + '\'' +
                ", widthL='" + widthL + '\'' +
                ", urlO='" + urlO + '\'' +
                ", heightO='" + heightO + '\'' +
                ", widthO='" + widthO + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
