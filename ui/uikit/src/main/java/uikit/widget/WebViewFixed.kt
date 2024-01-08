package uikit.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView


class WebViewFixed @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = android.R.attr.webViewStyle,
) : WebView(context, attrs, defStyle) {

    init {
        setLayerType(LAYER_TYPE_HARDWARE, null)
        isNestedScrollingEnabled = true

        settings.allowContentAccess = true
        settings.allowFileAccess = true
        settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        settings.databaseEnabled = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        settings.javaScriptCanOpenWindowsAutomatically = true
        settings.allowFileAccess = false
        settings.setSupportMultipleWindows(true)
        settings.builtInZoomControls = false
        settings.setSupportZoom(false)
        settings.displayZoomControls = false
        settings.loadsImagesAutomatically = true


        setRendererPriorityPolicy(RENDERER_PRIORITY_IMPORTANT, false)
        setBackgroundColor(Color.TRANSPARENT)
    }

    override fun hasOverlappingRendering(): Boolean {
        return false
    }

    override fun destroy() {
        super.loadDataWithBaseURL(null, "", "text/html", "utf-8", null)
        super.clearHistory()
        try {
            (this.parent as ViewGroup).removeView(this)
        } catch (ignored: Throwable) { }
        try {
            removeAllViews()
        } catch (ignored: Throwable) { }
        super.destroy()
    }
}



