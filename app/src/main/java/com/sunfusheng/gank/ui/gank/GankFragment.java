package com.sunfusheng.gank.ui.gank;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunfusheng.gank.base.BaseFragment;

/**
 * Created by sunfusheng on 2017/1/13.
 */
public class GankFragment extends BaseFragment {

    private GankPresenter mPresenter;
    private GankView mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}