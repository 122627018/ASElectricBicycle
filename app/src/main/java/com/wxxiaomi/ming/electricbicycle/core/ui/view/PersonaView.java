package com.wxxiaomi.ming.electricbicycle.core.ui.view;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.wxxiaomi.ming.electricbicycle.core.ui.base.BasePre;
import com.wxxiaomi.ming.electricbicycle.core.ui.base.BaseView;
import com.wxxiaomi.ming.electricbicycle.dao.bean.UserCommonInfo;


/**
 * Created by 12262 on 2016/6/21.
 */
public interface PersonaView<T extends BasePre> extends BaseView<T> {
    Intent getIntent();
    void setViewData(UserCommonInfo info);
    void setBtnView(Drawable drawable);
    void setAdapter(RecyclerView.Adapter adapter);
}
