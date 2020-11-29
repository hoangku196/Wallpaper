
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
    private String url_sq;
    @JsonProperty("height_sq")
    private Integer height_sq;
    @JsonProperty("width_sq")
    private Integer width_sq;
    @JsonProperty("url_t")
    private String url_t;
    @JsonProperty("height_t")
    private Integer height_t;
    @JsonProperty("width_t")
    private Integer width_t;
    @JsonProperty("url_s")
    private String url_s;
    @JsonProperty("height_s")
    private String height_s;
    @JsonProperty("width_s")
    private String width_s;
    @JsonProperty("url_q")
    private String url_q;
    @JsonProperty("height_q")
    private String height_q;
    @JsonProperty("width_q")
    private String width_q;
    @JsonProperty("url_m")
    private String url_m;
    @JsonProperty("height_m")
    private String height_m;
    @JsonProperty("width_m")
    private String width_m;
    @JsonProperty("url_n")
    private String url_n;
    @JsonProperty("height_n")
    private String height_n;
    @JsonProperty("width_n")
    private String width_n;
    @JsonProperty("url_z")
    private String url_z;
    @JsonProperty("height_z")
    private String height_z;
    @JsonProperty("width_z")
    private String width_z;
    @JsonProperty("url_c")
    private String url_c;
    @JsonProperty("height_c")
    private String height_c;
    @JsonProperty("width_c")
    private String width_c;
    @JsonProperty("url_l")
    private String url_l;
    @JsonProperty("height_l")
    private String height_l;
    @JsonProperty("width_l")
    private String width_l;
    @JsonProperty("url_o")
    private String url_o;
    @JsonProperty("height_o")
    private String height_o;
    @JsonProperty("width_o")
    private String width_o;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Photo() {
    }

    /**
     * @param width_m
     * @param server
     * @param width_l
     * @param url_c
     * @param isfriend
     * @param url_m
     * @param width_t
     * @param url_n
     * @param width_s
     * @param height_z
     * @param secret
     * @param url_sq
     * @param url_l
     * @param title
     * @param width_q
     * @param width_o
     * @param width_n
     * @param height_o
     * @param height_q
     * @param width_z
     * @param height_t
     * @param height_s
     * @param ispublic
     * @param farm
     * @param id
     * @param height_l
     * @param height_n
     * @param height_m
     * @param owner
     * @param height_c
     * @param dateFaved
     * @param width_sq
     * @param isfamily
     * @param url_s
     * @param url_t
     * @param url_q
     * @param url_o
     * @param width_c
     * @param height_sq
     * @param url_z
     */
    public Photo(String id, String owner, String secret, String server, Integer farm, String title, Integer ispublic, Integer isfriend, Integer isfamily, String dateFaved, String url_sq, Integer height_sq, Integer width_sq, String url_t, Integer height_t, Integer width_t, String url_s, String height_s, String width_s, String url_q, String height_q, String width_q, String url_m, String height_m, String width_m, String url_n, String height_n, String width_n, String url_z, String height_z, String width_z, String url_c, String height_c, String width_c, String url_l, String height_l, String width_l, String url_o, String height_o, String width_o) {
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
        this.url_sq = url_sq;
        this.height_sq = height_sq;
        this.width_sq = width_sq;
        this.url_t = url_t;
        this.height_t = height_t;
        this.width_t = width_t;
        this.url_s = url_s;
        this.height_s = height_s;
        this.width_s = width_s;
        this.url_q = url_q;
        this.height_q = height_q;
        this.width_q = width_q;
        this.url_m = url_m;
        this.height_m = height_m;
        this.width_m = width_m;
        this.url_n = url_n;
        this.height_n = height_n;
        this.width_n = width_n;
        this.url_z = url_z;
        this.height_z = height_z;
        this.width_z = width_z;
        this.url_c = url_c;
        this.height_c = height_c;
        this.width_c = width_c;
        this.url_l = url_l;
        this.height_l = height_l;
        this.width_l = width_l;
        this.url_o = url_o;
        this.height_o = height_o;
        this.width_o = width_o;
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
        return url_sq;
    }

    @JsonProperty("url_sq")
    public void setUrlSq(String url_sq) {
        this.url_sq = url_sq;
    }

    @JsonProperty("height_sq")
    public Integer getHeightSq() {
        return height_sq;
    }

    @JsonProperty("height_sq")
    public void setHeightSq(Integer height_sq) {
        this.height_sq = height_sq;
    }

    @JsonProperty("width_sq")
    public Integer getWidthSq() {
        return width_sq;
    }

    @JsonProperty("width_sq")
    public void setWidthSq(Integer width_sq) {
        this.width_sq = width_sq;
    }

    @JsonProperty("url_t")
    public String getUrlT() {
        return url_t;
    }

    @JsonProperty("url_t")
    public void setUrlT(String url_t) {
        this.url_t = url_t;
    }

    @JsonProperty("height_t")
    public Integer getHeightT() {
        return height_t;
    }

    @JsonProperty("height_t")
    public void setHeightT(Integer height_t) {
        this.height_t = height_t;
    }

    @JsonProperty("width_t")
    public Integer getWidthT() {
        return width_t;
    }

    @JsonProperty("width_t")
    public void setWidthT(Integer width_t) {
        this.width_t = width_t;
    }

    @JsonProperty("url_s")
    public String getUrlS() {
        return url_s;
    }

    @JsonProperty("url_s")
    public void setUrlS(String url_s) {
        this.url_s = url_s;
    }

    @JsonProperty("height_s")
    public String getHeightS() {
        return height_s;
    }

    @JsonProperty("height_s")
    public void setHeightS(String height_s) {
        this.height_s = height_s;
    }

    @JsonProperty("width_s")
    public String getWidthS() {
        return width_s;
    }

    @JsonProperty("width_s")
    public void setWidthS(String width_s) {
        this.width_s = width_s;
    }

    @JsonProperty("url_q")
    public String getUrlQ() {
        return url_q;
    }

    @JsonProperty("url_q")
    public void setUrlQ(String url_q) {
        this.url_q = url_q;
    }

    @JsonProperty("height_q")
    public String getHeightQ() {
        return height_q;
    }

    @JsonProperty("height_q")
    public void setHeightQ(String height_q) {
        this.height_q = height_q;
    }

    @JsonProperty("width_q")
    public String getWidthQ() {
        return width_q;
    }

    @JsonProperty("width_q")
    public void setWidthQ(String width_q) {
        this.width_q = width_q;
    }

    @JsonProperty("url_m")
    public String getUrlM() {
        return url_m;
    }

    @JsonProperty("url_m")
    public void setUrlM(String url_m) {
        this.url_m = url_m;
    }

    @JsonProperty("height_m")
    public String getHeightM() {
        return height_m;
    }

    @JsonProperty("height_m")
    public void setHeightM(String height_m) {
        this.height_m = height_m;
    }

    @JsonProperty("width_m")
    public String getWidthM() {
        return width_m;
    }

    @JsonProperty("width_m")
    public void setWidthM(String width_m) {
        this.width_m = width_m;
    }

    @JsonProperty("url_n")
    public String getUrlN() {
        return url_n;
    }

    @JsonProperty("url_n")
    public void setUrlN(String url_n) {
        this.url_n = url_n;
    }

    @JsonProperty("height_n")
    public String getHeightN() {
        return height_n;
    }

    @JsonProperty("height_n")
    public void setHeightN(String height_n) {
        this.height_n = height_n;
    }

    @JsonProperty("width_n")
    public String getWidthN() {
        return width_n;
    }

    @JsonProperty("width_n")
    public void setWidthN(String width_n) {
        this.width_n = width_n;
    }

    @JsonProperty("url_z")
    public String getUrlZ() {
        return url_z;
    }

    @JsonProperty("url_z")
    public void setUrlZ(String url_z) {
        this.url_z = url_z;
    }

    @JsonProperty("height_z")
    public String getHeightZ() {
        return height_z;
    }

    @JsonProperty("height_z")
    public void setHeightZ(String height_z) {
        this.height_z = height_z;
    }

    @JsonProperty("width_z")
    public String getWidthZ() {
        return width_z;
    }

    @JsonProperty("width_z")
    public void setWidthZ(String width_z) {
        this.width_z = width_z;
    }

    @JsonProperty("url_c")
    public String getUrlC() {
        return url_c;
    }

    @JsonProperty("url_c")
    public void setUrlC(String url_c) {
        this.url_c = url_c;
    }

    @JsonProperty("height_c")
    public String getHeightC() {
        return height_c;
    }

    @JsonProperty("height_c")
    public void setHeightC(String height_c) {
        this.height_c = height_c;
    }

    @JsonProperty("width_c")
    public String getWidthC() {
        return width_c;
    }

    @JsonProperty("width_c")
    public void setWidthC(String width_c) {
        this.width_c = width_c;
    }

    @JsonProperty("url_l")
    public String getUrlL() {
        return url_l;
    }

    @JsonProperty("url_l")
    public void setUrlL(String url_l) {
        this.url_l = url_l;
    }

    @JsonProperty("height_l")
    public String getHeightL() {
        return height_l;
    }

    @JsonProperty("height_l")
    public void setHeightL(String height_l) {
        this.height_l = height_l;
    }

    @JsonProperty("width_l")
    public String getWidthL() {
        return width_l;
    }

    @JsonProperty("width_l")
    public void setWidthL(String width_l) {
        this.width_l = width_l;
    }

    @JsonProperty("url_o")
    public String getUrlO() {
        return url_o;
    }

    @JsonProperty("url_o")
    public void setUrlO(String url_o) {
        this.url_o = url_o;
    }

    @JsonProperty("height_o")
    public String getHeightO() {
        return height_o;
    }

    @JsonProperty("height_o")
    public void setHeightO(String height_o) {
        this.height_o = height_o;
    }

    @JsonProperty("width_o")
    public String getWidthO() {
        return width_o;
    }

    @JsonProperty("width_o")
    public void setWidthO(String width_o) {
        this.width_o = width_o;
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
                ", url_sq='" + url_sq + '\'' +
                ", height_sq=" + height_sq +
                ", width_sq=" + width_sq +
                ", url_t='" + url_t + '\'' +
                ", height_t=" + height_t +
                ", width_t=" + width_t +
                ", url_s='" + url_s + '\'' +
                ", height_s='" + height_s + '\'' +
                ", width_s='" + width_s + '\'' +
                ", url_q='" + url_q + '\'' +
                ", height_q='" + height_q + '\'' +
                ", width_q='" + width_q + '\'' +
                ", url_m='" + url_m + '\'' +
                ", height_m='" + height_m + '\'' +
                ", width_m='" + width_m + '\'' +
                ", url_n='" + url_n + '\'' +
                ", height_n='" + height_n + '\'' +
                ", width_n='" + width_n + '\'' +
                ", url_z='" + url_z + '\'' +
                ", height_z='" + height_z + '\'' +
                ", width_z='" + width_z + '\'' +
                ", url_c='" + url_c + '\'' +
                ", height_c='" + height_c + '\'' +
                ", width_c='" + width_c + '\'' +
                ", url_l='" + url_l + '\'' +
                ", height_l='" + height_l + '\'' +
                ", width_l='" + width_l + '\'' +
                ", url_o='" + url_o + '\'' +
                ", height_o='" + height_o + '\'' +
                ", width_o='" + width_o + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
