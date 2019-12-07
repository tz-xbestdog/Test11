package com.example.test11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myku.interceptor.HttpKit
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HttpKit.getInstance()

    }

    /**
     * 快捷登陆
     */
    private fun login(phone: String, password: String) {
        val request = HttpKit.getInstance().create(Api::class.java)
        val observable: Observable<Any> = request.login(phone, password, 2, "")
        observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Any> {
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(t: Any) {
                }

                override fun onError(e: Throwable) {
                }
            })
    }
}
