package com.apo.netbeanscoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.apo.netbeanscoffee.R;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView cups, creamer;
    private ImageView baggedCoffee, combos;
    private ImageView shirts, giftCards;

    private Button logOutBtn, checkOrdersBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        logOutBtn = (Button) findViewById(R.id.admin_logout_btn);
        checkOrdersBtn = (Button) findViewById(R.id.check_orders_btn);

        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        checkOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);

            }
        });

        cups = (ImageView) findViewById(R.id.cups);
        creamer = (ImageView) findViewById(R.id.creamer);

        baggedCoffee = (ImageView) findViewById(R.id.bagged_beans);
        combos = (ImageView) findViewById(R.id.combos);

        shirts = (ImageView) findViewById(R.id.shirts);
        giftCards = (ImageView) findViewById(R.id.gift_cards);

        cups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Cups");
                startActivity(intent);

            }
        });

        creamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Creamer");
                startActivity(intent);
            }
        });

        baggedCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Bagged Coffee");
                startActivity(intent);
            }
        });

        combos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Combos");
                startActivity(intent);
            }
        });

        shirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Shirts");
                startActivity(intent);
            }
        });

        giftCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Gift Cards");
                startActivity(intent);
            }
        });

    }
}
