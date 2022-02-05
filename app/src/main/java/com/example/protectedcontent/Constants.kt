package com.example.protectedcontent

import android.net.Uri

object Constants {
    val AUTHORITY = "com.example.protectedcontent.provider"
    val URL = Uri.parse("content://" + AUTHORITY + "/t1")
    val CONTENT_TYPE = "vnd.android.cursor.dir/vnd.android.contentproviderlab.t1"
    val ID = "_ID"
    val TEXT = "MESSAGE"
    val TEXT_DATA = "Hello Content Providers!"
}