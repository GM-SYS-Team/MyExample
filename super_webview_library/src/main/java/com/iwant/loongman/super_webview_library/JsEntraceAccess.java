package com.iwant.loongman.super_webview_library;

import android.webkit.ValueCallback;

/**
 * Created by cenxiaozhong on 2017/5/14.
 */

public interface JsEntraceAccess extends QuickCallJs{


    void callJs(String js, ValueCallback<String> callback);

    void callJs(String js);




}