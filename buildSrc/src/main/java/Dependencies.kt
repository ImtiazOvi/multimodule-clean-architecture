

object Dependencies {
    const val ktx = "androidx.core:core-ktx:${DependenciesVersion.ktx}"
    const val appcompat = "androidx.appcompat:appcompat:${DependenciesVersion.appCompact}"
    const val material = "com.google.android.material:material:${DependenciesVersion.material}"
    const val activity = "androidx.activity:activity-ktx:${DependenciesVersion.activityVersion}"
    const val fragment = "androidx.fragment:fragment-ktx:${DependenciesVersion.fragmentVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${DependenciesVersion.recyclerViewVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${DependenciesVersion.constraintLayout}"

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependenciesVersion.lifeCycleVersion}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${DependenciesVersion.lifeCycleVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-common-java8:${DependenciesVersion.lifeCycleVersion}"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${DependenciesVersion.navigationVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${DependenciesVersion.navigationVersion}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${DependenciesVersion.hiltVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${DependenciesVersion.hiltVersion}"

    const val rxJava3 = "io.reactivex.rxjava3:rxjava:${DependenciesVersion.rxJavaVersion}"
    const val rxJava3Android = "io.reactivex.rxjava3:rxandroid:${DependenciesVersion.rxJavaVersion}"

    const val okhHttp3 = "com.squareup.okhttp3:okhttp:${DependenciesVersion.okHttp3Version}"
    const val okhHttp3Interceptor = "com.squareup.okhttp3:logging-interceptor:${DependenciesVersion.okHttp3Version}"

    const val timber = "com.jakewharton.timber:timber:${DependenciesVersion.timberVersion}"
    const val gson = "com.google.code.gson:gson:${DependenciesVersion.gsonVersion}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${DependenciesVersion.retrofitVersion}"
    const val rxJava3adapter = "com.squareup.retrofit2:adapter-rxjava3:${DependenciesVersion.retrofitVersion}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${DependenciesVersion.retrofitVersion}"

    const val junit = "junit:junit:${DependenciesVersion.junit}"
    const val extJunit = "androidx.test.ext:junit:${DependenciesVersion.extJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${DependenciesVersion.espresso}"
}
