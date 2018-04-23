package com.example.kongdech.finalend;

import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class Main2Activity extends AppCompatActivity {
    private EditText etFirstName;
    private EditText etLastName;
    private ListView lvCustomer;
    private TextView tvMessage;

    SqliteHelper helper;
    CustomerCursorAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);



        tvMessage = (TextView) findViewById(R.id.tvMessage);
        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        lvCustomer = (ListView) findViewById(R.id.lvCustomer);
        helper = new SqliteHelper(this);
        Cursor cursor = helper.getCustomerDao().getCustomers(new Customer());
        adapter = new CustomerCursorAdapter(this, cursor, true);
        lvCustomer.setAdapter(adapter);
        lvCustomer.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }



    public void addCustomer(View view) {

        Customer customer = new Customer();
        customer.setId(-1);
        customer.setFirstName(etFirstName.getText().toString());
        customer.setLastName(etLastName.getText().toString());
        ReturnMessage rm = helper.getCustomerDao().addCustomer(customer);
        tvMessage.setText(rm.message);
        if (rm.success) {
            tvMessage.setTextColor(Color.BLUE);
            adapter.changeCursor(helper.getCustomerDao().getCustomers(new Customer()));
            resetForm();

        } else {
            tvMessage.setTextColor(Color.RED);
        }
    }

    private void resetForm() {
        //  lvCustomer.setSelected(false);
        lvCustomer.setItemChecked(-1, true);
        etFirstName.setText("");
        etLastName.setText("");
        etFirstName.requestFocus();
    }

    public void updateCustomer(View view) {
        //lvCustomer
        Toast.makeText(Main2Activity.this, "Selected Position : " + lvCustomer.getCheckedItemPosition(), Toast.LENGTH_SHORT).show();
        if (lvCustomer.getCheckedItemPosition() == -1) {
            tvMessage.setText(getString(R.string.select_a_customer_to_edit));
            tvMessage.setTextColor(Color.RED);
        } else {
            Customer customer = new Customer();
            Cursor c = (Cursor) adapter.getItem(lvCustomer.getCheckedItemPosition());
            Customer cust = (Customer) SqliteHelper.getObjectFromCursor(c, Customer.class);
            customer.setId(cust.getId());
            customer.setFirstName(etFirstName.getText().toString());
            customer.setLastName(etLastName.getText().toString());
            ReturnMessage rm = helper.getCustomerDao().updateCustomer(customer);
            tvMessage.setText(rm.message);
            if (rm.success) {
                tvMessage.setTextColor(Color.BLUE);
                adapter.changeCursor(helper.getCustomerDao().getCustomers(new Customer()));
                resetForm();
            } else {
                tvMessage.setTextColor(Color.RED);
            }
        }
    }

    public void onClickOfUpdateDelete(View view) {

        ImageButton ib = (ImageButton) view;
        String[] temp = ib.getTag().toString().split(",");
        int position = Integer.parseInt(temp[1]);
        if (temp[0].equals("update")) {
            Cursor c = (Cursor) adapter.getItem(position);
            Customer customer = (Customer) SqliteHelper.getObjectFromCursor(c, Customer.class);
            Toast.makeText(this, customer.getFirstName() + " " + customer.getLastName(), Toast.LENGTH_SHORT).show();
            etFirstName.setText(customer.getFirstName());
            etLastName.setText(customer.getLastName());

            lvCustomer.setItemChecked(position, true);
            //lvCustomer.setSelected(true);
            //lvCustomer.setSe


        } else if (temp[0].equals("delete")) {
            Cursor c = (Cursor) adapter.getItem(position);
            Customer customer = (Customer) SqliteHelper.getObjectFromCursor(c, Customer.class);
            ReturnMessage rm = helper.getCustomerDao().deleteCustomer(customer.getId());
            tvMessage.setText(rm.message);
            if (rm.success) {
                tvMessage.setTextColor(Color.BLUE);
                Cursor cursor = helper.getCustomerDao().getCustomers(new Customer());
                adapter.changeCursor(cursor);
            } else {
                tvMessage.setTextColor(Color.RED);
            }

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;


    }



    /*  MenuInflater inflater=this.getMenuInflater();
        inflater.inflate(R.menu.menu_search,menu);
        MenuItem menuSearch=menu.findItem(R.id.action_search);
        SearchView searchView=(SearchView)menuSearch.getActionView();
        if (searchView!=null){
            searchView.setQueryHint("search");

        }

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });*/



        //int id=item.getItem();

    /*    if (id==R.id.home){
            System.out.println("Home id :"+id);
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        }*/




}

