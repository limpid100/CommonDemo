package com.dxl.commondemo.bean;

import com.dxl.commondemo.R;
import com.dxl.commondemo.app.CommonApp_;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * desc   :
 *
 * @author : dxl
 * @version : 1.0
 * e-mail : du_xiaolong@hotmail.com
 * @date : 2020/6/10 11:38 AM
 */
public class News {
    private int id;
    private String title;
    private Date sendTime;
    private String img;
    private Map<String, Boolean> readMap = new HashMap<>();
    /**
     * 1新闻公告 2主题学习  3悦然心声  -1分组
     */
    private int type = -1;

    public News() {
        String[] stringArray = CommonApp_.getAppContext().getResources().getStringArray(R.array.news_read_names);
        for (String s : stringArray) {
            readMap.put(s, false);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Map<String, Boolean> getReadMap() {
        return readMap;
    }

    public void setReadMap(Map<String, Boolean> readMap) {
        this.readMap = readMap;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
