package com.wxxiaomi.ming.electricbicycle.ui.presenter.impl;

import com.wxxiaomi.ming.electricbicycle.ConstantValue;
import com.wxxiaomi.ming.electricbicycle.ui.presenter.base.BasePreImpl;
import com.wxxiaomi.ming.electricbicycle.ui.presenter.WelcomePre;
import com.wxxiaomi.ming.electricbicycle.ui.activity.view.WelcomeView;
import com.wxxiaomi.ming.electricbicycle.ui.activity.LoginActivity;

/**
 * Created by 12262 on 2016/10/28.
 */

public class WelcomePresenterImpl extends BasePreImpl<WelcomeView> implements WelcomePre<WelcomeView> {
    @Override
    public void init() {
        mView.showBtn();
    }

    @Override
    public void onRegisterClick() {
        if(ConstantValue.openScan){

        }else{
//            mView.runActivity(RegisterOneAct.class,null,false);
        }
    }

    @Override
    public void onLoginClick() {
        mView.runActivity(LoginActivity.class,null,false);
    }
}
