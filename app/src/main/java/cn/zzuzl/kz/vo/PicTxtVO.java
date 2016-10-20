package cn.zzuzl.kz.vo;

/**
 * Created by Administrator on 2016/10/20.
 */
public class PicTxtVO {
    private String title;
    private Integer src;

    public PicTxtVO(String title, Integer src) {
        this.title = title;
        this.src = src;
    }

    public PicTxtVO() {
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
}
