package com.tcl.mvpdemo.mvp.presenter

import com.tcl.mvpdemo.mvp.base.BasePresenter
import com.tcl.mvpdemo.mvp.base.BaseView

/**
 *
 * @author  hao2.ling
 * @date 2021/3/8
 */
class StudentPresenter : BasePresenter<BaseView>() {

    override fun initData() {
        getName()
        getAge()
        getSex()
    }

    override fun getName() {
        getView()?.showName("白云城主叶孤城")
    }

    override fun getAge() {
        getView()?.showAge("42")
    }

    override fun getSex() {
        getView()?.showSex("男")
    }


}