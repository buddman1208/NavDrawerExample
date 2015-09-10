package kr.edcan.drawerexample;

import android.content.Context;

/**
 * Created by kotohana5706 on 15. 7. 13.
 */
public class CData {
    private String content_label;
    private String description;

    public CData(Context context,String content_label_, String description_) {
        content_label = content_label_;
        description = description_;
    }


    public String getContent_label() {
        return content_label;
    }

    public String getDescription() {
        return description;
    }
}
