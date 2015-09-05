package com.jiang.phonecontact.utils;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import com.jiang.phonecontact.Data.Contact;

import java.util.ArrayList;
import java.util.List;


public class ConstactUtils {
    public static List<Contact> getContact(Context context)
    {
        List<Contact> lists= new ArrayList<>();

        Cursor cursor=context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        while (cursor.moveToNext())
        {
            Contact contact=new Contact();
            contact.setName(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)));
            contact.setPhoneNum(cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)));
            lists.add(contact);
            System.out.println(contact.getName() + "   " + contact.getPhoneNum());
        }
        return lists;
    }
}
