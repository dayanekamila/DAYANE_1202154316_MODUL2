package com.example.asus.dayane_1202154316_modul2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by ASUS on 17/02/2018.
 */

public class DatePickerFragment extends DialogFragment
    implements DatePickerDialog.OnDateSetListener {
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Digunakan untuk mengambil tanggal bulan dan tahun
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it.
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            //Untuk melakukan set tanggal bulan dan tahun yang dipilih
            TakeAway activity = (TakeAway) getActivity();
            // Invoke Main Activity's processDatePickerResult() method.
            activity.processDatePickerResult(year, month, day);
        }
    }


