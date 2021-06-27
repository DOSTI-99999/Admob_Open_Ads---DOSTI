# Admob_Open_Ads---DOSTI

[![](https://jitpack.io/v/DOSTI-99999/Admob_Open_Ads---DOSTI.svg)](https://jitpack.io/#DOSTI-99999/Admob_Open_Ads---DOSTI)

Implement admob  open ads in your android app.   


## Step 1. Add the JitPack repository to your build file


```gradle 

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ```
  
  
## Step 2. Add the dependency     build.gradle)(app)

### Enable   MultiDex

```gradle 

defaultConfig {

        minSdkVersion 19
        targetSdkVersion 30
        versionCode 1
        versionName "1.0"
        
        
        multiDexEnabled true   
        
       

}
```

  
  ```gradle 
  
 dependencies {
	        implementation 'com.github.DOSTI-99999:Admob_Open_Ads---DOSTI:1.0.0'
            implementation 'com.google.android.gms:play-services-ads:20.2.0'

	}
  
  ```
  
  
  
 ## Step  3   -   Create  a   JAVA   Class  
  
   > class name =  OpenAds
  
 >  and  class extends with  Application
  
 >   now   Your  Code  Look  Like  this 
  
  
  ```gradle
  
  public class OpenAds extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this);

        new Admob_Ads_DOSTI_Manager(this,"ca-app-pub-3940256099942544/3419835294");


    }
}


````
   
  
  
  
  
  
  
  
##   Step  4  -   Add   INTTERNET  permission  And  META  DATA   in  manifest
  
  ```gradle
  
      <uses-permission android:name="android.permission.INTERNET"/>
      
      
      
    <application
    
        android:name=".OpenAds"
      
    
        <!-- Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713 -->
        <meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="ca-app-pub-3940256099942544~3347511713"/>
    
    
    
    </application>
    </manifest>

```




 **WORK  done**  
 
###  NOW  YOU  can  run  your app   ,   Ads  Impliment  in  your  app  Successfully

  
