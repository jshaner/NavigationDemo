package com.ebookfrenzy.navigationdemo;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ebookfrenzy.navigationdemo.ui.main.MainFragment;
import java.lang.annotation.Documented;

public abstract class MainActivity extends AppCompatActivity implements
SecondFragment.OnFragmentInteractionListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    }

  public void onFragmentInteraction(Uri uri) {

    }
  }

