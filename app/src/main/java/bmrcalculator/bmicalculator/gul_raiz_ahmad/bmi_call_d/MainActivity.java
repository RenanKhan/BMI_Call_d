package bmrcalculator.bmicalculator.gul_raiz_ahmad.bmi_call_d;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

//import com.bmicalculator.gul_raiz_ahmad.bmi_ca;
import com.bmicalculator.gul_raiz_ahmad.bmi_call_d.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

import bmrcalculator.bmicalculator.gul_raiz_ahmad.bmi_call_d.Opration.opration_class;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   // boolean isPressed = false;

    Button bodyMassIndexButton,waistToHeightButton,bodyFatPercentageButton,basalMetabloicRateButton;
    public int navId;
    String gender ;
    TextView resultstatuseBMITextView,bmiUnderWeightTextView;///just for
    TextView bmiResultTextView,idealWeightTextView,fatTextView,bodymassresultTextView,bodyMassRecmendTextView,waistToggleTextView;
    EditText ageGernalEditText, heightEditTextFeet,weightEditText, heightEditTextInch, hipBFPEditText;
//    TextView underWeightNameLayout,underWeightDataTextView, overWeightNameLayout,overWeightdataTextView, healthyNameLayout,healthyDataTextView, obeseNameLayout,obeseDataTextView;
    Button calBodyMassIndexBtn;
    /////////////////waist to height
    TextView waistToHeightExtremlySlimTextView,waistToHeightHealthyTextView,waistToHeightOverWeightSlimTextView,waistToHeightVeryOverweightTextView,waistToHeightObeseTextView;
    Button calWaistToHeightBtn;
    TextView waistToHeightOfResultTeextView;
    EditText waistGernalEditText;
    String waist_type = "cm";
    String neck_type = "cm";
    String hip_type = "cm";
    String weight_type = "kg";
    String height_type = "cm";
    Double Waist,neck,hip;
   // ScrollView scrollViewBMI,scrollViewBFP,scrollViewWaistToHeight,scrollViewBMR;
    ScrollView scrollView;
    ///////////////////waist of height
    double height;
    double  weight;
    int age, gernalInch;
    RelativeLayout bodyMassIndexLayout,waistToHeightlayout,bodyFatPercentageLayout,basalMetabloicRateLayout;
    TextView heightToggleTextView,weightToggleTextView, waistBFPToggleTextView,neckToggleTextView,hipToggleTextView;
    LinearLayout heightGernalToggleLayout,ageToggleLayout, weightGernaltogglelayout,waistWaistToHeightToggleLayout,neckToggleLayout,waistFatofPercentageLayout;
    LinearLayout underWeightNameLayout,overWeightNameLayout,healthyNameLayout, obeseNameLayout;
    ///////////////////////////////////////////////////////////stat waist to height
    LinearLayout extremlyslimWToHlayout,healthyslimWToHlayout,healthyWToHlayout,overweightWToHlayout,veryoverweightWToHlayout,morbidlyObeseWToHlayout;
    TextView bodyFatPerResultStuts;
    ////////////////////////////////////////////////end waist to height
////////////////////////////////////////////stat Body fat percentage////////////////////////////////////////////////////////
        EditText neckBFPEditText;
        EditText waistBFPEditText;
        TextView resultBodyFatPerTextView;
        Button calBodyFatPercentageBtn;
        LinearLayout hipBodyFatPercentToggleLayout;
        LinearLayout lowBFPLayout, normalBFPLayout, highBFPLayout, veryhighBFPLayout;
        TextView lowBFPTextview, normalBFPTextView, highBFPTextView, veryhighBFPTextView;
    //////////////////////////////////////////////end body fat percentage////////////////////////////////////////////////////////


    EditText WaistToheightEditText;
    Button femaleBtnGernal, maleBtnGernal;
    //////////////////////////////start BMR
    LinearLayout  weightBMRtogglelayout;
    EditText weightBMREditText;
    TextView weighttoggleBMRTextView;
    TextView resultBMRTextView;
    Button calBMRBtn;
    private AdView mAdView,underDetailadView,mAdViewBFP,mAdViewBMI,mAdViewWaistToHeight;
    private   InterstitialAd mInterstitialAd;
    ///////////////////////end BMR
    //////////////////////
    TextView ageGernalTextView,heightGernalTextView,waistTextview,waistBFPtextview,hipTextView, weightgernalTextView,weightBMRTextview,neckBFPtextview;
    /////////////////////
    RelativeLayout sceondscreenlayot,firstscreenlayout;
    //////////////
    ImageView dropdownGernalheight,dropdownGernalwaist, dropDownGernalWeight,dropDownwaistbfp,dropDownNeckbfp,dropDownWeightBMR,dropDownHip;
    private void intilaize(){
//////////////////////////////////////first main screen start
        //bodyMassIndexButton,waistToHeightButton,bodyFatPercentageButton,basalMetabloicRateButton;
        //#16222d
        gender = "man";
        setActionBarTitleAndColor("BMI","#16222d");
     //   bodyFatPerResultStuts = (TextView) findViewById(R.id.body_fat_per_resultstuts);
        resultstatuseBMITextView = (TextView)findViewById(R.id.resultstutesbmi);
        dropdownGernalheight =  (ImageView)findViewById(R.id.dropdowngernalheight);
        dropdownGernalwaist = (ImageView)findViewById(R.id.gernalwaistdropdown);
        dropDownwaistbfp = (ImageView)findViewById(R.id.waistbfpdropdown);
        dropDownGernalWeight = (ImageView)findViewById(R.id.dropweightgernal) ;
        dropDownWeightBMR = (ImageView)findViewById(R.id.dropdownweightbmr);
        dropDownNeckbfp = (ImageView)findViewById(R.id.neckbfpdropdown);
        dropDownHip = (ImageView)findViewById(R.id.hipbfpdropdown);

        ageGernalTextView = (TextView) findViewById(R.id.gernaltextage);
        heightGernalTextView = (TextView)findViewById(R.id.gernaltextheight);
        waistTextview = (TextView)findViewById(R.id.waistTextView);
        waistBFPtextview = (TextView)findViewById(R.id.waistbodyfatpertext);
        neckBFPtextview = (TextView) findViewById(R.id.necktextview);
        hipTextView = (TextView)findViewById(R.id.hiptextview);
        weightBMRTextview = (TextView)findViewById(R.id.weighttextviewbmr);
        weightgernalTextView = (TextView)findViewById(R.id.weight_toggle_textviewgernal);
        /////////////////////////////////
        basalMetabloicRateButton = (Button)findViewById(R.id.basalmetabloicimage);
        bodyMassIndexButton = (Button)findViewById(R.id.bodymassindeximage);
        waistToHeightButton = (Button)findViewById(R.id.waisttoheightimagee);
        bodyFatPercentageButton = (Button)findViewById(R.id.bodyfatpercentageimage);
        sceondscreenlayot = (RelativeLayout)findViewById(R.id.sceondscreenlayout);
        firstscreenlayout = (RelativeLayout)findViewById(R.id.firstscreenlayout);
        ///////////////////////////////first main screen end
        weightToggleTextView = (TextView)findViewById(R.id.weight_toggle_textviewgernal);
        heightToggleTextView = (TextView)findViewById(R.id.height_toggle_textview);
        heightEditTextInch = (EditText)findViewById(R.id.gernal_height_edit_inch);
        //////////////layout end
        bodyMassIndexLayout = (RelativeLayout) findViewById(R.id.bodymassindexlayout);
        waistToHeightlayout = (RelativeLayout) findViewById(R.id.wais_to_heightlayout);
        bodyFatPercentageLayout = (RelativeLayout) findViewById(R.id.body_fat_percentagelayout);
        basalMetabloicRateLayout = (RelativeLayout) findViewById(R.id.basal_metabloic);
        ///////////layout end
        ////////////////////////////////start waist to height
        ////////////start layout
        extremlyslimWToHlayout = (LinearLayout)findViewById(R.id.extremelyslimlayout);
        healthyWToHlayout = (LinearLayout)findViewById(R.id.healthylayout);
        overweightWToHlayout = (LinearLayout)findViewById(R.id.overweightlayouts);
        veryoverweightWToHlayout = (LinearLayout)findViewById(R.id.veryoverweightlayouts);
        morbidlyObeseWToHlayout = (LinearLayout) findViewById(R.id.morbidlyobeselayout);
        healthyslimWToHlayout = (LinearLayout) findViewById(R.id.healthyslimlayout);
        /////end layouts
        ///////////////////////////////end waist to height
        /////////////////////////////////////////////////////////////////////bodymassindex start
        bodymassresultTextView = (TextView)findViewById(R.id.bmiTextbodymasssresult);
        ageGernalEditText = (EditText)findViewById(R.id.age_edit);  //,heightEditTextFeet,weightEditText
        heightEditTextFeet = (EditText)findViewById(R.id.height_edit_feet);
        weightEditText = (EditText)findViewById(R.id.weight_edit);
        //////////
        calBodyMassIndexBtn = (Button)findViewById(R.id.calculatebodymess);
        heightGernalToggleLayout = (LinearLayout) findViewById(R.id.heighttogglelayout) ;
        weightGernaltogglelayout = (LinearLayout) findViewById(R.id.weighttogglelayout);
        underWeightNameLayout = (LinearLayout) findViewById(R.id.underweight_name);
        overWeightNameLayout = (LinearLayout) findViewById(R.id.overwieght_name);
        healthyNameLayout = (LinearLayout) findViewById(R.id.healthy_name);
        obeseNameLayout = (LinearLayout) findViewById(R.id.obeset_name);
        /////////////////////////////////////////////////////////////////////bodymassindex start
        //////////////////weiest to height start
        femaleBtnGernal = (Button)findViewById(R.id.femalbtnnwaisttoheight);
        maleBtnGernal = (Button)findViewById(R.id.malebtnnwaisttoheight);
        waistWaistToHeightToggleLayout = (LinearLayout) findViewById(R.id.waisttogglelayout);
        waistToggleTextView = (TextView)findViewById(R.id.waist_toggle_textview) ;
        waistToHeightHealthyTextView = (TextView) findViewById(R.id.waistToHeighthealthy);
        waistToHeightObeseTextView = (TextView)findViewById(R.id.waistToHeightobese);
        waistToHeightOverWeightSlimTextView = (TextView)findViewById(R.id.waistToHeightoverweight);
        waistToHeightVeryOverweightTextView = (TextView)findViewById(R.id.waistToHeightveryoverweight);
        calWaistToHeightBtn = (Button)findViewById(R.id.wais_to_heightbtn);
        waistToHeightOfResultTeextView = (TextView)findViewById(R.id.waisttoheightresulttext);
        waistGernalEditText = (EditText) findViewById(R.id.gernal_waist_edit);
        //////////////////////////weast to height end
        ////////////////////////////////////////////stat Body fat percentage////////////////////////////////////////////////////////

        waistBFPToggleTextView = (TextView)findViewById(R.id.body_fat_per_waist_toggle_textview);
        waistFatofPercentageLayout = (LinearLayout)findViewById(R.id.body_fat_per_waisttogglelayout);
        waistBFPEditText = (EditText)findViewById(R.id.body_fat_per_waist_edittext);
        neckToggleLayout = (LinearLayout)findViewById(R.id.necktogglelayout);
        neckToggleTextView = (TextView)findViewById(R.id.neck_toggle_textview);
        neckBFPEditText = (EditText) findViewById(R.id.body_fat_per_neck_edittext);
        hipBodyFatPercentToggleLayout = (LinearLayout)findViewById(R.id.hiptogglelayout);
        hipToggleTextView = (TextView)findViewById(R.id.hip_toggle_textview);
        hipBFPEditText = (EditText) findViewById(R.id.body_fat_per_hip_edittext);
        resultBodyFatPerTextView = (TextView)findViewById(R.id.body_fat_per_result);
        calBodyFatPercentageBtn = (Button) findViewById(R.id.calculate_body_fat_percentage);
        lowBFPLayout = (LinearLayout)findViewById(R.id.lowbfp);
        normalBFPLayout = (LinearLayout)findViewById(R.id.normalbfp);
        highBFPLayout = (LinearLayout)findViewById(R.id.highbfp);
        veryhighBFPLayout = (LinearLayout)findViewById(R.id.veryhighbfp);
        lowBFPTextview = (TextView) findViewById(R.id.lowbfptext) ;
        normalBFPTextView = (TextView) findViewById(R.id.normalbfptextview) ;
        highBFPTextView = (TextView) findViewById(R.id.highbfptextview) ;
       veryhighBFPTextView = (TextView) findViewById(R.id.veryhighbfptextview) ;
        //////////////////////////////////////////////end body fat percentage////////////////////////////////////////////////////////
//////////////////////////////////start BMR
        weightBMRtogglelayout = (LinearLayout)findViewById(R.id.basal_metabloic_weighttogglelayout);
        weightBMREditText = (EditText)findViewById(R.id.basal_metabloic_weight_edit);
        weighttoggleBMRTextView = (TextView)findViewById(R.id.basal_metabloicweight_toggle_textview);
        resultBMRTextView = (TextView)findViewById(R.id.bmr_resultTextView);
        calBMRBtn = (Button) findViewById(R.id.basal_metabloic_calculate);
        femaleBtnGernal.setBackgroundResource(R.drawable.femaleunslected);
        ////////////////////////////////end basal metabolic rate
        //////add mob
        mAdView = (AdView) findViewById(R.id.adView);
        underDetailadView = (AdView)findViewById(R.id.adViewunderdetail);
        mAdViewBFP = (AdView)findViewById(R.id.adViewbfp);
        mAdViewBMI = (AdView)findViewById(R.id.adViewbmi);
        mAdViewWaistToHeight = (AdView)findViewById(R.id.adViewwtoh);
        /////////add mob
       /// scrollViewBMR = (ScrollView)findViewById(R.id.scrolbmr);
       // scrollViewBMI = (ScrollView)findViewById(R.id.scrolbmi);
//        scrollViewBFP = (ScrollView)findViewById(R.id.scrolbfp);
//        scrollViewWaistToHeight = (ScrollView)findViewById(R.id.scrolwtoh);
        scrollView = (ScrollView)findViewById(R.id.gernalscrolview);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     //   setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        intilaize();
        ////////////////add aD
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        if(adRequest != null){
            mAdView.loadAd(adRequest);
            underDetailadView.loadAd(adRequest);
            mAdViewBFP.loadAd(adRequest);
            mAdViewBMI.loadAd(adRequest);
            mAdViewWaistToHeight.loadAd(adRequest);
            mInterstitialAd = new InterstitialAd(this);
            // set the ad unit ID
            mInterstitialAd.setAdUnitId("ca-app-pub-9764299659831882/7889406658");
            // Load ads into Interstitial Ads
            mInterstitialAd.loadAd(adRequest);
        }
        //////////////////// end add
        weightGernaltogglelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
///////////////////
                final CharSequence[] items = {"kg ","lb(pound)"};//" Hard "," Very Hard "};

// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select weight format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    Log.e("index", String.valueOf(indexSelected));
                                    //   weight_type = items(indexSelected);
                                    seletedItems.add(indexSelected);
                                    if (indexSelected == 0){
                                        weight_type = "kg";
                                        weightToggleTextView.setText("kg");
                                        dialog.cancel();
                                    }
                                    else if (indexSelected == 1){
                                        weight_type = "lb";
                                        weightToggleTextView.setText("lb");
                                        dialog.cancel();
                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it
                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                dialog.show();
                ////////////////
            }
        });
        heightGernalToggleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
////////////////////
                final CharSequence[] items = {"ft+Inch","cm"};//" Hard "," Very Hard "};
// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select height format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    seletedItems.add(indexSelected);
                                    if(indexSelected == 0){
                                        height_type = "ft";
                                        heightToggleTextView.setText("ft+in");
                                        //  heightEditTextInch.setWidth(50);
                                        //    heightEditTextInch.setWidth(100);
                                        heightEditTextFeet.setHint("feet");
                                        heightEditTextInch.setVisibility(View.VISIBLE);
                                        dialog.cancel();
                                    }else if(indexSelected == 1){
                                        height_type = "cm";
                                        heightEditTextFeet.setHint("cm");
                                        heightEditTextInch.setVisibility(View.GONE);
                                        heightToggleTextView.setText("cm");
                                        dialog.cancel();
                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it
                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                    dialog.show();
            ///////////////
        }
    });

        weightBMRtogglelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
///////////////////
                final CharSequence[] items = {"kg ","lb(pound)"};//" Hard "," Very Hard "};
// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select weight format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    Log.e("index", String.valueOf(indexSelected));
                                    //   weight_type = items(indexSelected);
                                    seletedItems.add(indexSelected);
                                    if (indexSelected == 0){
                                        weight_type = "kg";
                                        weighttoggleBMRTextView.setText("kg");
                                        dialog.cancel();
                                    }
                                    else if (indexSelected == 1){
                                        weight_type = "lb";
                                        weighttoggleBMRTextView.setText("lb");
                                        dialog.cancel();
                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it

                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                dialog.show();
                ////////////////
            }
        });
/////////////////////////////hip start
        hipBodyFatPercentToggleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
////////////////////
                final CharSequence[] items = {"Inch","cm"};//" Hard "," Very Hard "};
// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select Hip format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    seletedItems.add(indexSelected);
                                    if(indexSelected == 0){
                                       hip_type = "inch";
                                        hipToggleTextView.setText("in");
                                        dialog.cancel();
                                    }else if(indexSelected == 1){
                                        hip_type = "cm";
                                       // heightEditTextInch.setVisibility(View.INVISIBLE);
                                      hipToggleTextView.setText("cm");
                                        dialog.cancel();
                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it
                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                dialog.show();
                ///////////////
            }
        });
        ///////////////////////hip end
        waistToHeightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navId = R.id.nav_gallery;
                wasitToHeightSet();
                firstscreenlayout.setVisibility(View.INVISIBLE);
                sceondscreenlayot.setVisibility(View.VISIBLE);
                bodyMassIndexLayout.setVisibility(View.INVISIBLE);
                waistToHeightlayout.setVisibility(View.VISIBLE);
                basalMetabloicRateLayout.setVisibility(View.INVISIBLE);
                bodyFatPercentageLayout.setVisibility(View.INVISIBLE);
            }
        });
        bodyMassIndexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navId = R.id.nav_camera;
                bodyMassIndexSet();
               firstscreenlayout.setVisibility(View.INVISIBLE);
                sceondscreenlayot.setVisibility(View.VISIBLE);
                bodyMassIndexLayout.setVisibility(View.VISIBLE);
                waistToHeightlayout.setVisibility(View.INVISIBLE);
                basalMetabloicRateLayout.setVisibility(View.INVISIBLE);
                bodyFatPercentageLayout.setVisibility(View.INVISIBLE);
            }
        });
       bodyFatPercentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navId = R.id.nav_slideshow;
                bodyFatPercentageSet();
                bodyMassIndexLayout.setVisibility(View.INVISIBLE);
                waistToHeightlayout.setVisibility(View.INVISIBLE);
                basalMetabloicRateLayout.setVisibility(View.INVISIBLE);
                bodyFatPercentageLayout.setVisibility(View.VISIBLE);
                firstscreenlayout.setVisibility(View.INVISIBLE);
                sceondscreenlayot.setVisibility(View.VISIBLE);
            }
        });
        basalMetabloicRateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navId = R.id.nav_manage;
                baselMetabolicRateSet();
                firstscreenlayout.setVisibility(View.INVISIBLE);
                sceondscreenlayot.setVisibility(View.VISIBLE);
                bodyMassIndexLayout.setVisibility(View.INVISIBLE);
                waistToHeightlayout.setVisibility(View.INVISIBLE);
                basalMetabloicRateLayout.setVisibility(View.VISIBLE);
                bodyFatPercentageLayout.setVisibility(View.INVISIBLE);
            }
        });

        calBodyMassIndexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(ageGernalEditText.getText().toString().equals("") || heightEditTextFeet.getText().toString().equals("")|| weightEditText.getText().equals("")){
                Toast.makeText(getBaseContext(),"Please Fill All Fields.",Toast.LENGTH_LONG).show();
            }else {
                    age = Integer.parseInt(ageGernalEditText.getText().toString());
                    height = Double.parseDouble(heightEditTextFeet.getText().toString());
                try {
                    weight = Double.parseDouble(weightEditText.getText().toString());
                }catch (NumberFormatException e){
                    Toast.makeText(getBaseContext(),"Please Enter Correct Value in Weight.",Toast.LENGTH_LONG).show();
                }
                    gernalInch = 0;
                    if (!heightEditTextInch.getText().toString().equals(""))
                        gernalInch = Integer.parseInt(heightEditTextInch.getText().toString());//error

                    opration_class oprationObject = new opration_class();
                    String getBMI = oprationObject.getBMI(weight_type, height_type, height, weight, gernalInch);
                    String[] result = getBMI.split(",");

                    final int ORANGE = 0xFFFF3300;

                bodymassresultTextView.setText(result[1]);

                if (result[0].equals("under")) {
                        underWeightNameLayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        //////////////////////////////////
                       healthyNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overWeightNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        obeseNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                    } else if (result[0].equals("normal")) {
                        healthyNameLayout.setBackgroundColor(Color.parseColor("#93c47d"));
                        ///////////////////////////
                        //////////////////////////////////
                        underWeightNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overWeightNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        obeseNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        ////////////////////////////////
                    } else if (result[0].equals("over")) {
                        //bodyMassRecmendTextView .setText("Please do some walk ");

                        overWeightNameLayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        //////////////////////////////////
                        underWeightNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        healthyNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        obeseNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                    } else if (result[0].equals("obese")) {
                      //  bodyMassRecmendTextView .setText("Lets Cup of coffe with doctor ");

                        obeseNameLayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        //////////////////////////////////fafafa
                        underWeightNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        healthyNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overWeightNameLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                    }
               // scrollView.fullScroll(View.FOCUS_DOWN);
              //  scrollView.pageScroll(View.FOCUS_DOWN);
                    hideSoftKeyboard();
                    setScrollViewDown();
             //   if(getCurrentFocus()!=null) { InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE); inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0); }
               /* new CountDownTimer(2000, 20) {

                    public void onTick(long millisUntilFinished) {

                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }

                    public void onFinish() {
                    }

                }.start();*/
                /////test scrol

                ///////end test scrool
            }
            }
        });
        /////////////////////////////////////////////////////////////////////bodymassindex end
//////////////////weiest to height start
        femaleBtnGernal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(navId == R.id.nav_camera)
                    femaleBtnGernal.setBackgroundResource(R.drawable.femaleselectedforbodymassindex);
                if(navId == R.id.nav_gallery)
                    femaleBtnGernal.setBackgroundResource(R.drawable.femaleselectedforwaisttoheight);
                if(navId == R.id.nav_slideshow)
                    femaleBtnGernal.setBackgroundResource(R.drawable.femaleselectedforbodyfatpersentage);
                if(navId == R.id.nav_manage)
                    femaleBtnGernal.setBackgroundResource(R.drawable.femaleselectedforbasalmetabolicrate);
                maleBtnGernal.setBackgroundResource(R.drawable.maleunselected);
                gender = "woman";
                //  TextView waistToHeightExtremlySlimTextView,waistToHeightHealthyTextView,waistToHeightOverWeightSlimTextView,waistToHeightVeryOverweightTextView,waistToHeightObeseTextView;
                if (navId == R.id.nav_slideshow){
                    hipBodyFatPercentToggleLayout.setVisibility(View.VISIBLE);
                    lowBFPTextview.setText("<21%");
                    normalBFPTextView.setText("21 - 33%");
                    highBFPTextView.setText("33 - 39%");
                    veryhighBFPTextView.setText(">39%");
                }
                waistToHeightHealthyTextView.setText("0.43 to 0.52");
                waistToHeightOverWeightSlimTextView.setText("0.49 to 0.53");
                waistToHeightVeryOverweightTextView.setText("0.54 to 0.57");
                waistToHeightObeseTextView.setText("0.58");
               /* <=0.34   Extremely Slim
                0.42 to 0.48  Healthy
                0.49 to 0.53  Overweight
                0.54 to 0.57  Very Overweight
                0.58 +   Morbidly Obese*/

            }
        });
        maleBtnGernal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*nav_camera
                        nav_gallery
                nav_slideshow
                        manage*/
                if(navId == R.id.nav_camera)
                    maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforbodymassindex);
                if(navId == R.id.nav_gallery)
                    maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforwaisttoheight);
                if(navId == R.id.nav_slideshow)
                    maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforbodyfatpersentage);
                if(navId == R.id.nav_manage)
                    maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforbasalmetabolicrate);

                femaleBtnGernal.setBackgroundResource(R.drawable.femaleunslected);
                gender = "man";
                if (navId == R.id.nav_slideshow){
                    hipBodyFatPercentToggleLayout.setVisibility(View.INVISIBLE);
                    lowBFPTextview.setText("8%");
                    normalBFPTextView.setText(" 8 - 20%");
                    highBFPTextView.setText("20 - 25%");
                    veryhighBFPTextView.setText(">25%");
                }
                waistToHeightHealthyTextView.setText("0.43 to 0.52");
                waistToHeightOverWeightSlimTextView.setText("0.53 to 0.57");
                waistToHeightVeryOverweightTextView.setText("0.58 to 0.62");
                waistToHeightObeseTextView.setText("0.63");
                /*<=0.34  Extremely Slim
                0.43 to 0.52 Healthy
                0.53 to 0.57 Overweight
                0.58 to 0.62 Very Overweight
                0.63 +  Morbidly Obese*/
            }
        });
        calWaistToHeightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    if(getCurrentFocus()!=null) { InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE); inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0); }
                if(ageGernalEditText.getText().toString().equals("") || heightEditTextFeet.getText().toString().equals("") ||waistGernalEditText.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(),"Please Fill All Fields.",Toast.LENGTH_LONG).show();

                }else {
                    age = Integer.parseInt(ageGernalEditText.getText().toString());
                    height = Integer.parseInt(heightEditTextFeet.getText().toString());
                    Waist = Double.parseDouble(waistGernalEditText.getText().toString());
                    if (heightEditTextInch.getText().toString().equals("")) {
                    }else
                    gernalInch = Integer.parseInt( heightEditTextInch.getText().toString());
                    opration_class oprationObject = new opration_class();
                    //(int age,double height,double waist,double gernalInch,String gender)
                  ///  String gender = "man";
                    //  String waist_type,String height_type,int age,double height,double waist,double gernalInch,String gender
                   String getWaistToHeight = oprationObject.getWaistToHeight(waist_type, height_type, height, Waist, gernalInch,gender);
                //public String getWaistToHeight(String wiast_type, String height_type, double heightFeet, Double waistToheight_waist, int heightInch, String gender)
                   String[] result = getWaistToHeight.split(",");
                    final int ORANGE = 0xFFFF3300;
                    Log.e("result",result[1]);
                  //  double ans = Double.parseDouble(new DecimalFormat("##.##").format(result[1]));
                    waistToHeightOfResultTeextView.setText(result[1]);
                    hideSoftKeyboard();
                    setScrollViewDown();

                    if (result[0].equals("extremelyslim")) {
                        extremlyslimWToHlayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        //////////////////////////////////
                        healthyWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryoverweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        morbidlyObeseWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        healthyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));

                        //////////////////////////////////
                    } else if (result[0].equals("healthyslim")) {
                        extremlyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        healthyslimWToHlayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        healthyWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryoverweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        morbidlyObeseWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        ////////////////////////////////
                    }else if (result[0].equals("healthy")) {
                        extremlyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        healthyWToHlayout.setBackgroundColor(Color.parseColor("#93c47d"));
                        overweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryoverweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        morbidlyObeseWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        healthyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));

                        //////////////////////////////////
                        ////////////////////////////////
                    } else if (result[0].equals("overweight")) {
                        extremlyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        healthyWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overweightWToHlayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        veryoverweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        morbidlyObeseWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        healthyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));

                        //////////////////////////////////
                    } else if (result[0].equals("veryoverweight")) {
                        extremlyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        healthyWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryoverweightWToHlayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        morbidlyObeseWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        healthyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));

                        //////////////////////////////////
                    }else if (result[0].equals("morbidlyobese")) {
                        extremlyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        healthyWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        overweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryoverweightWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        morbidlyObeseWToHlayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        healthyslimWToHlayout.setBackgroundColor(Color.parseColor("#fafafa"));

                        //////////////////////////////////
                    }
                    hideSoftKeyboard();
                    setScrollViewDown();
                }
            }
        });
        waistWaistToHeightToggleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
////////////////////
                final CharSequence[] items = {"in","cm"};//" Hard "," Very Hard "};
// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select waist format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    seletedItems.add(indexSelected);
                                    if(indexSelected == 0){
                                        waist_type = "inch";
                                        waistToggleTextView.setText("in");
                                        dialog.cancel();
                                    }else if(indexSelected == 1){
                                        waist_type = "cm";
                                        waistToggleTextView.setText("cm");
                                        dialog.cancel();
                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it
                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                dialog.show();
                ///////////////
            }
        });
        //////////////////////////weast to height end
////////////////////////////////////////////stat Body fat percentage////////////////////////////////////////////////////////

        neckToggleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
////////////////////
                final CharSequence[] items = {"inch","cm"};//" Hard "," Very Hard "};
// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select neck format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    seletedItems.add(indexSelected);
                                    if(indexSelected == 0){
                                        neck_type = "inch";
                                        neckToggleTextView.setText("in");
                                        dialog.cancel();
                                        //   heightEditTextInch.setVisibility(View.VISIBLE);
                                    }else if(indexSelected == 1){
                                       neck_type = "cm";
                                        // heightEditTextInch.setVisibility(View.INVISIBLE);

                                        //    heightToglebtn.setText("CM");
                                        neckToggleTextView.setText("cm");

                                        dialog.cancel();

                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it
                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                dialog.show();
                ///////////////
            }
        });
        ////////////////
        calBodyFatPercentageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  if(getCurrentFocus()!= null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                }*/
                if(ageGernalEditText.getText().toString().equals("") || heightEditTextFeet.getText().toString().equals("")||neckBFPEditText.getText().toString().equals("")||waistBFPEditText.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(),"Please Fill All Fields.",Toast.LENGTH_LONG).show();
                }else {
                    hip = 0.0;
                    age = Integer.parseInt(ageGernalEditText.getText().toString());
                    height = Double.parseDouble(heightEditTextFeet.getText().toString());
                    Waist = Double.parseDouble(waistBFPEditText.getText().toString());
                 //   gernalInch = 0;
                    if (!heightEditTextInch.getText().toString().equals(""))
                        gernalInch = Integer.parseInt(heightEditTextInch.getText().toString());
                    neck = Double.parseDouble(neckBFPEditText.getText().toString());
                    if(gender.equals("woman")) {
                        if(hipBFPEditText.getText().toString().equals("")){
                            Toast.makeText(getBaseContext(),"Please Fil Hip Field.",Toast.LENGTH_LONG).show();
                        }else
                        hip = Double.parseDouble(hipBFPEditText.getText().toString());
                    }
                    opration_class oprationObject = new opration_class();
                   // String gender = "man";
                    String getBMI = oprationObject.calculateBodyFatOfPercetage(waist_type, Waist,height_type, height,gernalInch, neck_type,neck,gender,hip_type,hip);
                    //(String waistType ,double waist,String heightType,double height,String neckType,double neck,String hipType,double hip,String gender){
                    String[] result = getBMI.split(",");
              //      bodyFatPerResultStuts.setText(result[1]);
                    resultBodyFatPerTextView.setText(result[0]);
               //   scrollView.fullScroll(View.FOCUS_DOWN);
                    hideSoftKeyboard();
                    setScrollViewDown();

                    if (result[1].equals("low")) {
                        lowBFPLayout.setBackgroundColor(Color.parseColor("#93c47d"));
                        //////////////////////////////////
                        normalBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        highBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryhighBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                    } else if (result[1].equals("normal")) {
                        lowBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        normalBFPLayout.setBackgroundColor(Color.parseColor("#93c47d"));
                        highBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryhighBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        ////////////////////////////////
                    }else if (result[1].equals("high")) {
                        lowBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        normalBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryhighBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        highBFPLayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        ////////////////////////////////
                    } else if (result[1].equals("veryhigh")) {
                        lowBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                        normalBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        veryhighBFPLayout.setBackgroundColor(Color.parseColor("#f4cccc"));
                        highBFPLayout.setBackgroundColor(Color.parseColor("#fafafa"));
                        //////////////////////////////////
                    }
                    hideSoftKeyboard();
                    setScrollViewDown();
                }
            }
        });
        waistFatofPercentageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
////////////////////
                final CharSequence[] items = {"Inch","cm"};//" Hard "," Very Hard "};
// arraylist to keep the selected items
                final ArrayList seletedItems=new ArrayList();

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Please Select waist format")
                        .setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int indexSelected, boolean isChecked) {
                                if (isChecked) {
                                    // If the user checked the item, add it to the selected items
                                    seletedItems.add(indexSelected);
                                    if(indexSelected == 0){
                                        waist_type = "inch";
                                       waistBFPToggleTextView.setText("in");
                                        dialog.cancel();
                                        //   heightEditTextInch.setVisibility(View.VISIBLE);
                                    }else if(indexSelected == 1){
                                        waist_type = "cm";
                                        // heightEditTextInch.setVisibility(View.INVISIBLE);
                                        //    heightToglebtn.setText("CM");
                                        waistBFPToggleTextView.setText("cm");
                                        dialog.cancel();
                                    }
                                } else if (seletedItems.contains(indexSelected)) {
                                    // Else, if the item is already in the array, remove it
                                    seletedItems.remove(Integer.valueOf(indexSelected));
                                }
                            }
                        }).create();
                dialog.show();
                ///////////////
            }
        });
        //////////////////////////////////////////////end body fat percentage////////////////////////////////////////////////////////
        calBMRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ///    if(getCurrentFocus()!=null) { InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE); inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0); }
        if(ageGernalEditText.getText().toString().equals("") || heightEditTextFeet.getText().toString().equals("")){
            Toast.makeText(getBaseContext(),"Please Fill All Fields.",Toast.LENGTH_LONG).show();
        }else {
            age = Integer.parseInt(ageGernalEditText.getText().toString());
            height = Integer.parseInt(heightEditTextFeet.getText().toString());
            weight = Double.parseDouble(weightBMREditText.getText().toString());
            gernalInch = 0;
            if (!heightEditTextInch.getText().toString().equals(""))
                gernalInch = Integer.parseInt(heightEditTextInch.getText().toString());
            opration_class oprationObject = new opration_class();
        //    String gender = "man";
               // public String calculateBMR(String weightType ,double weight,String heightType,double height,int age,String gender){

            String getBMR = oprationObject.calculateBMR(weight_type, weight, height_type, height,age,gender,gernalInch);
            String[] result = getBMR.split(",");
            resultBMRTextView.setText(getBMR);
         //  scrollView.fullScroll(View.FOCUS_DOWN);
          //  scrollView.
            hideSoftKeyboard();
            //setScrollViewDown();

        }
    }
});
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if(sceondscreenlayot.getVisibility() == View.VISIBLE) {
            firstscreenlayout.setVisibility(View.VISIBLE);
            sceondscreenlayot.setVisibility(View.INVISIBLE);
           /* getSupportActionBar().setTitle("BMI");
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor()));*/
            setActionBarTitleAndColor("BMI","#16222d");
        }else{
            super.onBackPressed();
            showInterstitial();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (navId == R.navId.action_settings) {
            return true;
        }*/
      //  return false;
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        navId = item.getItemId();
        if (navId == R.id.nav_camera) {
            // Handle the camera action
            bodyMassIndexLayout.setVisibility(View.VISIBLE);
            waistToHeightlayout.setVisibility(View.INVISIBLE);
            basalMetabloicRateLayout.setVisibility(View.INVISIBLE);
            bodyFatPercentageLayout.setVisibility(View.INVISIBLE);
            bodyMassIndexSet();
        } else if (navId == R.id.nav_gallery) {
            bodyMassIndexLayout.setVisibility(View.INVISIBLE);
            waistToHeightlayout.setVisibility(View.VISIBLE);
            basalMetabloicRateLayout.setVisibility(View.INVISIBLE);
            bodyFatPercentageLayout.setVisibility(View.INVISIBLE);
            wasitToHeightSet();
        } else if (navId == R.id.nav_slideshow) {
            bodyFatPercentageLayout.setVisibility(View.VISIBLE);
            bodyMassIndexLayout.setVisibility(View.INVISIBLE);
            waistToHeightlayout.setVisibility(View.INVISIBLE);
            basalMetabloicRateLayout.setVisibility(View.INVISIBLE);
             bodyFatPercentageSet();
        } else if (navId == R.id.nav_manage) {
            basalMetabloicRateLayout.setVisibility(View.VISIBLE);
            bodyFatPercentageLayout.setVisibility(View.INVISIBLE);
            bodyMassIndexLayout.setVisibility(View.INVISIBLE);
            waistToHeightlayout.setVisibility(View.INVISIBLE);
            baselMetabolicRateSet();
        } else if (navId == R.id.nav_share) {
            Intent i=new Intent(android.content.Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(android.content.Intent.EXTRA_SUBJECT,"Share With Friends");
            i.putExtra(android.content.Intent.EXTRA_TEXT, "extra text that you want to put");
            startActivity(Intent.createChooser(i,"Share via"));
        } else if (navId == R.id.nav_send) {
            //details?navId=com.homeremedies.rehan.homeremedies&hl=en
            https://play.google.com/store/apps/details?navId=com.adeebhat.rabbitsvilla/
            try {
            Intent viewIntent =
                    new Intent("android.intent.action.VIEW",
                            Uri.parse("https://play.google.com/store/apps/details?id=com.eclixtech.bmicalculator"));
            startActivity(viewIntent);
             } catch(Exception e) {
            Toast.makeText(getApplicationContext(),"Unable to Connect Try Again...",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void bodyMassIndexSet(){
        setActionBarTitleAndColor("Body Mass Index","#d99a4d");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ageGernalEditText.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#d99a4d")));
            heightEditTextInch.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#d99a4d")));
            heightEditTextFeet.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#d99a4d")));
            weightEditText.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#d99a4d")));
        }else {
            ViewCompat.setBackgroundTintList(ageGernalEditText,ColorStateList.valueOf(Color.parseColor("#d99a4d")));
            ViewCompat.setBackgroundTintList( heightEditTextInch,ColorStateList.valueOf(Color.parseColor("#d99a4d")));
            ViewCompat.setBackgroundTintList(heightEditTextFeet,ColorStateList.valueOf(Color.parseColor("#d99a4d")));
            ViewCompat.setBackgroundTintList(weightEditText,ColorStateList.valueOf(Color.parseColor("#d99a4d")));
        }
        ageGernalTextView.setTextColor(Color.parseColor("#d99a4d"));
        heightGernalTextView.setTextColor(Color.parseColor("#d99a4d"));
        weightgernalTextView.setTextColor(Color.parseColor("#d99a4d"));
        calBodyMassIndexBtn.setBackgroundColor(Color.parseColor("#d99a4d"));
        heightToggleTextView.setTextColor(Color.parseColor("#d99a4d"));
        weightgernalTextView.setTextColor(Color.parseColor("#d99a4d"));
        dropDownGernalWeight.setImageResource ( R.drawable.dropbodymassindeximage);
        dropdownGernalheight.setImageResource ( R.drawable.dropbodymassindeximage);
        maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforbodymassindex);
    }
    public void wasitToHeightSet(){
        setActionBarTitleAndColor("Waist to Height Ratio","#f24a57");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ageGernalEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f24a57") ) );
            heightEditTextInch.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f24a57") ) );
            heightEditTextFeet.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f24a57") ) );
            waistGernalEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f24a57") ) );
        }else {
            ViewCompat.setBackgroundTintList(ageGernalEditText,ColorStateList.valueOf(Color.parseColor("#f24a57")));
            ViewCompat.setBackgroundTintList( heightEditTextInch,ColorStateList.valueOf(Color.parseColor("#f24a57")));
            ViewCompat.setBackgroundTintList(heightEditTextFeet,ColorStateList.valueOf(Color.parseColor("#f24a57")));
            ViewCompat.setBackgroundTintList( waistGernalEditText,ColorStateList.valueOf(Color.parseColor("#f24a57")));
        }
        ageGernalTextView.setTextColor(Color.parseColor("#f24a57"));
        heightGernalTextView.setTextColor(Color.parseColor("#f24a57"));
        waistTextview.setTextColor(Color.parseColor("#f24a57"));
        calWaistToHeightBtn.setBackgroundColor(Color.parseColor("#f24a57"));
        heightToggleTextView.setTextColor(Color.parseColor("#f24a57"));
        waistToggleTextView.setTextColor(Color.parseColor("#f24a57"));
        dropdownGernalheight.setImageResource ( R.drawable.dropwaisttoheightimage);
        dropdownGernalwaist.setImageResource ( R.drawable.dropwaisttoheightimage);
        maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforwaisttoheight);
    }
    public void bodyFatPercentageSet(){
         setActionBarTitleAndColor("Body Fat Percentage","#f16e42");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ageGernalEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f16e42") ) );
            heightEditTextInch.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f16e42") ) );
            heightEditTextFeet.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f16e42") ) );
            waistBFPEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f16e42") ) );
            neckBFPEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f16e42") ) );
            hipBFPEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#f16e42") ) );
        }else {
            ViewCompat.setBackgroundTintList(ageGernalEditText,ColorStateList.valueOf(Color.parseColor("#f16e42")));
            ViewCompat.setBackgroundTintList( heightEditTextInch,ColorStateList.valueOf(Color.parseColor("#f16e42")));
            ViewCompat.setBackgroundTintList(heightEditTextFeet,ColorStateList.valueOf(Color.parseColor("#f16e42")));
            ViewCompat.setBackgroundTintList(waistBFPEditText,ColorStateList.valueOf(Color.parseColor("#f16e42")));
            ViewCompat.setBackgroundTintList(neckBFPEditText,ColorStateList.valueOf(Color.parseColor("#f16e42")));
            ViewCompat.setBackgroundTintList(hipBFPEditText,ColorStateList.valueOf(Color.parseColor("#f16e42")));
        }
        ageGernalTextView.setTextColor(Color.parseColor("#f16e42"));
        heightGernalTextView.setTextColor(Color.parseColor("#f16e42"));
        hipTextView.setTextColor(Color.parseColor("#f16e42"));
        neckBFPtextview.setTextColor(Color.parseColor("#f16e42"));
        waistBFPtextview.setTextColor(Color.parseColor("#f16e42"));
        calBodyFatPercentageBtn.setBackgroundColor(Color.parseColor("#f16e42"));
        heightToggleTextView.setTextColor(Color.parseColor("#f16e42"));
        waistBFPToggleTextView.setTextColor(Color.parseColor("#f16e42"));
        hipToggleTextView.setTextColor(Color.parseColor("#f16e42"));
        neckToggleTextView.setTextColor(Color.parseColor("#f16e42"));
        dropDownHip.setImageResource(R.drawable.dropbodyfatpercentageimage);
        dropDownwaistbfp.setImageResource(R.drawable.dropbodyfatpercentageimage);
        dropDownNeckbfp.setImageResource(R.drawable.dropbodyfatpercentageimage);
        dropdownGernalheight.setImageResource(R.drawable.dropbodyfatpercentageimage);
        maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforwaisttoheight);
    }
    public void baselMetabolicRateSet(){
        setActionBarTitleAndColor("Basel Metabolic Rate","#b84a67");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ageGernalEditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#b84a67") ) );
            heightEditTextInch.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#b84a67") ) );
            heightEditTextFeet.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#b84a67") ) );
            weightBMREditText.setBackgroundTintList( ColorStateList.valueOf(  Color.parseColor("#b84a67") ) );
        }else {
            ViewCompat.setBackgroundTintList(ageGernalEditText,ColorStateList.valueOf(Color.parseColor("#b84a67")));
            ViewCompat.setBackgroundTintList( heightEditTextInch,ColorStateList.valueOf(Color.parseColor("#b84a67")));
            ViewCompat.setBackgroundTintList(heightEditTextFeet,ColorStateList.valueOf(Color.parseColor("#b84a67")));
            ViewCompat.setBackgroundTintList(waistBFPEditText,ColorStateList.valueOf(Color.parseColor("#b84a67")));
            ViewCompat.setBackgroundTintList(weightBMREditText,ColorStateList.valueOf(Color.parseColor("#b84a67")));
        }
        ageGernalTextView.setTextColor(Color.parseColor("#b84a67"));
        heightGernalTextView.setTextColor(Color.parseColor("#b84a67"));
        weightBMRTextview.setTextColor(Color.parseColor("#b84a67"));
        calBMRBtn.setBackgroundColor(Color.parseColor("#b84a67"));
        heightToggleTextView.setTextColor(Color.parseColor("#b84a67"));
        weighttoggleBMRTextView.setTextColor(Color.parseColor("#b84a67"));
        dropdownGernalheight.setImageResource(R.drawable.dropbaselmatabolicimage);
        dropDownWeightBMR.setImageResource(R.drawable.dropbaselmatabolicimage);
        maleBtnGernal.setBackgroundResource(R.drawable.maleselectedforbasalmetabolicrate);
    }
    public void hideSoftKeyboard() {
        if(getCurrentFocus()!=null) { InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE); inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0); }

    }
    public void setScrollViewDown(){
        new CountDownTimer(2000, 20) {

            public void onTick(long millisUntilFinished) {

                scrollView.scrollTo(0, (int) ((int) 2000 - millisUntilFinished));
            }

            public void onFinish() {
            }

        }.start();
    }
    public void setActionBarTitleAndColor(String title, String color ){
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(color)));
    }
}
