package com.tcl.mvpdemo.mvp.base

import java.lang.ref.Reference
import java.lang.ref.WeakReference

/**
 *
 * @author  hao2.ling
 * @date 2021/3/8
 * BasePresenter 要 Attach BaseView 此处持有 BaseView 的子类泛型 T
 */
abstract class BasePresenter<T : BaseView> {

    fun getView(): T? {
        return mReference?.get()
    }

    var mReference: Reference<T>? = null

    /**
     * 弱引用（WeakReference）只具有弱引用的对象拥有更短暂的生命周期。在垃圾回收器线程扫描它所管辖的内存区域的过程中，一旦发现了只具有弱引用的对象，不管当前内存空间足够与否，都会回收它的内存。
     * 软引用  （SoftReference）当内存不足时避免oom才会释放内存
     */
    fun onAttach(view: T) {
        mReference = WeakReference<T>(view)
    }

    abstract fun initData();
    abstract fun getName()
    abstract fun getAge()
    abstract fun getSex()

}