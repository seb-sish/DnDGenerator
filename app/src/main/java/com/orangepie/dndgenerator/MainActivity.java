package com.orangepie.dndgenerator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Spinner locationsSpinner;
    private ArrayAdapter<String> locationsAdapter;
    private Spinner settingsSpinner;
    private ArrayAdapter<CharSequence> settingsAdapter;
    private ClipboardManager myClipboard;
    private ImageButton generateButton;
    private TextView result;
    private EditText persons;
    private EditText objects;

    private String[] personsNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        persons = findViewById(R.id.persons);
        objects = findViewById(R.id.objects);

        locationsSpinner = findViewById(R.id.locations);
        locationsAdapter = new ArrayAdapter<>(this, R.layout.spinner_layout, Arrays.defaultList);
        locationsSpinner.setAdapter(locationsAdapter);

        settingsSpinner = findViewById(R.id.settings);
        settingsAdapter = ArrayAdapter.createFromResource(this, R.array.settings, R.layout.spinner_layout);
        settingsSpinner.setAdapter(settingsAdapter);

        result = findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipData myClip;
                myClip = ClipData.newPlainText("text", result.getText());
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), R.string.clipboardNotify, Toast.LENGTH_SHORT).show();
            }
        });

        generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numberGenerator = new Random();

                String mainPersName, additPersName = "Карл", itemName;
                String description = "";
                String mainPers = "";
                String item = "";
                String additPers = "";

                switch (settingsSpinner.getSelectedItem().toString()){
                    case "Фэнтези":
                        description = Arrays.fentezi.locsDesc.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        mainPers = Arrays.fentezi.mainPers.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        item = Arrays.fentezi.item.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        additPers = Arrays.fentezi.additPers.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        break;
                    case "Киберпанк":
                        description = Arrays.cyberpunk.locsDesc.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        mainPers = Arrays.cyberpunk.mainPers.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        item = Arrays.cyberpunk.item.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        additPers = Arrays.cyberpunk.additPers.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        break;
                    case "Постапокалипсис":
                        description = Arrays.postapocalyptic.locsDesc.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        mainPers = Arrays.postapocalyptic.mainPers.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        item = Arrays.postapocalyptic.item.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        additPers = Arrays.postapocalyptic.additPers.get(locationsSpinner.getSelectedItem().toString()).get(numberGenerator.nextInt(2));
                        break;
                }

                if (objects.getText().toString().isEmpty()) itemName = "Кольцо всевластия";
                else itemName = objects.getText().toString();

                personsNames = persons.getText().toString().split(",");
                if (personsNames[0].isEmpty()) mainPersName = "Людовик";
                else mainPersName = personsNames[0].replaceFirst(" ", "");
                try {
                    if (personsNames[1].isEmpty()) additPersName = "Карл";
                    else additPersName = personsNames[1].replaceFirst(" ", "");
                } catch (java.lang.ArrayIndexOutOfBoundsException ignored){}

                mainPers = mainPers.replace("[артефакт]", itemName).replace("[гл имя]", mainPersName).replace("[доп имя]", additPersName);
                item = item.replace("[артефакт]", itemName).replace("[гл имя]", mainPersName).replace("[доп имя]", additPersName);
                additPers = additPers.replace("[артефакт]", itemName).replace("[гл имя]", mainPersName).replace("[доп имя]", additPersName);

                result.setText(description + mainPers + item + additPers);
            }
        });

        settingsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                locationsAdapter.clear();
                switch (parent.getSelectedItem().toString()){
                    case "Фэнтези": locationsAdapter.addAll(Arrays.fentezi.locs);
                        break;
                    case "Киберпанк": locationsAdapter.addAll(Arrays.cyberpunk.locs);
                        break;
                    case "Постапокалипсис": locationsAdapter.addAll(Arrays.postapocalyptic.locs);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
    }

}