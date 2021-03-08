package com.tcl.mvpdemo.mvp.activity

import android.os.Bundle
import com.tcl.mvpdemo.R
import com.tcl.mvpdemo.mvp.base.BaseActivity
import com.tcl.mvpdemo.mvp.presenter.StudentPresenter
import kotlinx.android.synthetic.main.activity_student.*

/**
 *
 * @author  hao2.ling
 * @date 2021/3/8
 */
class StudentActivity : BaseActivity<StudentPresenter>() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        mPresenter?.initData();
    }

    override fun initPresenter() {
        mPresenter = StudentPresenter()
    }


    override fun showName(name: String) {
        tv_name.text = name
    }

    override fun showAge(age: String) {
        tv_age.text = age
    }

    override fun showSex(sex: String) {
        tv_sex.text = sex
    }


}