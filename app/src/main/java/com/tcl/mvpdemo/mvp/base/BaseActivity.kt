package com.tcl.mvpdemo.mvp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *
 * @author  hao2.ling
 * @date 2021/3/8
 */
abstract class BaseActivity<T : BasePresenter<BaseView>> : BaseView, AppCompatActivity() {

    protected var mPresenter: T? = null

    abstract fun initPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initPresenter();
        mPresenter?.onAttach(this);
    }


}