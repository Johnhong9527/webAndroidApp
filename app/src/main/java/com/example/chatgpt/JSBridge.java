//package com.example.chatgpt;
//
//import android.webkit.JsPromptResult;
//import android.webkit.WebChromeClient;
//import android.webkit.WebView;
//
//import java.lang.reflect.Method;
//import java.util.HashMap;
//import java.util.Map;
//
//public class JSBridge {
//    public class JSBridgeWebChromeClient extends WebChromeClient {
//        @Override
//        public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
//            result.confirm(JSBridge.callJava(view, message));
//            return true;
//        }
//    }
//    private static Map<String, HashMap<String, Method>> exposedMethods = new HashMap<>();
//    public static <IBridge> void register(String exposedName, Class<? extends IBridge> clazz) {
//        if (!exposedMethods.containsKey(exposedName)) {
//            try {
//                exposedMethods.put(exposedName, getAllMethod(clazz));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private static <IBridge> HashMap<String, Method> getAllMethod(Class<? extends IBridge> clazz) {
//    }
//}
