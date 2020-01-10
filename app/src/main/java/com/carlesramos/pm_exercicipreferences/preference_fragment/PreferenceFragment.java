package com.carlesramos.pm_exercicipreferences.preference_fragment;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.carlesramos.pm_exercicipreferences.R;

public class PreferenceFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);

    }
}
