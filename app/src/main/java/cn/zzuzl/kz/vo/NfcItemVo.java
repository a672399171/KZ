package cn.zzuzl.kz.vo;

/**
 * Created by Administrator on 2016/10/21.
 */
public class NfcItemVo {
    private Integer src;
    private String title;
    private String title1;
    private String title2;

    public NfcItemVo(Integer src, String title, String title1, String title2) {
        this.src = src;
        this.title = title;
        this.title1 = title1;
        this.title2 = title2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSrc() {
        return src;
    }

    public void setSrc(Integer src) {
        this.src = src;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}
