package com.example.testmvp.view.fragment.alarm;

import com.example.testmvp.presenter.base.impl.BaseImpl;
import com.example.testmvp.presenter.utils.UtilsMenuFragment;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import lombok.Setter;

@EBean
public class AlarmImpl extends BaseImpl<AlarmView> implements AlarmPres {
    @Bean
    protected UtilsMenuFragment utilsMenuFragment;

    @Setter
    private int fragmentId;

    @Setter
    private String title;

    @Override
    public void init() {
//        getFragmentManagerUtils().showFragmentUsingCallBackNoBackStack(utilsMenuFragment.
//                getFragment(fragmentId));
    }

    @Override
    public String titleActivity() {
        return title;
    }

}
