package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<ContactModel> arrContact = new ArrayList<>();

    //here we have created the arraylist and pass the filename in the generic section...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        //here we have created object of recycleview  and the with the help of findviewbyid method
        //we are finding the the view by passing the argument in which The R class in Android is an
        // automatically generated class that contains references to all resources in your project
        //and by passing the id of recycle which we have creataed in the xml file...





        recyclerView.setLayoutManager(new LinearLayoutManager( this));

        //here we are setting the what type of layout we are going to apply in our app



        arrContact.add(new ContactModel(R.drawable.a,"A","1234567890"));
        arrContact.add(new ContactModel(R.drawable.b,"B","9876543210"));
        arrContact.add(new ContactModel(R.drawable.c,"C","8806046789"));
        arrContact.add(new ContactModel(R.drawable.d,"D","9145554280"));
        arrContact.add(new ContactModel(R.drawable.e,"E","9198255281"));
        arrContact.add(new ContactModel(R.drawable.g,"F","9123567904"));
        arrContact.add(new ContactModel(R.drawable.j,"G","8846539028"));
        arrContact.add(new ContactModel(R.drawable.a,"H","6745354898"));
        arrContact.add(new ContactModel(R.drawable.b,"I","9876543245"));
        arrContact.add(new ContactModel(R.drawable.c,"J","2345678876"));
        arrContact.add(new ContactModel(R.drawable.d,"K","6543267889"));
        arrContact.add(new ContactModel(R.drawable.e,"L","5081234587"));
        arrContact.add(new ContactModel(R.drawable.g,"M","0934568725"));
        arrContact.add(new ContactModel(R.drawable.j,"N","9856899123"));
        arrContact.add(new ContactModel(R.drawable.a,"O","0991237682"));
        arrContact.add(new ContactModel(R.drawable.b,"P","0982347468"));


        //here we have given the data from drawable and passing in the constructor which we have made
        //in the contactsmodel.java

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContact);
        recyclerView.setAdapter(adapter);





    }
}